package progRemi;

import java.util.ArrayList;
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;

public class MainClass {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	sc = new Scanner(System.in);
	
//	Création d'un tableau pour enregistrer toutes les notes que l'on va entrer
//	C'est un tableau croisé dynamique car il va s'agrandir automatiquement en ajoutant des données
	ArrayList<Double> TableauNotes = new ArrayList<Double>();
	
	double NoteMax = 0;
	double NoteMin = 20;

	System.out.println("Combien de notes voulez-vous entrer?");
//	On créé la variable de type "entier" qu'on nomme "qt" qui va récupérer la donnée utilisateur
	int qt = sc.nextInt();
	
//	Création d'une boucle FOR pour demander une note en fonction du nombre qu'on veut en entrer
	for (int i = 0; i < qt; i++) {
		
//		Algo qui permet d'afficher quelque chose dans la console:
		System.out.println("Veuillez saisir une note: ");
		
//		On créé la variable qui va récupérer la saisie utilisateur
		Double nb = sc.nextDouble();
		
//		On insert la saisie utilisateur dans le tableau "notes"
		TableauNotes.add(nb);
		
			if(NoteMin > TableauNotes.get(i)){
				NoteMin = TableauNotes.get(i);	
			}
		
			if (NoteMax < TableauNotes.get(i)) {
				NoteMax = TableauNotes.get(i);
			}
	}
//	On affiche une string avec la saisie utilisateur
	System.out.println("Vous avez saisi: " + TableauNotes);
	
		System.out.println("La note la plus basse est: " + NoteMin);
		System.out.println("La note la plus haute est: " + NoteMax);

	}

}
