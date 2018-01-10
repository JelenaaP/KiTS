package dto;

import model.Korisnik_servisa;
import model.Zgrada;

public class StanDto {
	private int id;
	private String ime;
	private String adresa;
	private Korisnik_servisa vlasnik;
	private int br_stanovnika;
	private Korisnik_servisa stanovnici;
	private Zgrada zgrada;
	
	private StanDto(){}
	
	
	public StanDto(int id, String ime, String adresa, Korisnik_servisa vlasnik, int br_stanovnika,
			Korisnik_servisa stanovnici, Zgrada zgrada) {
		super();
		this.id = id;
		this.ime = ime;
		this.adresa = adresa;
		this.vlasnik = vlasnik;
		this.br_stanovnika = br_stanovnika;
		this.stanovnici = stanovnici;
		this.zgrada = zgrada;
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

	public int getBr_stanovnika() {
		return br_stanovnika;
	}

	public void setBr_stanovnika(int br_stanovnika) {
		this.br_stanovnika = br_stanovnika;
	}

	public Korisnik_servisa getStanovnici() {
		return stanovnici;
	}

	public void setStanovnici(Korisnik_servisa stanovnici) {
		this.stanovnici = stanovnici;
	}

	public Zgrada getZgrada() {
		return zgrada;
	}

	public void setZgrada(Zgrada zgrada) {
		this.zgrada = zgrada;
	}

}
