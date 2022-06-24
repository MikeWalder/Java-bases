package edu.utility.utilpackage;

public class TasksDriver {

	public static void main(String[] args) {
		Tasks tache1 = new Tasks("Apprendre Java", "Description1");
		Tasks tache2 = new Tasks("S'inscrire sur des plateformes de dev", "Description2");
		Tasks tache3 = new Tasks("Avancer sur le projet Vue et TensorFlow", "Mettre des étapes claires au projet");
		
		//System.out.println(tache1.description);
		//System.out.println(tache2.description);
		//System.out.println(tache3.description);
		
		tache2.renderTask();
		tache1.renderTask();
		
		tache3.completed();
		tache3.renderTask();
	}

}
