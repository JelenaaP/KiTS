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
public class Komentar {
	
	@Id
	@GeneratedValue
	private Long id_komentar;
	
	private String tekst;
	private String kreator;
	private Date datum;
	
	@OneToMany(mappedBy = "komentar", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Kvar> kvar = new HashSet<Kvar>();

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

	public String getKreator() {
		return kreator;
	}

	public void setKreator(String kreator) {
		this.kreator = kreator;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Set<Kvar> getKvar() {
		return kvar;
	}

	public void setKvar(Set<Kvar> kvar) {
		this.kvar = kvar;
	}

	@Override
	public String toString() {
		return "Komentar [id_komentar=" + id_komentar + ", tekst=" + tekst + ", kreator=" + kreator + ", datum=" + datum
				+ ", kvar=" + kvar + "]";
	}
	
	
	

}
