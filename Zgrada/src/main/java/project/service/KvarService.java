package project.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Kvar;
import project.repository.KvarRepository;

@Service
public class KvarService {
	@Autowired
	private KvarRepository kvarRepository;
		
	public Kvar findByIme(String ime) {
		return kvarRepository.findByIme(ime);
	}
	public List<Kvar> findAll(){
		return kvarRepository.findAll();
	}
	public Kvar findByDatKreiranja(Date datKreiranja) {
		return kvarRepository.findByDatKreiranja(datKreiranja);
	}
	public Kvar findByDatZakazivanja(Date datZakazivanja) {
		return kvarRepository.findByDatZakazivanja(datZakazivanja);
	}
	public Kvar findByDatPopravke(Date datPopravke) {
		return kvarRepository.findByDatPopravke(datPopravke);
	}
	public Kvar findByRadnik(String radnik) {
		return kvarRepository.findByRadnik(radnik);
	}
	public void delete(Long id) {
		kvarRepository.delete(id);
	}		
	public Kvar save(Kvar kvar) {
		return kvarRepository.save(kvar);
	}
	public List<Kvar> findByZgrada(String zgrada) {
		return kvarRepository.findByZgrada(zgrada);
	}
	public Kvar findOne(Long id) {
		return kvarRepository.findOne(id);
	}
	public List<Kvar> findByKreator(String kreator) {
		return kvarRepository.findByKreator(kreator);
	}
}