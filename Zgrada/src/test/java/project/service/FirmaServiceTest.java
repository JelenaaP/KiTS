package project.service;

import static org.assertj.core.api.Assertions.assertThat;
import static project.constants.FirmaConstants.DB_ADRESA;
import static project.constants.FirmaConstants.DB_COUNT;
import static project.constants.FirmaConstants.DB_EMAIL;
import static project.constants.FirmaConstants.DB_IME;
import static project.constants.FirmaConstants.DB_VLASNIK_ID;
import static project.constants.FirmaConstants.DB_WEB_SITE;
import static project.constants.FirmaConstants.NEW_ADRESA;
import static project.constants.FirmaConstants.NEW_IME;
import static project.constants.FirmaConstants.DB_TELEFON;
import static project.constants.FirmaConstants.NEW_TELEFON;
import static project.constants.FirmaConstants.NEW_EMAIL;
import static project.constants.FirmaConstants.DB_COUNT_WITH_ADRESA;
import static project.constants.FirmaConstants.DB_ID;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import project.MyApplication;
import project.model.Firma;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class FirmaServiceTest {
	
	@Autowired
	FirmaService firmaService;
	
	@Test
	public void testFindAll() {
		List<Firma> firme = firmaService.findAll();
		assertThat(firme).hasSize(DB_COUNT);
	}
	
	@Test 
	public void testFindOne() {
		Firma dbFirma= firmaService.findOne(DB_ID);
		assertThat(dbFirma).isNotNull();
		
		assertThat(dbFirma.getId()).isEqualTo(DB_ID);
		assertThat(dbFirma.getAdresa()).isEqualTo(DB_ADRESA);
		assertThat(dbFirma.getEmail()).isEqualTo(DB_EMAIL);
		assertThat(dbFirma.getIme()).isEqualTo(DB_IME);
		assertThat(dbFirma.getTelefon()).isEqualTo(DB_TELEFON);
		assertThat(dbFirma.getWebSite()).isEqualTo(DB_WEB_SITE);
		assertThat(dbFirma.getVlasnik().getId()).isEqualTo(DB_VLASNIK_ID);
	}
	
	@Test
    @Transactional
    @Rollback(true) //it can be omitted because it is true by default
	public void testAdd() {
		Firma firma = new Firma();
		firma.setAdresa(NEW_ADRESA);
		firma.setEmail(NEW_EMAIL);
		firma.setTelefon(NEW_TELEFON);
		firma.setIme(NEW_IME);
		
		int dbSizeBeforeAdd = firmaService.findAll().size();
		
		Firma dbFirma = firmaService.save(firma);
		assertThat(dbFirma).isNotNull();
				
		// Validate that new building is in the database
        List<Firma> firme = firmaService.findAll();
        assertThat(firme).hasSize(dbSizeBeforeAdd + 1);
        dbFirma = firme.get(firme.size() - 1); //get last student
        assertThat(dbFirma.getAdresa()).isEqualTo(NEW_ADRESA);
        assertThat(dbFirma.getEmail()).isEqualTo(NEW_EMAIL);
        assertThat(dbFirma.getTelefon()).isEqualTo(NEW_TELEFON);
        assertThat(dbFirma.getIme()).isEqualTo(NEW_IME);
	}
	
	@Test(expected = DataIntegrityViolationException.class)
	@Transactional
	@Rollback(true)
	public void testRemove() {
		int dbSizeBeforeRemove = firmaService.findAll().size();
		firmaService.delete(DB_ID);
		
		List<Firma> firme = firmaService.findAll();
		assertThat(firme).hasSize(dbSizeBeforeRemove - 1);
		
		Firma dbFirma = firmaService.findOne(DB_ID);
		assertThat(dbFirma).isNull();
	}
	
	@Test
	public void testFindByAdresa() {
		List<Firma> firme = firmaService.findByAdresa(DB_ADRESA);
		assertThat(firme).hasSize(DB_COUNT_WITH_ADRESA);
	}
	
	
}
