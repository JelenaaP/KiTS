package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Zapisnik;
import repository.ZapisnikRepository;

@Service
public class ZapisnikService {

	@Autowired
	private ZapisnikRepository zapisnikRepository;
	
	public List<Zapisnik> findBySednica(Zapisnik zapisnik){
		return zapisnikRepository.findBySednica(zapisnik);
	}
	public Zapisnik findAllByDat_kreiranja(Date dat_kreiranja) {
		return zapisnikRepository.findOneByDat_kreiranja(dat_kreiranja);
	}
	
	public Zapisnik save(Zapisnik zapisnik){
		return zapisnikRepository.save(zapisnik);
	}
	
	public void delete(Zapisnik zapisnik){
		zapisnikRepository.delete(zapisnik);
	}
}
