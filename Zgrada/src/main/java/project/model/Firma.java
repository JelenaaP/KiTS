package project.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
public class Firma {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String ime;
	private String adresa;
	private int telefon;
	private String email;
	private String webSite;
	
	@ManyToMany(mappedBy = "firma")
	private Set<Kvar> kvar = new HashSet<Kvar>();
	
	@Cascade(CascadeType.REFRESH)
	@ManyToOne(fetch = FetchType.EAGER)
	private Korisnik_servisa vlasnik;
	
	@Cascade(CascadeType.REFRESH)
	@ManyToMany
	@JoinTable(name = "radi",
    joinColumns = @JoinColumn(name="firma_id", referencedColumnName="id"),
    inverseJoinColumns = @JoinColumn(name="korisnik_servisa_id", referencedColumnName="id"))
	private Set<Korisnik_servisa> radnici = new HashSet<Korisnik_servisa>();
	
	
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
	public Set<Korisnik_servisa> getRadnici() {
		return radnici;
	}
	public void setRadnici(Set<Korisnik_servisa> radnici) {
		this.radnici = radnici;
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
	public Set<Kvar> getKvar() {
		return kvar;
	}
	public void setKvar(Set<Kvar> kvar) {
		this.kvar = kvar;
	}
}