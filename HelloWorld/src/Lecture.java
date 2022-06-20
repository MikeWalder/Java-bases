import java.util.Scanner;

public class Lecture {
	
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		// Afficher un entier et deux chaînes de caractères
		double a = 0;
		String str1 = ""; 
		String str2 = "";
		
		System.out.print("Entrez un nombre (entier ou à virgule) : ");
		a = clavier.nextDouble();
		clavier.nextLine(); 
		/* on ajoute nextLine quand on a nextDouble ou nexInt précédent nextLine
		 * pour éviter les conflits 
		 */
		
		System.out.println("Entrez la première chaîne de caractères : ");
		str1 = clavier.nextLine();
		
		System.out.println("Entrez la seconde chaîne de caractères : ");
		str2 = clavier.nextLine();
		
		// Affichage du résultat : 
		
		System.out.println("a : " + a);
		System.out.println("1ère phrase : " + str1);
		System.out.println("2ème phrase : " + str2);
	}

}
