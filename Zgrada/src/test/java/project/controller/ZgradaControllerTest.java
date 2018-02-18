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

import static project.constants.ZgradaConstants.DB_ADRESA;
import static project.constants.ZgradaConstants.DB_BR_NASELJENIH;
import static project.constants.ZgradaConstants.DB_BR_STANOVA;
import static project.constants.ZgradaConstants.DB_IME;
import static project.constants.ZgradaConstants.DB_VLASNIK_ID;
import static project.constants.ZgradaConstants.DB_COUNT;
import static project.constants.ZgradaConstants.NEW_BR_NASELJENIH;
import static project.constants.ZgradaConstants.NEW_BR_STANOVA;
import static project.constants.ZgradaConstants.NEW_IME;
import static project.constants.ZgradaConstants.DB_COUNT_ZGRADA_STANOVI;
import static project.constants.ZgradaConstants.DB_COUNT_ZGRADA_KVAROVI;
import static project.constants.ZgradaConstants.DB_COUNT_ZGRADA_OBAVESTENJA;

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
import project.constants.ObavestenjeConstants;
import project.constants.StanConstants;
import project.constants.ZgradaConstants;
import project.dto.Korisnik_servisaDto;
import project.dto.ZgradaDto;
import project.service.Korisnik_servisaService;
import project.service.ZgradaService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")
public class ZgradaControllerTest {
	private static final String URL_PREFIX = "/api/zgrada";

	
	private MediaType contentType = new MediaType(
			MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    Korisnik_servisaService korisnikService;
    
    @Autowired
    ZgradaService zgradaService;
    
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
            .andExpect(jsonPath("$.[*].brNaseljenih").value(hasItem(DB_BR_NASELJENIH)))
            .andExpect(jsonPath("$.[*].brStanova").value(hasItem(DB_BR_STANOVA)))
    		.andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
    		.andExpect(jsonPath("$.[*].vlasnik.id").value(hasItem(DB_VLASNIK_ID.intValue())));
    }
    
