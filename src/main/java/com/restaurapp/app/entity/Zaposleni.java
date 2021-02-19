package com.restaurapp.app.entity;

public class Zaposleni {

	private int idRadnika;
	private String ime;
	private String prezime;
	private int idKredencijala;
	
	public Zaposleni() {}

	public Zaposleni(int idRadnika, String ime, String prezime, int idKredencijala) {
		this.idRadnika = idRadnika;
		this.ime = ime;
		this.prezime = prezime;
		this.idKredencijala = idKredencijala;
	}

	public int getIdRadnika() {
		return idRadnika;
	}

	public void setIdRadnika(int idRadnika) {
		this.idRadnika = idRadnika;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getIdKredencijala() {
		return idKredencijala;
	}

	public void setIdKredencijala(int idKredencijala) {
		this.idKredencijala = idKredencijala;
	}

	@Override
	public String toString() {
		return "Zaposleni [idRadnika=" + idRadnika + ", ime=" + ime + ", prezime=" + prezime + ", idKredencijala="
				+ idKredencijala + "]";
	}
	
	
}
