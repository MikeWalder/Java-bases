
public class TableauxMulti {

	public static void main(String[] args) {
		// Déclaration d'un tableau multidimentionnel
		double [][] tabMulti1 = {
				{34.4, -12.09, 34.67, 76, -0.87},
				{23,5, 1.05, -3.8, 45.9, 0.04}
		};
		
		// Parcourir les éléments du tableau
		
		for(int i = 0, nbreRows = tabMulti1.length; i < nbreRows; i++) {
			for(int j = 0, nbreCol = tabMulti1[i].length; j < nbreCol; j++) {
				System.out.print(tabMulti1[i][j] + "   ");
			}
			System.out.println("");
		}

	}

}
