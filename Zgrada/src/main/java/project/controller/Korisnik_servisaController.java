package project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import project.dto.Korisnik_servisaDto;
import project.model.Korisnik_servisa;
import project.repository.FirmaRepository;
import project.repository.KorisnikServisaRepository;
import project.service.Korisnik_servisaService;




@RestController
@RequestMapping(value = "/api/korisnik_servisa")

public class Korisnik_servisaController {

	@Autowired
	KorisnikServisaRepository korisnikServisaRepository;
	
	@Autowired
	FirmaRepository firmaRepository;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<Korisnik_servisaDto>> getAllUsers() {
		List<Korisnik_servisa> korisnik_servisa = korisnik_servisaService.findAll();
		//convert students to DTOs
		List<Korisnik_servisaDto> korisnik_servisaDto = new ArrayList<>();
		for (Korisnik_servisa k : korisnik_servisa) {
			korisnik_servisaDto.add(new Korisnik_servisaDto(k));
		}
		return new ResponseEntity<>(korisnik_servisaDto, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Korisnik_servisaDto>> getUsersPage(Pageable strana) {
		//page object holds data about pagination and sorting
		//the object is created based on the url parameters "page", "size" and "sort" 
		Page<Korisnik_servisa> korisnik_servisa = korisnik_servisaService.findAll(strana);
		
		//convert students to DTOs
		List<Korisnik_servisaDto> korisnik_servisaDto = new ArrayList<>();
		for (Korisnik_servisa k : korisnik_servisa) {
			korisnik_servisaDto.add(new Korisnik_servisaDto(k));
		}
		return new ResponseEntity<>(korisnik_servisaDto, HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Korisnik_servisaDto> getStudent(@PathVariable Long id_korisnika_servisa){
		Korisnik_servisa korisnik_servisa = korisnik_servisaService.findOne(id_korisnika_servisa);
		if(korisnik_servisa == null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(new Korisnik_servisaDto(korisnik_servisa), HttpStatus.OK);
	}
	
}