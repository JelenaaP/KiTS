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

import project.dto.SednicaDto;
import project.model.Korisnik_servisa;
import project.model.Sednica;
import project.model.Zgrada;
import project.service.Korisnik_servisaService;
import project.service.SednicaService;
import project.service.StavkaService;
import project.service.ZgradaService;

@RestController
@RequestMapping(value = "api/sednica")
public class SednicaController {
	@Autowired
	SednicaService sednicaService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	@Autowired
	ZgradaService zgradaService;
	
	@Autowired
	StavkaService stavkaService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<SednicaDto>> getAllSednica() {
		List<Sednica> sednice = sednicaService.findAll();
		//konvertuje u DTO
		List<SednicaDto> sednicaDto = new ArrayList<>();
		for (Sednica s : sednice) {
			sednicaDto.add(new SednicaDto(s));
		}
		return new ResponseEntity<>(sednicaDto, HttpStatus.OK);
	}
	
	@RequestMapping(value="/findKreator", method = RequestMethod.GET)
	public ResponseEntity<List<SednicaDto>> getAllSednicaByCreator(@RequestParam String kreator) {
		List<Sednica> sednice = sednicaService.findAllByKreator(kreator);
		//convert buildings to DTOs
		List<SednicaDto> sedniceDto = new ArrayList<>();
		for (Sednica s : sednice) {
			sedniceDto.add(new SednicaDto(s));
		}
		return new ResponseEntity<>(sedniceDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findZgrada", method = RequestMethod.GET)
	public ResponseEntity<List<SednicaDto>> sednicaByZgrada(@RequestParam String zgrada) {
		List<Sednica> sednice = sednicaService.findAllByZgrada(zgrada);
		List<SednicaDto> sedniceDto = new ArrayList<>();
		for (Sednica s : sednice) {
			sedniceDto.add(new SednicaDto(s));
		}
		return new ResponseEntity<>(sedniceDto, HttpStatus.OK);
		}
	
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<SednicaDto> createSednica(@RequestBody SednicaDto sednicaDto) {
		if(sednicaDto.getZgrada()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Zgrada zgrada = zgradaService.findOneById_zgrada(sednicaDto.getZgrada().getId_zgrada());
		
		if (zgrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Korisnik_servisa kreator = korisnik_servisaService.findOneByKoris_ime(sednicaDto.getKreator().getKoris_ime());
		
		Sednica sednica = new Sednica();
		sednica.setKreator(kreator);
		sednica.setZgrada(zgrada);
		sednica.setDat_kreiranja(sednicaDto.getDat_kreiranja());
		sednica.setDat_zakazivanja(sednicaDto.getDat_zakazivanja());
		sednica.setAktivna(sednicaDto.isAktivna());
		
		sednica = sednicaService.save(sednica);
		return new ResponseEntity<>(new SednicaDto(sednica), HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<SednicaDto> updateSednica(@RequestBody SednicaDto sednicaDto) {
		
		Sednica sednica = sednicaService.findOneById_sednice(sednicaDto.getId_sednice());
		if (sednica == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		sednica.setDat_zakazivanja(sednicaDto.getDat_zakazivanja());
		sednica.setAktivna(sednicaDto.isAktivna());
		
		return new ResponseEntity<>(new SednicaDto(sednica),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id_sednice}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteSednica(@PathVariable Long id_sednice) {
		Sednica sednica = sednicaService.findOneById_sednice(id_sednice);
		if (sednica != null) {
			sednicaService.delete(sednica);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}