package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Zgrada;

public interface ZgradaRepository extends JpaRepository<Zgrada, Long>{

	Zgrada findOneByName(String name);

	Zgrada findOneByAdress(String adresa);

	Zgrada findAllByOwner(String vlasnik);

}