package project.controller;
import java.util.ArrayList;
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

import project.dto.KomentarDto;
import project.model.Komentar;
import project.model.Korisnik_servisa;
import project.model.Kvar;
import project.repository.KorisnikServisaRepository;
import project.service.KomentarService;
import project.service.KvarService;

@RestController
@RequestMapping(value = "/api/komentar")
public class KomentarController {
	
	@Autowired
	KomentarService komentarService;
	
	@Autowired
	KvarService kvarService;
	
	@Autowired
	KorisnikServisaRepository korisnik_servisaService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<KomentarDto>> getAllNotifications() {
		List<Komentar> komentar = komentarService.findAll();
		//convert notifications to DTOs
		List<KomentarDto> komentarDto = new ArrayList<>();
		for (Komentar k : komentar) {
			komentarDto.add(new KomentarDto(k));
		}
		return new ResponseEntity<>(komentarDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findVlasnik", method = RequestMethod.GET)
	public ResponseEntity<List<KomentarDto>> notificatiosByOwner(@RequestParam Korisnik_servisa kreator) {
		List<Komentar> komentar = komentarService.findByOwner(kreator);
		List<KomentarDto> komentarDto = new ArrayList<>();
		for (Komentar k : komentar) {
			komentarDto.add(new KomentarDto(k));
		}
		return new ResponseEntity<>(komentarDto, HttpStatus.OK);
		}
	
	@RequestMapping(value = "/findKvar", method = RequestMethod.GET)
	public ResponseEntity<List<KomentarDto>> notificatiosByFailure(@RequestParam Kvar kvar) {
		List<Komentar> komentar = komentarService.findByKvar(kvar);
		List<KomentarDto> komentarDto = new ArrayList<>();
		for (Komentar k : komentar) {
			komentarDto.add(new KomentarDto(k));
		}
		return new ResponseEntity<>(komentarDto, HttpStatus.OK);
		}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<KomentarDto> createComment(@RequestBody KomentarDto komentarDto) {
		if(komentarDto.getKvar()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Kvar kvar = kvarService.findOneById(komentarDto.getKvar().getId_kvar());
		if (kvar == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Korisnik_servisa kreator = korisnik_servisaService.findOneByUsername(komentarDto.getKreator().getKoris_ime());
		
		Komentar komentar = new Komentar();
		komentar.setText(komentarDto.getText());
		komentar.setDat_kreiranja(komentarDto.getDat_kreiranja());
		komentar.setKreator(kreator);
		komentar.setKvar(kvar);
		
		komentar = komentarService.save(komentar);
		return new ResponseEntity<>(new KomentarDto(komentar), HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<KomentarDto> updateComment(@RequestBody KomentarDto komentarDto) {
		Komentar komentar = komentarService.findOneById(komentarDto.getId_komentar());
		if (komentar == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		// we allow changing date and points for an building on
		
		komentar.setDat_kreiranja(komentarDto.getDat_kreiranja());
		komentar.setText(komentarDto.getText());
		
		komentar = komentarService.save(komentar);
		return new ResponseEntity<>(new KomentarDto(komentar), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/{id_komentar}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteComment(@PathVariable Long id_komentar) {
		Komentar komentar = komentarService.findOneById(id_komentar);
		if (komentar != null) {
			komentarService.delete(komentar);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
