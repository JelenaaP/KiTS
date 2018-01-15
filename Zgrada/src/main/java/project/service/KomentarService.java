package project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import project.model.Komentar;
import project.repository.KomentarRepository;

public class KomentarService {

	@Autowired
	private KomentarRepository komentarRepository;
	
	public List<Komentar> findByKvar(String kvar) {
		return komentarRepository.findByKvar(kvar);
	}
	
	public List<Komentar> findByKreator(String kreator){
		return komentarRepository.findByKreator(kreator);
	}
	
	public Komentar findOne(Long id_komentar){
		return komentarRepository.findOne(id_komentar);
	}

	public List<Komentar> findAll(){
		return komentarRepository.findAll();
	}
	
	public Komentar  save(Komentar komentar){
		return komentarRepository.save(komentar);
	}
	
	public void delete(Long id_komentar){
		 komentarRepository.delete(id_komentar);
	}
}