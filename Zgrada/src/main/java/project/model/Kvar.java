package project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Kvar {
	@Id
	@GeneratedValue
	private long id;
	
	private String ime;
	private String opis;
	private Date datKreiranja;
	private Date datZakazivanja;
	private Date datPopravke;
	private boolean popravljen;
	
	@ManyToMany
    @JoinTable(name = "popravlja",
               joinColumns = @JoinColumn(name="kvar_id", referencedColumnName="id"),
               inverseJoinColumns = @JoinColumn(name="firma_id", referencedColumnName="id"))
	private Set<Firma> firma = new HashSet<Firma>();
	
	@ManyToMany
    @JoinTable(name = "popravlja",
               joinColumns = @JoinColumn(name="kvar_id", referencedColumnName="id"),
               inverseJoinColumns = @JoinColumn(name="korisnik_servisa_id", referencedColumnName="id"))
	private Set<Korisnik_servisa> radnik = new HashSet<Korisnik_servisa>();
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Zgrada zgrada;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Korisnik_servisa kreator;

	@OneToMany(mappedBy = "kvar", fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Set<Komentar> komentar = new HashSet<Komentar>();
	
	public Korisnik_servisa getKreator() {
		return kreator;
	}
	public void setKreator(Korisnik_servisa kreator) {
		this.kreator = kreator;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
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
	public Date getDatPopravke() {
		return datPopravke;
	}
	public void setDatPopravke(Date datPopravke) {
		this.datPopravke = datPopravke;
	}
	public Set<Firma> getFirma() {
		return firma;
	}
	public void setFirma(Set<Firma> firma) {
		this.firma = firma;
	}
	public boolean isPopravljen() {
		return popravljen;
	}
	public void setPopravljen(boolean popravljen) {
		this.popravljen = popravljen;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Zgrada getZgrada() {
		return zgrada;
	}
	public void setZgrada(Zgrada zgrada) {
		this.zgrada = zgrada;
	}
	public Set<Komentar> getKomentar() {
		return komentar;
	}
	public void setKomentar(Set<Komentar> komentar) {
		this.komentar = komentar;
	}
	
	@Override
	public String toString(){
		return "Kvar[id_kvar = "+id+", ime = "+ime+", opis = "+opis+","
				+ "dat_kreiranja = "+datKreiranja+", dat_zakazivanja = "+datZakazivanja+","
						+ " dat_popravke = "+datPopravke+", popravljen = "+popravljen+","
								+ "zgrada = "+zgrada+"]";
	}
}