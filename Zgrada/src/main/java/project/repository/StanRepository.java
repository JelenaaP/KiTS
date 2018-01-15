package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Stan;

public interface StanRepository extends JpaRepository<Stan, Long>{

	Stan findByIme(String ime);
	Stan findByAdresa(String adresa);
	Stan findByVlasnik(String vlasnik);
	List<Stan> findAllByAdresa(String adresa);
	List<Stan> findAllByVlasnik(String vlasnik);
}
