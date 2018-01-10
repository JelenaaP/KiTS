package dto;

import model.Komentar;
import model.Korisnik_servisa;
import model.Zgrada;

public class KvarDto {
	private Long id_kvar;
	private String ime;
	private String opis;
	private int dat_kreiranja;
	private boolean popravljen;
	
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
	
	public boolean isPopravljen() {
		return popravljen;
	}
	public void setPopravljen(boolean popravljen) {
		this.popravljen = popravljen;
	}
	
	private KvarDto(){};
	
	public KvarDto(Long id_kvar, String ime, String opis, int dat_kreiranja, int dat_zakazivanja, int dat_popravke,
			boolean popravljen, Zgrada zgrada, Korisnik_servisa radnik, Komentar komentar) {
		super();
		this.id_kvar = id_kvar;
		this.ime = ime;
		this.opis = opis;
		this.dat_kreiranja = dat_kreiranja;
		this.popravljen = popravljen;
	}
}
