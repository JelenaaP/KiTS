package project.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import project.service.KomentarService;
import project.service.Korisnik_servisaService;
import project.service.KvarService;

@RestController
@RequestMapping(value = "api/komentar")
public class KomentarController {
	
	@Autowired
	KomentarService komentarService;
	
	@Autowired
	KvarService kvarService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<KomentarDto>> getAllKomentar() {
		List<Komentar> komentar = komentarService.findAll();
		//convert notifications to DTOs
		List<KomentarDto> komentarDto = new ArrayList<>();
		for (Komentar k : komentar) {
			komentarDto.add(new KomentarDto(k));
		}
		return new ResponseEntity<>(komentarDto, HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<KomentarDto> getKomentar(@PathVariable Long id){
		Komentar k = komentarService.findOne(id);
		if(k == null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(new KomentarDto(k), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findKreator", method = RequestMethod.GET)
	public ResponseEntity<List<KomentarDto>> getKomentarByKreator(@RequestParam Long kreator) {
		List<Komentar> komentar = komentarService.findByKreatorId(kreator);
		List<KomentarDto> komentarDto = new ArrayList<>();
		for (Komentar k : komentar) {
			komentarDto.add(new KomentarDto(k));
		}
		return new ResponseEntity<>(komentarDto, HttpStatus.OK);
		}
	
	@RequestMapping(value = "/findKvar", method = RequestMethod.GET)
	public ResponseEntity<List<KomentarDto>> getKomentarByKvar(@RequestParam Long kvar) {
		List<Komentar> komentar = komentarService.findByKvarId(kvar);
		List<KomentarDto> komentarDto = new ArrayList<>();
		for (Komentar k : komentar) {
			komentarDto.add(new KomentarDto(k));
		}
		return new ResponseEntity<>(komentarDto, HttpStatus.OK);
		}
	
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<KomentarDto> createKomentar(@RequestBody KomentarDto komentarDto) {
		if(komentarDto.getKvar()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Kvar kvar = kvarService.findOne(komentarDto.getKvar().getId());
		if (kvar == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Korisnik_servisa kreator = korisnik_servisaService.findByKorisIme(komentarDto.getKreator().getKorisIme());
		
		Komentar komentar = new Komentar();
		komentar.setText(komentarDto.getText());
		komentar.setDatKreiranja(komentarDto.getDatKreiranja());
		komentar.setKreator(kreator);
		komentar.setKvar(kvar);
		
		komentar = komentarService.save(komentar);
		return new ResponseEntity<>(new KomentarDto(komentar), HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<KomentarDto> updateKomentar(@RequestBody KomentarDto komentarDto) {
		Komentar komentar = komentarService.findOne(komentarDto.getId());
		if (komentar == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		// we allow changing date and points for an building on
		
		komentar.setText(komentarDto.getText());
		komentar.setDatKreiranja(komentarDto.getDatKreiranja());
		
		
		komentar = komentarService.save(komentar);
		return new ResponseEntity<>(new KomentarDto(komentar), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteKomentar(@PathVariable Long id) {
		Komentar komentar = komentarService.findOne(id);
		if (komentar != null) {
			komentarService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}