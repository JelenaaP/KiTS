package dto;

import model.Korisnik_servisa;
import model.Zgrada;

public class StanDto {
	private int id;
	private String ime;
	private String adresa;
	private Korisnik_servisaDto vlasnik;
	private ZgradaDto zgrada;
	
	private StanDto(){}
	
	
	public StanDto(int id, String ime, String adresa, Korisnik_servisaDto vlasnik,
			int br_stanovnika, ZgradaDto zgrada) {
		super();
		this.id = id;
		this.ime = ime;
		this.adresa = adresa;
		this.vlasnik = vlasnik;
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

	public Korisnik_servisaDto getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Korisnik_servisaDto vlasnik) {
		this.vlasnik = vlasnik;
	}
	
	public ZgradaDto getZgrada() {
		return zgrada;
	}

	public void setZgrada(ZgradaDto zgrada) {
		this.zgrada = zgrada;
	}	
}
