package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Komentar;

public interface KomentarRepository extends JpaRepository<Komentar, Long> {

	public List<Komentar> findByKvar(String kvar);
	public List<Komentar> findByKreator(String kreator);
	public Komentar findOneById_komentar(Long id_komentar);

	
}
