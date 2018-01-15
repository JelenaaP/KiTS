package project.dto;

import java.util.Date;

import project.model.Stavka;

public class StavkaDto {

	private Long id;
	private String ime;
	private String opis;
	private Date datKreiranja;
	private Korisnik_servisaDto kreator;
	private SednicaDto sednica;
	
	public StavkaDto(){}

	public StavkaDto(Long id, String ime, String opis, Date datKreiranja, Korisnik_servisaDto kreator,
			SednicaDto sednica) {
		super();
		this.id = id;
		this.ime = ime;
		this.opis = opis;
		this.datKreiranja = datKreiranja;
		this.setKreator(kreator);
		this.setSednica(sednica);
	}
	
	public StavkaDto(Stavka stavka) {
		id = stavka.getId();
		ime = stavka.getIme();
		datKreiranja = stavka.getDatKreiranja();
		kreator = new Korisnik_servisaDto(stavka.getKreator());
		//sednica = new SednicaDto(sednica.getSednica());
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
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
}