package com.restaurapp.app.entity;

public class Angazovanje {
	
	private int idAngazovanja;
	private int idRadnika;
	private int idStola;
	
	public Angazovanje() {}
	
	public Angazovanje(int idAngazovanja, int idRadnika, int idStola) {
		this.idAngazovanja = idAngazovanja;
		this.idRadnika = idRadnika;
		this.idStola = idStola;
	}

	public int getIdAngazovanja() {
		return idAngazovanja;
	}

	public void setIdAngazovanja(int idAngazovanja) {
		this.idAngazovanja = idAngazovanja;
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

	@Override
	public String toString() {
		return "Angazovanje [idAngazovanja=" + idAngazovanja + ", idRadnika=" + idRadnika + ", idStola=" + idStola
				+ "]";
	}
	
	
	

}
