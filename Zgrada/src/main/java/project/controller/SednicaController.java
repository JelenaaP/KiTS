package project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.dto.Korisnik_servisaDto;
import project.dto.SednicaDto;
import project.dto.StavkaDto;
import project.dto.ZapisnikDto;
import project.model.Korisnik_servisa;
import project.model.Sednica;
import project.model.Stavka;
import project.model.Zapisnik;
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
	//dobavljanje svih sednica
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
	//pretrazivanje po kreatoru sednice
	@RequestMapping(value="/findKreator", method = RequestMethod.GET)
	public ResponseEntity<List<SednicaDto>> getSednicaByKreator(@RequestParam String kreator) {
		List<Sednica> sednice = sednicaService.findByKreator(kreator);
		List<SednicaDto> sedniceDto = new ArrayList<>();
		for (Sednica s : sednice) {
			sedniceDto.add(new SednicaDto(s));
		}
		return new ResponseEntity<>(sedniceDto, HttpStatus.OK);
	}
	//pretrazivanje po zgradi u kojoj se odrzava sednica
	@RequestMapping(value = "/findZgrada", method = RequestMethod.GET)
	public ResponseEntity<List<SednicaDto>> getSednicaByZgrada(@RequestParam String zgrada) {
		List<Sednica> sednice = sednicaService.findByZgrada(zgrada);
		List<SednicaDto> sedniceDto = new ArrayList<>();
		for (Sednica s : sednice) {
			sedniceDto.add(new SednicaDto(s));
		}
		return new ResponseEntity<>(sedniceDto, HttpStatus.OK);
		}
	//kreiranje sednice
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<SednicaDto> createSednica(@RequestBody SednicaDto sednicaDto) {
		if(sednicaDto.getZgrada()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Zgrada zgrada = zgradaService.findOne(sednicaDto.getZgrada().getId_zgrada());
		
		if (zgrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Korisnik_servisa kreator = korisnik_servisaService.findByKoris_ime(sednicaDto.getKreator().getKoris_ime());
		
		Sednica sednica = new Sednica();
		sednica.setKreator(kreator);
		sednica.setZgrada(zgrada);
		sednica.setDat_kreiranja(sednicaDto.getDat_kreiranja());
		sednica.setDat_zakazivanja(sednicaDto.getDat_zakazivanja());
		sednica.setAktivna(sednicaDto.isAktivna());
		
		sednica = sednicaService.save(sednica);
		return new ResponseEntity<>(new SednicaDto(sednica), HttpStatus.CREATED);
	}
	//izmena sednice
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<SednicaDto> updateSednica(@RequestBody SednicaDto sednicaDto) {
		
		Sednica sednica = sednicaService.findOne(sednicaDto.getId_sednice());
		if (sednica == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		sednica.setDat_zakazivanja(sednicaDto.getDat_zakazivanja());
		sednica.setAktivna(sednicaDto.isAktivna());
		
		return new ResponseEntity<>(new SednicaDto(sednica),HttpStatus.OK);
	}
	//brisanje sednice
	@RequestMapping(value = "/{id_sednice}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteSednica(@PathVariable Long id_sednice) {
		Sednica sednica = sednicaService.findOne(id_sednice);
		if (sednica != null) {
			sednicaService.delete(id_sednice);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	//izlistavanje stavki sa sednice
	@RequestMapping(value = "/{sednicaId_sednice}/stavka", method = RequestMethod.GET)
	public ResponseEntity<List<StavkaDto>> getSednicaStavke(
			@PathVariable Long sednicaId_sednice) {
		Sednica sednica = sednicaService.findOne(sednicaId_sednice);
		Set<Stavka> stavke = sednica.getStavka();
		List<StavkaDto> stavkeDto = new ArrayList<>();
		for (Stavka s: stavke) {
			StavkaDto stavkaDto = new StavkaDto();
			stavkaDto.setId_stavke(s.getId_stavke());
			stavkaDto.setIme(s.getIme());
			stavkaDto.setOpis(s.getOpis());
			stavkaDto.setDat_kreiranja(s.getDat_kreiranja());
			stavkeDto.add(stavkaDto);
		}
		return new ResponseEntity<>(stavkeDto, HttpStatus.OK);
	}
	//izlistavanje zapisnika sa sednice
		@RequestMapping(value = "/{sednicaId_sednice}/zapisnik", method = RequestMethod.GET)
		public ResponseEntity<ZapisnikDto> getSednicaZapisnik(@PathVariable Long sednicaId_sednice) {
			Sednica sednica = sednicaService.findOne(sednicaId_sednice);
			Zapisnik zapisnik = sednica.getZapisnik();
			
			ZapisnikDto zapisnikDto = new ZapisnikDto();
			
			zapisnikDto.setId_zapisnik(zapisnik.getId_zapisnik());
			zapisnikDto.setOpis(zapisnik.getOpis());
			zapisnikDto.setDat_kreiranja(zapisnik.getDat_kreiranja());
			zapisnikDto.setKreator(new Korisnik_servisaDto(zapisnik.getKreator()));
			zapisnikDto.setSednica(new SednicaDto(zapisnik.getSednica()));
			
			return new ResponseEntity<>(zapisnikDto, HttpStatus.OK);
	
		}
}