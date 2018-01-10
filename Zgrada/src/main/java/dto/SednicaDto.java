package dto;

import java.util.Date;

import model.Korisnik_servisa;
import model.Zapisnik;
import model.Zgrada;

public class SednicaDto {
	private int id_sednice;
	private Date dat_kreiranja;
	private Korisnik_servisa kreator;
	

	private SednicaDto(){}
	
	public SednicaDto(int id_sednice, Date dat_kreiranja, Date dat_zakazivanja, boolean aktivna,
			Korisnik_servisa kreator, Zgrada zgrada, Zapisnik zapisnik) {
		super();
		this.id_sednice = id_sednice;
		this.dat_kreiranja = dat_kreiranja;
		this.kreator = kreator;
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

	public Korisnik_servisa getKreator() {
		return kreator;
	}

	public void setKreator(Korisnik_servisa kreator) {
		this.kreator = kreator;
	}
}
