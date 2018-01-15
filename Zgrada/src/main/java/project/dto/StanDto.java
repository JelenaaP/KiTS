package project.dto;


import project.model.Stan;

public class StanDto {
	private Long id;
	private String ime;
	private String adresa;
	private Korisnik_servisaDto vlasnik;
	private ZgradaDto zgrada;
	private int brStanovnika;
	
	
	public StanDto(){}
	
	
	public StanDto(Long id, String ime, String adresa, Korisnik_servisaDto vlasnik,
			int brStanovnika, ZgradaDto zgrada) {
		super();
		this.id = id;
		this.ime = ime;
		this.adresa = adresa;
		this.vlasnik = vlasnik;
		this.zgrada = zgrada;
		this.brStanovnika = brStanovnika;
	}

	public StanDto(Stan stan) {
		id = stan.getId();
		ime=stan.getIme();
		adresa =stan.getAdresa();
		vlasnik = new Korisnik_servisaDto(stan.getVlasnik());
		zgrada = new ZgradaDto(stan.getZgrada());
		brStanovnika =stan.getBrStanovnika();
	}

	public int getBrStanovnika() {
		return brStanovnika;
	}
	public void setBrStanovnika(int brStanovnika) {
		this.brStanovnika = brStanovnika;
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
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public Korisnik_servisaDto getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(Korisnik_servisaDto vlasnik) {
		this.vlasnik = vlasnik;
	}
	public ZgradaDto getZgrada() {
		return zgrada;
	}
	public void setZgrada(ZgradaDto zgrada) {
		this.zgrada = zgrada;
	}
}