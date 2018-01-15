package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

import project.model.Obavestenje;

public interface ObavestenjeRepository extends JpaRepository<Obavestenje,Long> {

	Obavestenje findByDat_kreiranja(Date dat_kreiranja);

	List<Obavestenje> findByKreator(String kreator);

	List<Obavestenje> findByZgrada(String zgrada);
}
