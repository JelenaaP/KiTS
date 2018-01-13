package project.dto;

import java.util.Date;

import project.model.Zapisnik;

public class ZapisnikDto {

	private Long id_zapisnik;
	private String opis;
	private Date dat_kreiranja;
	private Korisnik_servisaDto kreator;
	private SednicaDto sednica;
	private ZgradaDto zgrada;
	
	public ZapisnikDto(){}

	public ZapisnikDto(Long id_zapisnik, String opis, Korisnik_servisaDto kreator, SednicaDto sednica,
			Date dat_kreiranja,	ZgradaDto zgrada) {
		super();
		this.id_zapisnik = id_zapisnik;
		this.opis = opis;
		this.dat_kreiranja = dat_kreiranja;
		this.setKreator(kreator);
		this.setSednica(sednica);
		this.setZgrada(zgrada);
	}
	public ZapisnikDto(Zapisnik zapisnik) {
		id_zapisnik = zapisnik.getId_zapisnik();
		opis = zapisnik.getOpis();
		dat_kreiranja = zapisnik.getDat_kreiranja();
		sednica = new SednicaDto(zapisnik.getSednica());
		zgrada = new ZgradaDto(zapisnik.getZgrada());
		kreator = new Korisnik_servisaDto(zapisnik.getKreator());
	}

	public Long getId_zapisnik() {
		return id_zapisnik;
	}
	public void setId_zapisnik(Long id_zapisnik) {
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