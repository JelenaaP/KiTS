package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Firma;

public interface FirmaRepository extends JpaRepository<Firma,Long> {
	
	public Firma findOneByName(String ime);
}
