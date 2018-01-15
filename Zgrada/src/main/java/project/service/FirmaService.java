package project.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Firma;
import project.repository.FirmaRepository;

@Service
public class FirmaService {

	@Autowired
	private FirmaRepository firmaRepository;
	
	public Firma findByIme(String ime){
		return firmaRepository.findByIme(ime);
	}
	
	public Firma findOne(Long id_firme){
		return firmaRepository.findOne(id_firme);
	}
	
	public Firma findByAdresa(String adresa) {
		return firmaRepository.findByAdresa(adresa);
	}
	
	public Firma findByRadnik(String radnik){
		return firmaRepository.findByRadnik(radnik);
	}
	
	public List<Firma> findAll(){
		return firmaRepository.findAll();
	}
	
	public Firma save(Firma firma){
		return firmaRepository.save(firma);
	}
	
	public void delete(Long id_firme){
		 firmaRepository.delete(id_firme);
	}	
}