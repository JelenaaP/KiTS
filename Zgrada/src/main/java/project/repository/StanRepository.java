package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Stan;

public interface StanRepository extends JpaRepository<Stan, Long>{

	Stan findOneByIme(String ime);
	Stan findOneByAdresa(String adresa);
	Stan findOneByVlasnik(String vlasnik);
	List<Stan> findAllByAddresa(String adresa);
	List<Stan> findAllByVlasnik(String vlasnik);
	Stan findOneByAddresa(String adresa);
	Stan findOneById_stanovi(Long id_stanovi);

}
