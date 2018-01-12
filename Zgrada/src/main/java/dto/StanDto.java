package dto;


import model.Stan;

public class StanDto {
	private Long id_stanovi;
	private String ime;
	private String adresa;
	private Korisnik_servisaDto vlasnik;
	private ZgradaDto zgrada;
	private int br_stanovnika;
	
	
	public StanDto(){}
	
	
	public StanDto(Long id_stanovi, String ime, String adresa, Korisnik_servisaDto vlasnik,
			int br_stanovnika, ZgradaDto zgrada) {
		super();
		this.id_stanovi = id_stanovi;
		this.ime = ime;
		this.adresa = adresa;
		this.vlasnik = vlasnik;
		this.zgrada = zgrada;
		this.br_stanovnika = br_stanovnika;
	}

	public StanDto(Stan stan) {
		id_stanovi = stan.getId_stanovi();
		ime=stan.getIme();
		adresa =stan.getAdresa();
		vlasnik = new Korisnik_servisaDto(stan.getVlasnik());
		zgrada = new ZgradaDto(stan.getZgrada());
		br_stanovnika =stan.getBr_stanovnika();
	}



	public int getBr_stanovnika() {
		return br_stanovnika;
	}


	public void setBr_stanovnika(int br_stanovnika) {
		this.br_stanovnika = br_stanovnika;
	}


	public Long getId_stanovi() {
		return id_stanovi;
	}


	public void setId_stanovi(Long id_stanovi) {
		this.id_stanovi = id_stanovi;
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
