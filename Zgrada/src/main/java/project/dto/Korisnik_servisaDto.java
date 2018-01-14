package project.dto;

import project.model.Korisnik_servisa;

public class Korisnik_servisaDto {
	
	private Long id_korisnik_servisa;
	private String ime;
	private String koris_ime;
	private String lozinka;
	private String uloga;
	private Korisnik_servisaDto predsednik_skupstine;
	private Korisnik_servisaDto vlasnik_zgrade;
	private Korisnik_servisaDto vlasnik_firme;
	private Korisnik_servisaDto vlasnik_stana;
	
	public Korisnik_servisaDto(Long id_korisnik_servisa, String ime, String koris_ime, String lozinka, String uloga,
			Korisnik_servisaDto vlasnik_firme, Korisnik_servisaDto vlasnik_zgrade, Korisnik_servisaDto vlasnik_stana, Korisnik_servisaDto predsednik_skupstine) {
		super();
		this.id_korisnik_servisa = id_korisnik_servisa;
		this.ime = ime;
		this.koris_ime = koris_ime;
		this.lozinka = lozinka;
		this.uloga = uloga;
		this.vlasnik_firme = vlasnik_firme;
		this.vlasnik_zgrade = vlasnik_zgrade;
		this.vlasnik_stana = vlasnik_stana;
		this.predsednik_skupstine = predsednik_skupstine;
	}

	public Korisnik_servisaDto(Korisnik_servisa korisnik_servisa) {
		id_korisnik_servisa = korisnik_servisa.getId_korisnik_servisa();
		ime = korisnik_servisa.getKoris_ime();
	}
	
	public long getId_korisnik_servisa() {
		return id_korisnik_servisa;
	}
	public void setId_korisnika_servisa(long id_korisnik_servisa) {
		this.id_korisnik_servisa = id_korisnik_servisa;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getKoris_ime() {
		return koris_ime;
	}
	public void setKoris_ime(String koris_ime) {
		this.koris_ime = koris_ime;
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
	public Korisnik_servisaDto getVlasnik_zgrade() {
		return vlasnik_zgrade;
	}
	public void setVlasnik_zgrade(Korisnik_servisaDto vlasnik_zgrade) {
		this.vlasnik_zgrade = vlasnik_zgrade;
	}
	public Korisnik_servisaDto getVlasnik_firme() {
		return vlasnik_firme;
	}
	public void setVlasnik_firme(Korisnik_servisaDto vlasnik_firme) {
		this.vlasnik_firme = vlasnik_firme;
	}
	public Korisnik_servisaDto getVlasnik_stana() {
		return vlasnik_stana;
	}
	public void setVlasnik_stana(Korisnik_servisaDto vlasnik_stana) {
		this.vlasnik_stana = vlasnik_stana;
	}
	public void setId_korisnik_servisa(long id_korisnik_servisa) {
		this.id_korisnik_servisa = id_korisnik_servisa;
	}
	public Korisnik_servisaDto getPredsednik_skupstine() {
		return predsednik_skupstine;
	}
	public void setPredsednik_skupstine(Korisnik_servisaDto predsednik_skupstine) {
		this.predsednik_skupstine = predsednik_skupstine;
	}
}