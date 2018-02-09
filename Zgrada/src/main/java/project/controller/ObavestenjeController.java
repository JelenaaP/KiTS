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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.dto.ObavestenjeDto;
import project.model.Korisnik_servisa;
import project.model.Obavestenje;
import project.model.Zgrada;
import project.service.Korisnik_servisaService;
import project.service.ObavestenjeService;
import project.service.ZgradaService;

@RestController
@RequestMapping(value = "api/obavestenje")
public class ObavestenjeController {
	
	@Autowired
	ObavestenjeService obavestenjeService;
	
	@Autowired
	ZgradaService zgradaService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<ObavestenjeDto>> getAllObavestenje() {
		List<Obavestenje> obavestenja = obavestenjeService.findAll();
		//convert notifications to DTOs
		List<ObavestenjeDto> obavestenjaDto = new ArrayList<>();
		for (Obavestenje o : obavestenja) {
			obavestenjaDto.add(new ObavestenjeDto(o));
		}
		return new ResponseEntity<>(obavestenjaDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findKreator", method = RequestMethod.GET)
	public ResponseEntity<List<ObavestenjeDto>> getObavestenjeByKreator(@RequestParam Long kreator) {
		List<Obavestenje> obavestenja = obavestenjeService.findByKreatorId(kreator);
		List<ObavestenjeDto> obavestenjaDto = new ArrayList<>();
		for (Obavestenje o : obavestenja) {
			obavestenjaDto.add(new ObavestenjeDto(o));
		}
		return new ResponseEntity<>(obavestenjaDto, HttpStatus.OK);
		}
	
	@RequestMapping(value = "/findZgrada", method = RequestMethod.GET)
	public ResponseEntity<List<ObavestenjeDto>> getObavestenjeByZgrada(@RequestParam Long zgrada) {
		List<Obavestenje> obavestenja = obavestenjeService.findByZgrada(zgrada);
		List<ObavestenjeDto> obavestenjaDto = new ArrayList<>();
		for (Obavestenje o : obavestenja) {
			obavestenjaDto.add(new ObavestenjeDto(o));
		}
		return new ResponseEntity<>(obavestenjaDto, HttpStatus.OK);
		}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ObavestenjeDto> createObavestenje(@RequestBody ObavestenjeDto obavestenjeDto) {
		if(obavestenjeDto.getZgrada()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Zgrada zgrada = zgradaService.findOne(obavestenjeDto.getZgrada().getId());
		if (zgrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Korisnik_servisa kreator = korisnik_servisaService.findByKorisIme(obavestenjeDto.getKreator().getKorisIme());
		
		Obavestenje obavestenje = new Obavestenje();
		obavestenje.setIme(obavestenjeDto.getIme());
		obavestenje.setOpis(obavestenjeDto.getOpis());
		obavestenje.setDatKreiranja(obavestenjeDto.getDatKreiranja());
		obavestenje.setKreator(kreator);
		obavestenje.setZgrada(zgrada);
		
		obavestenje = obavestenjeService.save(obavestenje);
		return new ResponseEntity<>(new ObavestenjeDto(obavestenje), HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<ObavestenjeDto> updateObavestenje(@RequestBody ObavestenjeDto obavestenjeDto) {
		// a building must exist
		Obavestenje obavestenje = obavestenjeService.findOne(obavestenjeDto.getId());
		if (obavestenje == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		// we allow changing date and points for an building only
		
		obavestenje.setDatKreiranja(obavestenjeDto.getDatKreiranja());
		obavestenje.setIme(obavestenjeDto.getIme());
		obavestenje.setOpis(obavestenjeDto.getOpis());
		
		obavestenje = obavestenjeService.save(obavestenje);
		return new ResponseEntity<>(new ObavestenjeDto(obavestenje), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteObavestenje(@PathVariable Long id) {
		Obavestenje obavestenje = obavestenjeService.findOne(id);
		if (obavestenje != null) {
			obavestenjeService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}