package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Firma;

public interface FirmaRepository extends JpaRepository<Firma,Long> {
	
	public Firma findOneByName(String ime);
	public Firma findOneByAdress(String adresa);
	public List<Firma> findOneById(String ime);
}
