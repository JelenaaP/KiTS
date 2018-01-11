package dto;

import java.util.Date;


public class SednicaDto {
	private int id_sednice;
	private Date dat_kreiranja;
	private Date dat_zakazivanja;
	private boolean aktivna;
	private Korisnik_servisaDto kreator;
	private ZgradaDto zgrada;
	
	private SednicaDto(){}
	
	public SednicaDto(int id_sednice, Date dat_kreiranja, Date dat_zakazivanja, boolean aktivna,
			Korisnik_servisaDto kreator, ZgradaDto zgrada) {
		super();
		this.id_sednice = id_sednice;
		this.dat_kreiranja = dat_kreiranja;
		this.dat_zakazivanja = dat_zakazivanja;
		this.kreator = kreator;
		this.aktivna = aktivna;
		this.zgrada = zgrada;
		}

	public int getId_sednice() {
		return id_sednice;
	}

	public void setId_sednice(int id_sednice) {
		this.id_sednice = id_sednice;
	}

	public Date getDat_kreiranja() {
		return dat_kreiranja;
	}

	public void setDat_kreiranja(Date dat_kreiranja) {
		this.dat_kreiranja = dat_kreiranja;
	}

	public Date getDat_zakazivanja() {
		return dat_zakazivanja;
	}

	public void setDat_zakazivanja(Date dat_zakazivanja) {
		this.dat_zakazivanja = dat_zakazivanja;
	}

	public boolean isAktivna() {
		return aktivna;
	}

	public void setAktivna(boolean aktivna) {
		this.aktivna = aktivna;
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
}
