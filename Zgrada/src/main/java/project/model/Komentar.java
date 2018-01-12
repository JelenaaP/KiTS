package project.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Komentar {
	
	@Id
	@GeneratedValue
	private Long id_komentar;
	
	private String text;
	private Date dat_kreiranja;
	
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDat_kreiranja() {
		return dat_kreiranja;
	}

	public void setDat_kreiranja(Date dat_kreiranja) {
		this.dat_kreiranja = dat_kreiranja;
	}

	public Korisnik_servisa getKreator() {
		return kreator;
	}

	public void setKreator(Korisnik_servisa kreator) {
		this.kreator = kreator;
	}
	
	@Override
	public String toString() {
		return "Komentar [id_komentar=" + id_komentar + ", text=" + text
				+ ", kreator=" + kreator + ","
						+ " dat_kreiranja=" + dat_kreiranja +"]";
	}

	
}
