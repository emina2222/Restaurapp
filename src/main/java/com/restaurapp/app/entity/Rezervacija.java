package com.restaurapp.app.entity;

public class Rezervacija {
	
	private int idRezervacija;
	private String ime;
	private String telefon;
	private String datum;
	private int idStola;
	
	public Rezervacija() {}

	public Rezervacija(int idRezervacija, String ime, String telefon, String datum, int idStola) {
		this.idRezervacija = idRezervacija;
		this.ime = ime;
		this.telefon = telefon;
		this.datum = datum;
		this.idStola = idStola;
	}

	public int getIdRezervacija() {
		return idRezervacija;
	}

	public void setIdRezervacija(int idRezervacija) {
		this.idRezervacija = idRezervacija;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public int getIdStola() {
		return idStola;
	}

	public void setIdStola(int idStola) {
		this.idStola = idStola;
	}

	@Override
	public String toString() {
		return "Rezervacija [idRezervacija=" + idRezervacija + ", ime=" + ime + ", telefon=" + telefon + ", datum="
				+ datum + ", idStola=" + idStola + "]";
	}
	
	

}
