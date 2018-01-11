package dto;


import java.util.List;

import model.Stan;

public class StanDto {
	private Long id_stanovi;
	private String ime;
	private String adresa;
	private Korisnik_servisaDto vlasnik;
	private ZgradaDto zgrada;
	private StanDto stan;
	
	public StanDto(){}
	
	
	public StanDto(Long id_stanovi, String ime, String adresa, Korisnik_servisaDto vlasnik,
			int br_stanovnika, ZgradaDto zgrada) {
		super();
		this.id_stanovi = id_stanovi;
		this.ime = ime;
		this.adresa = adresa;
		this.vlasnik = vlasnik;
		this.zgrada = zgrada;
	}

	public StanDto(Stan stan) {
		id_stanovi = stan.getId_stanovi();
		ime=stan.getIme();
		adresa =stan.getAdresa();
		//vlasnik = new Korisnik_servisaDto(stan.getVlasnik());
		zgrada = new ZgradaDto(stan.getZgrada());
	
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



	public StanDto getStan() {
		return stan;
	}


	public void setStan(StanDto stan) {
		this.stan = stan;
	}


	public void setStan(List<Stan> findAll) {
		// TODO Auto-generated method stub
		
	}





	

	
}
