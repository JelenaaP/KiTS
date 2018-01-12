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



@Entity
public class Zgrada {
	
	@Id
	@GeneratedValue
	private Long id_zgrada;

	private String ime;
	private String  adresa;
	private int br_stanova;
	private int br_naseljenih;
	private boolean predsednik;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Korisnik_servisa vlasnik;
	
	@OneToMany(mappedBy = "zgrada", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Obavestenje> obavestenje = new HashSet<Obavestenje>();
	
	@OneToMany(mappedBy = "zgrada", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Stan> stan = new HashSet<Stan>();
	
	@OneToMany(mappedBy = "zgrada", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Kvar> kvar = new HashSet<Kvar>();
	
	public Long getId_zgrada() {
		return id_zgrada;
	}

	public void setId_zgrada(Long id_zgrada) {
		this.id_zgrada = id_zgrada;
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

	public int getBr_stanova() {
		return br_stanova;
	}

	public void setBr_stanova(int br_stanova) {
		this.br_stanova = br_stanova;
	}

	public int getBr_naseljenih() {
		return br_naseljenih;
	}

	public void setBr_naseljenih(int br_naseljenih) {
		this.br_naseljenih = br_naseljenih;
	}

	public boolean isPredsednik() {
		return predsednik;
	}

	public void setPredsednik(boolean predsednik) {
		this.predsednik = predsednik;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Zgrada z = (Zgrada) o;
		if (z.id_zgrada == null || id_zgrada == null) {
			return false;
		}
		return Objects.equals(id_zgrada, z.id_zgrada);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id_zgrada);
	}

	@Override
	public String toString() {
		return "Zgrada [id_zgrada=" + id_zgrada + ", ime=" + ime
				+ ", adresa=" + adresa + ", vlasnik=" + vlasnik + ","
						+ " br_stanova=" + br_stanova + ", br_naseljenih = "+ br_naseljenih + ","
								+ " predsednik="+ predsednik + ", obavestenje="+ obavestenje + ","
										+ " stan="+stan+"]";
	}

}
