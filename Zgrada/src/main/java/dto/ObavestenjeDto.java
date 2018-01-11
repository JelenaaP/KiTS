package dto;

import java.util.Date;

import model.Obavestenje;

public class ObavestenjeDto {
	
	private Long id_obavestenje;
	private String ime;
	private String opis;
	private Date dat_kreiranja;
	private Korisnik_servisaDto kreator;
	private ZgradaDto zgrada;
	
	public Long getId_obavestenje() {
		return id_obavestenje;
	}
	public void setId_obavestenje(Long id_obavestenje) {
		this.id_obavestenje = id_obavestenje;
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
	public ZgradaDto getZgrada() {
		return zgrada;
	}
	public void setZgrada(ZgradaDto zgrada) {
		this.zgrada = zgrada;
	}
	
	public ObavestenjeDto(){};
	
	public ObavestenjeDto(Long id_obavestenje, String ime, String opis, Date dat_kreiranja,
			Korisnik_servisaDto kreator, ZgradaDto zgrada) {
		super();
		this.id_obavestenje = id_obavestenje;
		this.ime = ime;
		this.opis = opis;
		this.dat_kreiranja = dat_kreiranja;
		this.kreator = kreator;
		this.zgrada = zgrada;
	}
	public ObavestenjeDto(Obavestenje obavestenje) {
		id_obavestenje = obavestenje.getId_obavestenje();
		ime = obavestenje.getIme();
		dat_kreiranja = obavestenje.getDat_kreiranja();
		kreator = new Korisnik_servisaDto(obavestenje.getKreator());
		zgrada = new ZgradaDto(obavestenje.getZgrada());		
	}
}
