package project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Komentar {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String text;
	private Date datKreiranja;
	@ManyToMany(mappedBy = "komentar")
	
	@Cascade(CascadeType.REFRESH)
	@ManyToOne(fetch = FetchType.EAGER)
	private Korisnik_servisa kreator;
	
	@Cascade(CascadeType.REFRESH)
	@ManyToOne(fetch = FetchType.EAGER)
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