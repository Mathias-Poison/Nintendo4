package model;

import java.time.LocalDate;

public class Console {

	private String nom;
	private int prix;
	private String dateSortie;

	public Console(String nom, int prix, String dateSortie) {
		this.nom = nom;
		this.prix=prix;
		this.dateSortie=dateSortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}

	
	
	
}
