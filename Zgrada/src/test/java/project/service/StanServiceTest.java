package project.service;

import static org.assertj.core.api.Assertions.assertThat;
import static project.constants.StanConstants.DB_ADRESA;
import static project.constants.StanConstants.DB_COUNT;
import static project.constants.StanConstants.DB_COUNT_WITH_ADRESA;
import static project.constants.StanConstants.DB_COUNT_WITH_VLASNIK;
import static project.constants.StanConstants.DB_ID;
import static project.constants.StanConstants.DB_IME;
import static project.constants.StanConstants.DB_VLASNIK_ID;
import static project.constants.StanConstants.NEW_ADRESA;
import static project.constants.StanConstants.NEW_IME;
import static project.constants.StanConstants.DB_BR_STANOVNIKA;
import static project.constants.StanConstants.DB_ZGRADA_ID;
import static project.constants.StanConstants.NEW_BR_STANOVNIKA;

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
import project.constants.Korisnik_ServisaConstants;
import project.model.Stan;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class StanServiceTest {
	@Autowired
	StanService stanService;
	

	@Test
	public void testFindAll() {
		List<Stan> stanovi = stanService.findAll();
		assertThat(stanovi).hasSize(DB_COUNT);
	}
	
	@Test 
	public void testFindOne() {
		Stan dbStan= stanService.findOne(DB_ID);
		assertThat(dbStan).isNotNull();	
		assertThat(dbStan.getId()).isEqualTo(DB_ID);
		assertThat(dbStan.getAdresa()).isEqualTo(DB_ADRESA);
		assertThat(dbStan.getBrStanovnika()).isEqualTo((DB_BR_STANOVNIKA));
		assertThat(dbStan.getIme()).isEqualTo(DB_IME);
		assertThat(dbStan.getVlasnik().getId()).isEqualTo(DB_VLASNIK_ID);
		assertThat(dbStan.getZgrada().getId()).isEqualTo(DB_ZGRADA_ID);
	}

	@Test
    @Transactional
    @Rollback(true) //it can be omitted because it is true by default
	public void testAdd() {
		Stan stan = new Stan();
		stan.setAdresa(NEW_ADRESA);
		stan.setBrStanovnika(NEW_BR_STANOVNIKA);
		stan.setIme(NEW_IME);
		stan.setVlasnik(Korisnik_ServisaConstants.NEW_VLASNIK_ID);
		
		int dbSizeBeforeAdd = stanService.findAll().size();
		
		Stan dbStan = stanService.save(stan);
		assertThat(dbStan).isNotNull();
				
		// Validate that new apartment is in the database
        List<Stan> stanovi = stanService.findAll();
        assertThat(stanovi).hasSize(dbSizeBeforeAdd + 1);
        dbStan = stanovi.get(stanovi.size() - 1);//poslednji stan
        assertThat(dbStan.getAdresa()).isEqualTo(NEW_ADRESA);
        assertThat(dbStan.getBrStanovnika()).isEqualTo(NEW_BR_STANOVNIKA);
        assertThat(dbStan.getIme()).isEqualTo(NEW_IME);
        assertThat(dbStan.getVlasnik()).isEqualTo(Korisnik_ServisaConstants.NEW_VLASNIK_ID);
}
	@Test
	@Transactional
	@Rollback(true)
	public void testRemove() {
		int dbSizeBeforeRemove = stanService.findAll().size();
		stanService.delete(DB_ID);
		
		List<Stan> stanovi = stanService.findAll();
		assertThat(stanovi).hasSize(dbSizeBeforeRemove - 1);
		
		Stan dbStan = stanService.findOne(DB_ID);
		assertThat(dbStan).isNull();
	}
	@Test
	public void testFindByAdresa() {
		List<Stan> stanovi = stanService.findAllByAdresa(DB_ADRESA);
		assertThat(stanovi).hasSize(DB_COUNT_WITH_ADRESA);
	}
	@Test
	public void testFindByVlasnik() {
		List<Stan> stanovi = stanService.findAllByVlasnikId(DB_VLASNIK_ID);
		assertThat(stanovi).hasSize(DB_COUNT_WITH_VLASNIK);
	}
}
