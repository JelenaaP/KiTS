package project.dto;

import java.util.Date;

import project.model.Sednica;


public class SednicaDto {
	private Long id;
	private Date datKreiranja;
	private Date datZakazivanja;
	private boolean aktivna;
	private Korisnik_servisaDto kreator;
	private ZgradaDto zgrada;
	
	public SednicaDto(){}
	
	public SednicaDto(Long id, Date datKreiranja, Date datZakazivanja, boolean aktivna,
			Korisnik_servisaDto kreator, ZgradaDto zgrada) {
		super();
		this.id = id;
		this.datKreiranja = datKreiranja;
		this.datZakazivanja = datZakazivanja;
		this.kreator = kreator;
		this.aktivna = aktivna;
		this.zgrada = zgrada;
		}

	public SednicaDto(Sednica sednica) {
		id = sednica.getId();
		datKreiranja = sednica.getDatKreiranja();
		datZakazivanja = sednica.getDatZakazivanja();
		aktivna = sednica.isAktivna();
		kreator = new Korisnik_servisaDto(sednica.getKreator());
		zgrada = new ZgradaDto(sednica.getZgrada());
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public boolean isAktivna() {
		return aktivna;
	}
	public void setAktivna(boolean aktivna) {
		this.aktivna = aktivna;
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
}