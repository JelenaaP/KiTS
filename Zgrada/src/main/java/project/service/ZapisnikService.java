package project.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Korisnik_servisa;
import project.model.Sednica;
import project.model.Zapisnik;
import project.model.Zgrada;
import project.repository.ZapisnikRepository;

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

	public List<Zapisnik> findAll() {
		return zapisnikRepository.findAll();
	}

	public List<Zapisnik> findAllByCreator(String kreator) {
		return zapisnikRepository.findAllByCreator(kreator);
	}

	public List<Zapisnik> findAllByBuilding(String zgrada) {
		// TODO Auto-generated method stub
		return zapisnikRepository.finAllByBuilding(zgrada);}

	public Zapisnik findOneById(Long id_zapisnik) {
		// TODO Auto-generated method stub
		return zapisnikRepository.findOneById(id_zapisnik);}}