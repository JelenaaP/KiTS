package project.service;

import static org.assertj.core.api.Assertions.assertThat;

import static project.constants.StavkaConstants.DB_COUNT;
import static project.constants.StavkaConstants.DB_DAT_KREIRANJA;
import static project.constants.StavkaConstants.DB_ID;
import static project.constants.StavkaConstants.DB_IME;
import static project.constants.StavkaConstants.DB_OPIS;
import static project.constants.StavkaConstants.NEW_DAT_KREIRANJA;
import static project.constants.StavkaConstants.NEW_IME;
import static project.constants.StavkaConstants.NEW_OPIS;
import static project.constants.StavkaConstants.DB_KREATOR_ID;
import static project.constants.StavkaConstants.DB_COUNT_WITH_KREATOR;

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
import project.model.Stavka;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class StavkaServiceTest {
	
	@Autowired
	StavkaService stavkaService;
	
	@Test
	public void testFindAll() {
		List<Stavka> stavke = stavkaService.findAll();
		assertThat(stavke).hasSize(DB_COUNT);
	}
	
	@Test 
	public void testFindOne() {
		Stavka dbStavka= stavkaService.findOne(DB_ID);
		//assertThat(dbStavka).isNotNull();
		assertThat(dbStavka.getId()).isEqualTo(DB_ID);
		assertThat(dbStavka.getDatKreiranja()).isEqualTo(DB_DAT_KREIRANJA);
		assertThat(dbStavka.getIme()).isEqualTo(DB_IME);
		assertThat(dbStavka.getOpis()).isEqualTo(DB_OPIS);
		assertThat(dbStavka.getKreator()).isEqualTo(DB_KREATOR_ID);
	}
	
	@Test
    @Transactional
    @Rollback(true) //it can be omitted because it is true by default
	public void testAdd() {
		Stavka stavka = new Stavka();
		stavka.setDatKreiranja(NEW_DAT_KREIRANJA);
		stavka.setIme(NEW_IME);
		stavka.setOpis(NEW_OPIS);
		
		
		
		int dbSizeBeforeAdd = stavkaService.findAll().size();
		
		Stavka dbStavka = stavkaService.save(stavka);
		assertThat(dbStavka).isNotNull();
				
		// Validate that new failure is in the database
        List<Stavka> stavke = stavkaService.findAll();
        assertThat(stavke).hasSize(dbSizeBeforeAdd + 1);
        dbStavka = stavke.get(stavke.size() - 1); 
        assertThat(dbStavka.getDatKreiranja()).isEqualTo(NEW_DAT_KREIRANJA);
        assertThat(dbStavka.getIme()).isEqualTo(NEW_IME);
        assertThat(dbStavka.getOpis()).isEqualTo(NEW_OPIS);
	}
	
	@Test
	@Transactional
	@Rollback(true)
	public void testRemove() {
		int dbSizeBeforeRemove = stavkaService.findAll().size();
		stavkaService.delete(DB_ID);
		
		List<Stavka> stavke = stavkaService.findAll();
		assertThat(stavke).hasSize(dbSizeBeforeRemove - 1);
		
		Stavka dbStavka = stavkaService.findOne(DB_ID);
		assertThat(dbStavka).isNull();
	}
	
	@Test
	public void testFindByKreator() {
		List<Stavka> stavke = stavkaService.findByKreatorId(DB_KREATOR_ID);
		assertThat(stavke).hasSize(DB_COUNT_WITH_KREATOR);
	}

}
