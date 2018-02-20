package project.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Sednica {
	@Id
	@GeneratedValue	
	private Long id;
	
	private Date datKreiranja;
	private Date datZakazivanja;
	private boolean aktivna;
	
	@Cascade(CascadeType.DELETE)
	@OneToMany(mappedBy = "sednica",fetch = FetchType.LAZY)
	private Set<Stavka> stavka = new HashSet<Stavka>();
	
	@Cascade(CascadeType.REFRESH)
	@ManyToOne(fetch = FetchType.EAGER)
	private Korisnik_servisa kreator;//kreator koji je kreirao sednicu
	
	@Cascade(CascadeType.REFRESH)
	@ManyToOne(fetch = FetchType.EAGER)
	private Zgrada zgrada; //zgrada kojoj pripadaju sednice
	
	@OneToOne
	private Zapisnik zapisnik;	
	
	public Set<Stavka> getStavka() {
		return stavka;
	}
	public void setStavka(Set<Stavka> stavka) {
		this.stavka = stavka;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDatKreiranja() {
		return datKreiranja;
	}
	public void setDatKreiranja(Date datKreiranja) {
		this.datKreiranja = datKreiranja;
	}
	public Date getDatZakazivanja() {
		return datZakazivanja;
	}
	public void setDatZakazivanja(Date datZakazivanja) {
		this.datZakazivanja = datZakazivanja;
	}
	public boolean isAktivna() {
		return aktivna;
	}
	public void setAktivna(boolean aktivna) {
		this.aktivna = aktivna;
	}
	public Korisnik_servisa getKreator() {
		return kreator;
	}
	public void setKreator(Korisnik_servisa kreator) {
		this.kreator = kreator;
	}
	public Zgrada getZgrada() {
		return zgrada;
	}
	public void setZgrada(Zgrada zgrada) {
		this.zgrada = zgrada;
	}
	public Zapisnik getZapisnik() {
		return zapisnik;
	}
	public void setZapisnik(Zapisnik zapisnik) {
		this.zapisnik = zapisnik;
	}
	
	@Override
	public String toString() {
		return "Sednica [id_sednice=" + id+ ", dat_kreiranja=" + datKreiranja + ", dat_zakazivanja=" + datZakazivanja + ", kreator="+kreator+"]";
	}
}