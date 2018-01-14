package project.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import project.model.Korisnik_servisa;
import project.repository.KorisnikServisaRepository;

@Service
public class Korisnik_servisaService {
	@Autowired
	private KorisnikServisaRepository korisnik_servisaRepository;
	
	public Korisnik_servisa findOneByUsername(String koris_ime) {
		return korisnik_servisaRepository.findOneByUsername(koris_ime);
	}
	public Korisnik_servisa findAllByName(String ime){
		return korisnik_servisaRepository.findAllByName(ime);
	}
	
	public  List<Korisnik_servisa> findAll(){
		return korisnik_servisaRepository.findAll();
	}
	
	public Page<Korisnik_servisa> findAll(Pageable strana){
		return korisnik_servisaRepository.findAll(strana);
	}
	
	public Korisnik_servisa  save(Korisnik_servisa  korisnik_servisa ){
		return korisnik_servisaRepository.save(korisnik_servisa );
	}
	
	public void delete(Korisnik_servisa korisnik_servisa){
		 korisnik_servisaRepository.delete(korisnik_servisa);
	}
}
