package edu.utility.objectorientedpackage;

public class Triangle extends Forme {
	protected double base;
	protected double hauteur;
	
	public Triangle(double base, double hauteur) { // constructeur
		this.base = base;
		this.hauteur = hauteur;
	}
	
	public double aire() {
		return (base * hauteur) / 2;
	}
}
