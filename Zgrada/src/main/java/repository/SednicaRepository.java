package repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Sednica;

public interface SednicaRepository extends JpaRepository<Sednica, Long> {

	public List<Sednica> findAll();
	public Sednica findOneByDat_kreiranja(Date dat_kreiranja);
	public Sednica findOneByDat_zakazivanja(Date dat_zakazivanja);
	public Sednica findByAktivna(boolean aktivna);
	public Sednica findOneById(Long id_zapisnik);
	public List<Sednica> findByCreator(String kreator);
	public List<Sednica> findByBuilding(String zgrada);
}
