package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Firma;

public interface FirmaRepository extends JpaRepository<Firma,Long> {
	
	public Firma findOneByIme(String ime);
	public Firma findOneByAdresa(String adresa);
	public Firma findByRadnik(String radnik);
}