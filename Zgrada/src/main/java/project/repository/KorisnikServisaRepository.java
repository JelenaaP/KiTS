package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Korisnik_servisa;

public interface KorisnikServisaRepository extends JpaRepository<Korisnik_servisa,Long> {
	
	public Korisnik_servisa findOneByKoris_ime(String koris_ime);

	public List<Korisnik_servisa> findAllByIme(String ime);
	
	public List <Korisnik_servisa> findAll();
	
}
