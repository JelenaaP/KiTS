package project.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Korisnik_servisa {
	
	@Id
	@GeneratedValue
	private Long id_korisnik_servisa;
	
	private String ime;
	private String koris_ime;
	private String lozinka;
	private String uloga;
	
	@OneToMany(mappedBy = "kreator", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Stavka> stavka = new HashSet<Stavka>();

	@OneToMany(mappedBy = "kreator", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Obavestenje> obavestenje = new HashSet<Obavestenje>();

	@OneToMany(mappedBy = "kreator", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Komentar> komentar = new HashSet<Komentar>();
 
	@OneToMany(mappedBy = "vlasnik", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Firma> firma = new HashSet<Firma>();

	@OneToMany(mappedBy = "vlasnik", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Stan> stan = new HashSet<Stan>();

	@OneToMany(mappedBy = "vlasnik", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Zgrada> zgrada = new HashSet<Zgrada>();

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Stan stanovnik;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Zgrada radnik;
	
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
	public Long getId_korisnik_servisa() {
		return id_korisnik_servisa;
	}
	public void setId_korisnik_servisa(Long id_korisnik_servisa) {
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
}
