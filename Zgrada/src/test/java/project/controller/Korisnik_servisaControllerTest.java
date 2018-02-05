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

import static project.constants.Korisnik_ServisaConstants.DB_COUNT;
import static project.constants.Korisnik_ServisaConstants.DB_ID;
import static project.constants.Korisnik_ServisaConstants.DB_ID_KORISNIKA;
import static project.constants.Korisnik_ServisaConstants.DB_IME;
import static project.constants.Korisnik_ServisaConstants.DB_KORIS_IME;
import static project.constants.Korisnik_ServisaConstants.DB_LOZINKA;
import static project.constants.Korisnik_ServisaConstants.DB_ULOGA;
import static project.constants.Korisnik_ServisaConstants.NEW_IME;
import static project.constants.Korisnik_ServisaConstants.NEW_KORIS_IME;
import static project.constants.Korisnik_ServisaConstants.NEW_LOZINKA;
import static project.constants.Korisnik_ServisaConstants.NEW_ULOGA;
import static project.constants.Korisnik_ServisaConstants.PAGE_SIZE;
import static project.constants.Korisnik_ServisaConstants.DB_COUNT_WITH_KORIS_IME;

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

import project.MyApplication;
import project.TestUtil;
import project.constants.Korisnik_ServisaConstants;
import project.model.Korisnik_servisa;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")


public class Korisnik_servisaControllerTest {

private static final String URL_PREFIX = "/api/korisnik_servisa";
	
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
	        .andExpect(jsonPath("$.[*].id").value(hasItem(Korisnik_ServisaConstants.DB_ID.intValue())))
            .andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
            .andExpect(jsonPath("$.[*].korisIme").value(hasItem(DB_KORIS_IME)))
            .andExpect(jsonPath("$.[*].lozinka").value(hasItem(DB_LOZINKA)))
        	.andExpect(jsonPath("$.[*].uloga").value(hasItem(DB_ULOGA)));

    }
    
    @Test
    public void testGetUsersPage() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "?page=1&size=" + PAGE_SIZE))
    		.andExpect(status().isOk())
    		.andExpect(content().contentType(contentType))
    		.andExpect(jsonPath("$", hasSize(PAGE_SIZE)))
    		.andExpect(jsonPath("$.[*].id").value(hasItem(Korisnik_ServisaConstants.DB_ID.intValue())))
            .andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
            .andExpect(jsonPath("$.[*].korisIme").value(hasItem(DB_KORIS_IME)))
            .andExpect(jsonPath("$.[*].lozinka").value(hasItem(DB_LOZINKA)))
            .andExpect(jsonPath("$.[*].uloga").value(hasItem(DB_ULOGA)));

    }
    
    @Test
    public void testGetUser() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/" + Korisnik_ServisaConstants.DB_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.id").value(Korisnik_ServisaConstants.DB_ID.intValue()))
        .andExpect(jsonPath("$.ime").value(DB_IME))
        .andExpect(jsonPath("$.korisIme").value(DB_KORIS_IME))
        .andExpect(jsonPath("$.lozinka").value(DB_LOZINKA))
        .andExpect(jsonPath("$.uloga").value(DB_ULOGA));

    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testSaveUser() throws Exception {
    	Korisnik_servisa korisnik = new Korisnik_servisa();
		korisnik.setIme(NEW_IME);
		korisnik.setKorisIme(NEW_KORIS_IME);
		korisnik.setLozinka(NEW_LOZINKA);
		korisnik.setUloga(NEW_ULOGA);
    	
    	String json = TestUtil.json(korisnik);
        this.mockMvc.perform(post(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isCreated());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testUpdateUser() throws Exception {
    	Korisnik_servisa korisnik = new Korisnik_servisa();
		korisnik.setIme(NEW_IME);
		korisnik.setKorisIme(NEW_KORIS_IME);
		korisnik.setLozinka(NEW_LOZINKA);
		korisnik.setUloga(NEW_ULOGA);
    	
    	String json = TestUtil.json(korisnik);
        this.mockMvc.perform(put(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isOk());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testDeleteUser() throws Exception { 	
        this.mockMvc.perform(delete(URL_PREFIX + "/" + Korisnik_ServisaConstants.DB_ID))
                .andExpect(status().isOk());
    }
    
    @Test
    public void testGetUsersByKorisIme() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findKorisIme?korisIme=" + DB_KORIS_IME))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$", hasSize(DB_COUNT_WITH_KORIS_IME)));
    }
}
