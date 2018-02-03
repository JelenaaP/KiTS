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
		
	public Zgrada findOne(Long id) {
		return zgradaRepository.findOne(id);
	}

	public List<Zgrada> findByVlasnik(Long vlasnik) {
		return zgradaRepository.findByVlasnik(vlasnik);
	}

	public List<Zgrada> findByAdresa(String adresa) {
		return zgradaRepository.findByAdresa(adresa);
	}
	public Zgrada findOneByAdresa(String adresa) {
		return zgradaRepository.findOneByAdresa(adresa);
	}
	public void delete(Long id) {
		zgradaRepository.delete(id);
	}
		
	public Zgrada save(Zgrada zgrada) {
		return zgradaRepository.save(zgrada);
	}
}