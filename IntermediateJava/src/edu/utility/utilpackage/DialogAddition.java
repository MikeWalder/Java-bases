package edu.utility.utilpackage;

import javax.swing.JOptionPane;

public class DialogAddition {

	public static void main(String[] args) {
		// Demander deux nombres en boîte de dialogue puis afficher le résultat
		JOptionPane.showMessageDialog(null, "ADDITION DE DEUX NOMBRES");
		
		String strNbre1 = JOptionPane.showInputDialog("Entrez le premier nombre : ");
		String strNbre2 = JOptionPane.showInputDialog("Entrez le second nombre : ");
		
		double nbre1 = Double.parseDouble(strNbre1);
		double nbre2 = Double.parseDouble(strNbre2);
		
		double res = nbre1 + nbre2;
		
		String message = String.format("%.2f + %.2f = %.2f", nbre1, nbre2, res);
		
		JOptionPane.showMessageDialog(null, message);

	}

}
