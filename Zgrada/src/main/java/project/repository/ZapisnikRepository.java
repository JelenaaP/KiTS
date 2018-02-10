package project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Zapisnik;

public interface ZapisnikRepository extends JpaRepository<Zapisnik, Long>{

	List<Zapisnik> findBySednicaId(String sednica);

	Zapisnik findByDatKreiranja(Date datKreiranja);

	List<Zapisnik> findByZgradaId(Long zgrada);

	List<Zapisnik> findByKreatorId(Long kreator);
}
