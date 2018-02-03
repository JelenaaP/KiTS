package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

import project.model.Obavestenje;

public interface ObavestenjeRepository extends JpaRepository<Obavestenje,Long> {

	Obavestenje findByDatKreiranja(Date datKreiranja);

	List<Obavestenje> findByKreator(Long kreator);

	List<Obavestenje> findByZgrada(Long zgrada);
}
