package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Zgrada;
import repository.ZgradaRepository;

@Service
public class ZgradaService {
	@Autowired
	private ZgradaRepository zgradaRepository;
		
	public Zgrada findOneByName(String ime) {
		return zgradaRepository.findOneByName(ime);
	}
	
	public List<Zgrada> findAll(){
		return zgradaRepository.findAll();
	}
		
	public Zgrada findOneById(Long id_zgrada) {
		return zgradaRepository.findOne(id_zgrada);
	}
	
	public void delete(Zgrada zgrada) {
		zgradaRepository.delete(zgrada);
	}
		
	public Zgrada save(Zgrada zgrada) {
		return zgradaRepository.save(zgrada);
	}
	
	public Zgrada findAllByAdress(String adresa) {
		return zgradaRepository.findOneByAdress(adresa);
	}
	
	public Zgrada findAllByOwner(String vlasnik) {
		return zgradaRepository.findAllByOwner(vlasnik);
	}
}
