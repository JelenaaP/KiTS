package dto;

import model.Korisnik_servisa;
import model.Kvar;


public class FirmaDto {

	private Long id_firme;
	private String ime;
	private String adresa;
	private Long telefon;
	private String email;
	private String web_site;
	private Kvar kvar;
	private Korisnik_servisa radnik;
	
	public FirmaDto(){}
	
	public FirmaDto(Long id_firme, String ime, String adresa, Long telefon, String email, String web_site, Kvar kvar,
			Korisnik_servisa radnik) {
		super();
		this.id_firme = id_firme;
		this.ime = ime;
		this.adresa = adresa;
		this.telefon = telefon;
		this.email = email;
		this.web_site = web_site;
		this.kvar = kvar;
		this.radnik = radnik;
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
	public Long getTelefon() {
		return telefon;
	}
	public void setTelefon(Long telefon) {
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
	public Kvar getKvar() {
		return kvar;
	}
	public void setKvar(Kvar kvar) {
		this.kvar = kvar;
	}
	public Korisnik_servisa getRadnik() {
		return radnik;
	}
	public void setRadnik(Korisnik_servisa radnik) {
		this.radnik = radnik;
	}
	
	
}
