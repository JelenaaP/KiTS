package project.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Zapisnik;
import project.repository.ZapisnikRepository;

@Service
public class ZapisnikService {

	@Autowired
	private ZapisnikRepository zapisnikRepository;
	
	public Zapisnik findByDatKreiranja(Date datKreiranja) {
		return zapisnikRepository.findByDatKreiranja(datKreiranja);
	}
	
	public List<Zapisnik> findByKreatorId(Long kreator){
		return zapisnikRepository.findByKreatorId(kreator);
	}
	
	public Zapisnik findBySednicaId(Long sednicaId){
		return zapisnikRepository.findBySednicaId(sednicaId);
	}
	
	public List<Zapisnik> findByZgradaId(Long zgrada){
		return zapisnikRepository.findByZgradaId(zgrada);
	}
	
	public Zapisnik save(Zapisnik zapisnik){
		return zapisnikRepository.save(zapisnik);
	}
	
	public void delete(Long id){
		zapisnikRepository.delete(id);
	}

	public List<Zapisnik> findAll() {
		return zapisnikRepository.findAll();
	}

	public Zapisnik findOne(Long id) {
		return zapisnikRepository.findOne(id);
	}
}