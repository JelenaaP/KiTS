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

	List<Kvar> findByRadnikId(Long radnik);

	List<Kvar> findByZgradaId(Long Zgrada);

	List<Kvar> findByKreatorId(Long kreator);
}