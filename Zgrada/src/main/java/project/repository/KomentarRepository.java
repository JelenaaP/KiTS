package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import project.model.Komentar;
import project.model.Korisnik_servisa;
import project.model.Kvar;

public interface KomentarRepository extends JpaRepository<Komentar, Long> {

	public List<Komentar> findByKvar(Kvar kvar);
	public List<Komentar> findByOwner(Korisnik_servisa kreator);
	public Komentar findOneById(Long id_komentar);

	
}
