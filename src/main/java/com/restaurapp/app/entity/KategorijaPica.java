package com.restaurapp.app.entity;

public class KategorijaPica {

	private int idKategorijaPica;
	private String naziv;
	
	public KategorijaPica() {}

	public KategorijaPica(int idKategorijaPica, String naziv) {
		this.idKategorijaPica = idKategorijaPica;
		this.naziv = naziv;
	}

	public int getIdKategorijaPica() {
		return idKategorijaPica;
	}

	public void setIdKategorijaPica(int idKategorijaPica) {
		this.idKategorijaPica = idKategorijaPica;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "KategorijaPica [idKategorijaPica=" + idKategorijaPica + ", naziv=" + naziv + "]";
	}
	
	
}
