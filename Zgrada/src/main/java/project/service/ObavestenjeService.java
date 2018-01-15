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
	
	public List<Obavestenje> findByZgrada(String zgrada){
		return obavestenjeRepository.findByZgrada(zgrada);
	}
	public List<Obavestenje> findAll(){
		return obavestenjeRepository.findAll();
	}
	
	public Obavestenje findByDat_kreiranja(Date dat_kreiranja) {
		return obavestenjeRepository.findByDat_kreiranja(dat_kreiranja);
	}
	
	public List<Obavestenje> findByKreator(String kreator) {
		return obavestenjeRepository.findByKreator(kreator);
	}
	public void delete(Long id_obavestenje) {
		obavestenjeRepository.delete(id_obavestenje);
	}
		
	public Obavestenje save(Obavestenje obavestenje) {
		return obavestenjeRepository.save(obavestenje);
	}
	public Obavestenje findOne(Long id_obavestenje) {
		return obavestenjeRepository.findOne(id_obavestenje);
	}
}