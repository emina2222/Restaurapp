package com.restaurapp.app.entity;

public class Sto {
	
	private int idStola;
	private int brojStolica;
	private int zauzeto;
	
	public Sto() {}

	public Sto(int idStola, int brojStolica, int zauzeto) {
		super();
		this.idStola = idStola;
		this.brojStolica = brojStolica;
		this.zauzeto = zauzeto;
	}

	public int getIdStola() {
		return idStola;
	}

	public void setIdStola(int idStola) {
		this.idStola = idStola;
	}

	public int getBrojStolica() {
		return brojStolica;
	}

	public void setBrojStolica(int brojStolica) {
		this.brojStolica = brojStolica;
	}

	public int getZauzeto() {
		return zauzeto;
	}

	public void setZauzeto(int zauzeto) {
		this.zauzeto = zauzeto;
	}

	@Override
	public String toString() {
		return "Sto [idStola=" + idStola + ", brojStolica=" + brojStolica + ", zauzeto=" + zauzeto + "]";
	}
	
	

}
