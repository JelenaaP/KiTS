package project.service;
import static org.assertj.core.api.Assertions.assertThat;
import static project.constants.KomentarConstants.DB_DAT_KREIRANJA;
import static project.constants.KomentarConstants.DB_TEXT;
import static project.constants.KomentarConstants.DB_KVAR_ID;
import static project.constants.KomentarConstants.DB_KREATOR_ID;
import static project.constants.KomentarConstants.NEW_DAT_KREIRANJA;
import static project.constants.KomentarConstants.NEW_TEXT;
import static project.constants.KomentarConstants.DB_COUNT_WITH_KREATOR;
import static project.constants.KomentarConstants.DB_COUNT;
import static project.constants.KomentarConstants.DB_ID;

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
import project.model.Komentar;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")

public class KomentarServiceTest {
	@Autowired
	KomentarService komentarService;
	
	@Test
	public void testFindAll() {
		List<Komentar> komentari = komentarService.findAll();
		assertThat(komentari).hasSize(DB_COUNT);
	}
	
	@Test 
	public void testFindOne() {
		Komentar dbKomentar= komentarService.findOne(DB_ID);
		assertThat(dbKomentar).isNotNull();
		
		assertThat(dbKomentar.getId()).isEqualTo(DB_ID);
		assertThat(dbKomentar.getDatKreiranja()).isEqualTo(DB_DAT_KREIRANJA);
		assertThat(dbKomentar.getText()).isEqualTo(DB_TEXT);
		assertThat(dbKomentar.getKreator().getId()).isEqualTo(DB_KREATOR_ID);
		assertThat(dbKomentar.getKvar().getId()).isEqualTo(DB_KVAR_ID);
		
	}
	@Test
    @Transactional
    @Rollback(true) //it can be omitted because it is true by default
	public void testAdd() {
		Komentar komentar = new Komentar();
		komentar.setDatKreiranja(NEW_DAT_KREIRANJA);
		komentar.setText(NEW_TEXT);
		
		int dbSizeBeforeAdd = komentarService.findAll().size();
		
		Komentar dbKomentar = komentarService.save(komentar);
		assertThat(dbKomentar).isNotNull();
				
		// Validate that new failure is in the database
        List<Komentar> komentari = komentarService.findAll();
        assertThat(komentari).hasSize(dbSizeBeforeAdd + 1);
        dbKomentar = komentari.get(komentari.size() - 1); //get last student
        assertThat(dbKomentar.getDatKreiranja()).isEqualTo(NEW_DAT_KREIRANJA);
        assertThat(dbKomentar.getText()).isEqualTo(NEW_TEXT);

	}
	
	@Test
	@Transactional
	@Rollback(true)
	public void testRemove() {
		int dbSizeBeforeRemove = komentarService.findAll().size();
		komentarService.delete(DB_ID);
		
		List<Komentar> komentari = komentarService.findAll();
		assertThat(komentari).hasSize(dbSizeBeforeRemove - 1);
		
		Komentar dbKomentar = komentarService.findOne(DB_ID);
		assertThat(dbKomentar).isNull();
	}
	
	@Test
	public void testFindByKreator() {
		List<Komentar> komentar = komentarService.findByKreatorId(DB_KREATOR_ID);
		assertThat(komentar).hasSize(DB_COUNT_WITH_KREATOR);
	}

}
