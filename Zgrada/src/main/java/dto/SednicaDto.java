package dto;

import java.util.Date;

import model.Korisnik_servisa;
import model.Zapisnik;
import model.Zgrada;

public class SednicaDto {
	private int id_sednice;
	private Date dat_kreiranja;
	private Date dat_zakazivanja;
	private boolean aktivna;
	private Korisnik_servisa kreator;
	private Zgrada zgrada;
	private Zapisnik zapisnik;
	
	public SednicaDto(int id_sednice, Date dat_kreiranja, Date dat_zakazivanja, boolean aktivna,
			Korisnik_servisa kreator, Zgrada zgrada, Zapisnik zapisnik) {
		super();
		this.id_sednice = id_sednice;
		this.dat_kreiranja = dat_kreiranja;
		this.dat_zakazivanja = dat_zakazivanja;
		this.aktivna = aktivna;
		this.kreator = kreator;
		this.zgrada = zgrada;
		this.zapisnik = zapisnik;
	}

	public int getId_sednice() {
		return id_sednice;
	}

	public void setId_sednice(int id_sednice) {
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
	
	private SednicaDto(){}
	

}
