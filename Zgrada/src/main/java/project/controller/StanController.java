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

import project.dto.StanDto;
import project.model.Korisnik_servisa;
import project.model.Stan;
import project.model.Zgrada;
import project.service.Korisnik_servisaService;
import project.service.StanService;
import project.service.ZgradaService;

@RestController
@RequestMapping(value = "api/stan")
public class StanController {
	@Autowired
	StanService stanService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	@Autowired
	ZgradaService zgradaService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<StanDto>> getAllStanovi() {
		List<Stan> stanovi = stanService.findAll();
		//konvertuje u DTO
		List<StanDto> stanDto = new ArrayList<>();
		for (Stan s : stanovi) {
			stanDto.add(new StanDto(s));
		}
		return new ResponseEntity<>(stanDto, HttpStatus.OK);
	}
	
	@RequestMapping(value="/findAdresa", method = RequestMethod.GET)
	public ResponseEntity<List<StanDto>> getStanoviByAdresa(@RequestParam String adresa) {
		List<Stan> stanovi = stanService.findAllByAdresa(adresa);
		//convert buildings to DTOs
		List<StanDto> stanoviDto = new ArrayList<>();
		for (Stan s : stanovi) {
			stanoviDto.add(new StanDto(s));
		}
		return new ResponseEntity<>(stanoviDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findVlasnik", method = RequestMethod.GET)
	public ResponseEntity<List<StanDto>> getStanoviByVlasnik(@RequestParam String vlasnik) {
		List<Stan> stanovi = stanService.findAllByVlasnik(vlasnik);
		List<StanDto> stanoviDto = new ArrayList<>();
		for (Stan s : stanovi) {
			stanoviDto.add(new StanDto(s));
		}
		return new ResponseEntity<>(stanoviDto, HttpStatus.OK);
		}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<StanDto> createStanovi(@RequestBody StanDto stanDto) {
		if(stanDto.getAdresa()==null||stanDto.getZgrada()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Stan adresa = stanService.findByAdresa(stanDto.getAdresa());
		Zgrada zgrada = zgradaService.findOne(stanDto.getZgrada().getId_zgrada());
		
		
		if (adresa == null || zgrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Korisnik_servisa vlasnik = korisnik_servisaService.findByKoris_ime(stanDto.getVlasnik().getKoris_ime());
		
		Stan stan = new Stan();
		stan.setAdresa(stanDto.getAdresa());
		stan.setIme(stanDto.getIme());
		stan.setZgrada(zgrada);
		stan.setVlasnik(vlasnik);
		
		stan = stanService.save(stan);
		return new ResponseEntity<>(new StanDto(stan), HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<StanDto> updateStanovi(@RequestBody StanDto stanDto) {
		// a building must exist
		Stan stan = stanService.findOne(stanDto.getId_stanovi());
		if (stan == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		// we allow changing date and points for an building only
		
		stan.setBr_stanovnika(stanDto.getBr_stanovnika());
		stan.setIme(stanDto.getIme());
		stan.setAdresa(stanDto.getAdresa());
		
		stan = stanService.save(stan);
		return new ResponseEntity<>(new StanDto(stan), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/{id_stanovi}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteStanovi(@PathVariable Long id_stanovi) {
		Stan stan = stanService.findOne(id_stanovi);
		if (stan != null) {
			stanService.delete(id_stanovi);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}