package project.dto;

import project.model.Korisnik_servisa;

public class Korisnik_servisaDto {
	
	private Long id;
	private String ime;
	private String korisIme;
	private String lozinka;
	private String uloga;
	
	
	public Korisnik_servisaDto() {}

	public Korisnik_servisaDto(Long id, String ime, String korisIme, String lozinka, String uloga) {
		super();
		this.id = id;
		this.ime = ime;
		this.korisIme = korisIme;
		this.lozinka = lozinka;
		this.uloga = uloga;
		
	}

	public Korisnik_servisaDto(Korisnik_servisa korisnik_servisa) {
		this(korisnik_servisa.getId(), korisnik_servisa.getIme(), korisnik_servisa.getKorisIme(), korisnik_servisa.getLozinka(),
				korisnik_servisa.getUloga());
		
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

	public String getKorisIme() {
		return korisIme;
	}

	public void setKorisIme(String korisIme) {
		this.korisIme = korisIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public String getUloga() {
		return uloga;
	}

	public void setUloga(String uloga) {
		this.uloga = uloga;
	}
	
}