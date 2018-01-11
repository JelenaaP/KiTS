package dto;

import java.util.Date;

public class ZapisnikDto {

	private int id_zapisnik;
	private String opis;
	private Date dat_kreiranja;
	private Korisnik_servisaDto kreator;
	private SednicaDto sednica;
	private ZgradaDto zgrada;
	
	public ZapisnikDto(){}

	public ZapisnikDto(int id_zapisnik, String opis, Korisnik_servisaDto kreator, SednicaDto sednica,
			Date dat_kreiranja,	ZgradaDto zgrada) {
		super();
		this.id_zapisnik = id_zapisnik;
		this.opis = opis;
		this.dat_kreiranja = dat_kreiranja;
		this.setKreator(kreator);
		this.setSednica(sednica);
		this.setZgrada(zgrada);
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
	public Date getDat_kreiranja() {
		return dat_kreiranja;
	}

	public void setDat_kreiranja(Date dat_kreiranja) {
		this.dat_kreiranja = dat_kreiranja;
	}

	public Korisnik_servisaDto getKreator() {
		return kreator;
	}

	public void setKreator(Korisnik_servisaDto kreator) {
		this.kreator = kreator;
	}

	public SednicaDto getSednica() {
		return sednica;
	}

	public void setSednica(SednicaDto sednica) {
		this.sednica = sednica;
	}

	public ZgradaDto getZgrada() {
		return zgrada;
	}

	public void setZgrada(ZgradaDto zgrada) {
		this.zgrada = zgrada;
	}
}
