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
	private Long id_zapisnik;
	
	private String opis;
	private Date dat_kreiranja;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Korisnik_servisa kreator;//kreator koji je kreirao zapisnik
	
	@OneToOne(mappedBy = "zapisnik")
	private Sednica sednica;//zgrada u kojoj je kreiran zapisnik
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Zgrada zgrada;//zgrada u kojoj je kreiran zapisnik
	
	public Long getId_zapisnik() {
		return id_zapisnik;
	}
	public void setId_zapisnik(Long id_zapisnik) {
		this.id_zapisnik = id_zapisnik;
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
	public void setDat_kreiranja(Date date) {
		this.dat_kreiranja = date;
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
		return "Zapisnik [id_zapisnik=" + id_zapisnik + ",, opis=" + opis + ","
				+ "dat_kreiranja=" + dat_kreiranja + " kreator="+kreator+","
						+ "zgrada=" + zgrada + "]";
	}
}