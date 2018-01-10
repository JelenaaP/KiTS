package dto;

import model.Komentar;
import model.Korisnik_servisa;
import model.Zgrada;

public class KvarDto {
	private Long id_kvar;
	private String ime;
	private String opis;
	private int dat_kreiranja;
	private int dat_zakazivanja;
	private int dat_popravke;
	private boolean popravljen;
	private Zgrada zgrada;
	private Korisnik_servisa radnik;
	private Komentar komentar;
	public Long getId_kvar() {
		return id_kvar;
	}
	public void setId_kvar(Long id_kvar) {
		this.id_kvar = id_kvar;
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
	public int getDat_kreiranja() {
		return dat_kreiranja;
	}
	public void setDat_kreiranja(int dat_kreiranja) {
		this.dat_kreiranja = dat_kreiranja;
	}
	public int getDat_zakazivanja() {
		return dat_zakazivanja;
	}
	public void setDat_zakazivanja(int dat_zakazivanja) {
		this.dat_zakazivanja = dat_zakazivanja;
	}
	public int getDat_popravke() {
		return dat_popravke;
	}
	public void setDat_popravke(int dat_popravke) {
		this.dat_popravke = dat_popravke;
	}
	public boolean isPopravljen() {
		return popravljen;
	}
	public void setPopravljen(boolean popravljen) {
		this.popravljen = popravljen;
	}
	public Zgrada getZgrada() {
		return zgrada;
	}
	public void setZgrada(Zgrada zgrada) {
		this.zgrada = zgrada;
	}
	public Korisnik_servisa getRadnik() {
		return radnik;
	}
	public void setRadnik(Korisnik_servisa radnik) {
		this.radnik = radnik;
	}
	public Komentar getKomentar() {
		return komentar;
	}
	public void setKomentar(Komentar komentar) {
		this.komentar = komentar;
	}
	public KvarDto(Long id_kvar, String ime, String opis, int dat_kreiranja, int dat_zakazivanja, int dat_popravke,
			boolean popravljen, Zgrada zgrada, Korisnik_servisa radnik, Komentar komentar) {
		super();
		this.id_kvar = id_kvar;
		this.ime = ime;
		this.opis = opis;
		this.dat_kreiranja = dat_kreiranja;
		this.dat_zakazivanja = dat_zakazivanja;
		this.dat_popravke = dat_popravke;
		this.popravljen = popravljen;
		this.zgrada = zgrada;
		this.radnik = radnik;
		this.komentar = komentar;
	}
	
	private KvarDto(){};
}
