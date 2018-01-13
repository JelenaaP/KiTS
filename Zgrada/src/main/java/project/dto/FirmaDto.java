package project.dto;

import project.model.Firma;

public class FirmaDto {

	private Long id_firme;
	private String ime;
	private String adresa;
	private int telefon;
	private String email;
	private String web_site;
	private Korisnik_servisaDto radnik;
	private Korisnik_servisaDto vlasnik;
	
	public FirmaDto(){}
	
	public FirmaDto(Long id_firme, String ime, String adresa, int telefon, String email, String web_site,
			Korisnik_servisaDto radnik, Korisnik_servisaDto vlasnik) {
		super();
		this.id_firme = id_firme;
		this.ime = ime;
		this.adresa = adresa;
		this.telefon = telefon;
		this.email = email;
		this.web_site = web_site;
		this.radnik = radnik;
		this.vlasnik = vlasnik;
	}
	
	public FirmaDto(Firma firma) {
		id_firme = firma.getId_firme();
		ime = firma.getIme();
		adresa = firma.getAdresa();
		telefon = firma.getTelefon();
		email = firma.getEmail();
		web_site = firma.getWeb_site();
	}

	public Long getId_firme() {
		return id_firme;
	}
	public void setId_firme(Long id_firme) {
		this.id_firme = id_firme;
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
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeb_site() {
		return web_site;
	}
	public void setWeb_site(String web_site) {
		this.web_site = web_site;
	}
	public Korisnik_servisaDto getRadnik() {
		return radnik;
	}
	public void setRadnik(Korisnik_servisaDto radnik) {
		this.radnik = radnik;
	}
	public Korisnik_servisaDto getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(Korisnik_servisaDto vlasnik) {
		this.vlasnik = vlasnik;
	}	
}
