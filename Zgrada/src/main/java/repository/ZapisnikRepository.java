package repository;

import java.util.Date;
import java.util.List;

import model.Zapisnik;

public interface ZapisnikRepository {

	List<Zapisnik> findBySednica(Zapisnik zapisnik);

	Zapisnik save(Zapisnik zapisnik);

	void delete(Zapisnik zapisnik);

	Zapisnik findOneByDat_kreiranja(Date dat_kreiranja);

}
