package project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Sednica;
import project.model.Stavka;
import project.repository.StavkaRepository;

@Service

public class StavkaService {

	@Autowired
	private StavkaRepository stavkaRepository;
	
	public List<Stavka> findBySednica(Sednica sednica){
		return stavkaRepository.findBySednica(sednica);
	}
	
	public Stavka save(Stavka stavka){
		return stavkaRepository.save(stavka);
	}
	
	public void delete(Stavka stavka){
		stavkaRepository.delete(stavka);
	}
}
