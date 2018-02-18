package project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.dto.Korisnik_servisaDto;
import project.model.Korisnik_servisa;
import project.service.FirmaService;
import project.service.Korisnik_servisaService;
@RestController
@RequestMapping(value = "/api/korisnik_servisa")

public class Korisnik_servisaController {
	
	@Autowired
	FirmaService firmaservice;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<Korisnik_servisaDto>> getAll() {
		List<Korisnik_servisa> korisnik_servisa = korisnik_servisaService.findAll();
		//convert students to DTOs
		List<Korisnik_servisaDto> korisnik_servisaDto = new ArrayList<>();
		for (Korisnik_servisa k : korisnik_servisa) {
			korisnik_servisaDto.add(new Korisnik_servisaDto(k));
		}
		return new ResponseEntity<>(korisnik_servisaDto, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Korisnik_servisaDto>> getUsersPage(Pageable page) {
		//page object holds data about pagination and sorting
		//the object is created based on the url parameters "page", "size" and "sort" 
		Page<Korisnik_servisa> korisnik_servisa = korisnik_servisaService.findAll(page);
		
		//convert students to DTOs
		List<Korisnik_servisaDto> korisnik_servisaDto = new ArrayList<>();
		for (Korisnik_servisa k : korisnik_servisa) {
			korisnik_servisaDto.add(new Korisnik_servisaDto(k));
		}
		return new ResponseEntity<>(korisnik_servisaDto, HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Korisnik_servisaDto> getKorisnik_servisa(@PathVariable Long id){
		Korisnik_servisa korisnik_servisa = korisnik_servisaService.findOne(id);
		if(korisnik_servisa == null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(new Korisnik_servisaDto(korisnik_servisa), HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes="application/json")
	public ResponseEntity<Korisnik_servisaDto> createKorisnik_servisa(@RequestBody Korisnik_servisaDto korisnik_servisaDto){
		Korisnik_servisa korisnik_servisa = new Korisnik_servisa();
		korisnik_servisa.setIme(korisnik_servisaDto.getIme());
		korisnik_servisa.setKorisIme(korisnik_servisaDto.getKorisIme());
		korisnik_servisa.setLozinka(korisnik_servisaDto.getLozinka());
		korisnik_servisa.setUloga(korisnik_servisaDto.getUloga());
		
		korisnik_servisa = korisnik_servisaService.save(korisnik_servisa);
		return new ResponseEntity<>(new Korisnik_servisaDto(korisnik_servisa), HttpStatus.CREATED);	
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, consumes="application/json")
	public ResponseEntity<Korisnik_servisaDto> updateKorisnik_servisa(@RequestBody Korisnik_servisaDto korisnik_servisaDto){
		//a teacher must exist
		Korisnik_servisa korisnik_servisa = korisnik_servisaService.findOne(korisnik_servisaDto.getId()); 
		if (korisnik_servisa == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		korisnik_servisa.setIme(korisnik_servisaDto.getIme());
		korisnik_servisa.setUloga(korisnik_servisaDto.getUloga());
		korisnik_servisa.setKorisIme(korisnik_servisaDto.getKorisIme());
		korisnik_servisa.setLozinka(korisnik_servisaDto.getLozinka());
		
		korisnik_servisa = korisnik_servisaService.save(korisnik_servisa);
		return new ResponseEntity<>(new Korisnik_servisaDto(korisnik_servisa), HttpStatus.OK);	
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteKorisnik_servisa(@PathVariable Long id){
		Korisnik_servisa korisnik_servisa = korisnik_servisaService.findOne(id);
		if (korisnik_servisa != null){
			korisnik_servisaService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {		
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value="/findKorisIme", method=RequestMethod.GET)
	public ResponseEntity<Korisnik_servisaDto> getKorisnik_servisaByKorisIme(
			@RequestParam String korisIme) {
		Korisnik_servisa korisnik_servisa = korisnik_servisaService.findByKorisIme(korisIme);
		if(korisnik_servisa == null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<>(new Korisnik_servisaDto(korisnik_servisa), HttpStatus.OK);
	}
}