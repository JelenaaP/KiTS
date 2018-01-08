package model;

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
	private long id_kvar;
	
	private String ime;
	//private String opis;
	private Date dat_kreiranja;
	private Date dat_zakazivanja;
	private Date dat_popravke;
	private boolean popravljen;
	
	@ManyToMany
    @JoinTable(name = "popravlja",
               joinColumns = @JoinColumn(name="id_kvar", referencedColumnName="id"),
               inverseJoinColumns = @JoinColumn(name="id_korisnik_servisa", referencedColumnName="id"))
	private Set<Korisnik_servisa> radnik = new HashSet<Korisnik_servisa>();
	
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Komentar opis;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	private Zgrada zgrada;

	public long getId_kvar() {
		return id_kvar;
	}

	public void setId_kvar(long id_kvar) {
		this.id_kvar = id_kvar;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
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

	public Date getDat_popravke() {
		return dat_popravke;
	}

	public void setDat_popravke(Date dat_popravke) {
		this.dat_popravke = dat_popravke;
	}

	public boolean isPopravljen() {
		return popravljen;
	}

	public void setPopravljen(boolean popravljen) {
		this.popravljen = popravljen;
	}

	public Set<Korisnik_servisa> getRadnik() {
		return radnik;
	}

	public void setRadnik(Set<Korisnik_servisa> radnik) {
		this.radnik = radnik;
	}

	

	public Komentar getOpis() {
		return opis;
	}

	public void setOpis(Komentar opis) {
		this.opis = opis;
	}

	public Zgrada getZgrada() {
		return zgrada;
	}

	public void setZgrada(Zgrada zgrada) {
		this.zgrada = zgrada;
	}
	
	@Override
	public String toString(){
		return "Kvar[id_kvar = "+id_kvar+", ime = "+ime+", opis = "+opis+","
				+ "dat_kreiranja = "+dat_kreiranja+", dat_zakazivanja = "+dat_zakazivanja+","
						+ " dat_popravke = "+dat_popravke+", popravljen = "+popravljen+","
								+ " radnik = "+radnik+", zgrada = "+zgrada+"]";
	}
}
