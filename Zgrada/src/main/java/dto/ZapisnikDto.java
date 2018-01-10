package dto;

import java.util.Date;

import model.Korisnik_servisa;
import model.Sednica;
import model.Zgrada;

public class ZapisnikDto {

	private int id_zapisnik;
	private String opis;
	private Korisnik_servisa kreator;
	private Sednica sednica;
	private Date dat_kreiranja;
	private Zgrada zgrada;
	
	private ZapisnikDto(){}

	public ZapisnikDto(int id_zapisnik, String opis, Korisnik_servisa kreator, Sednica sednica, Date dat_kreiranja,
			Zgrada zgrada) {
		super();
		this.id_zapisnik = id_zapisnik;
		this.opis = opis;
		this.kreator = kreator;
		this.sednica = sednica;
		this.dat_kreiranja = dat_kreiranja;
		this.zgrada = zgrada;
	}

	public int getId_zapisnik() {
		return id_zapisnik;
	}

	public void setId_zapisnik(int id_zapisnik) {
		this.id_zapisnik = id_zapisnik;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Korisnik_servisa getKreator() {
		return kreator;
	}

	public void setKreator(Korisnik_servisa kreator) {
		this.kreator = kreator;
	}

	public Sednica getSednica() {
		return sednica;
	}

	public void setSednica(Sednica sednica) {
		this.sednica = sednica;
	}

	public Date getDat_kreiranja() {
		return dat_kreiranja;
	}

	public void setDat_kreiranja(Date dat_kreiranja) {
		this.dat_kreiranja = dat_kreiranja;
	}

	public Zgrada getZgrada() {
		return zgrada;
	}

	public void setZgrada(Zgrada zgrada) {
		this.zgrada = zgrada;
	}
	
}
