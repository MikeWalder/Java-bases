package edu.utility.objectorientedpackage;

public class CalculatriceDriver {

	public static void main(String[] args) {
		Calculatrice cal1 = new Calculatrice();
		cal1.addition(45, 34.5, -6);
		System.out.println(cal1.getResultat());
		cal1.soustraction(3.5, 2.2);
		System.out.println(cal1.getResultat());
		cal1.multiplication(1.01, 0.99);
		System.out.println(cal1.getResultat());
	}

}
