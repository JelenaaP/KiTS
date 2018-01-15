package project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
import project.dto.Korisnik_servisaDto;
import project.dto.KvarDto;
import project.model.Komentar;
import project.model.Kvar;
import project.model.Zgrada;
import project.service.Korisnik_servisaService;
import project.service.KvarService;
import project.service.ZgradaService;

@RestController
@RequestMapping(value = "api/kvar")
public class KvarController {
	
	@Autowired
	KvarService kvarService;
	
	@Autowired
	ZgradaService zgradaService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<KvarDto>> getAllKvar() {
		List<Kvar> kvar = kvarService.findAll();
		//convert failures to DTOs
		List<KvarDto> kvarDto = new ArrayList<>();
		for (Kvar k : kvar) {
			kvarDto.add(new KvarDto(k));
		}
		return new ResponseEntity<>(kvarDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findZgrada", method = RequestMethod.GET)
	public ResponseEntity<List<KvarDto>> getKvarByZgrada(@RequestParam String zgrada) {
		List<Kvar> kvarovi = kvarService.findByZgrada(zgrada);
		List<KvarDto> kvaroviDto = new ArrayList<>();
		for (Kvar k : kvarovi) {
			kvaroviDto.add(new KvarDto(k));
		}
		return new ResponseEntity<>(kvaroviDto, HttpStatus.OK);
		}
	
	@RequestMapping(value = "/findKreator", method = RequestMethod.GET)
	public ResponseEntity<List<KvarDto>> getKvarByKreator(@RequestParam String kreator) {
		List<Kvar> kvarovi = kvarService.findByKreator(kreator);
		List<KvarDto> kvaroviDto = new ArrayList<>();
		for (Kvar z : kvarovi) {
			kvaroviDto.add(new KvarDto(z));
		}
		return new ResponseEntity<>(kvaroviDto, HttpStatus.OK);
		}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<KvarDto> createKvar(@RequestBody KvarDto kvarDto) {
		if(kvarDto.getZgrada()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Zgrada zgrada = zgradaService.findOne(kvarDto.getZgrada().getId());
		if (zgrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Kvar kvar = new Kvar();
		kvar.setIme(kvarDto.getIme());
		kvar.setOpis(kvarDto.getOpis());
		kvar.setDatKreiranja(kvarDto.getDatKreiranja());
		kvar.setDatZakazivanja(kvar.getDatZakazivanja());
		kvar.setDatPopravke(kvar.getDatPopravke());
		kvar.setPopravljen(kvar.isPopravljen());
		kvar.setZgrada(zgrada);
		
		kvar = kvarService.save(kvar);
		return new ResponseEntity<>(new KvarDto(kvar), HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<KvarDto> updateKvar(@RequestBody KvarDto kvarDto) {
		// a building must exist
		Kvar kvar = kvarService.findOne(kvarDto.getId());
		if (kvar == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		// we allow changing date and points for an building only
		
		kvar.setIme(kvarDto.getIme());
		kvar.setOpis(kvarDto.getOpis());
		kvar.setDatKreiranja(kvarDto.getDatKreiranja());
		kvar.setDatZakazivanja(kvarDto.getDatZakazivanja());
		kvar.setDatPopravke(kvarDto.getDatPopravke());
		
		kvar = kvarService.save(kvar);
		return new ResponseEntity<>(new KvarDto(kvar), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteKvar(@PathVariable Long id) {
		Kvar kvar = kvarService.findOne(id);
		if (kvar != null) {
			kvarService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/{kvarId}/komentar", method = RequestMethod.GET)
	public ResponseEntity<List<KomentarDto>> getKvarKomentar(@PathVariable Long kvarId) {
		Kvar kvar = kvarService.findOne(kvarId);
		Set<Komentar> komentari = kvar.getKomentar();
		List<KomentarDto> komentariDto = new ArrayList<>();
		for (Komentar k : komentari) {
			KomentarDto komentarDto = new KomentarDto();
			
			komentarDto.setId(k.getId());
			komentarDto.setDatKreiranja(k.getDatKreiranja());
			komentarDto.setText(k.getText());
			komentarDto.setKreator(new Korisnik_servisaDto(k.getKreator()));
			
			komentariDto.add(komentarDto);
		}
		return new ResponseEntity<>(komentariDto, HttpStatus.OK);
	}
}