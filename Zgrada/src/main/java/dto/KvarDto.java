package dto;

import java.util.Date;

import model.Kvar;

public class KvarDto {
	private Long id_kvar;
	private String ime;
	private String opis;
	private Date dat_kreiranja;
	private Date dat_zakazivanja;
	private Date dat_popravke;
	private boolean popravljen;
	private ZgradaDto zgrada;
	
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
	public Date getDat_kreiranja() {
		return dat_kreiranja;
	}
	public void setDat_kreiranja(Date dat_kreiranja) {
		this.dat_kreiranja = dat_kreiranja;
	}
	
	public boolean isPopravljen() {
		return popravljen;
	}
	public void setPopravljen(boolean popravljen) {
		this.popravljen = popravljen;
	}	
	public Date getDat_zakazivanja() {
		return dat_zakazivanja;
	}
	public void setDat_zakazivanja(Date dat_zakazivanja) {
		this.dat_zakazivanja = dat_zakazivanja;
	}
	public Date getDat_popravke() {
		return dat_popravke;
	}
	public void setDat_popravke(Date dat_popravke) {
		this.dat_popravke = dat_popravke;
	}
	public ZgradaDto getZgrada() {
		return zgrada;
	}
	public void setZgrada(ZgradaDto zgrada) {
		this.zgrada = zgrada;
	}
	
	public KvarDto(){};
	
	public KvarDto(Long id_kvar, String ime, String opis, Date dat_kreiranja, Date dat_zakazivanja, Date dat_popravke, boolean popravljen,
			ZgradaDto zgrada) {
		super();
		this.id_kvar = id_kvar;
		this.ime = ime;
		this.opis = opis;
		this.dat_kreiranja = dat_kreiranja;
		this.popravljen = popravljen;
		this.dat_zakazivanja = dat_zakazivanja;
		this.dat_popravke = dat_popravke;
		this.zgrada = zgrada;
	}
	public KvarDto(Kvar kvar) {
		id_kvar = kvar.getId_kvar();
		ime = kvar.getIme();
		opis = kvar.getOpis();
		dat_kreiranja = kvar.getDat_kreiranja();
		dat_zakazivanja = kvar.getDat_zakazivanja();
		dat_popravke = kvar.getDat_popravke();
		popravljen = kvar.isPopravljen();
		zgrada = new ZgradaDto(kvar.getZgrada());
		
	}
}
