package project.service;

import static org.assertj.core.api.Assertions.assertThat;
import static project.constants.ObavestenjeConstants.DB_DAT_KREIRANJA;
import static project.constants.ObavestenjeConstants.DB_IME;
import static project.constants.ObavestenjeConstants.DB_OPIS;
import static project.constants.ObavestenjeConstants.DB_KREATOR_ID;
import static project.constants.ObavestenjeConstants.DB_ZGRADA_ID;
import static project.constants.ObavestenjeConstants.DB_COUNT;
import static project.constants.ObavestenjeConstants.DB_ID;
import static project.constants.ObavestenjeConstants.NEW_DAT_KREIRANJA;
import static project.constants.ObavestenjeConstants.NEW_IME;
import static project.constants.ObavestenjeConstants.NEW_OPIS;
import static project.constants.ObavestenjeConstants.DB_COUNT_WITH_KREATOR;
import static project.constants.ObavestenjeConstants.DB_COUNT_WITH_ZGRADA;

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
import project.model.Obavestenje;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class ObavestenjeServiceTest {
	@Autowired
	ObavestenjeService obavestenjeService;
	
	@Test
	public void testFindAll() {
		List<Obavestenje> obavestenja = obavestenjeService.findAll();
		assertThat(obavestenja).hasSize(DB_COUNT);
	}
	
	@Test 
	public void testFindOne() {
		Obavestenje dbObavestenje= obavestenjeService.findOne(DB_ID);
		assertThat(dbObavestenje).isNotNull();
		
		assertThat(dbObavestenje.getId()).isEqualTo(DB_ID);
		assertThat(dbObavestenje.getDatKreiranja()).hasSameTimeAs(DB_DAT_KREIRANJA);
		assertThat(dbObavestenje.getIme()).isEqualTo(DB_IME);
		assertThat(dbObavestenje.getKreator().getId()).isEqualTo(DB_KREATOR_ID);
		assertThat(dbObavestenje.getOpis()).isEqualTo(DB_OPIS);
		assertThat(dbObavestenje.getZgrada().getId()).isEqualTo(DB_ZGRADA_ID);
	}
	
	@Test
    @Transactional
    @Rollback(true) //it can be omitted because it is true by default
	public void testAdd() {
		Obavestenje obavestenje = new Obavestenje();
		obavestenje.setDatKreiranja(NEW_DAT_KREIRANJA);
		obavestenje.setIme(NEW_IME);
		obavestenje.setOpis(NEW_OPIS);
		
		int dbSizeBeforeAdd = obavestenjeService.findAll().size();
		
		Obavestenje dbObavestenje = obavestenjeService.save(obavestenje);
		assertThat(dbObavestenje).isNotNull();
				
		// Validate that new failure is in the database
        List<Obavestenje> obavestenja = obavestenjeService.findAll();
        assertThat(obavestenja).hasSize(dbSizeBeforeAdd + 1);
        dbObavestenje = obavestenja.get(obavestenja.size() - 1); //get last student
        assertThat(dbObavestenje.getDatKreiranja()).isEqualTo(NEW_DAT_KREIRANJA);
        assertThat(dbObavestenje.getIme()).isEqualTo(NEW_IME);
        assertThat(dbObavestenje.getOpis()).isEqualTo(NEW_OPIS);
        //assertThat(dbObavestenje.getKreator()).isEqualTo(DB_KREATOR_ID);
        //assertThat(dbObavestenje.getZgrada()).isEqualTo(ZgradaConstants.NEW_ZGRADA_ID);
	}
	
	@Test
	@Transactional
	@Rollback(true)
	public void testDelete() {
		int dbSizeBeforeRemove = obavestenjeService.findAll().size();
		obavestenjeService.delete(DB_ID);
		
		List<Obavestenje> obavestenja = obavestenjeService.findAll();
		assertThat(obavestenja).hasSize(dbSizeBeforeRemove - 1);
		
		Obavestenje dbObavestenje = obavestenjeService.findOne(DB_ID);
		assertThat(dbObavestenje).isNull();
	}
	
	@Test
	public void testFindByZgrada() {
		List<Obavestenje> obavestenja = obavestenjeService.findByZgradaId(DB_ZGRADA_ID);
		assertThat(obavestenja).hasSize(DB_COUNT_WITH_ZGRADA);
	}
	
	@Test
	public void testFindByKreator() {
		List<Obavestenje> obavestenja = obavestenjeService.findByKreatorId(DB_KREATOR_ID);
		assertThat(obavestenja).hasSize(DB_COUNT_WITH_KREATOR);
	}
}
