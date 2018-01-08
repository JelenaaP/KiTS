package repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Korisnik_servisa;
import model.Kvar;
import model.Zgrada;

public interface KvarRepository extends JpaRepository<Kvar,Long>{

	Kvar findOneByName(String ime);

	List<Kvar> findByZgrada(Zgrada zgrada);

	Kvar findOneByDat_kreiranja(Date dat_kreiranja);

	Kvar findOneByDat_zakazivanja(Date dat_zakazivanja);

	Kvar findOneByDat_popravke(Date dat_popravke);

	Kvar findAllByWorker(Korisnik_servisa radnik);

	Kvar findAllByOwner(Korisnik_servisa kreator);
	

}
