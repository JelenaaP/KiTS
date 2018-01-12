package project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Korisnik_servisa;
import project.model.Sednica;
import project.model.Zapisnik;
import project.model.Zgrada;

public interface ZapisnikRepository extends JpaRepository<Zapisnik, Long>{

	List<Zapisnik> findBySednica(Sednica sednica);

	Zapisnik findOneByDat_kreiranja(Date dat_kreiranja);

	List<Zapisnik> findByOwner(Korisnik_servisa kreator);

	List<Zapisnik> findByBuilding(Zgrada zgrada);

	List<Zapisnik> findAllByCreator(String kreator);

	List<Zapisnik> finAllByBuilding(String zgrada);

	Zapisnik findOneById(Long id_zapisnik);

}
