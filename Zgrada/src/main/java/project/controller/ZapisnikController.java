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

import project.dto.ZapisnikDto;
import project.model.Korisnik_servisa;
import project.model.Sednica;
import project.model.Zapisnik;
import project.service.Korisnik_servisaService;
import project.service.SednicaService;
import project.service.ZapisnikService;

@RestController
@RequestMapping(value = "api/zapisnik")
public class ZapisnikController {
	@Autowired
	SednicaService sednicaService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
		
	@Autowired
	ZapisnikService zapisnikService;
	
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
	
	@RequestMapping(value="/findKreator", method = RequestMethod.GET)
	public ResponseEntity<List<ZapisnikDto>> getAllZapisnikByCreator(@RequestParam String kreator) {
		List<Zapisnik> zapisnici = zapisnikService.findAllByCreator(kreator);
		//convert buildings to DTOs
		List<ZapisnikDto> zapisniciDto = new ArrayList<>();
		for (Zapisnik z : zapisnici) {
			zapisniciDto.add(new ZapisnikDto(z));
		}
		return new ResponseEntity<>(zapisniciDto, HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ZAPISNICAR')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ZapisnikDto> createZapisnik(@RequestBody ZapisnikDto zapisnikDto) {
		if(zapisnikDto.getSednica()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Sednica sednica = sednicaService.findOneById(zapisnikDto.getId_zapisnik());
		
		if (sednica == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Korisnik_servisa kreator = korisnik_servisaService.findOneByUsername(zapisnikDto.getKreator().getKoris_ime());
		
		Zapisnik zapisnik = new Zapisnik();
		zapisnik.setKreator(kreator);
		zapisnik.setOpis(zapisnikDto.getOpis());
		zapisnik.setDat_kreiranja(zapisnikDto.getDat_kreiranja());
		zapisnik.setSednica(sednica);
		
		zapisnik = zapisnikService.save(zapisnik);
		return new ResponseEntity<>(new ZapisnikDto(zapisnik), HttpStatus.CREATED);
	}
	@PreAuthorize("hasRole('ZAPISNICAR')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<ZapisnikDto> updateZapisnik(@RequestBody ZapisnikDto zapisnikDto) {
		// a building must exist
		Zapisnik zapisnik = zapisnikService.findOneById(zapisnikDto.getId_zapisnik());
		if (zapisnik == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		zapisnik.setOpis(zapisnikDto.getOpis());
		
		zapisnik = zapisnikService.save(zapisnik);
		return new ResponseEntity<>(new ZapisnikDto(zapisnik),HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ZAPISNICAR')")
	@RequestMapping(value = "/{id_zapisnik}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteZapisnik(@PathVariable Long id_zapisnik) {
		Zapisnik zapisnik = zapisnikService.findOneById(id_zapisnik);
		if (zapisnik != null) {
			zapisnikService.delete(zapisnik);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}