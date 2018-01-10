package dto;

import model.Korisnik_servisa;
import model.Zgrada;
import model.Obavestenje;

import java.util.List;

import model.Firma;

public class TenatProfileDto {
	
	private Korisnik_servisa radnik;
	private Firma firma;
	private Zgrada zgrada;
	public List<Obavestenje> obavestenje;
	
	public TenatProfileDto(){}

	public Korisnik_servisa getRadnik() {
		return radnik;
	}

	public void setRadnik(Korisnik_servisa radnik) {
		this.radnik = radnik;
	}

	public Firma getFirma() {
		return firma;
	}

	public void setFirma(Firma firma) {
		this.firma = firma;
	}

	public Zgrada getZgrada() {
		return zgrada;
	}

	public void setZgrada(Zgrada zgrada) {
		this.zgrada = zgrada;
	}

	public List<Obavestenje> getObavestenje() {
		return obavestenje;
	}

	public void setObavestenje(List<Obavestenje> obavestenje) {
		this.obavestenje = obavestenje;
	}
	
	
	

}
