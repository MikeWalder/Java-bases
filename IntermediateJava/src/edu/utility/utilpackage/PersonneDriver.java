package edu.utility.utilpackage;

public class PersonneDriver {

	public static void main(String[] args) {
		Personne perso1 = new Personne("Valentin", 34);
		
		perso1.presentation();
		
		perso1.setNom("Jean");
		perso1.setAge(36);
		try {
			perso1.setAge(-45);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		perso1.presentation();
		
		
		System.out.printf("Votre nom : %s%nVotre âge : %d%n%n", perso1.getNom(), perso1.getAge());
	}

}
