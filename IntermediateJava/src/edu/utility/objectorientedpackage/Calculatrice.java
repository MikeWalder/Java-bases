package edu.utility.objectorientedpackage;

public class Calculatrice {
	private double resultat;
	
	public double getResultat() {
		return resultat;
	}
	
	public void addition(double... nombres) {
		calculer('+', nombres);
	}

	public void soustraction(double... nombres) {
		calculer('+', nombres);
	}
	
	public void multiplication(double... nombres) {
		calculer('*', nombres);
	}
	
	private void calculer(char symbole, double... nombres) {
		for(double nombre : nombres) {
			switch (symbole) {
			case '+': {
				resultat += nombre;
				break;
			}
			case '-': {
				resultat -= nombre;
				break;
			}
			case '*': {
				resultat *= nombre;
				break;
			}
		}
	}
}
}
