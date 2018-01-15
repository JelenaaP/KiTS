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
		
	public Zgrada findOne(Long id_zgrada) {
		return zgradaRepository.findOne(id_zgrada);
	}

	public List<Zgrada> findByVlasnik(String vlasnik) {
		return zgradaRepository.findByVlasnik(vlasnik);
	}

	public List<Zgrada> findByAdresa(String adresa) {
		return zgradaRepository.findByAdresa(adresa);
	}
	public Zgrada findOneByAdresa(String adresa) {
		return zgradaRepository.findOneByAdresa(adresa);
	}
	public void delete(Long id_zgrada) {
		zgradaRepository.delete(id_zgrada);
	}
		
	public Zgrada save(Zgrada zgrada) {
		return zgradaRepository.save(zgrada);
	}
}