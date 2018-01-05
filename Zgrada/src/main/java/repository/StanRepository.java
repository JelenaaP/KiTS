package repository;
import org.springframework.data.jpa.repository.JpaRepository;

import model.Stan;

public interface StanRepository extends JpaRepository<Stan, Long>{

	Stan findOneByName(String ime);
	Stan findOneByAdress(String adresa);
	Stan findOneByowner(String vlasnik);

}
