package com.restaurapp.app.entity;

public class SpisakJela {

	private int idSpiskaJela;
	private int idJelovnika;
	private int idJela;
	
	public SpisakJela() {}

	public SpisakJela(int idSpiskaJela, int idJelovnika, int idJela) {
		this.idSpiskaJela = idSpiskaJela;
		this.idJelovnika = idJelovnika;
		this.idJela = idJela;
	}

	public int getIdSpiskaJela() {
		return idSpiskaJela;
	}

	public void setIdSpiskaJela(int idSpiskaJela) {
		this.idSpiskaJela = idSpiskaJela;
	}

	public int getIdJelovnika() {
		return idJelovnika;
	}

	public void setIdJelovnika(int idJelovnika) {
		this.idJelovnika = idJelovnika;
	}

	public int getIdJela() {
		return idJela;
	}

	public void setIdJela(int idJela) {
		this.idJela = idJela;
	}

	@Override
	public String toString() {
		return "SpisakJela [idSpiskaJela=" + idSpiskaJela + ", idJelovnika=" + idJelovnika + ", idJela=" + idJela + "]";
	}
	
	
}
