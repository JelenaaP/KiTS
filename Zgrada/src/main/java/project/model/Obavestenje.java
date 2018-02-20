package project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Obavestenje {
	
	@Id
	@GeneratedValue
	private Long id;

	private String ime;
	private String  opis;
	private Date datKreiranja;
	
	@Cascade(CascadeType.REFRESH)
	@ManyToOne(fetch = FetchType.EAGER)
	private Zgrada zgrada;
	
	@Cascade(CascadeType.REFRESH)
	@ManyToOne(fetch = FetchType.EAGER)
	private Korisnik_servisa kreator;

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
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Date getDatKreiranja() {
		return datKreiranja;
	}
	public void setDatKreiranja(Date datKreiranja) {
		this.datKreiranja = datKreiranja;
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
		return "Zgrada [id_obavestenje=" + id + ", ime=" + ime
				+ ", opis=" + opis + ", kreator=" + kreator + ","
						+ " dat_kreiranja=" + datKreiranja + ", zgrada= "+ zgrada+ "]";
	}
}