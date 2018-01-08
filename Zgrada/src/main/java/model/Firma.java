package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Firma {
	
	@Id
	@GeneratedValue
	private long id_firme;
	private String ime;
	private String adresa;
	private String vlasnik;
	private long telefon;
	private String email;
	private String web_site;
	private String radnik;
	
	@OneToMany(mappedBy = "firma", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Kvar> kvar = new HashSet<Kvar>();

	public long getId_firme() {
		return id_firme;
	}

	public void setId_firme(long id_firme) {
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

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

	public long getTelefon() {
		return telefon;
	}

	public void setTelefon(long telefon) {
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

	public String getRadnik() {
		return radnik;
	}

	public void setRadnik(String radnik) {
		this.radnik = radnik;
	}

	public Set<Kvar> getKvar() {
		return kvar;
	}

	public void setKvar(Set<Kvar> kvar) {
		this.kvar = kvar;
	}
	

}
