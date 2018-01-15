package project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Kvar;

public interface KvarRepository extends JpaRepository<Kvar,Long>{

	Kvar findByIme(String ime);
	
	Kvar findByDatKreiranja(Date datKreiranja);

	Kvar findByDatZakazivanja(Date datZakazivanja);

	Kvar findByDatPopravke(Date datPopravke);

	Kvar findByRadnik(String radnik);

	List<Kvar> findByZgrada(String zgrada);

	List<Kvar> findByKreator(String kreator);
}