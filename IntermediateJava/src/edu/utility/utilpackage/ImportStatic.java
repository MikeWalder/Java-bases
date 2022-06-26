package edu.utility.utilpackage;

// Importation de méthodes statiques
import static java.lang.Math.abs;
import static java.lang.Math.cos;
// Importation de constantes statiques
import static java.lang.Math.PI;

import java.util.Scanner;

public class ImportStatic {
	
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		// Impotations statiques 
		double a = 0.0;
		
		System.out.println("Entrez un chiffre : ");
		a = clavier.nextDouble();
		try {
			double aRand = (a * PI) / 180; // Constante statique importée donc PI = Math.PI
			double aCos = cos(aRand);
			double aAbs = abs(a);
			System.out.printf("Le cosinus de %.2f est : %.2f%nLa valeur absolue de %.2f est %.2f", a, aCos, a, aAbs);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
