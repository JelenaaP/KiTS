package dto;

import model.Korisnik_servisa;
import model.Zgrada;

public class StanDto {
	private int id;
	private String ime;
	private String adresa;
	private Korisnik_servisa vlasnik;
	
	private StanDto(){}
	
	
	public StanDto(int id, String ime, String adresa, Korisnik_servisa vlasnik, int br_stanovnika,
			Korisnik_servisa stanovnici, Zgrada zgrada) {
		super();
		this.id = id;
		this.ime = ime;
		this.adresa = adresa;
		this.vlasnik = vlasnik;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Korisnik_servisa getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Korisnik_servisa vlasnik) {
		this.vlasnik = vlasnik;
	}
}
