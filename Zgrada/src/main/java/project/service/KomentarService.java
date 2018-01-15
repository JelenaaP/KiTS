package project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Komentar;
import project.repository.KomentarRepository;

@Service
public class KomentarService {

	@Autowired
	private KomentarRepository komentarRepository;
	
	public List<Komentar> findByKvar(String kvar) {
		return komentarRepository.findByKvar(kvar);
	}
	
	public List<Komentar> findByKreator(String kreator){
		return komentarRepository.findByKreator(kreator);
	}
	
	public Komentar findOne(Long id){
		return komentarRepository.findOne(id);
	}

	public List<Komentar> findAll(){
		return komentarRepository.findAll();
	}
	
	public Komentar  save(Komentar komentar){
		return komentarRepository.save(komentar);
	}
	
	public void delete(Long id){
		 komentarRepository.delete(id);
	}
}