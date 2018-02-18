package project.dto;

import java.util.Date;

import project.model.Zapisnik;

public class ZapisnikDto {

	private Long id;
	private String opis;
	private Date datKreiranja;
	private Korisnik_servisaDto kreator;
	private SednicaDto sednica;
	private ZgradaDto zgrada;
	
	public ZapisnikDto(){}

	public ZapisnikDto(Long id, String opis, Korisnik_servisaDto kreator, SednicaDto sednica,
			Date datKreiranja,	ZgradaDto zgrada) {
		super();
		this.id = id;
		this.opis = opis;
		this.datKreiranja = datKreiranja;
		this.sednica = sednica;
		this.kreator = kreator;
		this.zgrada = zgrada;
	}
	public ZapisnikDto(Zapisnik zapisnik) {
		id = zapisnik.getId();
		opis = zapisnik.getOpis();
		datKreiranja = zapisnik.getDatKreiranja();
		sednica = new SednicaDto(zapisnik.getSednica());
		zgrada = new ZgradaDto(zapisnik.getZgrada());
		kreator = new Korisnik_servisaDto(zapisnik.getKreator());
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Date getDatKreiranja() {
		return datKreiranja;
	}
	public void setDatKreiranja(Date datKreiranja) {
		this.datKreiranja = datKreiranja;
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