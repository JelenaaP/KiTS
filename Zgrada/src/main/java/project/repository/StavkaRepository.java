package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Stavka;

public interface StavkaRepository extends JpaRepository<Stavka, Long> {

	public List<Stavka> findBySednica(String sednica);
	public List<Stavka> findByKreator(String kreator);
}
