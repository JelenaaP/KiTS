package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Korisnik_servisa {
	
	@Id
	@GeneratedValue
	private long id_korisnik_servisa;
	private String ime;
	private String koris_ime;
	private String lozinka;
	private String uloga;
	private String vlasnik_firme;
	private String vlasnik_zgrade;
	private String vlasnik_stana;
	private String predsednik_skupstine;
	
	
	public long getId_korisnik_servisa() {
		return id_korisnik_servisa;
	}
	public void setId_korisnik_servisa(long id_korisnik_servisa) {
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
	public String getVlasnik_firme() {
		return vlasnik_firme;
	}
	public void setVlasnik_firme(String vlasnik_firme) {
		this.vlasnik_firme = vlasnik_firme;
	}
	public String getVlasnik_zgrade() {
		return vlasnik_zgrade;
	}
	public void setVlasnik_zgrade(String vlasnik_zgrade) {
		this.vlasnik_zgrade = vlasnik_zgrade;
	}
	public String getVlasnik_stana() {
		return vlasnik_stana;
	}
	public void setVlasnik_stana(String vlasnik_stana) {
		this.vlasnik_stana = vlasnik_stana;
	}
	public String getPredsednik_skupstine() {
		return predsednik_skupstine;
	}
	public void setPredsednik_skupstine(String predsednik_skupstine) {
		this.predsednik_skupstine = predsednik_skupstine;
	}

}
