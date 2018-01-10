package dto;

import model.Korisnik_servisa;
import model.Obavestenje;
import model.Stan;

public class ZgradaDto {
	
	private Long id_zgrada;
	private String ime;
	private String adresa;
	private Korisnik_servisa vlasnik;
	private int br_stanova;
	private int br_naseljenih;
	private boolean predsednik;
	private Obavestenje obavestenje;
	private Stan stan;
	
	private ZgradaDto(){}

	
	public Long getId_zgrada() {
		return id_zgrada;
	}


	public void setId_zgrada(Long id_zgrada) {
		this.id_zgrada = id_zgrada;
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

	public Korisnik_servisa getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Korisnik_servisa vlasnik) {
		this.vlasnik = vlasnik;
	}

	public int getBr_stanova() {
		return br_stanova;
	}

	public void setBr_stanova(int br_stanova) {
		this.br_stanova = br_stanova;
	}

	public int getBr_naseljenih() {
		return br_naseljenih;
	}

	public void setBr_naseljenih(int br_naseljenih) {
		this.br_naseljenih = br_naseljenih;
	}

	public boolean isPredsednik() {
		return predsednik;
	}

	public void setPredsednik(boolean predsednik) {
		this.predsednik = predsednik;
	}

	public Obavestenje getObavestenje() {
		return obavestenje;
	}

	public void setObavestenje(Obavestenje obavestenje) {
		this.obavestenje = obavestenje;
	}

	public Stan getStan() {
		return stan;
	}

	public void setStan(Stan stan) {
		this.stan = stan;
	}

	public ZgradaDto(Long id_zgrada, String ime, String adresa, Korisnik_servisa vlasnik, int br_stanova, int br_naseljenih,
			boolean predsednik, Obavestenje obavestenje, Stan stan) {
		super();
		this.id_zgrada = id_zgrada;
		this.ime = ime;
		this.adresa = adresa;
		this.vlasnik = vlasnik;
		this.br_stanova = br_stanova;
		this.br_naseljenih = br_naseljenih;
		this.predsednik = predsednik;
		this.obavestenje = obavestenje;
		this.stan = stan;
	};
	
	
}
