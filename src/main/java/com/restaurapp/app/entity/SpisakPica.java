package com.restaurapp.app.entity;

public class SpisakPica {
	
	private int idSpiskaPica;
	private int idKarte;
	private int idPica;
	
	public SpisakPica() {}

	public SpisakPica(int idSpiskaPica, int idKarte, int idPica) {
		this.idSpiskaPica = idSpiskaPica;
		this.idKarte = idKarte;
		this.idPica = idPica;
	}

	public int getIdSpiskaPica() {
		return idSpiskaPica;
	}

	public void setIdSpiskaPica(int idSpiskaPica) {
		this.idSpiskaPica = idSpiskaPica;
	}

	public int getIdKarte() {
		return idKarte;
	}

	public void setIdKarte(int idKarte) {
		this.idKarte = idKarte;
	}

	public int getIdPica() {
		return idPica;
	}

	public void setIdPica(int idPica) {
		this.idPica = idPica;
	}

	@Override
	public String toString() {
		return "SpisakPica [idSpiskaPica=" + idSpiskaPica + ", idKarte=" + idKarte + ", idPica=" + idPica + "]";
	}
	
	

}
