package com.restaurapp.app.entity;

public class Porudzbina {
	
	private int idPorudzbine;
	private int idRacuna;
	
	public Porudzbina() {}

	public Porudzbina(int idPorudzbine, int idRacuna) {
		super();
		this.idPorudzbine = idPorudzbine;
		this.idRacuna = idRacuna;
	}

	public int getIdPorudzbine() {
		return idPorudzbine;
	}

	public void setIdPorudzbine(int idPorudzbine) {
		this.idPorudzbine = idPorudzbine;
	}

	public int getIdRacuna() {
		return idRacuna;
	}

	public void setIdRacuna(int idRacuna) {
		this.idRacuna = idRacuna;
	}

	@Override
	public String toString() {
		return "Porudzbina [idPorudzbine=" + idPorudzbine + ", idRacuna=" + idRacuna + "]";
	}
	
	

}