    @Test
    public void testGetZgradaByAdresa() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findAdresa?adresa=" + ZgradaConstants.DB_ADRESA))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.[*].id").value(hasItem(ZgradaConstants.DB_ID.intValue())))
        .andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
        .andExpect(jsonPath("$.[*].adresa").value(hasItem(DB_ADRESA)))
        .andExpect(jsonPath("$.[*].brStanova").value(hasItem(DB_BR_STANOVA)))
        .andExpect(jsonPath("$.[*].brNaseljenih").value(hasItem(DB_BR_NASELJENIH)))
        .andExpect(jsonPath("$.[*].vlasnik.id").value(hasItem(DB_VLASNIK_ID.intValue())));
    }
    
    @Test
    public void testGetZgradaByVlasnik() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/findVlasnik?vlasnik=" + ZgradaConstants.DB_VLASNIK_ID))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$.[*].id").value(hasItem(ZgradaConstants.DB_ID.intValue())))
        .andExpect(jsonPath("$.[*].ime").value(hasItem(DB_IME)))
        .andExpect(jsonPath("$.[*].adresa").value(hasItem(DB_ADRESA)))
        .andExpect(jsonPath("$.[*].brStanova").value(hasItem(DB_BR_STANOVA)))
        .andExpect(jsonPath("$.[*].brNaseljenih").value(hasItem(DB_BR_NASELJENIH)));
        
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testSaveZgrada() throws Exception {
    	ZgradaDto zgrada = new ZgradaDto();
    	
		zgrada.setIme(NEW_IME);
		zgrada.setAdresa(DB_ADRESA);
		zgrada.setBrNaseljenih(NEW_BR_NASELJENIH);
		zgrada.setBrStanova(NEW_BR_STANOVA);
		zgrada.setVlasnik(new Korisnik_servisaDto(korisnikService.findOne(1L)));
		
    	String json = TestUtil.json(zgrada);
        this.mockMvc.perform(post(URL_PREFIX)
                .contentType(contentType)
                .content(json))
                .andExpect(status().isCreated());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testUpdateZgrada() throws Exception {
    	ZgradaDto zgrada = new ZgradaDto();
    	
    	zgrada.setId(ZgradaConstants.DB_ID);
		zgrada.setIme(NEW_IME);
		zgrada.setBrStanova(NEW_BR_STANOVA);
		zgrada.setBrNaseljenih(NEW_BR_NASELJENIH);
    	
    	String json = TestUtil.json(zgrada);
        this.mockMvc.perform(put(URL_PREFIX)
        	    .contentType(contentType)
                .content(json))
                .andExpect(status().isOk());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void testDeleteZgrada() throws Exception { 	
        this.mockMvc.perform(delete(URL_PREFIX + "/" + ZgradaConstants.DB_ID))
                .andExpect(status().isOk());
    }
    
    @Test
    public void testGetZgradaStanovi() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/" + 
    			ZgradaConstants.DB_ID_REFERENCED + "/stan"))
    		.andExpect(status().isOk())
    		.andExpect(content().contentType(contentType))
    		.andExpect(jsonPath("$", hasSize(DB_COUNT_ZGRADA_STANOVI)))
    		.andExpect(jsonPath("$.[*].id").value(
    				hasItem(StanConstants.DB_ID.intValue())))
    		.andExpect(jsonPath("$.[*].adresa").value(
    				hasItem(StanConstants.DB_ADRESA)))
    		.andExpect(jsonPath("$.[*].ime").value(
    				hasItem(StanConstants.DB_IME)))
    		.andExpect(jsonPath("$.[*].brStanovnika").value(
    				hasItem(StanConstants.DB_BR_STANOVNIKA)))
    		.andExpect(jsonPath("$.[*].vlasnik.id").value(
    				hasItem(StanConstants.DB_VLASNIK_ID.intValue())));
    }

    @Test
    public void testGetZgradaKvar() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/" + 
    			ZgradaConstants.DB_ID_REFERENCED + "/kvar"))
    		.andExpect(status().isOk())
    		.andExpect(content().contentType(contentType))
    		.andExpect(jsonPath("$", hasSize(DB_COUNT_ZGRADA_KVAROVI)))
    		.andExpect(jsonPath("$.[*].datZakazivanja").value(
    				hasItem(KvarConstants.DB_DAT_ZAKAZIVANJA.getTime())))
    		.andExpect(jsonPath("$.[*].datKreiranja").value(
    				hasItem(KvarConstants.DB_DAT_KREIRANJA.getTime())))
    		.andExpect(jsonPath("$.[*].datPopravke").value(
    				hasItem(KvarConstants.DB_DAT_POPRAVKE.getTime())))
    		.andExpect(jsonPath("$.[*].kreator.id").value(
    				hasItem(KvarConstants.DB_KREATOR_ID.intValue())))
    		.andExpect(jsonPath("$.[*].ime").value(
    				hasItem(KvarConstants.DB_IME)))
    		.andExpect(jsonPath("$.[*].opis").value(
    				hasItem(KvarConstants.DB_OPIS)))
    		.andExpect(jsonPath("$.[*].popravljen").value(
    				hasItem(KvarConstants.DB_POPRAVLJEN)));
    }
    @Test
    public void testGetZgradaObavestenja() throws Exception {
    	mockMvc.perform(get(URL_PREFIX + "/" + 
    			ZgradaConstants.DB_ID_REFERENCED + "/obavestenje"))
    		.andExpect(status().isOk())
    		.andExpect(content().contentType(contentType))
    		.andExpect(jsonPath("$", hasSize(DB_COUNT_ZGRADA_OBAVESTENJA)))
    		//.andExpect(jsonPath("$.[*].datKreiranja").value(
    			//	hasItem(ObavestenjeConstants.DB_DAT_KREIRANJA)))
    		.andExpect(jsonPath("$.[*].kreator.id").value(
    				hasItem(ObavestenjeConstants.DB_KREATOR_ID.intValue())))
    		.andExpect(jsonPath("$.[*].ime").value(
    				hasItem(ObavestenjeConstants.DB_IME)))
    		.andExpect(jsonPath("$.[*].opis").value(
    				hasItem(ObavestenjeConstants.DB_OPIS)));
    }
}
