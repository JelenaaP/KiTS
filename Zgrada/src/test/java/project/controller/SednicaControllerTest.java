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

import static project.constants.SednicaConstants.DB_AKTIVNA;
import static project.constants.SednicaConstants.DB_COUNT;
import static project.constants.SednicaConstants.DB_DAT_KREIRANJA;
import static project.constants.SednicaConstants.DB_DAT_ZAKAZIVANJA;
import static project.constants.SednicaConstants.DB_KREATOR_ID;
import static project.constants.SednicaConstants.DB_ZGRADA_ID;
import static project.constants.SednicaConstants.NEW_AKTIVNA;
import static project.constants.SednicaConstants.NEW_DAT_KREIRANJA;
import static project.constants.SednicaConstants.DB_COUNT_SEDNICA_STAVKA;

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
import project.constants.KvarConstants;
import project.constants.SednicaConstants;
import project.constants.StavkaConstants;
import project.constants.ZapisnikConstants;
import project.dto.Korisnik_servisaDto;
import project.dto.SednicaDto;
import project.dto.ZgradaDto;
import project.service.Korisnik_servisaService;
import project.service.ZgradaService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")
public class SednicaControllerTest {
private static final String URL_PREFIX = "/api/sednica";

	
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
    public void testGetAllSednica() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/all"))
	        .andExpect(status().isOk())
	        .andExpect(content().contentType(contentType))
	        .andExpect(jsonPath("$", hasSize(DB_COUNT)))
	        .andExpect(jsonPath("$.[*].id").value(hasItem(SednicaConstants.DB_ID.intValue())))
            .andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA.getTime())))
            .andExpect(jsonPath("$.[*].datZakazivanja").value(hasItem(DB_DAT_ZAKAZIVANJA.getTime())))
    		.andExpect(jsonPath("$.[*].aktivna").value(hasItem(DB_AKTIVNA)))
    		.andExpect(jsonPath("$.[*].zgrada.id").value(hasItem(DB_ZGRADA_ID.intValue())))
    		.andExpect(jsonPath("$.[*].kreator.id").value(hasItem(DB_KREATOR_ID.intValue())));
    }
    @Test
    public void testGetSednicaByKreator() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findKreator?kreator=" + ZapisnikConstants.DB_ZGRADA_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.[*].id").value(hasItem(SednicaConstants.DB_ID.intValue())))
        .andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA.getTime())))
        .andExpect(jsonPath("$.[*].datZakazivanja").value(hasItem(DB_DAT_ZAKAZIVANJA.getTime())))
		.andExpect(jsonPath("$.[*].aktivna").value(hasItem(DB_AKTIVNA)))
		.andExpect(jsonPath("$.[*].zgrada.id").value(hasItem(DB_ZGRADA_ID.intValue())))
		.andExpect(jsonPath("$.[*].kreator.id").value(hasItem(DB_KREATOR_ID.intValue())));
    }
    
    @Test
    public void testGetSednicaByZgrada() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findZgrada?zgrada=" + ZapisnikConstants.DB_ZGRADA_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.[*].id").value(hasItem(SednicaConstants.DB_ID.intValue())))
        .andExpect(jsonPath("$.[*].datKreiranja").value(hasItem(DB_DAT_KREIRANJA.getTime())))
        .andExpect(jsonPath("$.[*].datZakazivanja").value(hasItem(DB_DAT_ZAKAZIVANJA.getTime())))
		.andExpect(jsonPath("$.[*].aktivna").value(hasItem(DB_AKTIVNA)))
		.andExpect(jsonPath("$.[*].zgrada.id").value(hasItem(DB_ZGRADA_ID.intValue())))
		.andExpect(jsonPath("$.[*].kreator.id").value(hasItem(DB_KREATOR_ID.intValue())));
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testSaveSednica() throws Exception {
    	SednicaDto sednica = new SednicaDto();
    	sednica.setDatKreiranja(NEW_DAT_KREIRANJA);
		sednica.setDatZakazivanja(NEW_DAT_KREIRANJA);
		sednica.setZgrada(new ZgradaDto(zgradaService.findOne(1L)));
    	sednica.setKreator(new Korisnik_servisaDto(korisnikServisa.findOne(1L)));
		sednica.setAktivna(NEW_AKTIVNA);
		
    	String json = TestUtil.json(sednica);
        this.mockMvc.perform(post(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isCreated());
    }
    @Test
    @Transactional
    @Rollback(true)
    public void testUpdateSednica() throws Exception {
    	SednicaDto sednica = new SednicaDto();
    	
    	sednica.setId(SednicaConstants.DB_ID);
    	sednica.setDatKreiranja(NEW_DAT_KREIRANJA);
		sednica.setDatZakazivanja(NEW_DAT_KREIRANJA);
		sednica.setZgrada(new ZgradaDto(zgradaService.findOne(1L)));
    	sednica.setKreator(new Korisnik_servisaDto(korisnikServisa.findOne(1L)));
		sednica.setAktivna(NEW_AKTIVNA);
		
    	String json = TestUtil.json(sednica);
        this.mockMvc.perform(put(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isOk());
    }
    @Test
    @Transactional
    @Rollback(true)
    public void testDeleteSednica() throws Exception { 	
        this.mockMvc.perform(delete(URL_PREFIX + "/" + KvarConstants.DB_ID))
                .andExpect(status().isOk());
    }
    @Test
    public void testGetSednicaStavka() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/" + 
    			SednicaConstants.DB_ID_REFERENCED + "/stavka"))
    		.andExpect(status().isOk())
    		.andExpect(content().contentType(contentType))
    		.andExpect(jsonPath("$", hasSize(DB_COUNT_SEDNICA_STAVKA)))
    		.andExpect(jsonPath("$.[*].datKreiranja").value(
    				hasItem(StavkaConstants.DB_DAT_KREIRANJA.getTime())))
    		.andExpect(jsonPath("$.[*].opis").value(
    				hasItem(StavkaConstants.DB_OPIS)))
    		.andExpect(jsonPath("$.[*].ime").value(
    				hasItem(StavkaConstants.DB_IME)))
    		.andExpect(jsonPath("$.[*].kreator.id").value(
    				(StavkaConstants.DB_KREATOR_ID.intValue())));
    }
    
    @Test
    public void testGetSednicaZapisnik() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/" + 
    			SednicaConstants.DB_ID_REFERENCED + "/zapisnik"))
    		.andExpect(status().isOk())
    		.andExpect(content().contentType(contentType))
    		.andExpect(jsonPath("$.datKreiranja").value(ZapisnikConstants.DB_DAT_KREIRANJA.getTime()))
    		.andExpect(jsonPath("$.opis").value(ZapisnikConstants.DB_OPIS))
    		.andExpect(jsonPath("$.zgrada.id").value(ZapisnikConstants.DB_ZGRADA_ID.intValue()))
    		.andExpect(jsonPath("$.kreator.id").value(ZapisnikConstants.DB_KREATOR_ID.intValue()));
    }
    
}
