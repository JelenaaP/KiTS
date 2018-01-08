package model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class Stavka {

	@Id
	@GeneratedValue
	
	private Long id_stavke;
	private String ime;
	private String opis;
	private Date datum_kreiranja;
	
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Korisnik_servisa kreator;//kreator koji je kreirao zapisnik
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Sednica sednica;//sednica na kojoj je kreiran zapisnik
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Zgrada zgrada;
	
	public Zgrada getZgrada() {
		return zgrada;
	}
	public void setZgrada(Zgrada zgrada) {
		this.zgrada = zgrada;
	}
	public Long getId_stavke() {
		return id_stavke;
	}
	public Korisnik_servisa getKreator() {
		return kreator;
	}
	public void setKreator(Korisnik_servisa kreator) {
		this.kreator = kreator;
	}
	public Sednica getSednica() {
		return sednica;
	}
	public void setSednica(Sednica sednica) {
		this.sednica = sednica;
	}
	public void setId_stavke(Long id_stavke) {
		this.id_stavke = id_stavke;
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
	public Date getDatum_kreiranja() {
		return datum_kreiranja;
	}
	public void setDatum_kreiranja(Date datum_kreiranja) {
		this.datum_kreiranja = datum_kreiranja;
	}
	
	
	
	
}
