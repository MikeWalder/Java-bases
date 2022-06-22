
public class Fonctions {

	public static void main(String[] args) {
		tellChairman("Bernard Arnault", 54);
		tellChairman("Laurent Oniercaud", 39);
		
		double euros = convertEurosToFrancs(12.50);
		System.out.printf("%.2f francs valent %.2f euros", 12.50, euros);
	}
	
	// Fonction ne retournant rien (void)
	static void tellChairman(String identity, int age) {
		System.out.printf("Le président est %s%nAge : %d%n%n", identity, age);
	}
	
	// Fonction avec return
	static double convertEurosToFrancs(double euros) {
		return 6.55957 * euros;
	}

}
