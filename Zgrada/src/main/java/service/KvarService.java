package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Korisnik_servisa;
import model.Kvar;
import model.Zgrada;
import repository.KvarRepository;

@Service
public class KvarService {
	@Autowired
	private KvarRepository kvarRepository;
		
	public Kvar findOneByName(String ime) {
		return kvarRepository.findOneByName(ime);
	}
	public List<Kvar> findByZgrada(Zgrada zgrada){
		return kvarRepository.findByZgrada(zgrada);
	}
	public List<Kvar> findAll(){
		return kvarRepository.findAll();
	}
	
	public Kvar findAllByDat_kreiranja(Date dat_kreiranja) {
		return kvarRepository.findOneByDat_kreiranja(dat_kreiranja);
	}
	
	public Kvar findAllByDat_zakazivanja(Date dat_zakazivanja) {
		return kvarRepository.findOneByDat_zakazivanja(dat_zakazivanja);
	}
	
	public Kvar findAllByDat_popravke(Date dat_popravke) {
		return kvarRepository.findOneByDat_popravke(dat_popravke);
	}
	
	public Kvar findAllByWorker(Korisnik_servisa radnik) {
		return kvarRepository.findAllByWorker(radnik);
	}
	
	public Kvar findAllByOwner(Korisnik_servisa radnik) {
		return kvarRepository.findAllByWorker(radnik);
	}
	
	public void delete(Kvar kvar) {
		kvarRepository.delete(kvar);
	}
		
	public Kvar save(Kvar kvar) {
		return kvarRepository.save(kvar);
	}
}

