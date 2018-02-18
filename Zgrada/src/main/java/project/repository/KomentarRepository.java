package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Komentar;

public interface KomentarRepository extends JpaRepository<Komentar, Long> {

	public List<Komentar> findByKvarId(Long kvar);
	public List<Komentar> findByKreatorId(Long kreator);
}
