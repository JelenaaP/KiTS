package dto;

import model.Korisnik_servisa;
import model.Komentar;
import model.Kvar;

public class KomentarKvarDto {
	
	private Komentar komentar;
	private Kvar kvar;
	private Korisnik_servisa kreator;
	
	public KomentarKvarDto(){}

	public Komentar getKomentar() {
		return komentar;
	}

	public void setKomentar(Komentar komentar) {
		this.komentar = komentar;
	}

	public Kvar getKvar() {
		return kvar;
	}

	public void setKvar(Kvar kvar) {
		this.kvar = kvar;
	}

	public Korisnik_servisa getKreator() {
		return kreator;
	}

	public void setKreator(Korisnik_servisa kreator) {
		this.kreator = kreator;
	}
	
	

}
