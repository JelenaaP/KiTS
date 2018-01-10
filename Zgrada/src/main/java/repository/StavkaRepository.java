package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Sednica;
import model.Stavka;

public interface StavkaRepository extends JpaRepository<Stavka, Long> {

	public List<Stavka> findBySednica(Sednica sednica);
	
}
