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

import static project.constants.KvarConstants.DB_DAT_KREIRANJA;
import static project.constants.KvarConstants.DB_DAT_ZAKAZIVANJA;
import static project.constants.KvarConstants.DB_DAT_POPRAVKE;
import static project.constants.KvarConstants.DB_IME;
import static project.constants.KvarConstants.DB_OPIS;
import static project.constants.KvarConstants.DB_KREATOR_ID;
import static project.constants.KvarConstants.DB_ZGRADA_ID;
import static project.constants.KvarConstants.DB_COUNT;
import static project.constants.KvarConstants.NEW_DAT_KREIRANJA;
import static project.constants.KvarConstants.NEW_IME;
import static project.constants.KvarConstants.NEW_OPIS;
import static project.constants.KvarConstants.DB_COUNT_KVAR_KOMENTARI;
import static project.constants.KvarConstants.DB_POPRAVLJEN;

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
import project.constants.KomentarConstants;
import project.constants.Korisnik_ServisaConstants;
import project.constants.KvarConstants;
import project.constants.ZgradaConstants;
import project.model.Kvar;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class KvarConrollerTest {
private static final String URL_PREFIX = "/api/kvar";

	
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
    public void testGetAllKvar() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/all"))
	        .andExpect(status().isOk())
	        .andExpect(content().contentType(contentType))
	        .andExpect(jsonPath("$", hasSize(DB_COUNT)))
	        .andExpect(jsonPath("$.[*].id").value(hasItem(KvarConstants.DB_ID.intValue())))
            .andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA)))
            .andExpect(jsonPath("$.[*].datZakazivanja").value(hasItem(DB_DAT_ZAKAZIVANJA)))
            .andExpect(jsonPath("$.[*].datPopravke").value(hasItem(DB_DAT_POPRAVKE)))
    		.andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
    		.andExpect(jsonPath("$.[*].opis").value(hasItem(DB_OPIS)))
    		.andExpect(jsonPath("$.[*].zgrada").value(hasItem(DB_ZGRADA_ID)))
    		.andExpect(jsonPath("$.[*].popravljen").value(hasItem(DB_POPRAVLJEN)))
    		.andExpect(jsonPath("$.[*].kreator.id").value(hasItem(DB_KREATOR_ID)));
    }
    
    @Test
    public void testGetKvarByZgrada() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findZgrada?zgrada.id=" + KvarConstants.DB_ZGRADA_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.id").value(KvarConstants.DB_ID.intValue()))
    	.andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA)))
        .andExpect(jsonPath("$.[*].datZakazivanja").value(hasItem(DB_DAT_ZAKAZIVANJA)))
        .andExpect(jsonPath("$.[*].datPopravke").value(hasItem(DB_DAT_POPRAVKE)))
		.andExpect(jsonPath("$.[*].popravljen").value(hasItem(DB_POPRAVLJEN)))
		.andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
		.andExpect(jsonPath("$.[*].opis").value(hasItem(DB_OPIS)))
		.andExpect(jsonPath("$.[*].zgrada.id").value(hasItem(DB_ZGRADA_ID)));
    }
    
    @Test
    public void testGetKvarByKreatorId() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findKreatorId?kreatorId=" + KvarConstants.DB_KREATOR_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.id").value(KvarConstants.DB_ID.intValue()))
    	.andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA)))
        .andExpect(jsonPath("$.[*].datZakazivanja").value(hasItem(DB_DAT_ZAKAZIVANJA)))
        .andExpect(jsonPath("$.[*].datPopravke").value(hasItem(DB_DAT_POPRAVKE)))
		.andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
		.andExpect(jsonPath("$.[*].opis").value(hasItem(DB_OPIS)))
		.andExpect(jsonPath("$.[*].kreator.id").value(hasItem(DB_KREATOR_ID)));
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testCreateKvar() throws Exception {
    	Kvar kvar = new Kvar();
		kvar.setIme(NEW_IME);
		kvar.setDatKreiranja(NEW_DAT_KREIRANJA);
		kvar.setOpis(NEW_OPIS);
		kvar.setZgrada(ZgradaConstants.NEW_ZGRADA_ID);
		kvar.setKreator(Korisnik_ServisaConstants.NEW_KREATOR_ID);
		
    	String json = TestUtil.json(kvar);
        this.mockMvc.perform(post(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isCreated());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testUpdateKvar() throws Exception {
    	Kvar kvar = new Kvar();
    	kvar.setId(KvarConstants.DB_ID);
    	kvar.setIme(NEW_IME);
		kvar.setDatKreiranja(NEW_DAT_KREIRANJA);
		kvar.setOpis(NEW_OPIS);
	
    	String json = TestUtil.json(kvar);
        this.mockMvc.perform(put(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isOk());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testDeleteKvar() throws Exception { 	
        this.mockMvc.perform(delete(URL_PREFIX + "/" + KvarConstants.DB_ID))
                .andExpect(status().isOk());
    }
    
    @Test
    public void testGetKvarKomentar() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/" + 
    			KvarConstants.DB_ID_REFERENCED + "/komentar"))
    		.andExpect(status().isOk())
    		.andExpect(content().contentType(contentType))
    		.andExpect(jsonPath("$", hasSize(DB_COUNT_KVAR_KOMENTARI)))
    		.andExpect(jsonPath("$.[*].datKreairanja").value(
    				hasItem(KomentarConstants.DB_DAT_KREIRANJA)))
    		.andExpect(jsonPath("$.[*].text").value(
    				hasItem(KomentarConstants.DB_TEXT)))
    		.andExpect(jsonPath("$.[*].kreator.id").value(
    				hasItem(KomentarConstants.DB_KREATOR_ID.intValue())));
    }
}
