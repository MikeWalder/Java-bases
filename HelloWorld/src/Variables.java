
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
		System.out.println("Le carré de n est : " + (n*n));
		
		// Echanger le contenu de deux variables
		int a = 3, b = 5, c;
		c = a;
		a = b;
		b = c;
		System.out.print("a : " + a + "\nb : " + b);
	}

}
