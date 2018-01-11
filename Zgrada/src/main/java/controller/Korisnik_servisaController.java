package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




import model.Korisnik_servisa;
import repository.FirmaRepository;
import repository.KorisnikServisaRepository;


@RestController
@RequestMapping(value = "/api")

public class Korisnik_servisaController {

	@Autowired
	KorisnikServisaRepository korisnikServisaRepository;
	
	
	@Autowired
	FirmaRepository firmaRepository;
	
	
	//za dobijanje svih korisnika, vraca listu svih korisnika
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping(value = "/korisnici", method = RequestMethod.GET)
	public List<Korisnik_servisa> korisnici() {
		return korisnikServisaRepository.findAll();
	}
	
	//za dobijanje korisnika po njegovom id-u
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping(value = "/korisnici/{id}", method = RequestMethod.GET)
	public ResponseEntity<Korisnik_servisa> userById(@PathVariable Long id) {
		Korisnik_servisa korisnik_servisa = korisnikServisaRepository.findOne(id);
		if (korisnik_servisa == null) {
			return new ResponseEntity<Korisnik_servisa>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<Korisnik_servisa>(korisnik_servisa, HttpStatus.OK);
		}
	}
	

	//za dodavanje korisnika
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping(value = "/korisnici", method = RequestMethod.POST)
	public ResponseEntity<Korisnik_servisa> createUser(@RequestBody Korisnik_servisa korisnik_servisa) {
		if (korisnikServisaRepository.findOneByUsername(korisnik_servisa.getKoris_ime()) != null) {
			throw new RuntimeException("Korisnicko ime vec postoji");
		}
		return new ResponseEntity<Korisnik_servisa>(korisnikServisaRepository.save(korisnik_servisa), HttpStatus.CREATED);
	}

	//za izmenu korisnika
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping(value = "/korisnici", method = RequestMethod.PUT)
	public Korisnik_servisa updateKorisnik(@RequestBody Korisnik_servisa korisnik_servisa) {
		// Check if the user already exists with that username
		if (korisnikServisaRepository.findOneByUsername(korisnik_servisa.getKoris_ime()) != null
				&& korisnikServisaRepository.findOneByUsername(korisnik_servisa.getKoris_ime()).getId_korisnik_servisa() != korisnik_servisa.getId_korisnik_servisa()) {
			throw new RuntimeException("Korisnicko ime vec postoji");
		}
		return korisnikServisaRepository.save(korisnik_servisa);
	}
	
}
