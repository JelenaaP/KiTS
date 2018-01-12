package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Stan;

public interface StanRepository extends JpaRepository<Stan, Long>{

	Stan findOneByName(String ime);
	Stan findOneByAdress(String adresa);
	Stan findOneByOwner(String vlasnik);
	List<Stan> findAllByAddress(String adresa);
	List<Stan> findAllByOwner(String vlasnik);
	Stan findOneByAddress(String adresa);

}
