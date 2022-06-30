package edu.utility.objectorientedpackage;

abstract public class Forme {
	// Méthode aire non définie au niveau de la super classe mais au niveau de
	// la classe fille
	abstract public double aire(); 
	
	public Forme() {
		System.out.println("Ceci est un constructeur de la classe parent.");
	}
}
