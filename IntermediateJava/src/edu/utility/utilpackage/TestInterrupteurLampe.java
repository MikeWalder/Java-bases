package edu.utility.utilpackage;

public class TestInterrupteurLampe {

	public static void main(String[] args) {
		// 
		Lampe lampe = new Lampe(false);
		Interrupteur interrupteur = new Interrupteur(lampe);
		
		System.out.println(lampe.estAllume());
		System.out.println(interrupteur.getPosition());
		
		interrupteur.changerPosition();
		
		System.out.println(lampe.estAllume());
		System.out.println(interrupteur.getPosition());
		
		//lampe.appuyerInterrupteur(); // changement de l'état de la lampe
		//System.out.println(lampe.estAllume()); // affichage de l'état
	}

}
