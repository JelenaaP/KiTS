package project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Kvar;

public interface KvarRepository extends JpaRepository<Kvar,Long>{

	Kvar findOneByName(String ime);
	
	Kvar findOneByDat_kreiranja(Date dat_kreiranja);

	Kvar findOneByDat_zakazivanja(Date dat_zakazivanja);

	Kvar findOneByDat_popravke(Date dat_popravke);

	Kvar findAllByWorker(String radnik);

	List<Kvar> findAllByBuilding(String zgrada);

	Kvar findOneById(Long id_kvar);
}
