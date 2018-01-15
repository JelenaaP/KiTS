package project.dto;

import project.model.Korisnik_servisa;

public class Korisnik_servisaDto {
	
	private Long id;
	private String ime;
	private String korisIme;
	private String lozinka;
	private String uloga;
	private Korisnik_servisaDto predsednikSkupstine;
	private Korisnik_servisaDto vlasnikZgrade;
	private Korisnik_servisaDto vlasnikFirme;
	private Korisnik_servisaDto vlasnikStana;
	
	public Korisnik_servisaDto(Long id, String ime, String korisIme, String lozinka, String uloga,
			Korisnik_servisaDto vlasnikFirme, Korisnik_servisaDto vlasnikZgrade, Korisnik_servisaDto vlasnikStana, Korisnik_servisaDto predsednikSkupstine) {
		super();
		this.id = id;
		this.ime = ime;
		this.korisIme = korisIme;
		this.lozinka = lozinka;
		this.uloga = uloga;
		this.vlasnikFirme = vlasnikFirme;
		this.vlasnikZgrade = vlasnikZgrade;
		this.vlasnikStana = vlasnikStana;
		this.predsednikSkupstine = predsednikSkupstine;
	}

	public Korisnik_servisaDto(Korisnik_servisa korisnik_servisa) {
		id = korisnik_servisa.getId();
		ime = korisnik_servisa.getIme();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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

	public Korisnik_servisaDto getPredsednikSkupstine() {
		return predsednikSkupstine;
	}

	public void setPredsednikSkupstine(Korisnik_servisaDto predsednikSkupstine) {
		this.predsednikSkupstine = predsednikSkupstine;
	}

	public Korisnik_servisaDto getVlasnikZgrade() {
		return vlasnikZgrade;
	}

	public void setVlasnikZgrade(Korisnik_servisaDto vlasnikZgrade) {
		this.vlasnikZgrade = vlasnikZgrade;
	}

	public Korisnik_servisaDto getVlasnikFirme() {
		return vlasnikFirme;
	}

	public void setVlasnikFirme(Korisnik_servisaDto vlasnikFirme) {
		this.vlasnikFirme = vlasnikFirme;
	}

	public Korisnik_servisaDto getVlasnikStana() {
		return vlasnikStana;
	}

	public void setVlasnikStana(Korisnik_servisaDto vlasnikStana) {
		this.vlasnikStana = vlasnikStana;
	}

	public void setId(Long id) {
		this.id = id;
	}
}