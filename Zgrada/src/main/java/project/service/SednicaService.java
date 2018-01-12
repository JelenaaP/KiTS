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
	
	public void delete(Sednica sednica){
		sednicaRepository.delete(sednica);
	}
	
	public Sednica findById(Long id_sednice){
		return sednicaRepository.findOne(id_sednice);
	}
	
	public Sednica findAllByDat_kreiranja(Date dat_kreiranja) {
		return sednicaRepository.findOneByDat_kreiranja(dat_kreiranja);
	}
	
	public Sednica findAllByDat_zakazivanja(Date dat_zakazivanja) {
		return sednicaRepository.findOneByDat_zakazivanja(dat_zakazivanja);
	}
	
	public Sednica findByAktivna(boolean aktivna){
		return sednicaRepository.findByAktivna(aktivna);
	}

	public Sednica findOneById(Long id_zapisnik) {
		// TODO Auto-generated method stub
		return sednicaRepository.findOneById(id_zapisnik);
	}

	public List<Sednica> findAllByCreator(String kreator) {
		return sednicaRepository.findByCreator(kreator);
	}

	public List<Sednica> findAllByBuilding(String zgrada) {
		return sednicaRepository.findByBuilding(zgrada);
	}
}