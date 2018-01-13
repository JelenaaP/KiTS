package project.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Firma {
	
	@Id
	@GeneratedValue
	private long id_firme;
	
	private String ime;
	private String adresa;
	private int telefon;
	private String email;
	private String web_site;
	
	@ManyToMany(mappedBy = "firma", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Kvar> kvar = new HashSet<Kvar>();
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Korisnik_servisa vlasnik;
	
	@OneToMany(mappedBy = "radnik", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Korisnik_servisa> radnik = new HashSet<Korisnik_servisa>();
	
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
	public Korisnik_servisa getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(Korisnik_servisa vlasnik) {
		this.vlasnik = vlasnik;
	}
	public Set<Korisnik_servisa> getRadnik() {
		return radnik;
	}
	public void setRadnik(Set<Korisnik_servisa> radnik) {
		this.radnik = radnik;
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
	public Set<Kvar> getKvar() {
		return kvar;
	}
	public void setKvar(Set<Kvar> kvar) {
		this.kvar = kvar;
	}
}