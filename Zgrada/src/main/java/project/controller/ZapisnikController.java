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

import project.dto.Korisnik_servisaDto;
import project.dto.ZapisnikDto;
import project.model.Korisnik_servisa;
import project.model.Sednica;
import project.model.Zapisnik;
import project.model.Zgrada;
import project.service.Korisnik_servisaService;
import project.service.SednicaService;
import project.service.ZapisnikService;
import project.service.ZgradaService;

@RestController
@RequestMapping(value = "api/zapisnik")
public class ZapisnikController {
	@Autowired
	SednicaService sednicaService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
		
	@Autowired
	ZapisnikService zapisnikService;
	
	@Autowired
	ZgradaService zgradaService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<ZapisnikDto>> getAllZapisnik() {
		List<Zapisnik> zapisnici = zapisnikService.findAll();
		//konvertuje u DTO
		List<ZapisnikDto> zapisnikDto = new ArrayList<>();
		for (Zapisnik z : zapisnici) {
			zapisnikDto.add(new ZapisnikDto(z));
		}
		return new ResponseEntity<>(zapisnikDto, HttpStatus.OK);
	}
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<ZapisnikDto> getZapisnik(@PathVariable Long id){
		Zapisnik zapisnik = zapisnikService.findOne(id);
		if(zapisnik == null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(new ZapisnikDto(zapisnik), HttpStatus.OK);
	}
	
	@RequestMapping(value="/findKreator", method = RequestMethod.GET)
	public ResponseEntity<List<ZapisnikDto>> getZapisnikByKreator(@RequestParam Long kreator) {
		List<Zapisnik> zapisnici = zapisnikService.findByKreatorId(kreator);
		//convert buildings to DTOs
		List<ZapisnikDto> zapisniciDto = new ArrayList<>();
		for (Zapisnik z : zapisnici) {
			zapisniciDto.add(new ZapisnikDto(z));
		}
		return new ResponseEntity<>(zapisniciDto, HttpStatus.OK);
	}
	@RequestMapping(value="/findSednica", method = RequestMethod.GET)
	public ResponseEntity<ZapisnikDto> getZapisnikBySednica(@RequestParam Long sednicaId) {
		Zapisnik zapisnik = zapisnikService.findBySednicaId(sednicaId);
		//convert buildings to DTOs
		ZapisnikDto zapisnikDto = new ZapisnikDto();
		
		zapisnikDto.setId(zapisnik.getId());
		zapisnikDto.setDatKreiranja(zapisnik.getDatKreiranja());
		zapisnikDto.setOpis(zapisnik.getOpis());
		zapisnikDto.setKreator(new Korisnik_servisaDto(zapisnik.getKreator()));
		
		return new ResponseEntity<>(zapisnikDto, HttpStatus.OK);
	}
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ZapisnikDto> createZapisnik(@RequestBody ZapisnikDto zapisnikDto) {
		if(zapisnikDto.getSednica()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Sednica sednica = sednicaService.findOne(zapisnikDto.getSednica().getId());
		
		if (sednica == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Korisnik_servisa kreator = korisnik_servisaService.findByKorisIme(zapisnikDto.getKreator().getKorisIme());
		Zgrada zgrada = zgradaService.findOne(zapisnikDto.getZgrada().getId());
		
		Zapisnik zapisnik = new Zapisnik();
		zapisnik.setKreator(kreator);
		zapisnik.setZgrada(zgrada);
		zapisnik.setOpis(zapisnikDto.getOpis());
		zapisnik.setDatKreiranja(zapisnikDto.getDatKreiranja());
		zapisnik.setSednica(sednica);
		
		zapisnik = zapisnikService.save(zapisnik);
		return new ResponseEntity<>(new ZapisnikDto(zapisnik), HttpStatus.CREATED);
	}
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<ZapisnikDto> updateZapisnik(@RequestBody ZapisnikDto zapisnikDto) {
		// a building must exist
		Zapisnik zapisnik = zapisnikService.findOne(zapisnikDto.getId());
		if (zapisnik == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		zapisnik.setOpis(zapisnikDto.getOpis());
		
		zapisnik = zapisnikService.save(zapisnik);
		return new ResponseEntity<>(new ZapisnikDto(zapisnik),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteZapisnik(@PathVariable Long id) {
		Zapisnik zapisnik = zapisnikService.findOne(id);
		if (zapisnik != null) {
			zapisnikService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}