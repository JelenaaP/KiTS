package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Korisnik_servisa;

public interface KorisnikServisaRepository extends JpaRepository<Korisnik_servisa,Long> {
	
	public Korisnik_servisa findOneByUsername(String koris_ime);

	public Korisnik_servisa findAllByName(String ime);
	
	public List <Korisnik_servisa> findAll();
	
}
