package project.model;

import java.util.HashSet;
import java.util.Objects;
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
public class Zgrada {
	
	@Id
	@GeneratedValue
	private Long id;

	private String ime;
	private String  adresa;
	private int brStanova;
	private int brNaseljenih;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Korisnik_servisa vlasnik;
	
	@OneToMany(mappedBy = "zgrada", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Obavestenje> obavestenje = new HashSet<Obavestenje>();
	
	@OneToMany(mappedBy = "zgrada", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Stan> stan = new HashSet<Stan>();
	
	@OneToMany(mappedBy = "zgrada", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Kvar> kvar = new HashSet<Kvar>();
	
	@OneToOne(mappedBy = "predsednik_skupstine")
	private Korisnik_servisa predsednik;
	
	
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
	public int getBrStanova() {
		return brStanova;
	}
	public void setBrStanova(int brStanova) {
		this.brStanova = brStanova;
	}
	public int getBrNaseljenih() {
		return brNaseljenih;
	}
	public void setBrNaseljenih(int brNaseljenih) {
		this.brNaseljenih = brNaseljenih;
	}
	public Set<Obavestenje> getObavestenje() {
		return obavestenje;
	}
	public void setObavestenje(Set<Obavestenje> obavestenje) {
		this.obavestenje = obavestenje;
	}
	public Set<Stan> getStan() {
		return stan;
	}
	public void setStan(Set<Stan> stan) {
		this.stan = stan;
	}
	public Set<Kvar> getKvar() {
		return kvar;
	}
	public void setKvar(Set<Kvar> kvar) {
		this.kvar = kvar;
	}	
	public Korisnik_servisa getPredsednik() {
		return predsednik;
	}
	public void setPredsednik(Korisnik_servisa predsednik) {
		this.predsednik = predsednik;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Zgrada z = (Zgrada) o;
		if (z.id == null || id == null) {
			return false;
		}
		return Objects.equals(id, z.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public String toString() {
		return "Zgrada [id_zgrada=" + id + ", ime=" + ime
				+ ", adresa=" + adresa + ", vlasnik=" + vlasnik + ","
						+ " br_stanova=" + brStanova + ", br_naseljenih = "+ brNaseljenih + ","
								+ " predsednik="+ predsednik + ", obavestenje="+ obavestenje + ","
										+ " stan="+stan+"]";
	}
}