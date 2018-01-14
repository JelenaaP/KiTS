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
		
	public Kvar findOneByName(String ime) {
		return kvarRepository.findOneByIme(ime);
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
	public Kvar findAllByRadnik(String radnik) {
		return kvarRepository.findAllByRadnik(radnik);
	}
	public void delete(Kvar kvar) {
		kvarRepository.delete(kvar);
	}		
	public Kvar save(Kvar kvar) {
		return kvarRepository.save(kvar);
	}
	public List<Kvar> findAllByZgrada(String zgrada) {
		return kvarRepository.findAllByZgrada(zgrada);
	}
	public Kvar findOneById_kvar(Long id_kvar) {
		return kvarRepository.findOneById_kvar(id_kvar);
	}
	public List<Kvar> findAllByKreator(String kreator) {
		return kvarRepository.findAllByKreator(kreator);
	}
}