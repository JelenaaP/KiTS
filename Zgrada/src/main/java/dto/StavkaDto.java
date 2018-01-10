package dto;

import model.Korisnik_servisa;
import model.Stavka;

public class StavkaDto {
	private Stavka stavka;
	private Long sednicaId;
	private Long tenatId;
	
	public StavkaDto(){}

	public Stavka getStavka() {
		return stavka;
	}

	public void setStavka(Stavka stavka) {
		this.stavka = stavka;
	}

	public Long getSednicaId() {
		return sednicaId;
	}

	public void setSednicaId(Long sednicaId) {
		this.sednicaId = sednicaId;
	}

	public Long getTenatId() {
		return tenatId;
	}

	public void setTenatId(Long tenatId) {
		this.tenatId = tenatId;
	}
	
	
	
	

}
