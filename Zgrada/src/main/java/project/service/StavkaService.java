package project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Stavka;
import project.repository.StavkaRepository;

@Service

public class StavkaService {

	@Autowired
	private StavkaRepository stavkaRepository;
	
	public List<Stavka> findAllBySednica(String sednica){
		return stavkaRepository.findAllBySednica(sednica);
	}
	
	public List<Stavka> findByKreator(String kreator){
		return stavkaRepository.findByKreator(kreator);
	}
	
	public Stavka findById_stavke(Long id_stavke){
		return stavkaRepository.findById_stavke(id_stavke);
	}
	
	public List<Stavka> findAll(){
		return stavkaRepository.findAll();
	}
	
	public Stavka save(Stavka stavka){
		return stavkaRepository.save(stavka);
	}
	
	public void delete(Stavka stavka){
		stavkaRepository.delete(stavka);
	}
}
