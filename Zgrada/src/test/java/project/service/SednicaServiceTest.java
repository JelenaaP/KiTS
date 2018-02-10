package project.service;
import static org.assertj.core.api.Assertions.assertThat;

import static project.constants.SednicaConstants.DB_AKTIVNA;

import static project.constants.SednicaConstants.DB_COUNT;
import static project.constants.SednicaConstants.DB_DAT_KREIRANJA;
import static project.constants.SednicaConstants.DB_ID;
import static project.constants.SednicaConstants.DB_DAT_ZAKAZIVANJA;
import static project.constants.SednicaConstants.DB_COUNT_WITH_ZGRADA;
import static project.constants.SednicaConstants.DB_COUNT_WITH_KREATOR;
import static project.constants.SednicaConstants.DB_KREATOR_ID;
import static project.constants.SednicaConstants.DB_ZGRADA_ID;
import static project.constants.SednicaConstants.NEW_DAT_ZAKAZIVANJA;
import static project.constants.SednicaConstants.NEW_DAT_KREIRANJA;
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
import project.model.Sednica;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyApplication.class)
@WebIntegrationTest
@TestPropertySource(locations="classpath:test.properties")
public class SednicaServiceTest {
	@Autowired
	SednicaService sednicaService;
	
	@Test
	public void testFindAll() {
		List<Sednica> sednice = sednicaService.findAll();
		assertThat(sednice).hasSize(DB_COUNT);
	}
	@Test 
	public void testFindOne() {
		Sednica dbSednica= sednicaService.findOne(DB_ID);
		assertThat(dbSednica).isNotNull();
		assertThat(dbSednica.isAktivna()).isEqualTo(DB_AKTIVNA);
		assertThat(dbSednica.getId()).isEqualTo(DB_ID);
		assertThat(dbSednica.getDatKreiranja()).hasSameTimeAs(DB_DAT_KREIRANJA);
		assertThat(dbSednica.getDatZakazivanja()).hasSameTimeAs(DB_DAT_ZAKAZIVANJA);
		assertThat(dbSednica.getKreator().getId()).isEqualTo(DB_KREATOR_ID);
		assertThat(dbSednica.getZgrada().getId()).isEqualTo(DB_ZGRADA_ID);
	}

	@Test
    @Transactional
    @Rollback(true) //it can be omitted because it is true by default
	public void testAdd() {
		Sednica sednica = new Sednica();
		sednica.setDatKreiranja(NEW_DAT_KREIRANJA);
		sednica.setDatZakazivanja(NEW_DAT_ZAKAZIVANJA);
		sednica.setAktivna(DB_AKTIVNA);
		
		
		
		int dbSizeBeforeAdd = sednicaService.findAll().size();
		
		Sednica dbSednica = sednicaService.save(sednica);
		assertThat(dbSednica).isNotNull();
				
		// Validate that new failure is in the database
        List<Sednica>sednice = sednicaService.findAll();
        assertThat(sednice).hasSize(dbSizeBeforeAdd + 1);
        dbSednica = sednice.get(sednice.size() - 1); 
        assertThat(dbSednica.getDatKreiranja()).isEqualTo(NEW_DAT_KREIRANJA);
        assertThat(dbSednica.getDatZakazivanja()).isEqualTo(NEW_DAT_ZAKAZIVANJA);
        assertThat(dbSednica.isAktivna()).isEqualTo(DB_AKTIVNA);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testRemove() {
		int dbSizeBeforeRemove = sednicaService.findAll().size();
		sednicaService.delete(DB_ID);
		
		List<Sednica> sednice = sednicaService.findAll();
		assertThat(sednice).hasSize(dbSizeBeforeRemove - 1);
		
		Sednica dbSednica = sednicaService.findOne(DB_ID);
		assertThat(dbSednica).isNull();
	}
	
	@Test
	public void testFindByZgrada() {
		List<Sednica> sednice = sednicaService.findByZgradaId(DB_ZGRADA_ID);
		assertThat(sednice).hasSize(DB_COUNT_WITH_ZGRADA);
	}
	
	@Test
	public void testFindByKreator() {
		List<Sednica> sednice = sednicaService.findByKreatorId(DB_KREATOR_ID);
		assertThat(sednice).hasSize(DB_COUNT_WITH_KREATOR);
	}
}
