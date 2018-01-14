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
	
	public Korisnik_servisa findOneByKoris_ime(String koris_ime) {
		return korisnik_servisaRepository.findOneByKoris_ime(koris_ime);
	}
	public List<Korisnik_servisa> findAllByIme(String ime){
		return korisnik_servisaRepository.findAllByIme(ime);
	}
	
	public Korisnik_servisa findOne(Long id_korisnik_servisa){
		return korisnik_servisaRepository.findOne(id_korisnik_servisa);
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
	
	public void delete(Korisnik_servisa korisnik_servisa){
		 korisnik_servisaRepository.delete(korisnik_servisa);
	}
	
	public void remove(Long id_korisnik_servisa) {
		korisnik_servisaRepository.delete(id_korisnik_servisa);
	}
	
}
