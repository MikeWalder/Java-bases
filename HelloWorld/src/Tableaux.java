import java.util.Scanner;

public class Tableaux {

	static Scanner clavier = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Déclaration d'un tableau d'entiers
		int tab1[] = {12, 45, 34, 54, -67, 9, 450}; // Déclaration + initialisation
		int elem = 0;
		
		System.out.println("Entrez le numéro de l'élément du tableau :");
		elem = clavier.nextInt();
		
		if(elem < 0 || elem > 6) {
			System.out.println("L'élément entré n'existe pas.");
		} else {
			System.out.println("tab[" + elem + "] = " + tab1[elem]);
		}
		
		// Tableau de taille fixe 
		double[] tab2 = new double[5]; // Tableau fixe de 5 éléments
		tab2[2] = 45.8;
		for(int i = 0; i < tab2.length; i++) {
			System.out.println("Elément " + i + " : " + tab2[i]);
		}
		
		// Itération sur les éléments d'un tableau 
		double[] tab3 = {34.5, 6.98, -4.08, 34.45};
		for(double tab3Elem : tab3) { // ne permet pas de faire de tests
			// De plus, peret uniqueent les pas de 1 dans le tableau
			System.out.println("> " + tab3Elem);
		}

	}

}
