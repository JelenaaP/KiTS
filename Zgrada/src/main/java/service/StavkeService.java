package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Korisnik_servisa;
import model.Kvar;
import model.Zgrada;
import repository.FirmaRepository;
import repository.KomentarRepository;
import repository.KvarRepository;
import repository.StavkaRepository;


public class StavkeService {

	@Autowired
	private StavkaRepository stavkaRepository;
}
