package project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Sednica;

public interface SednicaRepository extends JpaRepository<Sednica, Long> {

	public Sednica findByDatKreiranja(Date datKreiranja);
	public Sednica findByDatZakazivanja(Date datZakazivanja);
	public Sednica findByAktivna(boolean aktivna);
	public Sednica findById(Long id_zapisnik);
	public List<Sednica> findByKreator(Long kreator);
	public List<Sednica> findByZgrada(Long zgrada);
}
