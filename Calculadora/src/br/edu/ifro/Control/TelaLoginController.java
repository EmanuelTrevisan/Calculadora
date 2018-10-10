/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.Control;

import br.edu.ifro.Model.Login;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.awt.event.FocusEvent;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
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
    private Label lblUsuarioInvalido; /*
    @FXML 
    private JFXButton btncadastrar; */
    
    @FXML
    private void fazerLogin(ActionEvent event) throws IOException {
       
        

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hotel");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT senha FROM Login as senha WHERE senha.cpf = :cpf");

        query.setParameter("cpf", txtLogin.getText());

        List<Login> l = query.getResultList();

        if (!l.isEmpty()) {

            Login login = l.get(0);
            String senha = txtSenha.getText();
            
            if (login.getSenha().equals(senha)) {
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/MenuPrincipal.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setTitle("Menu Principal");
                stage.setScene(scene);
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
            }
            else{
                JOptionPane.showMessageDialog(null, "Senha incorreta");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuário incorreto");
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
