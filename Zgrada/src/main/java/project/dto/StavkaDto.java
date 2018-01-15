package project.dto;

import java.sql.Date;

import project.model.Stavka;

public class StavkaDto {

	private Long id_stavke;
	private String ime;
	private String opis;
	private Date dat_kreiranja;
	private Korisnik_servisaDto kreator;
	private SednicaDto sednica;
	
	public StavkaDto(){}

	public StavkaDto(Long id_stavke, String ime, String opis, Date dat_kreiranja, Korisnik_servisaDto kreator,
			SednicaDto sednica) {
		super();
		this.id_stavke = id_stavke;
		this.ime = ime;
		this.opis = opis;
		this.dat_kreiranja = dat_kreiranja;
		this.setKreator(kreator);
		this.setSednica(sednica);
	}
	
	public StavkaDto(Stavka stavka) {
		id_stavke = stavka.getId_stavke();
		ime = stavka.getIme();
		dat_kreiranja = stavka.getDat_kreiranja();
		kreator = new Korisnik_servisaDto(stavka.getKreator());
		//sednica = new SednicaDto(sednica.getSednica());
	}

	public Long getId_stavke() {
		return id_stavke;
	}
	public void setId_stavke(Long id_stavke) {
		this.id_stavke = id_stavke;
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
	public SednicaDto getSednica() {
		return sednica;
	}
	public void setSednica(SednicaDto sednica) {
		this.sednica = sednica;
	}
}