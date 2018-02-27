package project.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Zgrada {
	
	@Id
	@GeneratedValue
	private Long id;

	private String ime;
	private String  adresa;
	private int brStanova;
	private int brNaseljenih;

	@Cascade(CascadeType.REFRESH)
	@ManyToOne(fetch = FetchType.EAGER)
	private Korisnik_servisa vlasnik;
	
	@Cascade(CascadeType.DELETE)
	@OneToMany(mappedBy = "zgrada", fetch = FetchType.LAZY)
	private Set<Obavestenje> obavestenje = new HashSet<Obavestenje>();
	
	@Cascade(CascadeType.DELETE)
	@OneToMany(mappedBy = "zgrada", fetch = FetchType.LAZY)
	private Set<Stan> stan = new HashSet<Stan>();
	
	@Cascade(CascadeType.DELETE)
	@OneToMany(mappedBy = "zgrada", fetch = FetchType.LAZY)
	private Set<Kvar> kvar = new HashSet<Kvar>();
	
	@Cascade(CascadeType.DELETE)
	@OneToMany(mappedBy = "zgrada", fetch = FetchType.LAZY)
	private Set<Sednica> sednica = new HashSet<Sednica>();
	
	@Cascade(CascadeType.DELETE)
	@OneToMany(mappedBy = "zgrada", fetch = FetchType.LAZY)
	private Set<Zapisnik> zapisnik = new HashSet<Zapisnik>();
	
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
	
	
	public Set<Sednica> getSednica() {
		return sednica;
	}
	public void setSednica(Set<Sednica> sednica) {
		this.sednica = sednica;
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