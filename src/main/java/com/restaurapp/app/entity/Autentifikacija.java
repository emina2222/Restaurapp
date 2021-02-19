package com.restaurapp.app.entity;

public class Autentifikacija {
	
	private int idKredencijala;
	private String korisnickoIme;
	private String lozinka;
	private String uloga;
	
	public Autentifikacija() {
	}
	
	public Autentifikacija(String korisnickoIme,String lozinka) {
		this.korisnickoIme=korisnickoIme;
		this.lozinka=lozinka;
	}

	public Autentifikacija(int idKredencijala, String korisnickoIme, String lozinka, String uloga) {
		this.idKredencijala = idKredencijala;
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.uloga = uloga;
	}

	public int getIdKredencijala() {
		return idKredencijala;
	}

	public void setIdKredencijala(int idKredencijala) {
		this.idKredencijala = idKredencijala;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public String getUloga() {
		return uloga;
	}

	public void setUloga(String uloga) {
		this.uloga = uloga;
	}

	@Override
	public String toString() {
		return "Autentifikacija [idKredencijala=" + idKredencijala + ", korisnickoIme=" + korisnickoIme + ", lozinka="
				+ lozinka + ", uloga=" + uloga + "]";
	}
	
	
	
}
