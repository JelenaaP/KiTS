package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Firma;

public interface FirmaRepository extends JpaRepository<Firma,Long> {
	
	public Firma findByIme(String ime);
	public Firma findByAdresa(String adresa);
	public Firma findByRadnik(String radnik);
}