package edu.utility.utilpackage;

public class Personne {
	private String nom;
	private int age;
	
	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	// Setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setAge(int age) {
		if(age <= 0) {
			System.out.printf("L'âge entré est négatif !%nEntrez un âge valide.%n");
		} else {
			this.age = age;
		}
	}
	
	// Getters
	public String getNom() {
		return this.nom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// Méthode(s)
	public void presentation() {
		System.out.printf("Vous vous appelez %s et vous avez %s ans.%n%n", nom, age);
	}
}
