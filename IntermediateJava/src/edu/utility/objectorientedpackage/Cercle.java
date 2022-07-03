package edu.utility.objectorientedpackage;

public class Cercle extends Forme {
	double rayon;
	String ville;
	
	public Cercle() {
		super(); // Appel au constructeur de la classe parent
	}
	
	// Premier constructeur 
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	// Second constructeur avec appel du premier pour l'attribut rayon avec this()
	public Cercle(double rayon, String ville) {
		this(rayon);
		this.ville = ville;
	}
	
	public double aire() {
		return 0.0;
	}
	
	public void returnPropForme() {
		System.out.printf("L'atribut prop1 de la super classe Forme vaut : %.2f",super.prop1);
	}
}
