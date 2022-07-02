package edu.utility.objectorientedpackage;

public class Cercle extends Forme {
	public Cercle() {
		super(); // Appel au constructeur de la classe parent
	}
	
	public double aire() {
		return 0.0;
	}
	
	public void returnPropForme() {
		System.out.printf("L'atribut prop1 de la super classe Forme vaut : %.2f",super.prop1);
	}
}
