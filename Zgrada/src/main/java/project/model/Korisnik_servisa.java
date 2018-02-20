package project.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
public class Korisnik_servisa {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String ime;
	private String korisIme;
	private String lozinka;
	private String uloga;
	
	@Cascade(CascadeType.DELETE)
	@OneToMany(mappedBy = "kreator", fetch = FetchType.LAZY)
	private Set<Stavka> stavka = new HashSet<Stavka>();

	@Cascade(CascadeType.DELETE)
	@OneToMany(mappedBy = "kreator", fetch = FetchType.LAZY)
	private Set<Obavestenje> obavestenje = new HashSet<Obavestenje>();

	@Cascade(CascadeType.DELETE)
	@OneToMany(mappedBy = "kreator", fetch = FetchType.LAZY)
	private Set<Komentar> komentar = new HashSet<Komentar>();
 
	@Cascade(CascadeType.DELETE)
	@OneToMany(mappedBy = "kreator", fetch = FetchType.LAZY)
	private Set<Kvar> kvar = new HashSet<Kvar>();
 
	@Cascade(CascadeType.REFRESH)
	@OneToMany(mappedBy = "vlasnik", fetch = FetchType.LAZY)
	private Set<Firma> firma = new HashSet<Firma>();

	@Cascade(CascadeType.REFRESH)
	@OneToMany(mappedBy = "vlasnik", fetch = FetchType.LAZY)
	private Set<Stan> stan = new HashSet<Stan>();

	@Cascade(CascadeType.REFRESH)
	@OneToMany(mappedBy = "vlasnik", fetch = FetchType.LAZY)
	private Set<Zgrada> zgrada = new HashSet<Zgrada>();

	@Cascade(CascadeType.REFRESH)
	@ManyToOne(fetch = FetchType.EAGER)
	private Stan stanovnik;
	
	@ManyToMany(mappedBy = "radnici")
	private Set<Firma> radnici = new HashSet<Firma>();

	@ManyToMany(mappedBy = "radnik")
	private Set<Kvar> radnik = new HashSet<Kvar>();

	@OneToOne
	private Zgrada predsednik_skupstine;	
	
	public Set<Komentar> getKomentar() {
		return komentar;
	}
	public void setKomentar(Set<Komentar> komentar) {
		this.komentar = komentar;
	}
	public Set<Firma> getFirma() {
		return firma;
	}
	public void setFirma(Set<Firma> firma) {
		this.firma = firma;
	}
	public Set<Stan> getStan() {
		return stan;
	}
	public void setStan(Set<Stan> stan) {
		this.stan = stan;
	}
	public Stan getStanovnik() {
		return stanovnik;
	}
	public void setStanovnik(Stan stanovnik) {
		this.stanovnik = stanovnik;
	}
	public Zgrada getPredsednik_skupstine() {
		return predsednik_skupstine;
	}
	public void setPredsednik_skupstine(Zgrada predsednik_skupstine) {
		this.predsednik_skupstine = predsednik_skupstine;
	}
	public Set<Zgrada> getZgrada() {
		return zgrada;
	}
	public void setZgrada(Set<Zgrada> zgrada) {
		this.zgrada = zgrada;
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
	public Set<Stavka> getStavka() {
		return stavka;
	}
	public void setStavka(Set<Stavka> stavka) {
		this.stavka = stavka;
	}
	public Set<Obavestenje> getObavestenje() {
		return obavestenje;
	}
	public void setObavestenje(Set<Obavestenje> obavestenje) {
		this.obavestenje = obavestenje;
	}
	public Set<Kvar> getKvar() {
		return kvar;
	}
	public void setKvar(Set<Kvar> kvar) {
		this.kvar = kvar;
	}
	public Set<Firma> getRadnici() {
		return radnici;
	}
	public void setRadnici(Set<Firma> radnici) {
		this.radnici = radnici;
	}
	public Set<Kvar> getRadnik() {
		return radnik;
	}
	public void setRadnik(Set<Kvar> radnik) {
		this.radnik = radnik;
	}
	
	
	
}
