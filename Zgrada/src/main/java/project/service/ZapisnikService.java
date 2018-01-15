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
	
	public List<Zapisnik> findBySednica(String sednica){
		return zapisnikRepository.findBySednica(sednica);
	}
	
	public Zapisnik findByDatKreiranja(Date datKreiranja) {
		return zapisnikRepository.findByDatKreiranja(datKreiranja);
	}
	
	public List<Zapisnik> findByKreator(String kreator){
		return zapisnikRepository.findByKreator(kreator);
	}
	
	public List<Zapisnik> findByZgrada(String zgrada){
		return zapisnikRepository.findByZgrada(zgrada);
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