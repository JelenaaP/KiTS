package project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Sednica;

public interface SednicaRepository extends JpaRepository<Sednica, Long> {

	public Sednica findByDat_kreiranja(Date dat_kreiranja);
	public Sednica findByDat_zakazivanja(Date dat_zakazivanja);
	public Sednica findByAktivna(boolean aktivna);
	public Sednica findById_zapisnik(Long id_zapisnik);
	public List<Sednica> findByKreator(String kreator);
	public List<Sednica> findByZgrada(String zgrada);
}
