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
import javax.persistence.OneToMany;

@Entity

public class Stavke {

	@Id
	@GeneratedValue
	
	private Long id_stavke;
	private String ime;
	private String opis;
	private Date datum_kreiranja;
	private String kreator;
	private int sedmica;
	
	public Long getId_stavke() {
		return id_stavke;
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
	public String getKreator() {
		return kreator;
	}
	public void setKreator(String kreator) {
		this.kreator = kreator;
	}
	public int getSedmica() {
		return sedmica;
	}
	public void setSedmica(int sedmica) {
		this.sedmica = sedmica;
	}
	
}
