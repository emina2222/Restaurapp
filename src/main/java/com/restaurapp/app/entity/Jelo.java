package com.restaurapp.app.entity;

public class Jelo {
	
	private int idJela;
	private String naziv;
	private String opis;
	private int idKategorije;
	
	public Jelo() {}
	
	public Jelo(int idJela, String naziv, String opis, int idKategorije) {
		this.idJela = idJela;
		this.naziv = naziv;
		this.opis = opis;
		this.idKategorije = idKategorije;
	}

	public int getIdJela() {
		return idJela;
	}
	public void setIdJela(int idJela) {
		this.idJela = idJela;
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
	public int getIdKategorije() {
		return idKategorije;
	}
	public void setIdKategorije(int idKategorije) {
		this.idKategorije = idKategorije;
	}

	@Override
	public String toString() {
		return "Jelo [idJela=" + idJela + ", naziv=" + naziv + ", opis=" + opis + ", idKategorije=" + idKategorije
				+ "]";
	}
	
	

}
