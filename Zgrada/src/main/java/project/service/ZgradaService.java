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
		
	public Zgrada findOneById_zgrada(Long id_zgrada) {
		return zgradaRepository.findOneById_zgrada(id_zgrada);
	}

	public List<Zgrada> findAllByVlasnik(String vlasnik) {
		return zgradaRepository.findAllByVlasnik(vlasnik);
	}

	public List<Zgrada> findAllByAdresa(String adresa) {
		return zgradaRepository.findAllByAdresa(adresa);
	}
	public Zgrada findOneByAdresa(String adresa) {
		return zgradaRepository.findOneByAdresa(adresa);
	}
	public void delete(Zgrada zgrada) {
		zgradaRepository.delete(zgrada);
	}
		
	public Zgrada save(Zgrada zgrada) {
		return zgradaRepository.save(zgrada);
	}
}