package dto;

import dto.Korisnik_servisaDto;
import model.Zgrada;

public class ZgradaDto {
	
	private Long id_zgrada;
	private String ime;
	private String adresa;
	private Korisnik_servisaDto vlasnik;
	private int br_stanova;
	private int br_naseljenih;
	private boolean predsednik;
	
	public ZgradaDto(){}

	
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
	
	public Korisnik_servisaDto getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Korisnik_servisaDto vlasnik) {
		this.vlasnik = vlasnik;
	}
	
	public ZgradaDto(Zgrada zgrada) {
		id_zgrada = zgrada.getId_zgrada();
		ime = zgrada.getIme();
		adresa = zgrada.getAdresa();
		vlasnik = new Korisnik_servisaDto(zgrada.getVlasnik());
		br_stanova = zgrada.getBr_stanova();
		br_naseljenih = zgrada.getBr_naseljenih();
		predsednik = zgrada.isPredsednik();
	}


	public ZgradaDto(Long id_zgrada, String ime, String adresa, Korisnik_servisaDto vlasnik, int br_stanova,
			int br_naseljenih, boolean predsednik) {
		super();
		this.id_zgrada = id_zgrada;
		this.ime = ime;
		this.adresa = adresa;
		this.vlasnik = vlasnik;
		this.br_stanova = br_stanova;
		this.br_naseljenih = br_naseljenih;
		this.predsednik = predsednik;
	}
	
}
