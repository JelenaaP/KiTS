package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Zgrada;

public interface ZgradaRepository extends JpaRepository<Zgrada, Long>{

	List<Zgrada> findAllByAdresa(String adresa);

	List<Zgrada> findAllByVlasnik(String vlasnik);

	Zgrada findOneByAdresa(String adresa);

	Zgrada findOneById_zgrada(Long id_zgrada);
}