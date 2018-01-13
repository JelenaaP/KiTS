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
import org.springframework.web.bind.annotation.RestController;

import project.dto.FirmaDto;
import project.model.Firma;
import project.model.Korisnik_servisa;
import project.service.FirmaService;
import project.service.Korisnik_servisaService;
import project.service.KvarService;

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
	public ResponseEntity<List<FirmaDto>> getAll() {
		List<Firma> firme = firmaService.findAll();
		//convert buildings to DTOs
		List<FirmaDto> firmeDto = new ArrayList<>();
		for (Firma f : firme) {
			firmeDto.add(new FirmaDto(f));
		}
		return new ResponseEntity<>(firmeDto, HttpStatus.OK);
	}	
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<FirmaDto> create(@RequestBody FirmaDto firmaDto) {
		if(firmaDto.getVlasnik()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Korisnik_servisa vlasnik = korisnik_servisaService.findOneByUsername(firmaDto.getVlasnik().getKoris_ime());
		
		if (vlasnik == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Firma firma = new Firma();
		firma.setAdresa(firmaDto.getAdresa());
		firma.setIme(firmaDto.getIme());
		firma.setVlasnik(vlasnik);
		firma.setTelefon(firmaDto.getTelefon());
		firma.setEmail(firmaDto.getEmail());
		firma.setWeb_site(firmaDto.getWeb_site());
		firma.setVlasnik(vlasnik);
		
		firma = firmaService.save(firma);
		
		return new ResponseEntity<>(new FirmaDto(firma), HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<FirmaDto> update(@RequestBody FirmaDto firmaDto) {
		// a building must exist
		Firma firma = firmaService.findOneByName(firmaDto.getIme());
		if (firma == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		// we allow changing date and points for an building only
		firma.setTelefon(firmaDto.getTelefon());
		firma.setEmail(firmaDto.getEmail());
		firma.setWeb_site(firmaDto.getWeb_site());
		
		firma = firmaService.save(firma);
		return new ResponseEntity<>(new FirmaDto(firma), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/{id_firme}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteExam(@PathVariable Long id_firme) {
		Firma firma = firmaService.findOneById(id_firme);
		if (firma != null) {
			firmaService.delete(firma);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}