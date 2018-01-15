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
	
	public Zapisnik findByDat_kreiranja(Date dat_kreiranja) {
		return zapisnikRepository.findByDat_kreiranja(dat_kreiranja);
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
	
	public void delete(Long id_zapisnik){
		zapisnikRepository.delete(id_zapisnik);
	}

	public List<Zapisnik> findAll() {
		return zapisnikRepository.findAll();
	}

	public Zapisnik findOne(Long id_zapisnik) {
		return zapisnikRepository.findOne(id_zapisnik);
	}
}