package edu.utility.objectorientedpackage;

public class Rectangle extends Forme {
	protected double cote;
	
	public Rectangle(double cote) {
		this.cote = cote;
	}
	
	public double aire() {
		return cote * cote;
	}
}
