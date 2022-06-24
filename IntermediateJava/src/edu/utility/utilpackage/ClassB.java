package edu.utility.utilpackage;

public class ClassB {
	public String identity;
	public int code;
	
	public void simpleMethod() {
		System.out.println("Ma méthode de classification");
	}
	
	public static void main(String[] args) {
		// Les éléments protected sont accessibles au sein de
		// toute les classes du même package
		
		ClassC c = new ClassC();
		c.ville = "Sélestat";
		c.afficheMessage();
		System.out.printf("La ville entrée est : %s", c.ville);
	}
}
