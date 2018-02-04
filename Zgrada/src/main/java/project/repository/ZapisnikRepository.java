package project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Zapisnik;

public interface ZapisnikRepository extends JpaRepository<Zapisnik, Long>{

	List<Zapisnik> findBySednica(String sednica);

	Zapisnik findByDatKreiranja(Date datKreiranja);

	List<Zapisnik> findByZgrada(Long zgrada);

	List<Zapisnik> findByKreator(Long kreator);
}
