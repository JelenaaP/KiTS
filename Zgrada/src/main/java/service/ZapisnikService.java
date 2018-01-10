package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Korisnik_servisa;
import model.Sednica;
import model.Zapisnik;
import model.Zgrada;
import repository.ZapisnikRepository;

@Service
public class ZapisnikService {

	@Autowired
	private ZapisnikRepository zapisnikRepository;
	
	public List<Zapisnik> findBySednica(Sednica sednica){
		return zapisnikRepository.findBySednica(sednica);
	}
	
	public Zapisnik findAllByDat_kreiranja(Date dat_kreiranja) {
		return zapisnikRepository.findOneByDat_kreiranja(dat_kreiranja);
	}
	
	public List<Zapisnik> findByOwner(Korisnik_servisa kreator){
		return zapisnikRepository.findByOwner(kreator);
	}
	
	public List<Zapisnik> findByBuilding(Zgrada zgrada){
		return zapisnikRepository.findByBuilding(zgrada);
	}
	
	public Zapisnik save(Zapisnik zapisnik){
		return zapisnikRepository.save(zapisnik);
	}
	
	public void delete(Zapisnik zapisnik){
		zapisnikRepository.delete(zapisnik);
	}
}
