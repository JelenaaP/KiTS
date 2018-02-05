package project.dto;

import project.model.Firma;

public class FirmaDto {

	private Long id;
	private String ime;
	private String adresa;
	private int telefon;
	private String email;
	private String webSite;
	private Korisnik_servisaDto radnik;
	private Korisnik_servisaDto vlasnik;
	
	public FirmaDto(){}
	
	public FirmaDto(Long id, String ime, String adresa, int telefon, String email, String webSite,
			Korisnik_servisaDto radnik, Korisnik_servisaDto vlasnik) {
		super();
		this.id = id;
		this.ime = ime;
		this.adresa = adresa;
		this.telefon = telefon;
		this.email = email;
		this.webSite = webSite;
		this.radnik = radnik;
		this.vlasnik = vlasnik;
	}
	
	public FirmaDto(Firma firma) {
		id = firma.getId();
		ime = firma.getIme();
		adresa = firma.getAdresa();
		telefon = firma.getTelefon();
		email = firma.getEmail();
		webSite = firma.getWebSite();
		vlasnik = new Korisnik_servisaDto(firma.getVlasnik());
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
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
