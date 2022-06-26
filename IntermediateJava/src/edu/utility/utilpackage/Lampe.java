package edu.utility.utilpackage;

public class Lampe {
	private boolean etat;
	
	public Lampe(boolean etat) {
		this.etat = etat;
	}
	
	public boolean estAllume() {
		return etat;
	}
	
//	public void appuyerInterrupteur() {
//		etat = !etat;
//	}
	
	public void modifierEtat() {
		this.etat = !this.etat;
	}
}
	
