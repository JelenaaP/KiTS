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
	
	public Firma findOne(Long id){
		return firmaRepository.findOne(id);
	}
	
	public List<Firma> findByAdresa(String adresa) {
		return firmaRepository.findByAdresa(adresa);
	}
	
	
	public Firma findByRadnici(String radnik){
		return firmaRepository.findByRadnici(radnik);
	}
	
	public List<Firma> findByVlasnikId(Long vlasnik){
		return firmaRepository.findByVlasnikId(vlasnik);
	}
	
	public List<Firma> findAll(){
		return firmaRepository.findAll();
	}
	
	public Firma save(Firma firma){
		return firmaRepository.save(firma);
	}
	
	public void delete(Long id){
		 firmaRepository.delete(id);
	}	
}