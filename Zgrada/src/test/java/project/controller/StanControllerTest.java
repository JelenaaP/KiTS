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

import static project.constants.StanConstants.DB_ADRESA;
import static project.constants.StanConstants.DB_BR_STANOVNIKA;
import static project.constants.StanConstants.DB_COUNT;
import static project.constants.StanConstants.DB_IME;
import static project.constants.StanConstants.DB_VLASNIK_ID;
import static project.constants.StanConstants.DB_ZGRADA_ID;
import static project.constants.StanConstants.NEW_ADRESA;
import static project.constants.StanConstants.NEW_BR_STANOVNIKA;
import static project.constants.StanConstants.NEW_IME;


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
import project.constants.StanConstants;
import project.dto.Korisnik_servisaDto;
import project.dto.StanDto;
import project.dto.ZgradaDto;
import project.service.Korisnik_servisaService;
import project.service.ZgradaService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")
public class StanControllerTest {
    
private static final String URL_PREFIX = "/api/stan";

    
    private MediaType contentType = new MediaType(
            MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;
    
    @Autowired
    ZgradaService zgradaService;
    
    @Autowired
    Korisnik_servisaService korisnikServisa;
    
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
            .andExpect(jsonPath("$.[*].id").value(hasItem(StanConstants.DB_ID.intValue())))
            .andExpect(jsonPath("$.[*].adresa").value(hasItem(DB_ADRESA)))
            .andExpect(jsonPath("$.[*].brStanovnika").value(hasItem(DB_BR_STANOVNIKA)))
            .andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
            .andExpect(jsonPath("$.[*].zgrada.id").value(hasItem(DB_ZGRADA_ID.intValue())))
            .andExpect(jsonPath("$.[*].vlasnik.id").value(hasItem(DB_VLASNIK_ID.intValue())));
    }
    
    @Test
    public void testGetStanoviByAdresa() throws Exception {
        mockMvc.perform(get(URL_PREFIX + "/findAdresa?adresa=" + DB_ADRESA))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.[*].id").value(hasItem(StanConstants.DB_ID.intValue())))
        .andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
        .andExpect(jsonPath("$.[*].adresa").value(hasItem(DB_ADRESA)))
        .andExpect(jsonPath("$.[*].brStanovnika").value(hasItem(DB_BR_STANOVNIKA)))
        .andExpect(jsonPath("$.[*].zgrada.id").value(hasItem(DB_ZGRADA_ID.intValue())))
        .andExpect(jsonPath("$.[*].vlasnik.id").value(hasItem(DB_VLASNIK_ID.intValue())));
    }

    @Test
    public void testGetStanByVlasnik() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findVlasnik?vlasnik=" + StanConstants.DB_VLASNIK_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.[*].id").value(hasItem(StanConstants.DB_ID.intValue())))
        .andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
        .andExpect(jsonPath("$.[*].adresa").value(hasItem(DB_ADRESA)))
        .andExpect(jsonPath("$.[*].brStanovnika").value(hasItem(DB_BR_STANOVNIKA)))
        .andExpect(jsonPath("$.[*].zgrada.id").value(hasItem(DB_ZGRADA_ID.intValue())));
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testSaveStan() throws Exception {
    	StanDto stan = new StanDto();
		
    	stan.setIme(NEW_IME);
		stan.setAdresa(NEW_ADRESA);
		stan.setBrStanovnika(NEW_BR_STANOVNIKA);
		stan.setZgrada(new ZgradaDto(zgradaService.findOne(1L)));
    	stan.setVlasnik(new Korisnik_servisaDto(korisnikServisa.findOne(1L)));
		
    	String json = TestUtil.json(stan);
        this.mockMvc.perform(post(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isCreated());
    }
    @Test
    @Transactional
    @Rollback(true)
    public void testUpdateStan() throws Exception {
    	StanDto stan = new StanDto();
    	
    	stan.setId(StanConstants.DB_ID);
		stan.setIme(NEW_IME);
		stan.setAdresa(NEW_ADRESA);
		stan.setBrStanovnika(NEW_BR_STANOVNIKA);
		stan.setZgrada(new ZgradaDto(zgradaService.findOne(1L)));
    	stan.setVlasnik(new Korisnik_servisaDto(korisnikServisa.findOne(1L)));
		
    	String json = TestUtil.json(stan);
        this.mockMvc.perform(put(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isOk());
    }
    @Test
    @Transactional
    @Rollback(true)
    public void testDeleteStan() throws Exception { 	
        this.mockMvc.perform(delete(URL_PREFIX + "/" + StanConstants.DB_ID))
                .andExpect(status().isOk());
    }
    
    /// *********MOZDA NIJE DOVRSENO, JELENA ME POZURUJE DA KOMITUJEM HAHA *************
    
}
