package project.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Sednica {
	@Id
	@GeneratedValue	
	private Long id_sednice;
	
	private Date dat_kreiranja;
	private Date dat_zakazivanja;
	private boolean aktivna;
	
	@OneToMany(mappedBy = "sednica",fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Stavka> stavka = new HashSet<Stavka>();
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Korisnik_servisa kreator;//kreator koji je kreirao sednicu
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Zgrada zgrada; //zgrada kojoj pripadaju sednice
	
	@OneToOne
	private Zapisnik zapisnik;	
	
	public Set<Stavka> getStavka() {
		return stavka;
	}
	public void setStavka(Set<Stavka> stavka) {
		this.stavka = stavka;
	}
	public Long getId_sednice() {
		return id_sednice;
	}
	public void setId_sednice(Long id_sednice) {
		this.id_sednice = id_sednice;
	}
	public Date getDat_kreiranja() {
		return dat_kreiranja;
	}
	public void setDat_kreiranja(Date dat_kreiranja) {
		this.dat_kreiranja = dat_kreiranja;
	}
	public Date getDat_zakazivanja() {
		return dat_zakazivanja;
	}
	public void setDat_zakazivanja(Date dat_zakazivanja) {
		this.dat_zakazivanja = dat_zakazivanja;
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
		return "Sednica [id_sednice=" + id_sednice + ", dat_kreiranja=" + dat_kreiranja + ", dat_zakazivanja=" + dat_zakazivanja + ", kreator="+kreator+"]";
	}
}