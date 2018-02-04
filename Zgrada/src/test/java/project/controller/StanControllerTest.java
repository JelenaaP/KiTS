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
import static project.constants.StanConstants.DB_COUNT_WITH_ADRESA;
import static project.constants.StanConstants.DB_COUNT_WITH_VLASNIK;
import static project.constants.StanConstants.DB_IME;
import static project.constants.StanConstants.DB_VLASNIK_ID;
import static project.constants.StanConstants.DB_ZGRADA_ID;
import static project.constants.StanConstants.NEW_ADRESA;
import static project.constants.StanConstants.NEW_BR_STANOVNIKA;
import static project.constants.StanConstants.NEW_IME;
import static project.constants.StanConstants.NEW_VLASNIK_ID;


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
import project.constants.StanConstants;
import project.constants.ZgradaConstants;
import project.model.Stan;
import project.model.Zgrada;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")
public class StanControllerTest {
    
private static final String URL_PREFIX = "/api/zgrada";

    
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
            .andExpect(jsonPath("$.[*].id").value(hasItem(StanConstants.DB_ID.intValue())))
            .andExpect(jsonPath("$.[*].adresa").value(hasItem(DB_ADRESA)))
            .andExpect(jsonPath("$.[*].brStanovnika").value(hasItem(DB_BR_STANOVNIKA)))
            .andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
            .andExpect(jsonPath("$.[*].zgrada").value(hasItem(DB_ZGRADA_ID)))
            .andExpect(jsonPath("$.[*].vlasnik").value(hasItem(DB_VLASNIK_ID)));
    }
    
    @Test
    public void testGetStanoviByAdresa() throws Exception {
        mockMvc.perform(get(URL_PREFIX + "/findAdresa?adresa=" + StanConstants.DB_ADRESA))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.id").value(StanConstants.DB_ID.intValue()))
        .andExpect(jsonPath("$.ime").value(DB_IME))
        .andExpect(jsonPath("$.adresa").value(DB_ADRESA))
        .andExpect(jsonPath("$.brStanovnika").value(DB_BR_STANOVNIKA))
        .andExpect(jsonPath("$.zgrada").value(DB_ZGRADA_ID))
        .andExpect(jsonPath("$.vlasnik").value(DB_VLASNIK_ID));
    }

    @Test
    public void testGetStanByVlasnik() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findVlasnik?vlasnik=" + StanConstants.DB_VLASNIK_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.id").value(StanConstants.DB_ID.intValue()))
        .andExpect(jsonPath("$.ime").value(DB_IME))
        .andExpect(jsonPath("$.adresa").value(DB_ADRESA))
        .andExpect(jsonPath("$.brStanovnika").value(DB_BR_STANOVNIKA))
        .andExpect(jsonPath("$.zgrada").value(DB_ZGRADA_ID))
        .andExpect(jsonPath("$.vlasnik").value(DB_VLASNIK_ID));
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testSaveStan() throws Exception {
    	Stan stan = new Stan();
		stan.setIme(NEW_IME);
		stan.setAdresa(NEW_ADRESA);
		stan.setBrStanovnika(NEW_BR_STANOVNIKA);
		stan.setVlasnik(Korisnik_ServisaConstants.NEW_VLASNIK_ID);
		stan.setZgrada(ZgradaConstants.NEW_ZGRADA_ID);
    	
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
    	Stan stan = new Stan();
		stan.setIme(NEW_IME);
		stan.setAdresa(NEW_ADRESA);
		stan.setBrStanovnika(NEW_BR_STANOVNIKA);
		stan.setVlasnik(Korisnik_ServisaConstants.NEW_VLASNIK_ID);
		stan.setZgrada(ZgradaConstants.NEW_ZGRADA_ID);
    	
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
