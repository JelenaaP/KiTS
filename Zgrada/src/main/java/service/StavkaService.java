package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Korisnik_servisa;
import model.Kvar;
import model.Sednica;
import model.Stavka;
import model.Zgrada;
import repository.FirmaRepository;
import repository.KomentarRepository;
import repository.KvarRepository;
import repository.StavkaRepository;

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
