package edu.utility.objectorientedpackage;

public class BlocInitInstance {
	{
		System.out.println("Ceci est un bloc d'initialisation d'instance");
	}
	
	public BlocInitInstance() {
		System.out.println("Ceci est un simple constructeur");
	}
	
	public BlocInitInstance(double a) {
		System.out.printf("Ceci es tun constructeur avec le paramètre %.2f", a);
	}
}
