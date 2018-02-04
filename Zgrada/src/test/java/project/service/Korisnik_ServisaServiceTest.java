package project.service;

import static org.assertj.core.api.Assertions.assertThat;
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


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import project.MyApplication;
import project.model.Korisnik_servisa;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class Korisnik_ServisaServiceTest {
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	@Test
	public void testFindAll() {
		List<Korisnik_servisa> korisnici = korisnik_servisaService.findAll();
		assertThat(korisnici).hasSize(DB_COUNT);
	}
	
	@Test
	public void testFindAllPageable() {
		PageRequest pageRequest = new PageRequest(1, PAGE_SIZE); //second page
		Page<Korisnik_servisa> korisnici = korisnik_servisaService.findAll(pageRequest);
		assertThat(korisnici).hasSize(PAGE_SIZE); 
	}
	
	@Test 
	public void testFindOne() {
		Korisnik_servisa dbKorisnik = korisnik_servisaService.findOne(DB_ID);
		assertThat(dbKorisnik).isNotNull();
		
		assertThat(dbKorisnik.getId()).isEqualTo(DB_ID);
		assertThat(dbKorisnik.getIme()).isEqualTo(DB_IME);
        assertThat(dbKorisnik.getKorisIme()).isEqualTo(DB_KORIS_IME);
        assertThat(dbKorisnik.getLozinka()).isEqualTo(DB_LOZINKA);  
        assertThat(dbKorisnik.getUloga()).isEqualTo(DB_ULOGA);  
	}
	
	@Test
    @Transactional
    @Rollback(true) //it can be omitted because it is true by default
	public void testAdd() {
		Korisnik_servisa korisnik = new Korisnik_servisa();
		korisnik.setIme(NEW_IME);
		korisnik.setKorisIme(NEW_KORIS_IME);
		korisnik.setLozinka(NEW_LOZINKA);
		
		int dbSizeBeforeAdd = korisnik_servisaService.findAll().size();
		
		Korisnik_servisa dbKorisnik = korisnik_servisaService.save(korisnik);
		assertThat(dbKorisnik).isNotNull();
				
		// Validate that new student is in the database
        List<Korisnik_servisa> korisnici = korisnik_servisaService.findAll();
        assertThat(korisnici).hasSize(dbSizeBeforeAdd + 1);
        dbKorisnik = korisnici.get(korisnici.size() - 1); //get last student
        assertThat(dbKorisnik.getIme()).isEqualTo(NEW_IME);
        assertThat(dbKorisnik.getKorisIme()).isEqualTo(NEW_KORIS_IME);
        assertThat(dbKorisnik.getLozinka()).isEqualTo(NEW_LOZINKA);     
        
	}
	
	@Test
    @Transactional
    @Rollback(true)
	public void testUpdate() {
		Korisnik_servisa dbKorisnik = korisnik_servisaService.findOne(DB_ID);
		
		dbKorisnik.setIme(NEW_IME);
		dbKorisnik.setKorisIme(NEW_KORIS_IME);
		dbKorisnik.setLozinka(NEW_LOZINKA);
		dbKorisnik.setUloga(NEW_ULOGA);
		
		dbKorisnik = korisnik_servisaService.save(dbKorisnik);
		assertThat(dbKorisnik).isNotNull();
		
		//verify that database contains updated data
		dbKorisnik = korisnik_servisaService.findOne(DB_ID);
        assertThat(dbKorisnik.getIme()).isEqualTo(NEW_IME);
        assertThat(dbKorisnik.getKorisIme()).isEqualTo(NEW_KORIS_IME);
        assertThat(dbKorisnik.getLozinka()).isEqualTo(NEW_LOZINKA);
        assertThat(dbKorisnik.getUloga()).isEqualTo(NEW_ULOGA);

	}
	
	@Test
	@Transactional
	@Rollback(true)
	public void testRemove() {
		int dbSizeBeforeRemove = korisnik_servisaService.findAll().size();
		korisnik_servisaService.delete(DB_ID);
		
		List<Korisnik_servisa> korisnici = korisnik_servisaService.findAll();
		assertThat(korisnici).hasSize(dbSizeBeforeRemove - 1);
		
		Korisnik_servisa dbKorisnik = korisnik_servisaService.findOne(DB_ID);
		assertThat(dbKorisnik).isNull();
	}
	
	@Test
	public void testFindByIme() {
		Korisnik_servisa dbKorisnik = korisnik_servisaService.findByKorisIme(DB_IME);
		assertThat(dbKorisnik).isNotNull();
		
		assertThat(dbKorisnik.getId()).isEqualTo(DB_ID);
		assertThat(dbKorisnik.getIme()).isEqualTo(DB_IME);
        assertThat(dbKorisnik.getKorisIme()).isEqualTo(DB_KORIS_IME);
        assertThat(dbKorisnik.getLozinka()).isEqualTo(DB_LOZINKA);  
        assertThat(dbKorisnik.getUloga()).isEqualTo(DB_ULOGA);  

	}
	
	@Test
	public void testFindByKorisIme() {
		List<Korisnik_servisa> korisnici = korisnik_servisaService.findByIme(DB_KORIS_IME);
		assertThat(korisnici).hasSize(DB_COUNT_WITH_KORIS_IME);
	}
	
	@Test(expected = DataIntegrityViolationException.class)
	@Transactional
	@Rollback(true)
	public void testRemoveNegative() {
		int dbSizeBeforeRemove = korisnik_servisaService.findAll().size();
		korisnik_servisaService.delete(DB_ID_KORISNIKA);
		
		List<Korisnik_servisa> korisnici = korisnik_servisaService.findAll();
		assertThat(korisnici).hasSize(dbSizeBeforeRemove - 1);
		
		Korisnik_servisa dbKorisnik = korisnik_servisaService.findOne(DB_ID_KORISNIKA);
		assertThat(dbKorisnik).isNull();
	}
	

}
