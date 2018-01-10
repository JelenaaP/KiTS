package service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model.Komentar;
import model.Kvar;
import repository.KomentarRepository;


public class KomentarService {

	@Autowired
	private KomentarRepository komentarRepository;
	
	public List<Komentar> findByKvar(Kvar kvar) {
		return komentarRepository.findByKvar(kvar);
	}
	
	public Komentar  save(Komentar komentar){
		return komentarRepository.save(komentar);
	}
	
	public void delete(Komentar komentar){
		 komentarRepository.delete(komentar);
	}
}
