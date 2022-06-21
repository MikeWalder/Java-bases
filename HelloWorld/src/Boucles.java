import java.util.Scanner;

public class Boucles {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		// Boucle for 
		int lignes = 12;
		
		for(int i = 1; i <= lignes; i++) {
			System.out.println("Le double de " + i + " est : " + (2*i));
		}
		
		// Do ... while
		int nbre = 0;
		int nbreCible = 34;
		
		do {
			System.out.println("Entrez le nombre entier à trouver : ");
			nbre = clavier.nextInt();
			
			if(nbre > nbreCible) {
				System.out.println("Le nombre entré est trop grand !");
			} else if (nbre < nbreCible) {
				System.out.println("Le nombre entré est trop petit !");
			} else if (nbre == nbreCible) {
				System.out.println("Le nombre cible est bien " + nbreCible + ", félicitations !!");
			}
			
		} while (nbre != nbreCible);

	}

}
