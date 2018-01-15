package project.dto;

import project.dto.Korisnik_servisaDto;
import project.model.Zgrada;

public class ZgradaDto {
	
	private Long id;
	private String ime;
	private String adresa;
	private Korisnik_servisaDto vlasnik;
	private int brStanova;
	private int brNaseljenih;
	private Korisnik_servisaDto predsednikSkupstine;	
	
	public ZgradaDto(){}

	public ZgradaDto(Zgrada zgrada) {
		id= zgrada.getId();
		ime = zgrada.getIme();
		adresa = zgrada.getAdresa();
		vlasnik = new Korisnik_servisaDto(zgrada.getVlasnik());
		brStanova = zgrada.getBrStanova();
		brNaseljenih = zgrada.getBrNaseljenih();
		predsednikSkupstine = new Korisnik_servisaDto(zgrada.getPredsednik());
		}

	public ZgradaDto(Long id, String ime, String adresa, Korisnik_servisaDto vlasnik, int brStanova,
			int brNaseljenih, Korisnik_servisaDto predsednikSkupstine) {
		super();
		this.id= id;
		this.ime = ime;
		this.adresa = adresa;
		this.vlasnik = vlasnik;
		this.brStanova = brStanova;
		this.brNaseljenih = brNaseljenih;
		this.predsednikSkupstine = predsednikSkupstine;
	}

	public Long getId() {
		return id;
	}
	public void set(Long id) {
		this.id= id;
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

	public int getBrStanova() {
		return brStanova;
	}

	public void setBrStanova(int brStanova) {
		this.brStanova = brStanova;
	}

	public int getBrNaseljenih() {
		return brNaseljenih;
	}

	public void setBrNaseljenih(int brNaseljenih) {
		this.brNaseljenih = brNaseljenih;
	}

	public Korisnik_servisaDto getPredsednikSkupstine() {
		return predsednikSkupstine;
	}

	public void setPredsednikSkupstine(Korisnik_servisaDto predsednikSkupstine) {
		this.predsednikSkupstine = predsednikSkupstine;
	}
}