package project.dto;

import java.util.Date;

import project.model.Komentar;

public class KomentarDto {
	
	private Long id;
	private String text;
	private Date datKreiranja;
	private Korisnik_servisaDto kreator;
	private KvarDto kvar;

	public KomentarDto(){}
	
	public KomentarDto(Long id, String text, Date datKreiranja, Korisnik_servisaDto kreator, KvarDto kvar) {
		super();
		this.id = id;
		this.text = text;
		this.datKreiranja = datKreiranja;
		this.kreator = kreator;
		this.kvar = kvar;
	}

	public KomentarDto(Komentar komentar) {
		id = komentar.getId();
		text = komentar.getText();
		datKreiranja = komentar.getDatKreiranja();
		kreator = new Korisnik_servisaDto(komentar.getKreator());
		kvar = new KvarDto(komentar.getKvar());		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDatKreiranja() {
		return datKreiranja;
	}

	public void setDatKreiranja(Date datKreiranja) {
		this.datKreiranja = datKreiranja;
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