package project.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import project.model.Korisnik_servisa;
import project.repository.Korisnik_servisaRepository;

@Service
public class Korisnik_servisaService {
	@Autowired
	private Korisnik_servisaRepository korisnik_servisaRepository;
	
	public Korisnik_servisa findByKorisIme(String korisIme) {
		return korisnik_servisaRepository.findByKorisIme(korisIme);
	}
	public List<Korisnik_servisa> findByIme(String ime){
		return korisnik_servisaRepository.findByIme(ime);
	}
	
	public Korisnik_servisa findOne(Long id){
		return korisnik_servisaRepository.findOne(id);
	}
	
	public  List<Korisnik_servisa> findAll(){
		return korisnik_servisaRepository.findAll();
	}
	
	public Page<Korisnik_servisa> findAll(Pageable strana){
		return korisnik_servisaRepository.findAll(strana);
	}
	
	public Korisnik_servisa  save(Korisnik_servisa  korisnik_servisa ){
		return korisnik_servisaRepository.save(korisnik_servisa);
	}
	
	public void delete(Long id) {
		korisnik_servisaRepository.delete(id);
	}	
}