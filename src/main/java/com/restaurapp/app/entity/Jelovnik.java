package com.restaurapp.app.entity;

public class Jelovnik {

	private int idJelovnika;
	private String naziv;
	private String datum;
	
	public Jelovnik () {}

	public Jelovnik(int idJelovnika, String naziv, String datum) {
		this.idJelovnika = idJelovnika;
		this.naziv = naziv;
		this.datum = datum;
	}

	public int getIdJelovnika() {
		return idJelovnika;
	}

	public void setIdJelovnika(int idJelovnika) {
		this.idJelovnika = idJelovnika;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	@Override
	public String toString() {
		return "Jelovnik [idJelovnika=" + idJelovnika + ", naziv=" + naziv + ", datum=" + datum + "]";
	}
	
	
}
