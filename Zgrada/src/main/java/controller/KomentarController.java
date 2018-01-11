package controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import dto.KomentarKvarDto;
import dto.ZgradaDto;
import model.Komentar;
import model.Korisnik_servisa;
import model.Kvar;
import model.Zgrada;
import repository.KorisnikServisaRepository;
import service.KomentarService;
import service.Korisnik_servisaService;
import service.KvarService;
import service.ZgradaService;

@RestController
@RequestMapping(value = "/api")
public class KomentarController {
	
	@Autowired
	KomentarService komentarService;
	
	@Autowired
	KvarService kvarService;
	
	@Autowired
	KorisnikServisaRepository korisnikServisaRepository;
	
	@PreAuthorize("hasRole('ROLE_WORKER') || hasRole('ROLE_STANAR')")
	@RequestMapping(value = "/komentar/{ime}", method = RequestMethod.GET)
	public ResponseEntity<List<Komentar>> comments(@PathVariable String ime) {
		Kvar k = kvarService.findOneByName(ime);
		
		if(k == null){
			return new ResponseEntity<List<Komentar>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Komentar>>(komentarService.findByKvar(k), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ROLE_WORKER') || hasRole('ROLE_STANAR')")
	@RequestMapping(value = "/komentar", method = RequestMethod.POST)
	public ResponseEntity<List<Komentar>> dodajKomentar(@RequestBody KomentarKvarDto kkv) {
		if(kkv == null || kkv.getKomentar() == null || kkv.getKvar() == null || kkv.getKreator() == null){
			return new ResponseEntity<List<Komentar>>(HttpStatus.NO_CONTENT);
		}
		
		Komentar komentar = kkv.getKomentar();
		Korisnik_servisa kreator = kkv.getKreator();
		Kvar kvar = kkv.getKvar();
		
		// Ukoliko su liste komentara null inicijalizujemo nove liste
		if(kreator.getKomentari() == null){
			kreator.setKomentari(new ArrayList<>());
		}
		if(kvar.getKomentari() == null){
			kvar.setKomentari(new ArrayList<>());
		}
		
		
		// Set data to the comment
		komentar.setKreator(kreator);
		komentar.setKvar(kvar);
		komentar.setDat_kreiranja(new Date());
		komentarService.save(komentar);
		
		// Set data to author of the comment
		kreator.getKomentari().add(komentar);
		korisnikServisaRepository.save(kreator);
		
		// Set data to the failure
		kvar.getKomentari().add(komentar);
		kvarService.save(kvar);
		
		return new ResponseEntity<List<Komentar>>(komentarService.findByKvar(kvar), HttpStatus.OK);
	}

}
