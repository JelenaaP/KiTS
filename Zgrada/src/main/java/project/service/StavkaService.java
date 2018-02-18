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
	
	public List<Stavka> findBySednicaId(Long sednica){
		return stavkaRepository.findBySednicaId(sednica);
	}
	
	public List<Stavka> findByKreatorId(Long kreator){
		return stavkaRepository.findByKreatorId(kreator);
	}
	
	public Stavka findOne(Long id){
		return stavkaRepository.findOne(id);
	}
	
	public List<Stavka> findAll(){
		return stavkaRepository.findAll();
	}
	
	public Stavka save(Stavka stavka){
		return stavkaRepository.save(stavka);
	}
	
	public void delete(Long id){
		stavkaRepository.delete(id);
	}
}
