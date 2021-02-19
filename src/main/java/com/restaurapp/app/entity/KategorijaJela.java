package com.restaurapp.app.entity;

public class KategorijaJela {
	
	private int idKategorijeJela;
	private String naziv;
	
	public KategorijaJela() {}
	
	public KategorijaJela(int idKategorijeJela, String naziv) {
		this.idKategorijeJela = idKategorijeJela;
		this.naziv = naziv;
	}

	public int getIdKategorijeJela() {
		return idKategorijeJela;
	}

	public void setIdKategorijeJela(int idKategorijeJela) {
		this.idKategorijeJela = idKategorijeJela;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "KategorijaJela [idKategorijeJela=" + idKategorijeJela + ", naziv=" + naziv + "]";
	}
	
	

}
