package edu.utility.utilpackage;

public class Tasks {
	public String task;
	public String description;
	public boolean completed = false;
	
	// Constructeur
	// Mettre des paramètres explicites
	public Tasks(String task, String description) {
		this.task = task;
		this.description = description;
	}
	
	public void completed() {
		completed = true;
	}
	public void renderTask() {
		System.out.printf("Tâche : %s%nDescription : %s%n%n", task, description);
	}
}
