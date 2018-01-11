package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dto.ZgradaDto;
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
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ZgradaDto zgrade(){
		ZgradaDto zgrada = new ZgradaDto();
		zgrada.setZgrada(zgradaService.findAll());
		return zgrada;
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ZgradaDto> createExam(@RequestBody ZgradaDto zgradaDto) {
		if(zgradaDto.getAdresa()==null||zgradaDto.getVlasnik()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Zgrada adresa = zgradaService.findAllByAdress(zgradaDto.getAdresa());
		//Korisnik_servisa vlasnik = korisnik_servisaService.findAllByName(korisnik_servisaDto.getVlassnik().getId_korisnik_servisa());
		
		/*if (adresa == null || vlasnik == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}*/
		
		Zgrada zgrada = new Zgrada();
		zgrada.setAdresa(zgradaDto.getAdresa());
		zgrada.setIme(zgradaDto.getIme());
		//zgrada.setVlasnik(zgradaDto.getVlasnik());
		zgrada.setBr_stanova(zgradaDto.getBr_stanova());
		zgrada.setBr_naseljenih(zgradaDto.getBr_naseljenih());
		zgrada.setPredsednik(zgradaDto.isPredsednik());
		
		zgrada = zgradaService.save(zgrada);
		return new ResponseEntity<>(new ZgradaDto(zgrada), HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<ZgradaDto> updateExam(@RequestBody ZgradaDto zgradaDto) {
		// a building must exist
		Zgrada zgrada = zgradaService.findOneById(zgradaDto.getId_zgrada());
		if (zgrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		// we allow changing date and points for an building only
		zgrada.setBr_naseljenih(zgradaDto.getBr_naseljenih());
		zgrada.setBr_stanova(zgradaDto.getBr_stanova());
		zgrada.setIme(zgradaDto.getIme());
		zgrada.setPredsednik(zgradaDto.isPredsednik());
		//zgrada.setVlasnik(Korisnik_servisaDto.getVlasnik());
		
		zgrada = zgradaService.save(zgrada);
		return new ResponseEntity<>(new ZgradaDto(zgrada), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteExam(@PathVariable Long id_zgrada) {
		Zgrada zgrada = zgradaService.findOneById(id_zgrada);
		if (zgrada != null) {
			zgradaService.delete(zgrada);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
