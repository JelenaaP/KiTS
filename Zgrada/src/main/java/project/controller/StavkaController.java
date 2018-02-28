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

import project.dto.StavkaDto;
import project.model.Korisnik_servisa;
import project.model.Sednica;
import project.model.Stavka;
import project.service.Korisnik_servisaService;
import project.service.SednicaService;
import project.service.StavkaService;
import project.service.ZgradaService;

@RestController
@RequestMapping(value = "api/stavka")

public class StavkaController {
	@Autowired
	SednicaService sednicaService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	@Autowired
	ZgradaService zgradaService;
	
	@Autowired
	StavkaService stavkaService;
	
	//dobavljanje svih stavki
		@RequestMapping(value="/all", method = RequestMethod.GET)
		public ResponseEntity<List<StavkaDto>> getAllStavka() {
			List<Stavka> stavka = stavkaService.findAll();
			//konvertuje u DTO
			List<StavkaDto> stavkaDto = new ArrayList<>();
			for (Stavka s : stavka) {
				stavkaDto.add(new StavkaDto(s));
			}
			return new ResponseEntity<>(stavkaDto, HttpStatus.OK);
		}
		
		@RequestMapping(value="/{id}", method=RequestMethod.GET)
		public ResponseEntity<StavkaDto> getStavka(@PathVariable Long id){
			Stavka stavka = stavkaService.findOne(id);
			if(stavka == null){
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
			return new ResponseEntity<>(new StavkaDto(stavka), HttpStatus.OK);
		}
		
		//pretrazivanje po kreatoru stavke
		@RequestMapping(value="/findKreator", method = RequestMethod.GET)
		public ResponseEntity<List<StavkaDto>> getStavkaByKreator(@RequestParam Long kreator) {
			List<Stavka> stavka = stavkaService.findByKreatorId(kreator);
			List<StavkaDto> stavkaDto = new ArrayList<>();
			for (Stavka s : stavka) {
				stavkaDto.add(new StavkaDto(s));
			}
			return new ResponseEntity<>(stavkaDto, HttpStatus.OK);
		}
		
		//pretrazivanje po sednici na kojoj je napravljena stavka
		@RequestMapping(value = "/findSednica", method = RequestMethod.GET)
		public ResponseEntity<List<StavkaDto>> getStavkaBySednica(@RequestParam Long sednica) {
			List<Stavka> stavka = stavkaService.findBySednicaId(sednica);
			List<StavkaDto> stavkaDto = new ArrayList<>();
			for (Stavka s : stavka) {
				stavkaDto.add(new StavkaDto(s));
			}
			return new ResponseEntity<>(stavkaDto, HttpStatus.OK);
			}
		
		//kreiranje stavke
		@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
		public ResponseEntity<StavkaDto> createStavka(@RequestBody StavkaDto stavkaDto) {
			if(stavkaDto.getSednica()==null)
			{
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			Sednica sednica = sednicaService.findOne(stavkaDto.getSednica().getId());
			
			if (sednica == null) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			Korisnik_servisa kreator = korisnik_servisaService.findByKorisIme(stavkaDto.getKreator().getKorisIme());
			
			Stavka stavka = new Stavka();
			stavka.setKreator(kreator);
			stavka.setSednica(sednica);
			stavka.setDatKreiranja(stavkaDto.getDatKreiranja());
	
			
			stavka = stavkaService.save(stavka);
			return new ResponseEntity<>(new StavkaDto(stavka), HttpStatus.CREATED);
		}
		
		//izmena stavke
		@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
		public ResponseEntity<StavkaDto> updateStavka(@RequestBody StavkaDto stavkaDto) {
			
			Stavka stavka = stavkaService.findOne(stavkaDto.getId());
			if (stavka == null) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			stavka.setDatKreiranja(stavkaDto.getDatKreiranja());
			stavka.setIme(stavkaDto.getIme());
			stavka.setOpis((stavkaDto.getOpis()));
			
			return new ResponseEntity<>(new StavkaDto(stavka),HttpStatus.OK);
		}
		//brisanje stavke
		@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<Void> deleteStavka(@PathVariable Long id) {
			Stavka stavka = stavkaService.findOne(id);
			if (stavka != null) {
				stavkaService.delete(id);
				return new ResponseEntity<>(HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
}