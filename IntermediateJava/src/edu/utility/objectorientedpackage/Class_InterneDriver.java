package edu.utility.objectorientedpackage;

public class Class_InterneDriver {

	public static void main(String[] args) {
		
		new Class_Interne(23, "Maison").declaration();
		new Class_Interne(56, "Hôtel").declaration();
		
		Class_Interne interne = new Class_Interne(95, "Appartement");
		Class_Interne below = new Class_Interne(-23, "froid");
		interne.new InterneB(); // Création d'une instance d'une classe interne
		below.new InterneB();
		// Déclaration de la classe interne statique
		Class_Interne.InterneStaticC class_Static = new Class_Interne.InterneStaticC();
	}

}
