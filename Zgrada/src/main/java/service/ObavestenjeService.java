package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Obavestenje;
import model.Zgrada;
import repository.ObavestenjeRepository;

@Service
public class ObavestenjeService {
	@Autowired
	private ObavestenjeRepository obavestenjeRepository;
	
	public List<Obavestenje> findByZgrada(Zgrada zgrada){
		return obavestenjeRepository.findByZgrada(zgrada);
	}
	public List<Obavestenje> findAll(){
		return obavestenjeRepository.findAll();
	}
	
	public Obavestenje findAllByDat_kreiranja(Date dat_kreiranja) {
		return obavestenjeRepository.findOneByDat_kreiranja(dat_kreiranja);
	}
	
	public List<Obavestenje> findAllByOwner(String kreator) {
		return obavestenjeRepository.findAllByOwner(kreator);
	}
	public void delete(Obavestenje obavestenje) {
		obavestenjeRepository.delete(obavestenje);
	}
		
	public Obavestenje save(Obavestenje obavestenje) {
		return obavestenjeRepository.save(obavestenje);
	}
	public Obavestenje findOneById(Long id_obavestenje) {
		return obavestenjeRepository.findOneById(id_obavestenje);
	}
	public List<Obavestenje> findAllByBuilding(String zgrada) {
		return obavestenjeRepository.findOneById(zgrada);	}
}

