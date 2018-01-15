package project.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Zapisnik {

	@Id
	@GeneratedValue
	private Long id;
	
	private String opis;
	private Date datKreiranja;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Korisnik_servisa kreator;//kreator koji je kreirao zapisnik
	
	@OneToOne(mappedBy = "zapisnik")
	private Sednica sednica;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Zgrada zgrada;//zgrada u kojoj je kreiran zapisnik
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Zgrada getZgrada() {
		return zgrada;
	}
	public void setZgrada(Zgrada zgrada) {
		this.zgrada = zgrada;
	}
	
	@Override
	public String toString() {
		return "Zapisnik [id_zapisnik=" + id + ",, opis=" + opis + ","
				+ "dat_kreiranja=" + datKreiranja + " kreator="+kreator+","
						+ "zgrada=" + zgrada + "]";
	}
}