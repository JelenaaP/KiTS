package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.model.Zgrada;

public interface ZgradaRepository extends JpaRepository<Zgrada, Long>{

	List<Zgrada> findByAdresa(String adresa);

	List<Zgrada> findByVlasnikId(Long vlasnik);

	Zgrada findOneByAdresa(String adresa);
}