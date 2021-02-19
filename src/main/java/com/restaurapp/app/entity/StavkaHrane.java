package com.restaurapp.app.entity;

public class StavkaHrane {

	private int idStavkeHrane;
	private int idJela;
	private int idPorudzbine;
	private int kolicina;
	
	public StavkaHrane() {}

	public StavkaHrane(int idStavkeHrane, int idJela, int idPorudzbine, int kolicina) {
		this.idStavkeHrane = idStavkeHrane;
		this.idJela = idJela;
		this.idPorudzbine = idPorudzbine;
		this.kolicina = kolicina;
	}

	public int getIdStavkeHrane() {
		return idStavkeHrane;
	}

	public void setIdStavkeHrane(int idStavkeHrane) {
		this.idStavkeHrane = idStavkeHrane;
	}

	public int getIdJela() {
		return idJela;
	}

	public void setIdJela(int idJela) {
		this.idJela = idJela;
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
		return "StavkaHrane [idStavkeHrane=" + idStavkeHrane + ", idJela=" + idJela + ", idPorudzbine=" + idPorudzbine
				+ ", kolicina=" + kolicina + "]";
	}
	
	
}
