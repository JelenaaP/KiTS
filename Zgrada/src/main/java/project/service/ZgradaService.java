package project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Zgrada;
import project.repository.ZgradaRepository;

@Service
public class ZgradaService {
	@Autowired
	private ZgradaRepository zgradaRepository;
	
	public List<Zgrada> findAll(){
		return zgradaRepository.findAll();
	}
		
	public Zgrada findOneById(Long id_zgrada) {
		return zgradaRepository.findOne(id_zgrada);
	}

	public List<Zgrada> findAllByOwner(String vlasnik) {
		return zgradaRepository.findAllByOwner(vlasnik);
	}

	public List<Zgrada> findAllByAddress(String adresa) {
		return zgradaRepository.findAllByAddress(adresa);
	}
	public Zgrada findOneByAddress(String adresa) {
		return zgradaRepository.findOneByAddress(adresa);
	}
	public void delete(Zgrada zgrada) {
		zgradaRepository.delete(zgrada);
	}
		
	public Zgrada save(Zgrada zgrada) {
		return zgradaRepository.save(zgrada);
	}
}
