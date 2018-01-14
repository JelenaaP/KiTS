package project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Zapisnik;

public interface ZapisnikRepository extends JpaRepository<Zapisnik, Long>{

	List<Zapisnik> findBySednica(String sednica);

	Zapisnik findOneByDat_kreiranja(Date dat_kreiranja);

	List<Zapisnik> findOneByKreator(String kreator);

	List<Zapisnik> findAllByZgrada(String zgrada);

	List<Zapisnik> findAllByKreator(String kreator);

	Zapisnik findOneById_zapisnik(Long id_zapisnik);

}
