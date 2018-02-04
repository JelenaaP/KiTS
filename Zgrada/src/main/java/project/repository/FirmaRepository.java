package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Firma;

public interface FirmaRepository extends JpaRepository<Firma,Long> {
	
	public Firma findByIme(String ime);
	public Firma findByAdresa(String adresa);
	public Firma findByRadnici(String radnik);
	public List<Firma> findByAddress(String adresa);
}