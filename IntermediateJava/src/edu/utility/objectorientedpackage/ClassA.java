package edu.utility.objectorientedpackage;

import edu.utility.utilpackage.ClassB;
import edu.utility.utilpackage.ClassC;

public class ClassA {
	public static void main(String[] args) {
		ClassB classeB = new ClassB();
		
		// Accès à la méthode publique de l'objet ClassB depuis ClassA
		classeB.simpleMethod();
	}
}
