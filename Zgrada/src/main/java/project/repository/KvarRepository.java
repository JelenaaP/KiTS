package project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Kvar;

public interface KvarRepository extends JpaRepository<Kvar,Long>{

	Kvar findByIme(String ime);
	
	Kvar findByDat_kreiranja(Date dat_kreiranja);

	Kvar findByDat_zakazivanja(Date dat_zakazivanja);

	Kvar findByDat_popravke(Date dat_popravke);

	Kvar findByRadnik(String radnik);

	List<Kvar> findByZgrada(String zgrada);
	
	List<Kvar> findByKreator (String kreator);
}