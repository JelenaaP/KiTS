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
public class Stan {
	@Id
	@GeneratedValue
	private Long id;

	private String ime;
	private String  adresa;
	private int brStanovnika;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Zgrada zgrada;
	
	@OneToMany(mappedBy = "stanovnik", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Korisnik_servisa> stanovnici = new HashSet<Korisnik_servisa>();
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Korisnik_servisa vlasnik;
	
	public Zgrada getZgrada() {
		return zgrada;
	}
	public void setZgrada(Zgrada zgrada) {
		this.zgrada = zgrada;
	}
	public Korisnik_servisa getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(Korisnik_servisa vlasnik) {
		this.vlasnik = vlasnik;
	}
	public Set<Korisnik_servisa> getStanovnici() {
		return stanovnici;
	}
	public void setStanovnici(Set<Korisnik_servisa> stanovnici) {
		this.stanovnici = stanovnici;
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
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getBrStanovnika() {
		return brStanovnika;
	}
	public void setBrStanovnika(int brStanovnika) {
		this.brStanovnika = brStanovnika;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Stan s = (Stan) o;
		if (s.id == null || id == null) {
			return false;
		}
		return Objects.equals(id, s.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public String toString() {
		return "Stan [id_stanovi=" + id + ", ime=" + ime
				+ ", adresa=" + adresa + ", vlasnik=" + vlasnik + ","
						+ " br_stanovnika=" + brStanovnika + ", stanovnici = "+ stanovnici + ","
								+ " vlasnik="+ vlasnik +"]";
	}
}