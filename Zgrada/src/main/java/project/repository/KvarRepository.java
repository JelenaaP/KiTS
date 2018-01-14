package project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Kvar;

public interface KvarRepository extends JpaRepository<Kvar,Long>{

	Kvar findOneByIme(String ime);
	
	Kvar findOneByDat_kreiranja(Date dat_kreiranja);

	Kvar findOneByDat_zakazivanja(Date dat_zakazivanja);

	Kvar findOneByDat_popravke(Date dat_popravke);

	Kvar findAllByRadnik(String radnik);

	List<Kvar> findAllByZgrada(String zgrada);

	Kvar findOneById_kvar(Long id_kvar);
	
	List<Kvar> findAllByKreator (String kreator);
}