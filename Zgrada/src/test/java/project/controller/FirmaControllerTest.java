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

import static project.constants.FirmaConstants.DB_COUNT;
import static project.constants.FirmaConstants.DB_ADRESA;
import static project.constants.FirmaConstants.DB_COUNT_WITH_ADRESA;
import static project.constants.FirmaConstants.DB_COUNT_WITH_VLASNIK;
import static project.constants.FirmaConstants.DB_EMAIL;
import static project.constants.FirmaConstants.DB_ID;
import static project.constants.FirmaConstants.DB_IME;
import static project.constants.FirmaConstants.DB_TELEFON;
import static project.constants.FirmaConstants.DB_VLASNIK_ID;
import static project.constants.FirmaConstants.DB_WEB_SITE;
import static project.constants.FirmaConstants.NEW_ADRESA;
import static project.constants.FirmaConstants.NEW_EMAIL;
import static project.constants.FirmaConstants.NEW_IME;
import static project.constants.FirmaConstants.NEW_TELEFON;
import static project.constants.FirmaConstants.NEW_VLASNIK_ID;
import static project.constants.FirmaConstants.NEW_WEB_SITE;


import java.nio.charset.Charset;

import javax.annotation.PostConstruct;

import org.aspectj.lang.annotation.Before;
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
import project.constants.FirmaConstants;
import project.constants.Korisnik_ServisaConstants;
import project.constants.ZgradaConstants;
import project.model.Firma;
import project.model.Korisnik_servisa;
import project.model.Zgrada;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class FirmaControllerTest {
private static final String URL_PREFIX = "/api/firma";

	
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
    public void testGetAll() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/all"))
	        .andExpect(status().isOk())
	        .andExpect(content().contentType(contentType))
	        .andExpect(jsonPath("$", hasSize(DB_COUNT)))
	        .andExpect(jsonPath("$.[*].id").value(hasItem(ZgradaConstants.DB_ID.intValue())))
            .andExpect(jsonPath("$.[*].adresa").value(hasItem(DB_ADRESA)))
            .andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
            .andExpect(jsonPath("$.[*].telefon").value(hasItem(DB_TELEFON)))
    		.andExpect(jsonPath("$.[*].webSite").value(hasItem(DB_WEB_SITE)))
    		.andExpect(jsonPath("$.[*].email").value(hasItem(DB_EMAIL)));
    		//.andExpect(jsonPath("$.[*].vlasnik.id").value(hasItem(DB_VLASNIK_ID)));
    }
    
    @Test
    public void testGetFirmaByAdresa() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findAdresa?adresa=" + DB_ADRESA))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	//.andExpect(jsonPath("$.id").value(FirmaConstants.DB_ID.intValue()))
    	.andExpect(jsonPath("$.adresa").value(DB_ADRESA))
        .andExpect(jsonPath("$.ime").value(DB_IME))
        .andExpect(jsonPath("$.telefon").value(DB_TELEFON))
        .andExpect(jsonPath("$.webSite").value(DB_WEB_SITE))
        .andExpect(jsonPath("$.email").value(DB_EMAIL))
        .andExpect(jsonPath("$.vlasnik").value(DB_VLASNIK_ID));
    }
    
    @Test
    public void testGetFirmaByVlasnik() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findVlasnikId?vlasnik=" + FirmaConstants.DB_VLASNIK_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.id").value(FirmaConstants.DB_VLASNIK_ID))
        .andExpect(jsonPath("$.adresa").value(DB_ADRESA))
        .andExpect(jsonPath("$.ime").value(DB_IME))
        .andExpect(jsonPath("$.telefon").value(DB_TELEFON))
        .andExpect(jsonPath("$.webSite").value(DB_WEB_SITE))
        .andExpect(jsonPath("$.vlasnik.id").value(DB_VLASNIK_ID))
    	;
    }
    
    
    @Test
    @Transactional
    @Rollback(true)
    public void testSaveFirma() throws Exception {
    	Firma firma = new Firma();
    	
    	firma.setId(FirmaConstants.DB_ID);
		firma.setIme(NEW_IME);
		firma.setAdresa(NEW_ADRESA);
		firma.setTelefon(NEW_TELEFON);
		firma.setEmail(NEW_EMAIL);
		firma.setWebSite(NEW_WEB_SITE);
		
    	String json = TestUtil.json(firma);
        this.mockMvc.perform(post(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isCreated());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testUpdateFirma() throws Exception {
    	Firma firma = new Firma();
    	firma.setId(FirmaConstants.DB_ID);
		firma.setIme(NEW_IME);
		firma.setAdresa(NEW_ADRESA);
		firma.setTelefon(NEW_TELEFON);
    	
    	String json = TestUtil.json(firma);
        this.mockMvc.perform(put(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isOk());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testDeleteFirma() throws Exception { 	
        this.mockMvc.perform(delete(URL_PREFIX + "/" + FirmaConstants.DB_ID))
                .andExpect(status().isOk());
    }
    
    
}
