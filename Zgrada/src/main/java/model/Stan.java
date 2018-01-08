package model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Stan {
	@Id
	@GeneratedValue
	private Long id_stanovi;

	private String ime;
	private String  adresa;
	private int br_stanovnika;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Zgrada zgrada;
	
	@OneToMany(mappedBy = "stanovi", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
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

	public Long getId_stanovi() {
		return id_stanovi;
	}

	public void setId_stanovi(Long id_stanovi) {
		this.id_stanovi = id_stanovi;
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

	public int getBr_stanovnika() {
		return br_stanovnika;
	}

	public void setBr_stanovnika(int br_stanovnika) {
		this.br_stanovnika = br_stanovnika;
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
		if (s.id_stanovi == null || id_stanovi == null) {
			return false;
		}
		return Objects.equals(id_stanovi, s.id_stanovi);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id_stanovi);
	}

	@Override
	public String toString() {
		return "Stan [id_stanovi=" + id_stanovi + ", ime=" + ime
				+ ", adresa=" + adresa + ", vlasnik=" + vlasnik + ","
						+ " br_stanovnika=" + br_stanovnika + ", stanovnici = "+ stanovnici + ","
								+ " vlasnik="+ vlasnik +"]";
	}


}
