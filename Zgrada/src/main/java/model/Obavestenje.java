package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Obavestenje {
	
	@Id
	@GeneratedValue
	private Long id_obavestenje;

	private String ime;
	private String  opis;
	private Date dat_kreiranja;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Zgrada zgrada;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Korisnik_servisa kreator;

	public Long getId_obavestenje() {
		return id_obavestenje;
	}

	public void setId_obavestenje(Long id_obavestenje) {
		this.id_obavestenje = id_obavestenje;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Date getDat_kreiranja() {
		return dat_kreiranja;
	}

	public void setDat_kreiranja(Date dat_kreiranja) {
		this.dat_kreiranja = dat_kreiranja;
	}

	public Zgrada getZgrada() {
		return zgrada;
	}

	public void setZgrada(Zgrada zgrada) {
		this.zgrada = zgrada;
	}

	public Korisnik_servisa getKreator() {
		return kreator;
	}

	public void setKreator(Korisnik_servisa kreator) {
		this.kreator = kreator;
	}
	
	@Override
	public String toString() {
		return "Zgrada [id_obavestenje=" + id_obavestenje + ", ime=" + ime
				+ ", opis=" + opis + ", kreator=" + kreator + ","
						+ " dat_kreiranja=" + dat_kreiranja + ", zgrada= "+ zgrada+ "]";
	}
}
	