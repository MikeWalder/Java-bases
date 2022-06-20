
public class Variables {

	public static void main(String[] args) {
		int n = 45;
		double k = 4.56;
		double sum = n + k;
		double quotient = k / n;
		System.out.print("La valeur de la variable n est : " + n + "\n");
		System.out.print("La variable k vaut : " + k + "\n");
		System.out.print("Somme de k et n : " + sum + "\n");
		System.out.println("Quotient de k  par n : " + quotient);
		System.out.println("Le carré de n est : " + (n*n) + "\n");
		
		// Echanger le contenu de deux variables
		int a = 3, b = 5, c;
		c = a;
		a = b;
		b = c;
		System.out.println("a : " + a + "\nb : " + b + "\n");
		
		// Constantes 
		final int CONVERTOR = 6;
		final double CONVERT_EUR_FRANC = 6.55957;
		System.out.println("CONVERTOR vaut : " + CONVERTOR);
		System.out.println("Un euro vaut " + CONVERT_EUR_FRANC + " francs");
		
		// Incrémentation et pré incrémentation
		int d = 7;
		System.out.println(d++); // affiche 7
		System.out.println(d); // affiche 8
		System.out.println(++d); // affiche 9
	}

}
