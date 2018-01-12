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
		
	public Stan findOneByName(String ime) {
		return stanRepository.findOneByName(ime);
	}
	
	public Stan findOneByOwner(String vlasnik) {
		return stanRepository.findOneByOwner(vlasnik);
	}
	
	public Stan findOneByAdress(String adresa) {
		return stanRepository.findOneByAdress(adresa);
	}
	
	public List<Stan> findAll(){
		return stanRepository.findAll();
	}
		
	public Stan findOneById(Long id_stanovi) {
		return stanRepository.findOne(id_stanovi);
	}
	
	public Stan  save(Stan stan){
		return stanRepository.save(stan);
	}
	
	public void delete(Stan stan){
		 stanRepository.delete(stan);
	}

	public List<Stan> findAllByAddress(String adresa) {
		return stanRepository.findAllByAddress(adresa);
	}

	public List<Stan> findAllByOwner(String vlasnik) {
		return stanRepository.findAllByOwner(vlasnik);
	}

	public Stan findOneByAddress(String adresa) {
		return stanRepository.findOneByAddress (adresa);
}
}
