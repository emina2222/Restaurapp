package com.restaurapp.app.entity;

public class KartaPica {
	
	private int idKarte;
	private String naziv;
	private String datumObjave;
	
	public KartaPica() {}
	

	public KartaPica(int idKarte, String naziv, String datumObjave) {
		this.idKarte = idKarte;
		this.naziv = naziv;
		this.datumObjave = datumObjave;
	}

	public int getIdKarte() {
		return idKarte;
	}

	public void setIdKarte(int idKarte) {
		this.idKarte = idKarte;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getDatumObjave() {
		return datumObjave;
	}

	public void setDatumObjave(String datumObjave) {
		this.datumObjave = datumObjave;
	}
	
	

}
