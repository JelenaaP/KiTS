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
		
	public Stan findByIme(String ime) {
		return stanRepository.findByIme(ime);
	}
	
	public Stan findByVlasnik(String vlasnik) {
		return stanRepository.findByVlasnik(vlasnik);
	}
	
	public Stan findByAdresa(String adresa) {
		return stanRepository.findByAdresa(adresa);
	}
	
	public List<Stan> findAll(){
		return stanRepository.findAll();
	}
		
	public Stan findOne(Long id_stanovi) {
		return stanRepository.findOne(id_stanovi);
	}
	
	public Stan  save(Stan stan){
		return stanRepository.save(stan);
	}
	
	public void delete(Long id_stanovi){
		 stanRepository.delete(id_stanovi);
	}

	public List<Stan> findAllByAdresa(String adresa) {
		return stanRepository.findAllByAdresa(adresa);
	}

	public List<Stan> findAllByVlasnik(String vlasnik) {
		return stanRepository.findAllByVlasnik(vlasnik);
	}
}