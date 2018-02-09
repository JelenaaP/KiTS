package project.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Obavestenje;
import project.repository.ObavestenjeRepository;

@Service
public class ObavestenjeService {
	@Autowired
	private ObavestenjeRepository obavestenjeRepository;
	
	public List<Obavestenje> findByZgrada(Long zgrada){
		return obavestenjeRepository.findByZgrada(zgrada);
	}
	public List<Obavestenje> findAll(){
		return obavestenjeRepository.findAll();
	}
	
	public Obavestenje findByDatKreiranja(Date datKreiranja) {
		return obavestenjeRepository.findByDatKreiranja(datKreiranja);
	}
	
	public List<Obavestenje> findByKreatorId(Long kreator) {
		return obavestenjeRepository.findByKreatorId(kreator);
	}
	public void delete(Long id) {
		obavestenjeRepository.delete(id);
	}
		
	public Obavestenje save(Obavestenje obavestenje) {
		return obavestenjeRepository.save(obavestenje);
	}
	public Obavestenje findOne(Long id) {
		return obavestenjeRepository.findOne(id);
	}
}