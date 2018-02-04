package project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

import project.dto.Korisnik_servisaDto;
import project.dto.KvarDto;
import project.dto.ObavestenjeDto;
import project.dto.StanDto;
import project.dto.ZgradaDto;
import project.model.Korisnik_servisa;
import project.model.Kvar;
import project.model.Obavestenje;
import project.model.Stan;
import project.model.Zgrada;
import project.service.Korisnik_servisaService;
import project.service.ZgradaService;

@RestController
@RequestMapping(value = "api/zgrada")
public class ZgradaController {
	@Autowired
	ZgradaService zgradaService;
	
	@Autowired
	Korisnik_servisaService korisnik_servisaService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<ZgradaDto>> getAll() {
		List<Zgrada> zgrade = zgradaService.findAll();
		//convert buildings to DTOs
		List<ZgradaDto> zgradeDto = new ArrayList<>();
		for (Zgrada z : zgrade) {
			zgradeDto.add(new ZgradaDto(z));
		}
		return new ResponseEntity<>(zgradeDto, HttpStatus.OK);
	}
	
	@RequestMapping(value="/findAdresa", method = RequestMethod.GET)
	public ResponseEntity<List<ZgradaDto>> getZgradaByAdresa(@RequestParam String adresa) {
		List<Zgrada> zgrade = zgradaService.findByAdresa(adresa);
		//convert buildings to DTOs
		List<ZgradaDto> zgradeDto = new ArrayList<>();
		for (Zgrada z : zgrade) {
			zgradeDto.add(new ZgradaDto(z));
		}
		return new ResponseEntity<>(zgradeDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findVlasnik", method = RequestMethod.GET)
	public ResponseEntity<List<ZgradaDto>> getZgradaByVlasnik(@RequestParam Long vlasnik) {
		List<Zgrada> zgrade = zgradaService.findByVlasnik(vlasnik);
		List<ZgradaDto> zgradeDto = new ArrayList<>();
		for (Zgrada z : zgrade) {
			zgradeDto.add(new ZgradaDto(z));
		}
		return new ResponseEntity<>(zgradeDto, HttpStatus.OK);
		}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ZgradaDto> createZgrada(@RequestBody ZgradaDto zgradaDto) {
		if(zgradaDto.getAdresa()==null||zgradaDto.getVlasnik()==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Zgrada adresa = zgradaService.findOneByAdresa(zgradaDto.getAdresa());
		Korisnik_servisa vlasnik = korisnik_servisaService.findByKorisIme(zgradaDto.getVlasnik().getKorisIme());
		
		if (adresa == null || vlasnik == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Zgrada zgrada = new Zgrada();
		zgrada.setAdresa(zgradaDto.getAdresa());
		zgrada.setIme(zgradaDto.getIme());
		zgrada.setVlasnik(vlasnik);
		zgrada.setBrStanova(zgradaDto.getBrStanova());
		zgrada.setBrNaseljenih(zgradaDto.getBrNaseljenih());
		
		zgrada = zgradaService.save(zgrada);
		return new ResponseEntity<>(new ZgradaDto(zgrada), HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<ZgradaDto> updateZgrada(@RequestBody ZgradaDto zgradaDto) {
		// a building must exist
		Zgrada zgrada = zgradaService.findOne(zgradaDto.getId());
		if (zgrada == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		// we allow changing date and points for an building only
		
		zgrada.setBrNaseljenih(zgradaDto.getBrNaseljenih());
		zgrada.setBrStanova(zgradaDto.getBrStanova());
		zgrada.setIme(zgradaDto.getIme());
		
		zgrada = zgradaService.save(zgrada);
		return new ResponseEntity<>(new ZgradaDto(zgrada), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteZgrada(@PathVariable Long id) {
		Zgrada zgrada = zgradaService.findOne(id);
		if (zgrada != null) {
			zgradaService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/{zgradaId}/stanovi", method = RequestMethod.GET)
	public ResponseEntity<List<StanDto>> getZgradaStanovi(
			@PathVariable Long zgradaId) {
		Zgrada zgrada = zgradaService.findOne(zgradaId);
		Set<Stan> stanovi = zgrada.getStan();
		List<StanDto> stanoviDto = new ArrayList<>();
		for (Stan s: stanovi) {
			StanDto stanDto = new StanDto();
			stanDto.setId(s.getId());
			stanDto.setBrStanovnika(s.getBrStanovnika());
			stanDto.setAdresa(s.getAdresa());
			stanDto.setIme(s.getIme());
			stanDto.setVlasnik(new Korisnik_servisaDto(s.getVlasnik()));
			
			stanoviDto.add(stanDto);
		}
		return new ResponseEntity<>(stanoviDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{zgradaId}/kvar", method = RequestMethod.GET)
	public ResponseEntity<List<KvarDto>> getZgradaKvar(
			@PathVariable Long zgradaId) {
		Zgrada zgrada = zgradaService.findOne(zgradaId);
		Set<Kvar> kvarovi = zgrada.getKvar();
		List<KvarDto> kvaroviDto = new ArrayList<>();
		for (Kvar o : kvarovi) {
			KvarDto kvarDto = new KvarDto();
			
			kvarDto.setId(o.getId());
			kvarDto.setDatKreiranja(o.getDatKreiranja());
			kvarDto.setDatZakazivanja(o.getDatZakazivanja());
			kvarDto.setDatPopravke(o.getDatPopravke());
			kvarDto.setKreator(new Korisnik_servisaDto(o.getKreator()));
			kvarDto.setIme(o.getIme());
			kvarDto.setOpis(o.getOpis());
			kvarDto.setPopravljen(o.isPopravljen());
			kvarDto.setZgrada(new ZgradaDto(o.getZgrada()));
			
			kvaroviDto.add(kvarDto);
		}
		return new ResponseEntity<>(kvaroviDto, HttpStatus.OK);
	}

	@RequestMapping(value = "/{zgradaId}/obavestenje", method = RequestMethod.GET)
	public ResponseEntity<List<ObavestenjeDto>> getZgradaObavestenje(
			@PathVariable Long zgradaId) {
		Zgrada zgrada = zgradaService.findOne(zgradaId);
		Set<Obavestenje> obavestenja = zgrada.getObavestenje();
		List<ObavestenjeDto> obavestenjaDto = new ArrayList<>();
		for (Obavestenje o : obavestenja) {
			ObavestenjeDto obavestenjeDto = new ObavestenjeDto();
			
			obavestenjeDto.setId(o.getId());
			obavestenjeDto.setDatKreiranja(o.getDatKreiranja());
			obavestenjeDto.setIme(o.getIme());
			obavestenjeDto.setOpis(o.getOpis());
			obavestenjeDto.setKreator(new Korisnik_servisaDto(o.getKreator()));
			
			obavestenjaDto.add(obavestenjeDto);
		}
		return new ResponseEntity<>(obavestenjaDto, HttpStatus.OK);
	}
}