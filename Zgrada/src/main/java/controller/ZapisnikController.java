package controller;

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

import dto.ZapisnikDto;
import model.Korisnik_servisa;
import model.Sednica;
import model.Zapisnik;
import model.Zgrada;
import service.Korisnik_servisaService;
import service.SednicaService;
import service.ZapisnikService;
import service.ZgradaService;

@RestController
@RequestMapping(value = "api/zgrada")
public class ZapisnikController {
	@Autowired
	SednicaService sednicaService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	@Autowired
	ZgradaService zgradaService;
	
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
	
	@RequestMapping(value = "/findZgrada", method = RequestMethod.GET)
	public ResponseEntity<List<ZapisnikDto>> zapisnikByZgrada(@RequestParam String zgrada) {
		List<Zapisnik> zapisnici = zapisnikService.findAllByBuilding(zgrada);
		List<ZapisnikDto> zapisniciDto = new ArrayList<>();
		for (Zapisnik z : zapisnici) {
			zapisniciDto.add(new ZapisnikDto(z));
		}
		return new ResponseEntity<>(zapisniciDto, HttpStatus.OK);
		}
	@PreAuthorize("hasRole('ZAPISNICAR')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ZapisnikDto> createZapisnik(@RequestBody ZapisnikDto zapisnikDto) {
		if(zapisnikDto.getZgrada()==null||zapisnikDto.getSednica()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Sednica sednica = sednicaService.findOneById(zapisnikDto.getId_zapisnik());
		Zgrada zgrada = zgradaService.findOneById(zapisnikDto.getZgrada().getId_zgrada());
		
		
		if (sednica == null || zgrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Korisnik_servisa kreator = korisnik_servisaService.findOneByUsername(zapisnikDto.getKreator().getKoris_ime());
		Zapisnik zapisnik = new Zapisnik();
		zapisnik.setKreator(kreator);
		zapisnik.setOpis(zapisnikDto.getOpis());
		zapisnik.setZgrada(zgrada);
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
