package edu.utility.objectorientedpackage;

public class CompteBancaire {
	private String nom;
	private String prenom;
	private String numeroCompte;
	private int montant;
	final private double CONV_EUR_FRANCS = 6.55957;
	
	// 1er constructeur
	public CompteBancaire(String nom, String prenom, int montant) {
		this.nom = nom;
		this.prenom = prenom;
		this.montant = montant;
	}
	
	// Second constructeur
	public CompteBancaire(String nom, String prenom, String numeroCompte, int montant) {
		this(nom, prenom, montant);
		this.numeroCompte = numeroCompte;
	}
	
	// Méthode conversion euros vers francs
	public double conversionEurosFrancs() {
		double montant_francs = this.montant * this.CONV_EUR_FRANCS;
		return montant_francs;
	}
	
	// Redéfinition de la méthode toString
	@Override
	public String toString() {
		return String.format("Compte bancaire de %s %s.%nSolde :%n- %d €%n- %.2f F", nom, prenom, montant, this.conversionEurosFrancs());
	}
	
	// Getters et setters 
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	
	
}
