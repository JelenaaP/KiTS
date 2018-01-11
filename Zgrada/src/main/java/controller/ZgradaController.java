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

import dto.ZgradaDto;
import model.Korisnik_servisa;
import model.Zgrada;
import service.Korisnik_servisaService;
import service.ZgradaService;

@RestController
@RequestMapping(value = "api/zgrada")
public class ZgradaController {
	@Autowired
	ZgradaService zgradaService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<ZgradaDto>> getAllBuildings() {
		List<Zgrada> zgrade = zgradaService.findAll();
		//convert buildings to DTOs
		List<ZgradaDto> zgradeDto = new ArrayList<>();
		for (Zgrada z : zgrade) {
			zgradeDto.add(new ZgradaDto(z));
		}
		return new ResponseEntity<>(zgradeDto, HttpStatus.OK);
	}
	
	@RequestMapping(value="/findAdress", method = RequestMethod.GET)
	public ResponseEntity<List<ZgradaDto>> getAllBuildingsByAddress(@RequestParam String adresa) {
		List<Zgrada> zgrade = zgradaService.findAllByAddress(adresa);
		//convert buildings to DTOs
		List<ZgradaDto> zgradeDto = new ArrayList<>();
		for (Zgrada z : zgrade) {
			zgradeDto.add(new ZgradaDto(z));
		}
		return new ResponseEntity<>(zgradeDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findOwner", method = RequestMethod.GET)
	public ResponseEntity<List<ZgradaDto>> buildingsByOwner(@RequestParam String vlasnik) {
		List<Zgrada> zgrade = zgradaService.findAllByOwner(vlasnik);
		List<ZgradaDto> zgradeDto = new ArrayList<>();
		for (Zgrada z : zgrade) {
			zgradeDto.add(new ZgradaDto(z));
		}
		return new ResponseEntity<>(zgradeDto, HttpStatus.OK);
		}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ZgradaDto> createBuilding(@RequestBody ZgradaDto zgradaDto) {
		if(zgradaDto.getAdresa()==null||zgradaDto.getVlasnik()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Zgrada adresa = zgradaService.findOneByAddress(zgradaDto.getAdresa());
		Korisnik_servisa vlasnik = korisnik_servisaService.findOneByUsername(zgradaDto.getVlasnik().getIme());
		
		if (adresa == null || vlasnik == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Zgrada zgrada = new Zgrada();
		zgrada.setAdresa(zgradaDto.getAdresa());
		zgrada.setIme(zgradaDto.getIme());
		zgrada.setVlasnik(vlasnik);
		zgrada.setBr_stanova(zgradaDto.getBr_stanova());
		zgrada.setBr_naseljenih(zgradaDto.getBr_naseljenih());
		zgrada.setPredsednik(zgradaDto.isPredsednik());
		
		zgrada = zgradaService.save(zgrada);
		return new ResponseEntity<>(new ZgradaDto(zgrada), HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<ZgradaDto> updateBuilding(@RequestBody ZgradaDto zgradaDto) {
		// a building must exist
		Zgrada zgrada = zgradaService.findOneById(zgradaDto.getId_zgrada());
		if (zgrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		// we allow changing date and points for an building only
		Korisnik_servisa vlasnik = korisnik_servisaService.findOneByUsername(zgradaDto.getVlasnik().getIme());
		
		zgrada.setBr_naseljenih(zgradaDto.getBr_naseljenih());
		zgrada.setBr_stanova(zgradaDto.getBr_stanova());
		zgrada.setIme(zgradaDto.getIme());
		zgrada.setPredsednik(zgradaDto.isPredsednik());
		zgrada.setVlasnik(vlasnik);
		
		zgrada = zgradaService.save(zgrada);
		return new ResponseEntity<>(new ZgradaDto(zgrada), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteBuilding(@PathVariable Long id_zgrada) {
		Zgrada zgrada = zgradaService.findOneById(id_zgrada);
		if (zgrada != null) {
			zgradaService.delete(zgrada);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
