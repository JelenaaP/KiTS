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
		return kvarRepository.findOneByName(ime);
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
	public Kvar findAllByWorker(String radnik) {
		return kvarRepository.findAllByWorker(radnik);
	}
	public void delete(Kvar kvar) {
		kvarRepository.delete(kvar);
	}		
	public Kvar save(Kvar kvar) {
		return kvarRepository.save(kvar);
	}
	public List<Kvar> findAllByBuilding(String zgrada) {
		return kvarRepository.findAllByBuilding(zgrada);
	}
	public Kvar findOneById(Long id_kvar) {
		return kvarRepository.findOneById(id_kvar);
	}
	public List<Kvar> findAllByOwner(String vlasnik) {
		return kvarRepository.findAllByOwner(vlasnik);
	}
}