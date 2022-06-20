import java.util.Scanner;

public class MiniCalculatrice {

	static Scanner clavier = new Scanner(System.in);
	
	public static void main(String[] args) {

		// Demander à l'utilisateur deux nombres (non entiers)
		// Afficher l'addition des deux nombres, la soustraction et la multiplication
		
		double a = 0.0;
		double b = 0.0;
		
		System.out.println("Entrez le premier chiffre : ");
		a = clavier.nextDouble();
		// clavier.nextLine();
		
		System.out.println("Entrez le second chiffre : ");
		b = clavier.nextDouble();
		clavier.nextLine();
		
		// Addition, soustraction, multiplication
		double addition = a + b;
		double soustraction = a - b;
		double multiplication = a * b;
		
		// Affichage des résultats 
		System.out.println("-------- RESULTATS --------");
		System.out.println("Addition : " + a + " + " + b + " = " + addition);
		System.out.println("Soustraction : " + a + " - " + b + " = " + soustraction);
		System.out.println("Multiplication : " + a + " x " + b + " = " + multiplication);
		
		
		
		

	}

}
