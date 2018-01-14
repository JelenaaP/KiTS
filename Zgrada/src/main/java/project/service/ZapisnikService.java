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
	
	public Zapisnik findAllByDat_kreiranja(Date dat_kreiranja) {
		return zapisnikRepository.findOneByDat_kreiranja(dat_kreiranja);
	}
	
	public List<Zapisnik> findAllByKreator(String kreator){
		return zapisnikRepository.findAllByKreator(kreator);
	}
	
	public List<Zapisnik> findAllByZgrada(String zgrada){
		return zapisnikRepository.findAllByZgrada(zgrada);
	}
	
	public Zapisnik save(Zapisnik zapisnik){
		return zapisnikRepository.save(zapisnik);
	}
	
	public void delete(Zapisnik zapisnik){
		zapisnikRepository.delete(zapisnik);
	}

	public List<Zapisnik> findAll() {
		return zapisnikRepository.findAll();
	}

	public Zapisnik findOneById_zapisnik(Long id_zapisnik) {
		return zapisnikRepository.findOneById_zapisnik(id_zapisnik);
	}
}