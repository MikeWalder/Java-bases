package edu.utility.utilpackage;

public class Interrupteur {
	private boolean position;
	private Lampe lampe;
	
	public Interrupteur(Lampe lampe) {
		this.lampe = lampe;
		this.position = lampe.estAllume();
	}
	
	public String getPosition() {
		if(position) {
			return "Allumé";
		} else {
			return "Eteint";
		}
	}
	
	public void changerPosition() {
		lampe.modifierEtat();
		position = lampe.estAllume();
	}
}
