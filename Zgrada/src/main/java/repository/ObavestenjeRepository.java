package repository;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

import model.Korisnik_servisa;
import model.Obavestenje;
import model.Zgrada;

public interface ObavestenjeRepository extends JpaRepository<Obavestenje,Long> {

	Obavestenje findOneByDat_kreiranja(Date dat_kreiranja);

	Obavestenje findAllByOwner(Korisnik_servisa kreator);

	List<Obavestenje> findByZgrada(Zgrada zgrada);

}
