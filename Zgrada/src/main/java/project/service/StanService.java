package project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Stan;
import project.repository.StanRepository;


@Service
public class StanService {
	@Autowired
	private StanRepository stanRepository;
		
	public Stan findOneByIme(String ime) {
		return stanRepository.findOneByIme(ime);
	}
	
	public Stan findOneByVlasnik(String vlasnik) {
		return stanRepository.findOneByVlasnik(vlasnik);
	}
	
	public Stan findOneByAdresa(String adresa) {
		return stanRepository.findOneByAdresa(adresa);
	}
	
	public List<Stan> findAll(){
		return stanRepository.findAll();
	}
		
	public Stan findOneById_stanovi(Long id_stanovi) {
		return stanRepository.findOneById_stanovi(id_stanovi);
	}
	
	public Stan  save(Stan stan){
		return stanRepository.save(stan);
	}
	
	public void delete(Stan stan){
		 stanRepository.delete(stan);
	}

	public List<Stan> findAllByAddresa(String adresa) {
		return stanRepository.findAllByAddresa(adresa);
	}

	public List<Stan> findAllByVlasnik(String vlasnik) {
		return stanRepository.findAllByVlasnik(vlasnik);
	}

	public Stan findOneByAddresa(String adresa) {
		return stanRepository.findOneByAddresa (adresa);
	}
}