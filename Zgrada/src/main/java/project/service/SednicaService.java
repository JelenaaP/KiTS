package project.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Sednica;
import project.repository.SednicaRepository;

@Service
public class SednicaService {

	@Autowired
	private SednicaRepository sednicaRepository;
	
	public List<Sednica> findAll(){
		return sednicaRepository.findAll();
	}
	
	public Sednica save(Sednica sednica){
		return sednicaRepository.save(sednica);
	}
	
	public void delete(Long id_sednice){
		sednicaRepository.delete(id_sednice);
	}
	
	public Sednica findOne(Long id_sednice){
		return sednicaRepository.findOne(id_sednice);
	}
	
	public Sednica findByDat_kreiranja(Date dat_kreiranja) {
		return sednicaRepository.findByDat_kreiranja(dat_kreiranja);
	}
	
	public Sednica findByDat_zakazivanja(Date dat_zakazivanja) {
		return sednicaRepository.findByDat_zakazivanja(dat_zakazivanja);
	}
	
	public Sednica findByAktivna(boolean aktivna){
		return sednicaRepository.findByAktivna(aktivna);
	}

	public Sednica findById_zapisnik(Long id_zapisnik) {
		return sednicaRepository.findById_zapisnik(id_zapisnik);
	}

	public List<Sednica> findByKreator(String kreator) {
		return sednicaRepository.findByKreator(kreator);
	}

	public List<Sednica> findByZgrada(String zgrada) {
		return sednicaRepository.findByZgrada(zgrada);
	}
}