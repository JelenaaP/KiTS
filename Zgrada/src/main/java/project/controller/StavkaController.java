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
		
		//pretrazivanje po kreatoru stavke
		@RequestMapping(value="/findKreator", method = RequestMethod.GET)
		public ResponseEntity<List<StavkaDto>> getStavkaByKreator(@RequestParam String kreator) {
			List<Stavka> stavka = stavkaService.findByKreator(kreator);
			List<StavkaDto> stavkaDto = new ArrayList<>();
			for (Stavka s : stavka) {
				stavkaDto.add(new StavkaDto(s));
			}
			return new ResponseEntity<>(stavkaDto, HttpStatus.OK);
		}
		
		//pretrazivanje po sednici na kojoj je napravljena stavka
		@RequestMapping(value = "/findSednica", method = RequestMethod.GET)
		public ResponseEntity<List<StavkaDto>> getStavkaBySednica(@RequestParam String sednica) {
			List<Stavka> stavka = stavkaService.findBySednica(sednica);
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
			Sednica sednica = sednicaService.findOne(stavkaDto.getSednica().getId_sednice());
			
			if (sednica == null) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			Korisnik_servisa kreator = korisnik_servisaService.findByKoris_ime(stavkaDto.getKreator().getKoris_ime());
			
			Stavka stavka = new Stavka();
			stavka.setKreator(kreator);
			stavka.setSednica(sednica);
			stavka.setDat_kreiranja(stavkaDto.getDat_kreiranja());
	
			
			stavka = stavkaService.save(stavka);
			return new ResponseEntity<>(new StavkaDto(stavka), HttpStatus.CREATED);
		}
		
		//izmena stavke
		@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
		public ResponseEntity<StavkaDto> updateStavka(@RequestBody StavkaDto stavkaDto) {
			
			Stavka stavka = stavkaService.findOne(stavkaDto.getId_stavke());
			if (stavka == null) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			stavka.setDat_kreiranja(stavkaDto.getDat_kreiranja());
			
			
			return new ResponseEntity<>(new StavkaDto(stavka),HttpStatus.OK);
		}
		//brisanje stavke
		@RequestMapping(value = "/{id_stavke}", method = RequestMethod.DELETE)
		public ResponseEntity<Void> deleteStavka(@PathVariable Long id_stavke) {
			Stavka stavka = stavkaService.findOne(id_stavke);
			if (stavka != null) {
				stavkaService.delete(id_stavke);
				return new ResponseEntity<>(HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
}