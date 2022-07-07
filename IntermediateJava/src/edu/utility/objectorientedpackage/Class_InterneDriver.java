package edu.utility.objectorientedpackage;

public class Class_InterneDriver {

	public static void main(String[] args) {
		
		new Class_Interne(23, "Maison").declaration();
		new Class_Interne(56, "Hôtel").declaration();
		
		Class_Interne interne = new Class_Interne(95, "Appartement");
		interne.new InterneB(); // Création d'une instance d'une classe interne
		
		// Déclaration de la classe interne statique
		Class_Interne.InterneStaticC class_Static = Class_Interne.InterneStaticC();
	}

}
