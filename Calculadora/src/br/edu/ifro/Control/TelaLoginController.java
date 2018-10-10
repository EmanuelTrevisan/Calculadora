/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.Control;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.awt.event.FocusEvent;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author 03194090232
 */
public class TelaLoginController implements Initializable {

    @FXML
    private JFXButton btnLogin;   
    @FXML
    private JFXTextField txtLogin;   
    @FXML
    private JFXPasswordField txtSenha;
    @FXML
    private Label lblUsuarioInvalido; /*
    @FXML 
    private JFXButton btncadastrar; */
    
    @FXML
    private void fazerLogin(ActionEvent event) {
       
        if ((txtLogin.getText().equals("admin")) && (txtSenha.getText().equals("admin")))  {            
                try {
                        FXMLLoader fxmlLoader = new FXMLLoader();
                        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/View/TelaPrincipal.fxml"));
                        Scene scene = new Scene(fxmlLoader.load());
                        Stage stage = new Stage();
                        stage.setTitle("Tela Principal");
                        stage.setScene(scene);
                        stage.show();  
                        fechar();
                                                 
                  } catch (IOException e) {
             }
        }
       else{
            lblUsuarioInvalido.setVisible(true);
           // if(FocusEvent(txtLogin)){
                  //          lblUsuarioInvalido.setVisible(false); 

            } 
              
           }
  
 
    private void fechar(){
         Stage stage = (Stage) btnLogin.getScene().getWindow();
                stage.close();
               
}
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }       
}
