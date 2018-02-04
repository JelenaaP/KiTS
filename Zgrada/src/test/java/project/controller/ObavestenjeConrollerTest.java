package project.controller;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static project.constants.ObavestenjeConstants.DB_DAT_KREIRANJA;
import static project.constants.ObavestenjeConstants.DB_IME;
import static project.constants.ObavestenjeConstants.DB_OPIS;
import static project.constants.ObavestenjeConstants.DB_KREATOR_ID;
import static project.constants.ObavestenjeConstants.DB_ZGRADA_ID;
import static project.constants.ObavestenjeConstants.DB_COUNT;
import static project.constants.ObavestenjeConstants.NEW_DAT_KREIRANJA;
import static project.constants.ObavestenjeConstants.NEW_IME;
import static project.constants.ObavestenjeConstants.NEW_OPIS;

import java.nio.charset.Charset;

import javax.annotation.PostConstruct;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import project.TestUtil;
import project.MyApplication;
import project.constants.Korisnik_ServisaConstants;
import project.constants.KvarConstants;
import project.constants.ObavestenjeConstants;
import project.constants.ZgradaConstants;
import project.model.Obavestenje;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class ObavestenjeConrollerTest {
private static final String URL_PREFIX = "/api/obavestenje";

	
	private MediaType contentType = new MediaType(
			MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;
    
    @Autowired
    private WebApplicationContext webApplicationContext;
    
    @PostConstruct
    public void setup() {
    	this.mockMvc = MockMvcBuilders.
    			webAppContextSetup(webApplicationContext).build();
    }
    
    @Test
    public void testGetAllObavestenje() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/all"))
	        .andExpect(status().isOk())
	        .andExpect(content().contentType(contentType))
	        .andExpect(jsonPath("$", hasSize(DB_COUNT)))
	        .andExpect(jsonPath("$.[*].id").value(hasItem(KvarConstants.DB_ID.intValue())))
            .andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA)))
            .andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
    		.andExpect(jsonPath("$.[*].opis").value(hasItem(DB_OPIS)))
    		.andExpect(jsonPath("$.[*].zgrada").value(hasItem(DB_ZGRADA_ID)))
    		.andExpect(jsonPath("$.[*].kreator").value(hasItem(DB_KREATOR_ID)));
    }
    
    @Test
    public void testGetObavestenjeByZgrada() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findZgrada?zgrada=" + ObavestenjeConstants.DB_ZGRADA_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.id").value(ObavestenjeConstants.DB_ID.intValue()))
    	.andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA)))
        .andExpect(jsonPath("$.[*].kreator").value(hasItem(DB_KREATOR_ID)))
		.andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
		.andExpect(jsonPath("$.[*].opis").value(hasItem(DB_OPIS)))
		.andExpect(jsonPath("$.[*].zgrada").value(hasItem(DB_ZGRADA_ID)));
    }
    
    @Test
    public void testGetObavestenjeByKreator() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findKreator?kreator=" + ObavestenjeConstants.DB_KREATOR_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.id").value(ObavestenjeConstants.DB_ID.intValue()))
    	.andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA)))
        .andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
		.andExpect(jsonPath("$.[*].opis").value(hasItem(DB_OPIS)))
		.andExpect(jsonPath("$.[*].kreator").value(hasItem(DB_KREATOR_ID)))
		.andExpect(jsonPath("$.[*].zgrada").value(hasItem(DB_ZGRADA_ID)));
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testSaveObavestenje() throws Exception {
    	Obavestenje obavestenje = new Obavestenje();
    	obavestenje.setIme(NEW_IME);
    	obavestenje.setDatKreiranja(NEW_DAT_KREIRANJA);
    	obavestenje.setOpis(NEW_OPIS);
    	obavestenje.setZgrada(ZgradaConstants.NEW_ZGRADA_ID);
    	obavestenje.setKreator(Korisnik_ServisaConstants.NEW_KREATOR_ID);
		
    	String json = TestUtil.json(obavestenje);
        this.mockMvc.perform(post(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isCreated());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testUpdateKvar() throws Exception {
    	Obavestenje obavestenje = new Obavestenje();
    	obavestenje.setId(KvarConstants.DB_ID);
    	obavestenje.setIme(NEW_IME);
    	obavestenje.setDatKreiranja(NEW_DAT_KREIRANJA);
    	obavestenje.setOpis(NEW_OPIS);
	
    	String json = TestUtil.json(obavestenje);
        this.mockMvc.perform(put(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isOk());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testDeleteStudent() throws Exception { 	
        this.mockMvc.perform(delete(URL_PREFIX + "/" + ObavestenjeConstants.DB_ID))
                .andExpect(status().isOk());
    }
}