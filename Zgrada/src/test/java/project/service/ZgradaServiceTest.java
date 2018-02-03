package project.service;

import static org.assertj.core.api.Assertions.assertThat;
import static project.constants.ZgradaConstants.DB_ADRESA;
import static project.constants.ZgradaConstants.DB_BR_NASELJENIH;
import static project.constants.ZgradaConstants.DB_BR_STANOVA;
import static project.constants.ZgradaConstants.DB_ID;
import static project.constants.ZgradaConstants.DB_IME;
import static project.constants.ZgradaConstants.DB_VLASNIK_ID;
import static project.constants.ZgradaConstants.DB_COUNT;
import static project.constants.ZgradaConstants.NEW_ADRESA;
import static project.constants.ZgradaConstants.NEW_BR_NASELJENIH;
import static project.constants.ZgradaConstants.NEW_BR_STANOVA;
import static project.constants.ZgradaConstants.NEW_IME;
import static project.constants.ZgradaConstants.DB_COUNT_WITH_ADRESA;
import static project.constants.ZgradaConstants.DB_COUNT_WITH_VLASNIK;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import project.MyApplication;
import project.model.Zgrada;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class ZgradaServiceTest {
	@Autowired
	ZgradaService zgradaService;
	
	@Test
	public void testFindAll() {
		List<Zgrada> zgrade = zgradaService.findAll();
		assertThat(zgrade).hasSize(DB_COUNT);
	}
	
	@Test 
	public void testFindOne() {
		Zgrada dbZgrada= zgradaService.findOne(DB_ID);
		assertThat(dbZgrada).isNotNull();
		
		assertThat(dbZgrada.getId()).isEqualTo(DB_ID);
		assertThat(dbZgrada.getAdresa()).isEqualTo(DB_ADRESA);
		assertThat(dbZgrada.getBrNaseljenih()).isEqualTo(DB_BR_NASELJENIH);
		assertThat(dbZgrada.getBrStanova()).isEqualTo(DB_BR_STANOVA);
		assertThat(dbZgrada.getIme()).isEqualTo(DB_IME);
		assertThat(dbZgrada.getVlasnik()).isEqualTo(DB_VLASNIK_ID);
	}
	
	@Test
    @Transactional
    @Rollback(true) //it can be omitted because it is true by default
	public void testAdd() {
		Zgrada zgrada = new Zgrada();
		zgrada.setAdresa(NEW_ADRESA);
		zgrada.setBrNaseljenih(NEW_BR_NASELJENIH);
		zgrada.setBrStanova(NEW_BR_STANOVA);
		zgrada.setIme(NEW_IME);
		
		int dbSizeBeforeAdd = zgradaService.findAll().size();
		
		Zgrada dbZgrada = zgradaService.save(zgrada);
		assertThat(dbZgrada).isNotNull();
				
		// Validate that new building is in the database
        List<Zgrada> zgrade = zgradaService.findAll();
        assertThat(zgrade).hasSize(dbSizeBeforeAdd + 1);
        dbZgrada = zgrade.get(zgrade.size() - 1); //get last student
        assertThat(dbZgrada.getAdresa()).isEqualTo(NEW_ADRESA);
        assertThat(dbZgrada.getBrNaseljenih()).isEqualTo(NEW_BR_NASELJENIH);
        assertThat(dbZgrada.getBrStanova()).isEqualTo(NEW_BR_STANOVA);
        assertThat(dbZgrada.getIme()).isEqualTo(NEW_IME);
	}
	
	@Test
	@Transactional
	@Rollback(true)
	public void testRemove() {
		int dbSizeBeforeRemove = zgradaService.findAll().size();
		zgradaService.delete(DB_ID);
		
		List<Zgrada> zgrade = zgradaService.findAll();
		assertThat(zgrade).hasSize(dbSizeBeforeRemove - 1);
		
		Zgrada dbZgrada = zgradaService.findOne(DB_ID);
		assertThat(dbZgrada).isNull();
	}
	
	@Test
	public void testFindByAdresa() {
		List<Zgrada> zgrade = zgradaService.findByAdresa(DB_ADRESA);
		assertThat(zgrade).hasSize(DB_COUNT_WITH_ADRESA);
	}
	@Test
	public void testFindByVlasnik() {
		List<Zgrada> zgrade = zgradaService.findByVlasnik(DB_VLASNIK_ID);
		assertThat(zgrade).hasSize(DB_COUNT_WITH_VLASNIK);
	}
}
