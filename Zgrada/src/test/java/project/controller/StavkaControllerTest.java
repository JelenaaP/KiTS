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

import static project.constants.StavkaConstants.DB_COUNT;
import static project.constants.StavkaConstants.DB_DAT_KREIRANJA;
import static project.constants.StavkaConstants.DB_IME;
import static project.constants.StavkaConstants.DB_OPIS;
import static project.constants.StavkaConstants.NEW_DAT_KREIRANJA;
import static project.constants.StavkaConstants.NEW_IME;
import static project.constants.StavkaConstants.NEW_OPIS;
import static project.constants.StavkaConstants.DB_KREATOR_ID;

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
import project.constants.KvarConstants;
import project.constants.StavkaConstants;
import project.dto.Korisnik_servisaDto;
import project.dto.SednicaDto;
import project.dto.StavkaDto;
import project.service.Korisnik_servisaService;
import project.service.SednicaService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class StavkaControllerTest {
	
private static final String URL_PREFIX = "/api/stavka";

	
	private MediaType contentType = new MediaType(
			MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;
    
    @Autowired
    Korisnik_servisaService korisnikServisa;
    
    @Autowired
    SednicaService sednicaService;
    
    @Autowired
    private WebApplicationContext webApplicationContext;
    
    @PostConstruct
    public void setup() {
    	this.mockMvc = MockMvcBuilders.
    			webAppContextSetup(webApplicationContext).build();
    }
    
    @Test
    public void testGetAllStavka() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/all"))
	        .andExpect(status().isOk())
	        .andExpect(content().contentType(contentType))
	        .andExpect(jsonPath("$", hasSize(DB_COUNT)))
	        .andExpect(jsonPath("$.[*].id").value(hasItem(StavkaConstants.DB_ID.intValue())))
            .andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA.getTime())))
    		.andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
    		.andExpect(jsonPath("$.[*].opis").value(hasItem(DB_OPIS)))
    		.andExpect(jsonPath("$.[*].sednica.id").value(hasItem(StavkaConstants.DB_SEDNICA_ID.intValue())))
    		.andExpect(jsonPath("$.[*].kreator.id").value(hasItem(DB_KREATOR_ID.intValue())));
    	
    }
    
    @Test
    public void testGetStavkaByKreator() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findKreator?kreator=" + StavkaConstants.DB_KREATOR_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.[*].id").value(hasItem(KvarConstants.DB_ID.intValue())))
    	.andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA.getTime())))
		.andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
		.andExpect(jsonPath("$.[*].opis").value(hasItem(DB_OPIS)))
		.andExpect(jsonPath("$.[*].kreator.id").value(hasItem(DB_KREATOR_ID.intValue())));
    }
    
    
    @Test
    public void testGetStavkaBySednica() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findSednica?sednica=" + StavkaConstants.DB_SEDNICA_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.[*].id").value(hasItem(StavkaConstants.DB_ID.intValue())))
    	.andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA.getTime())))
		.andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
		.andExpect(jsonPath("$.[*].opis").value(hasItem(DB_OPIS)))
		.andExpect(jsonPath("$.[*].kreator.id").value(hasItem(DB_KREATOR_ID.intValue())));
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testSaveStavka() throws Exception {
    	StavkaDto stavka = new StavkaDto();
    	
    	stavka.setSednica(new SednicaDto(sednicaService.findOne(1L)));
    	stavka.setDatKreiranja(NEW_DAT_KREIRANJA);
    	stavka.setIme(NEW_IME);
    	stavka.setOpis(NEW_OPIS);
    	stavka.setKreator(new Korisnik_servisaDto(korisnikServisa.findOne(1L)));
		
    	String json = TestUtil.json(stavka);
        this.mockMvc.perform(post(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isCreated());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testUpdateStavka() throws Exception {
    	StavkaDto stavka = new StavkaDto();
    	
    	stavka.setId(StavkaConstants.DB_ID);
    	stavka.setDatKreiranja(NEW_DAT_KREIRANJA);
    	stavka.setIme(NEW_IME);
    	stavka.setOpis(NEW_OPIS);
    	stavka.setKreator(new Korisnik_servisaDto(korisnikServisa.findOne(1L)));
	
    	String json = TestUtil.json(stavka);
        this.mockMvc.perform(put(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isOk());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testDeleteStavka() throws Exception { 	
        this.mockMvc.perform(delete(URL_PREFIX + "/" + StavkaConstants.DB_ID))
                .andExpect(status().isOk());
    }

}
