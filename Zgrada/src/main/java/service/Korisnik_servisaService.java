package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Korisnik_servisa;
import repository.KorisnikServisaRepository;

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
	
	public Korisnik_servisa  save(Korisnik_servisa  korisnik_servisa ){
		return korisnik_servisaRepository.save(korisnik_servisa );
	}
	
	public void delete(Korisnik_servisa korisnik_servisa){
		 korisnik_servisaRepository.delete(korisnik_servisa);
	}
}
