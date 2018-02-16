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
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import project.dto.FirmaDto;

import project.model.Firma;
import project.model.Korisnik_servisa;
import project.service.FirmaService;
import project.service.Korisnik_servisaService;
import project.service.KvarService;
@EnableWebMvc
@RestController
@RequestMapping(value = "api/firma")

public class FirmaController {
	
	@Autowired
	FirmaService firmaService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	@Autowired
	KvarService kvarService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<FirmaDto>> getAllFirma() {
		List<Firma> firme = firmaService.findAll();
		//convert buildings to DTOs
		List<FirmaDto> firmeDto = new ArrayList<>();
		for (Firma f : firme) {
			firmeDto.add(new FirmaDto(f));
		}
		return new ResponseEntity<>(firmeDto, HttpStatus.OK);
	}	
	
	//@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json;charset=utf-8")
	public ResponseEntity<FirmaDto> createFirma(@RequestBody FirmaDto firmaDto) {
		if(firmaDto.getVlasnik()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Korisnik_servisa vlasnik = korisnik_servisaService.findByKorisIme(firmaDto.getVlasnik().getKorisIme());
		
		if (vlasnik == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Firma firma = new Firma();
		firma.setAdresa(firmaDto.getAdresa());
		firma.setIme(firmaDto.getIme());
		firma.setVlasnik(vlasnik);
		firma.setTelefon(firmaDto.getTelefon());
		firma.setEmail(firmaDto.getEmail());
		firma.setWebSite(firmaDto.getWebSite());
		firma.setVlasnik(vlasnik);
		
		firma = firmaService.save(firma);
		
		return new ResponseEntity<>(new FirmaDto(firma), HttpStatus.CREATED);
	}
	
	/*@RequestMapping(value = "/findRadnik", method = RequestMethod.GET)
	public ResponseEntity<List<FirmaDto>> getFirmaByRadnik(@RequestParam String radnik) {
		List<Firma> firma = firmaService.findAllByIme(radnik);
		List<FirmaDto> firmaDto = new ArrayList<>();
		for (Firma f : firma) {
			firmaDto.add(new FirmaDto(f));
		}
		return new ResponseEntity<>(firmaDto, HttpStatus.OK);
		}
*/
	//@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<FirmaDto> updateFirma(@RequestBody FirmaDto firmaDto) {
		// a building must exist
		Firma firma = firmaService.findOne(firmaDto.getId());
		if (firma == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		// we allow changing date and points for an building only
		firma.setIme(firmaDto.getIme());
		firma.setAdresa(firmaDto.getAdresa());
		firma.setTelefon(firmaDto.getTelefon());
		firma.setEmail(firmaDto.getEmail());
		firma.setWebSite(firmaDto.getWebSite());
		
		firma = firmaService.save(firma);
		return new ResponseEntity<>(new FirmaDto(firma), HttpStatus.OK);
	}

	//@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteFirma(@PathVariable Long id) {
		Firma firma = firmaService.findOne(id);
		if (firma != null) {
			firmaService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/findAdresa", method = RequestMethod.GET)
	public ResponseEntity<List<FirmaDto>> getFirmaByAdresa(@RequestParam String adresa) {
		List<Firma> firme = firmaService.findByAdresa(adresa);
		List<FirmaDto> firmeDto = new ArrayList<>();
		for (Firma f : firme) {
			firmeDto.add(new FirmaDto(f));
		}
		return new ResponseEntity<>(firmeDto, HttpStatus.OK);
		}
	
	@RequestMapping(value = "/findVlasnikId", method = RequestMethod.GET)
	public ResponseEntity<List<FirmaDto>> getFirmaByVlasnik(@RequestParam Long vlasnikId) {
		List<Firma> firme = firmaService.findByVlasnikId(vlasnikId);
		List<FirmaDto> firmeDto = new ArrayList<>();
		for (Firma f : firme) {
			firmeDto.add(new FirmaDto(f));
		}
		return new ResponseEntity<>(firmeDto, HttpStatus.OK);
		}
}