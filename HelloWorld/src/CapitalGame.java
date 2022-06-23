import java.util.Random;
import java.util.Scanner;

public class CapitalGame {

	public static void main(String[] args) {
		// Demander la capitale d'un pays
		
		String datas[][] = {
				{"Allemagne", "Berlin"},
				{"Japon", "Pékin"},
				{"Russie", "Moscou"},
				{"Turquie", "Ankara"},
				{"Bulgarie", "Sofia"},
				{"Belgique", "Bruxelles"},
				{"Chine", "Pékin"},
				{"Grèce", "Athènes"},
				{"Italie", "Rome"},
				{"Iran", "Téhéran"}
		};
		
		int score = 0;
		final int NBRE_QUESTIONS = datas.length;
		
		Scanner clavier = new Scanner(System.in);
		
		for(int i = 0; i < NBRE_QUESTIONS; i++) {
			Random rand = new Random();
			int index = rand.nextInt(NBRE_QUESTIONS);
			
			String pays = datas[index][0];
			String capitale = datas[index][1];
			
			String rep = "";
			
			System.out.printf("Quelle est la capitale de ce pays : %s ?%n", pays);
			rep = clavier.nextLine();
			
			if(capitale.equals(rep)) {
				System.out.println("Bonne réponse !");
				++score;
				System.out.printf("Votre score : %d/%d%n%n", score, NBRE_QUESTIONS);
			} else {
				System.out.println("La réponse est : " + capitale);
			}	
		}
		
		afficherScoreGlobal(score);
		
	}

	static void afficherScoreGlobal(int scoring) {
		System.out.println("****************");
		System.out.printf("SCORE GENERAL : %d/10%n", scoring);
		if(scoring <= 4) {
			System.out.printf("Niveau faible !");
		} else if(scoring > 4 && scoring <= 6) {
			System.out.printf("Niveau moyen");
		} else if(scoring > 6 && scoring <= 9) {
			System.out.printf("Bon niveau !");
		} else if(scoring == 10) {
			System.out.printf("Niveau parfait ! ");
		}
	}
	
}
