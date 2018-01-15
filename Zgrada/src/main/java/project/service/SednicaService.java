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
	
	public void delete(Long id){
		sednicaRepository.delete(id);
	}
	
	public Sednica findOne(Long id){
		return sednicaRepository.findOne(id);
	}
	
	public Sednica findByDatKreiranja(Date datKreiranja) {
		return sednicaRepository.findByDatKreiranja(datKreiranja);
	}
	
	public Sednica findByDatZakazivanja(Date datZakazivanja) {
		return sednicaRepository.findByDatZakazivanja(datZakazivanja);
	}
	
	public Sednica findByAktivna(boolean aktivna){
		return sednicaRepository.findByAktivna(aktivna);
	}

	public Sednica findById(Long id_zapisnik) {
		return sednicaRepository.findById(id_zapisnik);
	}

	public List<Sednica> findByKreator(String kreator) {
		return sednicaRepository.findByKreator(kreator);
	}

	public List<Sednica> findByZgrada(String zgrada) {
		return sednicaRepository.findByZgrada(zgrada);
	}
}