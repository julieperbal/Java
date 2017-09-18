package com.upto.application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class LoginController {

    @FXML
    private BorderPane page;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtPwd;

    @FXML
    private Button btncancel;

    @FXML
    private Button btnSubmit;
    
    @FXML
    private Label errorMessage;
	
	public LoginController(){}
		
		@FXML
		private void initialize(){
			
			btnSubmit.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event){
					
					String login = txtLogin.getText();
					
					String motPasse = txtPwd.getText();
					
					if(txtLogin.getText().equals("") || txtPwd.getText().equals("") ){
						
						errorMessage.setVisible(true);
						errorMessage.setText("Veuillez saisir un login et mot de passe");
					}
					else {
						System.out.println("Login = "+login+", mot de passe: "+motPasse);
					}
				}
			});
			
			btncancel.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event){
					
					txtLogin.setText("");
					
					txtPwd.setText("");
					
				}
			});
}
	
	
	
	
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
