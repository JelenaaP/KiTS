package project.service;

import static org.assertj.core.api.Assertions.assertThat;
import static project.constants.KvarConstants.DB_DAT_KREIRANJA;
import static project.constants.KvarConstants.DB_DAT_ZAKAZIVANJA;
import static project.constants.KvarConstants.DB_DAT_POPRAVKE;
import static project.constants.KvarConstants.DB_IME;
import static project.constants.KvarConstants.DB_OPIS;
import static project.constants.KvarConstants.DB_POPRAVLJEN;
import static project.constants.KvarConstants.DB_KREATOR_ID;
import static project.constants.KvarConstants.DB_ZGRADA_ID;
import static project.constants.KvarConstants.DB_COUNT;
import static project.constants.KvarConstants.DB_ID;
import static project.constants.KvarConstants.NEW_DAT_KREIRANJA;
import static project.constants.KvarConstants.NEW_IME;
import static project.constants.KvarConstants.NEW_OPIS;
import static project.constants.KvarConstants.DB_COUNT_WITH_KORISNIK_SERVISA_ID;
import static project.constants.KvarConstants.DB_KORISNIK_SERVISA_ID;

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
import project.model.Kvar;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class KvarServiceTest {
	@Autowired
	KvarService kvarService;
	
	@Test
	public void testFindAll() {
		List<Kvar> kvarovi = kvarService.findAll();
		assertThat(kvarovi).hasSize(DB_COUNT);
	}
	
	@Test 
	public void testFindOne() {
		Kvar dbKvar= kvarService.findOne(DB_ID);
		assertThat(dbKvar).isNotNull();
		
		assertThat(dbKvar.getId()).isEqualTo(DB_ID);
		assertThat(dbKvar.getDatKreiranja()).hasSameTimeAs(DB_DAT_KREIRANJA);
		assertThat(dbKvar.getDatZakazivanja()).hasSameTimeAs(DB_DAT_ZAKAZIVANJA);
		assertThat(dbKvar.getDatPopravke()).hasSameTimeAs(DB_DAT_POPRAVKE);
		assertThat(dbKvar.getIme()).isEqualTo(DB_IME);
		assertThat(dbKvar.getOpis()).isEqualTo(DB_OPIS);
		assertThat(dbKvar.getKreator().getId()).isEqualTo(DB_KREATOR_ID);
		assertThat(dbKvar.isPopravljen()).isEqualTo(DB_POPRAVLJEN);
		assertThat(dbKvar.getZgrada().getId()).isEqualTo(DB_ZGRADA_ID);
	}
	
	@Test
    @Transactional
    @Rollback(true) //it can be omitted because it is true by default
	public void testAdd() {
		Kvar kvar = new Kvar();
		kvar.setDatKreiranja(NEW_DAT_KREIRANJA);
		kvar.setIme(NEW_IME);
		kvar.setOpis(NEW_OPIS);
		
		int dbSizeBeforeAdd = kvarService.findAll().size();
		
		Kvar dbKvar = kvarService.save(kvar);
		assertThat(dbKvar).isNotNull();
				
		// Validate that new failure is in the database
        List<Kvar> kvarovi = kvarService.findAll();
        assertThat(kvarovi).hasSize(dbSizeBeforeAdd + 1);
        dbKvar = kvarovi.get(kvarovi.size() - 1); //get last failure
        assertThat(dbKvar.getDatKreiranja()).hasSameTimeAs(NEW_DAT_KREIRANJA);
        assertThat(dbKvar.getIme()).isEqualTo(NEW_IME);
        assertThat(dbKvar.getOpis()).isEqualTo(NEW_OPIS);
        //assertThat(dbKvar.getKreator().isEqualTo(DB_KREATOR_ID);
	}
	
	@Test(expected = DataIntegrityViolationException.class)
	@Transactional
	@Rollback(true)
	public void testRemove() {
		int dbSizeBeforeRemove = kvarService.findAll().size();
		kvarService.delete(DB_ID);
		
		List<Kvar> kvarovi = kvarService.findAll();
		assertThat(kvarovi).hasSize(dbSizeBeforeRemove - 1);
		
		Kvar dbKvar = kvarService.findOne(DB_ID);
		assertThat(dbKvar).isNull();
	}
	
	@Test
	public void testFindByZgrada() {
		List<Kvar> kvarovi = kvarService.findByZgradaId(DB_ZGRADA_ID);
		assertThat(kvarovi).hasSize(DB_COUNT);
	}
	
	@Test
	public void testFindByRadnik() {
		List<Kvar> kvarovi = kvarService.findByRadnikId(DB_KORISNIK_SERVISA_ID);
		assertThat(kvarovi).hasSize(DB_COUNT_WITH_KORISNIK_SERVISA_ID);
	}
}
