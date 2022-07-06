package edu.utility.objectorientedpackage;

public class ButtonEffect implements ClickableInterface{

	@Override
	public void afficherMessage() {
		System.out.println("Le bouton vient d'être cliqué");
	}
	
}
