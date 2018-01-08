package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Korisnik_servisa;

public interface KorisnikServisaRepository extends JpaRepository<Korisnik_servisa,Long> {
	
	public Korisnik_servisa findOneByUsername(String koris_ime);
	
	

}
