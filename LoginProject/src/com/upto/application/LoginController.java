package com.upto.application;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class LoginController {
	
	@FXML
	private BorderPane page;
	
	Toto monToto;
//	type-nom de la variable

	
	void nommermonToto(){
//	void = déclare - nommermonToto = initialise
//	fonction pour ajouter des données à l'objet Toto
		
		monToto = new Toto();
//		permet de créer un mémoire pour stocker monToto
		
		System.out.println("Mon toto est initialisé");
//		Afficher dans la console
		
	}
}
