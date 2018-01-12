package project.dto;

import project.model.Korisnik_servisa;

public class Korisnik_servisaDto {
	
	private long id_korisnik_servisa;
	private String ime;
	private String koris_ime;
	private String lozinka;
	private String uloga;
	private boolean vlasnik_firme;
	private boolean vlasnik_zgrade;
	private boolean vlasnik_stana;
	private boolean predsednik_skupstine;
	private StanDto stan;
	private FirmaDto firma;
	private ZgradaDto zgrada;
	
	public Korisnik_servisaDto(long id_korisnik_servisa, String ime, String koris_ime, String lozinka, String uloga,
			boolean vlasnik_firme, boolean vlasnik_zgrade, boolean vlasnik_stana, boolean predsednik_skupstine,
			StanDto stan, FirmaDto firma, ZgradaDto zgrada) {
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
		this.setStan(stan);
		this.setFirma(firma);
		this.setZgrada(zgrada);
	}


	public Korisnik_servisaDto(Korisnik_servisa korisnik) {
		id_korisnik_servisa = korisnik.getId_korisnik_servisa();
		ime = korisnik.getKoris_ime();	
		
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

	public boolean isVlasnik_firme() {
		return vlasnik_firme;
	}

	public void setVlasnik_firme(boolean vlasnik_firme) {
		this.vlasnik_firme = vlasnik_firme;
	}

	public boolean isVlasnik_zgrade() {
		return vlasnik_zgrade;
	}

	public void setVlasnik_zgrade(boolean vlasnik_zgrade) {
		this.vlasnik_zgrade = vlasnik_zgrade;
	}

	public boolean isVlasnik_stana() {
		return vlasnik_stana;
	}

	public void setVlasnik_stana(boolean vlasnik_stana) {
		this.vlasnik_stana = vlasnik_stana;
	}

	public boolean isPredsednik_skupstine() {
		return predsednik_skupstine;
	}

	public void setPredsednik_skupstine(boolean predsednik_skupstine) {
		this.predsednik_skupstine = predsednik_skupstine;
	}

	public StanDto getStan() {
		return stan;
	}

	public void setStan(StanDto stan) {
		this.stan = stan;
	}

	public FirmaDto getFirma() {
		return firma;
	}

	public void setFirma(FirmaDto firma) {
		this.firma = firma;
	}

	public ZgradaDto getZgrada() {
		return zgrada;
	}

	public void setZgrada(ZgradaDto zgrada) {
		this.zgrada = zgrada;
	}
	
	
	

}
