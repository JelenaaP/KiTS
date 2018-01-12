package dto;

import model.Korisnik_servisa;

import java.util.Date;

import model.Komentar;
import model.Kvar;
import model.Obavestenje;

public class KomentarDto {
	
	private Long id_komentar;
	private String text;
	private Date dat_kreiranja;
	private Korisnik_servisaDto kreator;
	private KvarDto kvar;

	public KomentarDto(){}
	
	public KomentarDto(Long id_komentar, String text, Date dat_kreiranja, Korisnik_servisaDto kreator, KvarDto kvar,
			Komentar komentar) {
		super();
		this.id_komentar = id_komentar;
		this.text = text;
		this.dat_kreiranja = dat_kreiranja;
		this.kreator = kreator;
		this.kvar = kvar;

	}

	
	public KomentarDto(Komentar komentar) {
		id_komentar = komentar.getId_komentar();
		text = komentar.getText();
		dat_kreiranja = komentar.getDat_kreiranja();
		kreator = new Korisnik_servisaDto(komentar.getKreator());
		kvar = new KvarDto(komentar.getKvar());		
	}

	public Long getId_komentar() {
		return id_komentar;
	}

	public void setId_komentar(Long id_komentar) {
		this.id_komentar = id_komentar;
	}

	public String getText() {
		return text;
	}
	

	public void setText(String text) {
		this.text = text;
	}

	public Date getDat_kreiranja() {
		return dat_kreiranja;
	}

	public void setDat_kreiranja(Date dat_kreiranja) {
		this.dat_kreiranja = dat_kreiranja;
	}

	public Korisnik_servisaDto getKreator() {
		return kreator;
	}

	public void setKreator(Korisnik_servisaDto kreator) {
		this.kreator = kreator;
	}

	public KvarDto getKvar() {
		return kvar;
	}

	public void setKvar(KvarDto kvar) {
		this.kvar = kvar;
	}
	
	

}
