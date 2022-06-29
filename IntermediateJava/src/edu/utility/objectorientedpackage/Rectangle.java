package edu.utility.objectorientedpackage;

public class Rectangle extends Forme {
	protected double cote;
	
	public Rectangle(double cote) {
		this.cote = cote;
	}
	
	// La classe aire doit être définie car abstraite dans la classe parent
	@Override
	public double aire() {
		return cote * cote;
	}
}
