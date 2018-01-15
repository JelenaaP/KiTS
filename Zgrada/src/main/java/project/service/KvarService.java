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
	public Kvar findByDat_kreiranja(Date dat_kreiranja) {
		return kvarRepository.findByDat_kreiranja(dat_kreiranja);
	}
	public Kvar findByDat_zakazivanja(Date dat_zakazivanja) {
		return kvarRepository.findByDat_zakazivanja(dat_zakazivanja);
	}
	public Kvar findByDat_popravke(Date dat_popravke) {
		return kvarRepository.findByDat_popravke(dat_popravke);
	}
	public Kvar findByRadnik(String radnik) {
		return kvarRepository.findByRadnik(radnik);
	}
	public void delete(Long id_kvar) {
		kvarRepository.delete(id_kvar);
	}		
	public Kvar save(Kvar kvar) {
		return kvarRepository.save(kvar);
	}
	public List<Kvar> findByZgrada(String zgrada) {
		return kvarRepository.findByZgrada(zgrada);
	}
	public Kvar findOne(Long id_kvar) {
		return kvarRepository.findOne(id_kvar);
	}
	public List<Kvar> findByKreator(String kreator) {
		return kvarRepository.findByKreator(kreator);
	}
}