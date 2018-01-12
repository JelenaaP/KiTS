package project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

import project.model.Obavestenje;
import project.model.Zgrada;

public interface ObavestenjeRepository extends JpaRepository<Obavestenje,Long> {

	Obavestenje findOneByDat_kreiranja(Date dat_kreiranja);

	List<Obavestenje> findAllByOwner(String kreator);

	List<Obavestenje> findByZgrada(Zgrada zgrada);

	Obavestenje findOneById(Long id_obavestenje);

	List<Obavestenje> findOneById(String zgrada);
}
