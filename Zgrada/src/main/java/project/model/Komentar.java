package project.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Komentar {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String text;
	private Date datKreiranja;
	@ManyToMany(mappedBy = "komentar")
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
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
	
	@Override
	public String toString() {
		return "Komentar [id_komentar=" + id + ", text=" + text
				+ ", kreator=" + kreator + ","
						+ " dat_kreiranja=" + datKreiranja +"]";
	}	
}