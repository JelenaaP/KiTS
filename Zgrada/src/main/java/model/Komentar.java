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

@Entity
public class Komentar {
	
	@Id
	@GeneratedValue
	private Long id_komentar;
	
	private String tekst;
	//private String kreator;
	private Date datum;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Korisnik_servisa kreator;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Kvar kvar;

	public Kvar getKvar() {
		return kvar;
	}

	public void setKvar(Kvar kvar) {
		this.kvar = kvar;
	}

	public Long getId_komentar() {
		return id_komentar;
	}

	public void setId_komentar(Long id_komentar) {
		this.id_komentar = id_komentar;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	

	public Korisnik_servisa getKreator() {
		return kreator;
	}

	public void setKreator(Korisnik_servisa kreator) {
		this.kreator = kreator;
	}

	
	
	
	

}
