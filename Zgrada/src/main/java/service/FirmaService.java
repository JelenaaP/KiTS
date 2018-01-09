package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Firma;
import model.Korisnik_servisa;
import model.Kvar;
import model.Zgrada;
import repository.FirmaRepository;
import repository.KvarRepository;

@Service
public class FirmaService {

	@Autowired
	private FirmaRepository firmaRepository;
	
	public Firma findOneByName(String ime){
		return firmaRepository.findOneByName(ime);
	}
	
	public Firma save(Firma firma){
		return firmaRepository.save(firma);
	}
	
	public void delete(Firma firma){
		 firmaRepository.delete(firma);
	}
}
