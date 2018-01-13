package project.dto;

import project.model.Korisnik_servisa;
import project.model.Zgrada;
import project.model.Obavestenje;
import project.model.Stan;

import java.util.List;

/*klasa sadrzi korisnika, stan u kom zivi i zgradu gde se stan nalazi
 */

public class TenatProfileDto {
	
	private Korisnik_servisa radnik;
	private Stan stan;
	private Zgrada zgrada;
	public List<Obavestenje> obavestenje;
	
	public TenatProfileDto(){}

	public Korisnik_servisa getRadnik() {
		return radnik;
	}

	public void setRadnik(Korisnik_servisa radnik) {
		this.radnik = radnik;
	}


	public Stan getStan() {
		return stan;
	}

	public void setStan(Stan stan) {
		this.stan = stan;
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
