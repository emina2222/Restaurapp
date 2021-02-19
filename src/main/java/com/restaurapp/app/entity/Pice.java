package com.restaurapp.app.entity;

public class Pice {
	
	private int idPica;
	private String naziv;
	private String opis;
	private int idKategorijePica;
	
	public Pice() {}

	public Pice(int idPica, String naziv, String opis, int idKategorijePica) {
		super();
		this.idPica = idPica;
		this.naziv = naziv;
		this.opis = opis;
		this.idKategorijePica = idKategorijePica;
	}

	public int getIdPica() {
		return idPica;
	}

	public void setIdPica(int idPica) {
		this.idPica = idPica;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public int getIdKategorijePica() {
		return idKategorijePica;
	}

	public void setIdKategorijePica(int idKategorijePica) {
		this.idKategorijePica = idKategorijePica;
	}

	@Override
	public String toString() {
		return "Pice [idPica=" + idPica + ", naziv=" + naziv + ", opis=" + opis + ", idKategorijePica="
				+ idKategorijePica + "]";
	}
	
	 

}
