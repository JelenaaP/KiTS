package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Zgrada;

public interface ZgradaRepository extends JpaRepository<Zgrada, Long>{

	List<Zgrada> findAllByAddress(String adresa);

	List<Zgrada> findAllByOwner(String vlasnik);

	Zgrada findOneByAddress(String adresa);
}