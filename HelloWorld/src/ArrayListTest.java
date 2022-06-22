import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// Déclaration d'un tableau dynamique
		ArrayList<Integer> cars = new ArrayList<Integer>();
		System.out.println("Taille du tableau dynamique : " + cars.size());
		
		cars.add(0, 23500); // ajouter une valeur à l'élément 0 du tableau
		
		cars.add(22500);
		cars.add(6800);
		
		System.out.println("Taille du tableau dynamique : " + cars.size());
		
		// Récupération des éléments du tableau 
		for(int i = 0; i < cars.size(); i++) {
			System.out.println("Element " + i + " : " + cars.get(i) + " €");
		}
		
		// Vérifier si le tableau dynamique est vide
		if(cars.isEmpty()) {
			System.out.println("Le tableau est vide !");
		} else {
			System.out.println("Le tableau contient des données !");
		}
		
		// Vérifier si une valeur est contenue au niveau du tableau 
		int alpha = 22500;
		boolean isContained = cars.contains(alpha);
		System.out.println(isContained);
		if(isContained) {
			System.out.println("Le tableau dynamique contient une valeur égale à " + alpha);
		}
		
		// Récupérer l'index du tableau dynamique à partir de la valeur demandée
		int index = cars.indexOf(alpha);
		System.out.println("La valeur " + alpha + " est contenue dans l'index " + index);
	
		// Formater l'affichage : printf
		System.out.printf("%s à tous\n", "Bonjour");
		System.out.printf("%f est le taux de conversion des %s", 6.55957, "euros en francs\n");
		
	}

}
