package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Korisnik_servisa;

public interface Korisnik_servisaRepository extends JpaRepository<Korisnik_servisa,Long> {
	
	public Korisnik_servisa findByKorisIme(String korisIme);

	public List<Korisnik_servisa> findByIme(String ime);
}
