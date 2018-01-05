package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Stan;
import repository.StanRepository;

public class StanService {

@Service
public class ZgradaService {
	@Autowired
	private StanRepository stanRepository;
		
	public Stan findOneByName(String ime) {
		return stanRepository.findOneByName(ime);
	}
	
	public List<Stan> findAll(){
		return stanRepository.findAll();
	}
		
	public Stan findOneById(Long id_stanovi) {
		return stanRepository.findOne(id_stanovi);
	}
// ************DOPUNITI SA METODAMA ZA BRISANJE I CUVANJE************
}
}
