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

import dto.Korisnik_servisaDto;
import dto.StanDto;
import dto.ZgradaDto;
import model.Stan;
import model.Zgrada;
import service.Korisnik_servisaService;
import service.StanService;
import service.ZgradaService;

@RestController
@RequestMapping(value = "api/stanovi")
public class StanController {
	@Autowired
	StanService stanService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	@Autowired
	ZgradaService zgradaService;
	

	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public StanDto stanovi(){
		StanDto stan = new StanDto();
		stan.setStan(stanService.findAll());
		return stan;
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<StanDto> dodajstan(@RequestBody StanDto stanDto) {
		if(stanDto.getAdresa()==null||stanDto.getZgrada()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Stan adresa = stanService.findOneByAdress(stanDto.getAdresa());
		ZgradaDto zgradaDto = null;
		@SuppressWarnings("null")
		Zgrada zgrada = zgradaService.findAllByAdress(zgradaDto.getAdresa());
		
		if(adresa == null || zgrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Stan stan = new Stan();
		stan.setAdresa(stanDto.getAdresa());;
		stan.setIme(stanDto.getIme());
		//stan.setVlasnik(stanDto.getVlasnik());
		stan.setZgrada(zgrada);
		
		
		stan = stanService.save(stan);
	
		return new ResponseEntity<>(new StanDto(stan), HttpStatus.CREATED);
	}
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<StanDto> izmenistan(@RequestBody StanDto stanDto) {
		// stan mora postojati
		Stan stan = stanService.findOneById(stanDto.getId_stanovi());
		if (stan == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		//stan.setVlasnik(Korisnik_servisaDto.getVlasnik());
		stan.setIme(stanDto.getIme());
	
		
		stan = stanService.save(stan);
		return new ResponseEntity<>(new StanDto(stan), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> obrisistan(@PathVariable Long id_stanovi) {
		Stan stan = stanService.findOneById(id_stanovi);
		if (stan != null) {
			stanService.delete(stan);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
