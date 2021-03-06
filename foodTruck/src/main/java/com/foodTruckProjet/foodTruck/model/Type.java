package com.foodTruckProjet.foodTruck.model;

public class Type {

	private String nom;
	private int heure;
	
	public Type()
	{
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	@Override
	public String toString() {
		return "Type [getNom()=" + getNom() + ", getHeure()=" + getHeure() + "]";
	}

	public Type(String nom, int heure) {
		super();
		this.nom = nom;
		this.heure = heure;
	}
	
}
