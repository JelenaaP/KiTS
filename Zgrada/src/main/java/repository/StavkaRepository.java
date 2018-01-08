package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



import model.Stavka;
import model.Zgrada;

public interface StavkaRepository extends JpaRepository<Stavka, Long> {
	

}
