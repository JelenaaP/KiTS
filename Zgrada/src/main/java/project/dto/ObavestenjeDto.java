package project.dto;

import java.util.Date;

import project.model.Obavestenje;

public class ObavestenjeDto {
	
	private Long id;
	private String ime;
	private String opis;
	private Date datKreiranja;
	private Korisnik_servisaDto kreator;
	private ZgradaDto zgrada;
	
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
	public ZgradaDto getZgrada() {
		return zgrada;
	}
	public void setZgrada(ZgradaDto zgrada) {
		this.zgrada = zgrada;
	}
	
	public ObavestenjeDto(){};
	
	public ObavestenjeDto(Long id, String ime, String opis, Date datKreiranja,
			Korisnik_servisaDto kreator, ZgradaDto zgrada) {
		super();
		this.id = id;
		this.ime = ime;
		this.opis = opis;
		this.datKreiranja = datKreiranja;
		this.kreator = kreator;
		this.zgrada = zgrada;
	}
	public ObavestenjeDto(Obavestenje obavestenje) {
		id = obavestenje.getId();
		ime = obavestenje.getIme();
		opis= obavestenje.getOpis();
		datKreiranja = obavestenje.getDatKreiranja();
		kreator = new Korisnik_servisaDto(obavestenje.getKreator());
		zgrada = new ZgradaDto(obavestenje.getZgrada());		
	}
}