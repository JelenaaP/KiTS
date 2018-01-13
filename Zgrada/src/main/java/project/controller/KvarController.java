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
	public ResponseEntity<List<KvarDto>> getAllFailures() {
		List<Kvar> kvar = kvarService.findAll();
		//convert failures to DTOs
		List<KvarDto> kvarDto = new ArrayList<>();
		for (Kvar k : kvar) {
			kvarDto.add(new KvarDto(k));
		}
		return new ResponseEntity<>(kvarDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findZgrada", method = RequestMethod.GET)
	public ResponseEntity<List<KvarDto>> failuresByBulding(@RequestParam String zgrada) {
		List<Kvar> kvarovi = kvarService.findAllByBuilding(zgrada);
		List<KvarDto> kvaroviDto = new ArrayList<>();
		for (Kvar k : kvarovi) {
			kvaroviDto.add(new KvarDto(k));
		}
		return new ResponseEntity<>(kvaroviDto, HttpStatus.OK);
		}
	
	@RequestMapping(value = "/findVlasnik", method = RequestMethod.GET)
	public ResponseEntity<List<KvarDto>> buildingsByOwner(@RequestParam String vlasnik) {
		List<Kvar> kvarovi = kvarService.findAllByOwner(vlasnik);
		List<KvarDto> kvaroviDto = new ArrayList<>();
		for (Kvar z : kvarovi) {
			kvaroviDto.add(new KvarDto(z));
		}
		return new ResponseEntity<>(kvaroviDto, HttpStatus.OK);
		}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<KvarDto> createFailure(@RequestBody KvarDto kvarDto) {
		if(kvarDto.getZgrada()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Zgrada zgrada = zgradaService.findOneById(kvarDto.getZgrada().getId_zgrada());
		if (zgrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Kvar kvar = new Kvar();
		kvar.setIme(kvarDto.getIme());
		kvar.setOpis(kvarDto.getOpis());
		kvar.setDat_kreiranja(kvarDto.getDat_kreiranja());
		kvar.setDat_zakazivanja(kvar.getDat_zakazivanja());
		kvar.setDat_popravke(kvar.getDat_popravke());
		kvar.setPopravljen(kvar.isPopravljen());
		kvar.setZgrada(zgrada);
		
		kvar = kvarService.save(kvar);
		return new ResponseEntity<>(new KvarDto(kvar), HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<KvarDto> updateFailures(@RequestBody KvarDto kvarDto) {
		// a building must exist
		Kvar kvar = kvarService.findOneById(kvarDto.getId_kvar());
		if (kvar == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		// we allow changing date and points for an building only
		
		kvar.setIme(kvarDto.getIme());
		kvar.setOpis(kvarDto.getOpis());
		kvar.setDat_kreiranja(kvarDto.getDat_kreiranja());
		kvar.setDat_zakazivanja(kvarDto.getDat_zakazivanja());
		kvar.setDat_popravke(kvarDto.getDat_popravke());
		
		kvar = kvarService.save(kvar);
		return new ResponseEntity<>(new KvarDto(kvar), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/{id_kvar}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteFailures(@PathVariable Long id_kvar) {
		Kvar kvar = kvarService.findOneById(id_kvar);
		if (kvar != null) {
			kvarService.delete(kvar);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/{kvarId_kvar}/komentar", method = RequestMethod.GET)
	public ResponseEntity<List<KomentarDto>> getKvarKomentar(
			@PathVariable Long kvarId_kvar) {
		Kvar kvar = kvarService.findOneById(kvarId_kvar);
		Set<Komentar> komentari = kvar.getKomentar();
		List<KomentarDto> komentariDto = new ArrayList<>();
		for (Komentar k : komentari) {
			KomentarDto komentarDto = new KomentarDto();
			
			komentarDto.setId_komentar(k.getId_komentar());
			komentarDto.setDat_kreiranja(k.getDat_kreiranja());
			komentarDto.setText(k.getText());
			komentarDto.setKreator(new Korisnik_servisaDto(k.getKreator()));
			
			komentariDto.add(komentarDto);
		}
		return new ResponseEntity<>(komentariDto, HttpStatus.OK);
	}
}