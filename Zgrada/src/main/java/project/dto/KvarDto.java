package project.dto;

import java.util.Date;

import project.model.Kvar;

public class KvarDto {
	private Long id;
	private String ime;
	private String opis;
	private Date datKreiranja;
	private Date datZakazivanja;
	private Date datPopravke;
	private boolean popravljen;
	private ZgradaDto zgrada;
	private Korisnik_servisaDto kreator;
	
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
	public boolean isPopravljen() {
		return popravljen;
	}
	public void setPopravljen(boolean popravljen) {
		this.popravljen = popravljen;
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
	public ZgradaDto getZgrada() {
		return zgrada;
	}
	public void setZgrada(ZgradaDto zgrada) {
		this.zgrada = zgrada;
	}
	
	public KvarDto(){};
	
	public KvarDto(Long id, String ime, String opis, Date datKreiranja, Date datZakazivanja, Date datPopravke, boolean popravljen,
			ZgradaDto zgrada) {
		super();
		this.id = id;
		this.ime = ime;
		this.opis = opis;
		this.datKreiranja = datKreiranja;
		this.popravljen = popravljen;
		this.datZakazivanja = datZakazivanja;
		this.datPopravke = datPopravke;
		this.zgrada = zgrada;
	}
	public KvarDto(Kvar kvar) {
		id = kvar.getId();
		ime = kvar.getIme();
		opis = kvar.getOpis();
		datKreiranja = kvar.getDatKreiranja();
		datZakazivanja = kvar.getDatZakazivanja();
		datPopravke = kvar.getDatPopravke();
		popravljen = kvar.isPopravljen();
		zgrada = new ZgradaDto(kvar.getZgrada());
		kreator = new Korisnik_servisaDto(kvar.getKreator());
	}
	public Korisnik_servisaDto getKreator() {
		return kreator;
	}
	public void setKreator(Korisnik_servisaDto kreator) {
		this.kreator = kreator;
	}
}