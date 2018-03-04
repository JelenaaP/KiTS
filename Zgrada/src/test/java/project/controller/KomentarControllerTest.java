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


import static project.constants.KomentarConstants.DB_DAT_KREIRANJA;
import static project.constants.KomentarConstants.DB_TEXT;
import static project.constants.KomentarConstants.DB_KVAR_ID;
import static project.constants.KomentarConstants.DB_KREATOR_ID;
import static project.constants.KomentarConstants.NEW_DAT_KREIRANJA;
import static project.constants.KomentarConstants.NEW_TEXT;
import static project.constants.KomentarConstants.DB_COUNT;


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
import project.constants.KomentarConstants;
import project.dto.KomentarDto;
import project.dto.Korisnik_servisaDto;
import project.dto.KvarDto;
import project.service.Korisnik_servisaService;
import project.service.KvarService;
import project.MyApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class KomentarControllerTest {
private static final String URL_PREFIX = "/api/komentar";

	
	private MediaType contentType = new MediaType(
			MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;
    
    @Autowired
    private WebApplicationContext webApplicationContext;
    
    @Autowired
    private Korisnik_servisaService korisnikService;
    
    @Autowired
    private KvarService kvarService;
    
    @PostConstruct
    public void setup() {
    	this.mockMvc = MockMvcBuilders.
    			webAppContextSetup(webApplicationContext).build();
    }
    
    @Test
    public void testGetAllKomentar() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/all"))
	        .andExpect(status().isOk())
	        .andExpect(content().contentType(contentType))
	        .andExpect(jsonPath("$", hasSize(DB_COUNT)))
	        .andExpect(jsonPath("$.[*].id").value(hasItem(KomentarConstants.DB_ID.intValue())))
	        .andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA.getTime())))
            .andExpect(jsonPath("$.[*].text").value(hasItem(DB_TEXT)))
            .andExpect(jsonPath("$.[*].kvar.id").value(hasItem(DB_KVAR_ID.intValue())))
    		.andExpect(jsonPath("$.[*].kreator.id").value(hasItem(DB_KREATOR_ID.intValue())));
    }
    
    @Test
    public void testGetKomentarByKvar() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findKvar?kvar=" + KomentarConstants.DB_KVAR_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.[*].id").value(hasItem(KomentarConstants.DB_ID.intValue())))
    	.andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA.getTime())))
		.andExpect(jsonPath("$.[*].text").value(hasItem(DB_TEXT)))
		.andExpect(jsonPath("$.[*].kvar.id").value(hasItem(DB_KVAR_ID.intValue())));

    }
    
    @Test
    public void testGetKomentarByKreator() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findKreator?kreator=" + KomentarConstants.DB_KREATOR_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.[*].id").value(hasItem(KomentarConstants.DB_ID.intValue())))
    	.andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA.getTime())))
        .andExpect(jsonPath("$.[*].text").value(hasItem(DB_TEXT)))
        .andExpect(jsonPath("$.[*].kvar.id").value(hasItem(DB_KVAR_ID.intValue())))
		.andExpect(jsonPath("$.[*].kreator.id").value(hasItem(DB_KREATOR_ID.intValue())));
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testSaveKomentar() throws Exception {
    	KomentarDto komentar = new KomentarDto();
    	
    	komentar.setText(NEW_TEXT);
    	komentar.setDatKreiranja(NEW_DAT_KREIRANJA);
    	komentar.setKreator(new Korisnik_servisaDto(korisnikService.findOne(1L)));
    	komentar.setKvar(new KvarDto(kvarService.findOne(1L)));
		
    	String json = TestUtil.json(komentar);
        this.mockMvc.perform(post(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isCreated());
    }
	
    @Test
    @Transactional
    @Rollback(true)
    public void testUpdateKomentar() throws Exception {
    	KomentarDto komentar = new KomentarDto();
    	komentar.setId(KomentarConstants.DB_ID);
    	komentar.setText(NEW_TEXT);
    	komentar.setDatKreiranja(NEW_DAT_KREIRANJA);
    	
    	String json = TestUtil.json(komentar);
    	System.out.println(json);
        
        this.mockMvc.perform(put(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isOk());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testDeleteKomentar() throws Exception { 	
        this.mockMvc.perform(delete(URL_PREFIX + "/" + KomentarConstants.DB_ID))
        
                .andExpect(status().isOk());
    }
}
