package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import project.dto.FirmaDto;
import project.model.Firma;
import project.model.Zgrada;
import project.dto.StanDto;
import project.dto.ZgradaDto;
import project.service.FirmaService;
import project.service.ZgradaService;

@RestController
@RequestMapping(value = "api/firma")

public class FirmaController {
	
	@Autowired
	FirmaService firmaService;
	
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public FirmaDto firme(){
		FirmaDto firma = new FirmaDto();
		firma.setFirma(firmaService.findAll());
		return firma;
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<FirmaDto> createExam(@RequestBody FirmaDto firmaDto) {
		if(firmaDto.getIme()==null||firmaDto.getAdresa()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Firma adresa = firmaService.findOneByAdress(firmaDto.getAdresa());
		//Korisnik_servisa vlasnik = korisnik_servisaService.findAllByName(korisnik_servisaDto.getVlassnik().getId_korisnik_servisa());
		
		/*if (adresa == null || vlasnik == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}*/
		
		Firma firma = new Firma();
		firma.setAdresa(firmaDto.getAdresa());
		firma.setIme(firmaDto.getIme());
		//zgrada.setVlasnik(zgradaDto.getVlasnik());
		firma.setTelefon(firmaDto.getTelefon());
		firma.setEmail(firmaDto.getEmail());
		firma.setWeb_site(firmaDto.getWeb_site());
		
		firma = firmaService.save(firma);
		
		return new ResponseEntity<>(new FirmaDto(firma), HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<FirmaDto> updateExam(@RequestBody FirmaDto firmaDto) {
		// a building must exist
		Firma firma = firmaService.findOneByName(firmaDto.getIme());
		if (firma == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		// we allow changing date and points for an building only
		firma.setTelefon(firmaDto.getTelefon());
		firma.setEmail(firmaDto.getEmail());
		firma.setWeb_site(firmaDto.getWeb_site());
		
		
		
		firma = firmaService.save(firma);
		return new ResponseEntity<>(new FirmaDto(firma), HttpStatus.OK);
	}

	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteExam(@PathVariable Long id_firme) {
		Firma firma = firmaService.findOneById(id_firme);
		if (firma != null) {
			firmaService.delete(firma);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
