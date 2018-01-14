package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

import project.model.Obavestenje;

public interface ObavestenjeRepository extends JpaRepository<Obavestenje,Long> {

	Obavestenje findOneByDat_kreiranja(Date dat_kreiranja);

	List<Obavestenje> findAllByKreator(String kreator);

	List<Obavestenje> findAllByZgrada(String zgrada);

	Obavestenje findOneById_obavestenje(Long id_obavestenje);
}
