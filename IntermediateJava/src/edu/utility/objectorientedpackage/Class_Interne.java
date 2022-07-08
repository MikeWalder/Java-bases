package edu.utility.objectorientedpackage;

public class Class_Interne { // classe externe
	private int attr1;
	private String attr2;
	public static double attr3;
	
	private double def_attr1;
	private String def_attr2;
	
	public Class_Interne(int attr1, String attr2) {
		this.attr1 = attr1;
		this.attr2 = attr2;
		//new InterneB();
	}
	
	public void declaration() {
		System.out.printf("Nombre : %d%nTerme : %s%n%n", attr1, attr2);
	}
	
	public void traitementDeclaratif() {
		def_attr1 = 3.2 * attr1;
		def_attr2 = attr2 + " !!";
		System.out.printf("Nombre : %.2f%nTerme : %s%n%n", def_attr1, def_attr2);
	}
	
	public void declarationFormelle() {
		System.out.printf("Terme entré : %s%nNombre entré : %d%n%n", attr2, attr1);
	}
	
	class InterneA { // Classe interne
		// Accès direct aux attributs et méthodes de la classe externe
		public InterneA() { // Constructeur
			traitementDeclaratif();
		}
	}
	
	class InterneB {
		// Cette classe interne accède aussi aux attributs et méthodes de la classe externe
		public InterneB() {
			if(attr1 < 0) {
				class BelowZero {
					public BelowZero() {
						System.out.println("Ceci est la classe locale !");
					}
				}
				new BelowZero();
			}
			else {
				declarationFormelle();
			}
		}
	}
	
	static class InterneStaticC{
		public InterneStaticC() {
			System.out.println("Ceci est le constructeur de la classe statique interne.");
		}
	}
}
