package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import model.Komentar;
import model.Kvar;

public interface KomentarRepository extends JpaRepository<Komentar, Long> {

	public List<Komentar> findByKvar(Kvar kvar);
	
}
