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
import static project.constants.ZapisnikConstants.DB_COUNT;
import static project.constants.ZapisnikConstants.DB_DAT_KREIRANJA;
import static project.constants.ZapisnikConstants.DB_KREATOR_ID;
import static project.constants.ZapisnikConstants.DB_ZGRADA_ID;
import static project.constants.ZapisnikConstants.DB_OPIS;
import static project.constants.ZapisnikConstants.NEW_DAT_KREIRANJA;
import static project.constants.ZapisnikConstants.NEW_OPIS;

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
import project.constants.ZapisnikConstants;
import project.dto.Korisnik_servisaDto;
import project.dto.SednicaDto;
import project.dto.ZapisnikDto;
import project.dto.ZgradaDto;
import project.service.Korisnik_servisaService;
import project.service.SednicaService;
import project.service.ZgradaService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")
public class ZapisnikControllerTest {
private static final String URL_PREFIX = "/api/zapisnik";

	
	private MediaType contentType = new MediaType(
			MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;
    
    @Autowired
    private WebApplicationContext webApplicationContext;
    
    @Autowired
    ZgradaService zgradaService;
    
    @Autowired
    Korisnik_servisaService korisnikService;
    
    @Autowired
    SednicaService sednicaService;
    
    @PostConstruct
    public void setup() {
    	this.mockMvc = MockMvcBuilders.
    			webAppContextSetup(webApplicationContext).build();
    }
    @Test
    public void testGetAllZapisnik() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/all"))
	        .andExpect(status().isOk())
	        .andExpect(content().contentType(contentType))
	        .andExpect(jsonPath("$", hasSize(DB_COUNT)))
	        .andExpect(jsonPath("$.[*].id").value(hasItem(ZapisnikConstants.DB_ID.intValue())))
            .andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA.getTime())))
    		.andExpect(jsonPath("$.[*].opis").value(hasItem(DB_OPIS)))
    		.andExpect(jsonPath("$.[*].zgrada.id").value(hasItem(DB_ZGRADA_ID.intValue())))
    		.andExpect(jsonPath("$.[*].sednica.id").value(hasItem(ZapisnikConstants.DB_SEDNICA_ID.intValue())))
    		.andExpect(jsonPath("$.[*].kreator.id").value(hasItem(DB_KREATOR_ID.intValue())));
    }
    @Test
    public void testGetZapisnikByKreator() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findKreator?kreator=" + ZapisnikConstants.DB_KREATOR_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.[*].id").value(hasItem(ZapisnikConstants.DB_ID.intValue())))
    	 .andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA.getTime())))
 		.andExpect(jsonPath("$.[*].opis").value(hasItem(DB_OPIS)))
 		.andExpect(jsonPath("$.[*].sednica.id").value(hasItem(ZapisnikConstants.DB_SEDNICA_ID.intValue())))
 		.andExpect(jsonPath("$.[*].zgrada.id").value(hasItem(DB_ZGRADA_ID.intValue())));
    }
    @Test
    public void testGetZapisnikBySednica() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findSednica?sednicaId=" + ZapisnikConstants.DB_SEDNICA_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.id").value(ZapisnikConstants.DB_ID.intValue()))
    	 .andExpect(jsonPath("$.datKreiranja").value(DB_DAT_KREIRANJA.getTime()))
 		.andExpect(jsonPath("$.opis").value(DB_OPIS))
 		.andExpect(jsonPath("$.kreator.id").value(ZapisnikConstants.DB_KREATOR_ID.intValue()));
    }
    @Test
    @Transactional
    @Rollback(true)
    public void testSaveZapisnik() throws Exception {
    	ZapisnikDto zapisnik = new ZapisnikDto();
    	
    	zapisnik.setSednica(new SednicaDto(sednicaService.findOne(1L)));
		zapisnik.setDatKreiranja(NEW_DAT_KREIRANJA);
		zapisnik.setOpis(NEW_OPIS);
		zapisnik.setZgrada(new ZgradaDto(zgradaService.findOne(1L)));
		zapisnik.setKreator(new Korisnik_servisaDto(korisnikService.findOne(1L)));
		
    	String json = TestUtil.json(zapisnik);
        this.mockMvc.perform(post(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isCreated());
    }
    @Test
    @Transactional
    @Rollback(true)
    public void testUpdateZapisnik() throws Exception {
    	ZapisnikDto zapisnik = new ZapisnikDto();
    	
    	zapisnik.setId(ZapisnikConstants.DB_ID);
    	zapisnik.setDatKreiranja(NEW_DAT_KREIRANJA);
		zapisnik.setOpis(NEW_OPIS);
		zapisnik.setZgrada(new ZgradaDto(zgradaService.findOne(1L)));
		zapisnik.setSednica(new SednicaDto(sednicaService.findOne(1L)));
		
    	String json = TestUtil.json(zapisnik);
        this.mockMvc.perform(put(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isOk());
    }
    @Test
    @Transactional
    @Rollback(true)
    public void testDeleteZapisnik() throws Exception { 	
        this.mockMvc.perform(delete(URL_PREFIX + "/" + ZapisnikConstants.DB_ID))
                .andExpect(status().isOk());
    }
    
    

}
