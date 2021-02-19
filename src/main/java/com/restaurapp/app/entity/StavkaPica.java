package com.restaurapp.app.entity;

public class StavkaPica {
	
	private int idStavkePica;
	private int idPica;
	private int idPorudzbine;
	private int kolicina;
	
	public StavkaPica() {}

	public StavkaPica(int idStavkePica, int idPica, int idPorudzbine, int kolicina) {
		super();
		this.idStavkePica = idStavkePica;
		this.idPica = idPica;
		this.idPorudzbine = idPorudzbine;
		this.kolicina = kolicina;
	}

	public int getIdStavkePica() {
		return idStavkePica;
	}

	public void setIdStavkePica(int idStavkePica) {
		this.idStavkePica = idStavkePica;
	}

	public int getIdPica() {
		return idPica;
	}

	public void setIdPica(int idPica) {
		this.idPica = idPica;
	}

	public int getIdPorudzbine() {
		return idPorudzbine;
	}

	public void setIdPorudzbine(int idPorudzbine) {
		this.idPorudzbine = idPorudzbine;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	@Override
	public String toString() {
		return "StavkaPica [idStavkePica=" + idStavkePica + ", idPica=" + idPica + ", idPorudzbine=" + idPorudzbine
				+ ", kolicina=" + kolicina + "]";
	}
	
	

}
