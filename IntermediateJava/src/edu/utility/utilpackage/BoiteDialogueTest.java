package edu.utility.utilpackage;

import javax.swing.JOptionPane;

public class BoiteDialogueTest {

	public static void main(String[] args) {
		// Afficher une boîte de dialogue
		JOptionPane.showMessageDialog(null, "Voici une boîte de dialogue");
		
		// Boîte de dialogue demandant une valeur 
		String nom = JOptionPane.showInputDialog("Quel est votre nom ?");
		
		String message = String.format("Bonjour %s et bonne journée !", nom);
		JOptionPane.showMessageDialog(null, message);
	}

}
