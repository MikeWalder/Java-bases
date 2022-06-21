import java.util.Scanner;
public class Conditions {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		// Entrée d'un nombre puis en fonction de celui-ci, afficher le résultat
		double nbre = 0.0;
		
		System.out.println("Entrez un nombre entier : ");
		nbre = clavier.nextDouble();
		clavier.nextLine();
		
		// Traitement des conditions
		if(nbre > 0) {
			System.out.println("Le nombre " + nbre + " est positif.");
		} else if (nbre == 0) {
			System.out.println("Le nombre entré est nul.");
		} else {
			System.out.println("Le nombre " + nbre + " est négatif.");
		}
		
	}

}
