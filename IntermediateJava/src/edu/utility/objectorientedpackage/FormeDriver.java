package edu.utility.objectorientedpackage;

public class FormeDriver{

	public static void main(String[] args) {
		//
		System.out.println(new Rectangle(23.3).aire());
		System.out.println(new Rectangle(45.4).aire());
		System.out.println(new Triangle(12.4, 34.2).aire());
		System.out.println("************");

		Forme[] tab1 = new Forme[2];
		Forme forme1 = new Rectangle(12.5);
		Forme forme2 = new Triangle(2.5, 5.0);
		
		tab1[0] = forme1;
		tab1[1] = forme2;
		
		for(Forme f: tab1) {
			System.out.println(f.aire());
		}
		
		Cercle cercle1 = new Cercle();
		
		cercle1.returnPropForme();
	}

}
