package edu.utility.utilpackage;

public class PersonneDriver {

	public static void main(String[] args) {
		Personne perso1 = new Personne("Valentin", 34);
		
		perso1.presentation();
		
		perso1.setNom("Jean");
		perso1.setAge(36);
		
		perso1.presentation();
		perso1.setAge(-34);
		
		System.out.printf("Votre nom : %s%nVotre âge : %d%n%n", perso1.getNom(), perso1.getAge());
	}

}
