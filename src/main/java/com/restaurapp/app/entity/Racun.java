package com.restaurapp.app.entity;

public class Racun {
	
	private int idRacuna;
	private double ukupanIznos;
	private int idRadnika;
	private int idStola;
	private String datum;
	
	public Racun() {}

	public Racun(int idRacuna, double ukupanIznos, int idRadnika, int idStola, String datum) {
		this.idRacuna = idRacuna;
		this.ukupanIznos = ukupanIznos;
		this.idRadnika = idRadnika;
		this.idStola = idStola;
		this.datum = datum;
	}

	public int getIdRacuna() {
		return idRacuna;
	}

	public void setIdRacuna(int idRacuna) {
		this.idRacuna = idRacuna;
	}

	public double getUkupanIznos() {
		return ukupanIznos;
	}

	public void setUkupanIznos(double ukupanIznos) {
		this.ukupanIznos = ukupanIznos;
	}

	public int getIdRadnika() {
		return idRadnika;
	}

	public void setIdRadnika(int idRadnika) {
		this.idRadnika = idRadnika;
	}

	public int getIdStola() {
		return idStola;
	}

	public void setIdStola(int idStola) {
		this.idStola = idStola;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	@Override
	public String toString() {
		return "Racun [idRacuna=" + idRacuna + ", ukupanIznos=" + ukupanIznos + ", idRadnika=" + idRadnika
				+ ", idStola=" + idStola + ", datum=" + datum + "]";
	}
	
	

}
