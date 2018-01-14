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
	
	public List<Obavestenje> findAllByZgrada(String zgrada){
		return obavestenjeRepository.findAllByZgrada(zgrada);
	}
	public List<Obavestenje> findAll(){
		return obavestenjeRepository.findAll();
	}
	
	public Obavestenje findAllByDat_kreiranja(Date dat_kreiranja) {
		return obavestenjeRepository.findOneByDat_kreiranja(dat_kreiranja);
	}
	
	public List<Obavestenje> findAllByKreator(String kreator) {
		return obavestenjeRepository.findAllByKreator(kreator);
	}
	public void delete(Obavestenje obavestenje) {
		obavestenjeRepository.delete(obavestenje);
	}
		
	public Obavestenje save(Obavestenje obavestenje) {
		return obavestenjeRepository.save(obavestenje);
	}
	public Obavestenje findOneById_obavestenje(Long id_obavestenje) {
		return obavestenjeRepository.findOneById_obavestenje(id_obavestenje);
	}
}