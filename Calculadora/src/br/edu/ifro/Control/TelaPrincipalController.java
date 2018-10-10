/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
00000000000000 */
package br.edu.ifro.Control;

import br.edu.ifro.Model.Calculo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author 03731666219
 */
public class TelaPrincipalController implements Initializable {
    
    @FXML
    private TextField txtnum1,txtnum2,txtResultado;
    
   @FXML
   private Button btnSoma,btnSubtracao,btnMultiplicacao,btnDivisao;
   
    @FXML
    private Label label; 
         
    @FXML
    private void Soma(ActionEvent event) {
        Double num1 = Double.parseDouble(txtnum1.getText());
        Double num2 = Double.parseDouble(txtnum2.getText());
        Double resultado = num1 + num2;
        txtResultado.setText(resultado.toString());
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        Calculo calculo = new Calculo();

        calculo.setNum1(Double.parseDouble(txtnum1.getText()));
        calculo.setNum2(Double.parseDouble(txtnum2.getText()));
        calculo.setResultado(Double.parseDouble(txtResultado.getText()));
        calculo.setOperacao("Soma");
       
        em.getTransaction().begin();

        em.persist(calculo);

        em.getTransaction().commit();
    }
    @FXML
     private void Subtração(ActionEvent event) {
        Double num1 = Double.parseDouble(txtnum1.getText());
        Double num2 = Double.parseDouble(txtnum2.getText());
        Double resultado = num1 - num2;
        txtResultado.setText(resultado.toString());
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        Calculo calculo = new Calculo();

        calculo.setNum1(Double.parseDouble(txtnum1.getText()));
        calculo.setNum2(Double.parseDouble(txtnum2.getText()));
        calculo.setResultado(Double.parseDouble(txtResultado.getText()));
        calculo.setOperacao("Subtração");
       
        em.getTransaction().begin();

        em.persist(calculo);

        em.getTransaction().commit();
    }
     @FXML
       private void Multiplicação(ActionEvent event) {
        Double num1 = Double.parseDouble(txtnum1.getText());
        Double num2 = Double.parseDouble(txtnum2.getText());
        Double resultado = num1 * num2;
        txtResultado.setText(resultado.toString());
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        Calculo calculo = new Calculo();

        calculo.setNum1(Double.parseDouble(txtnum1.getText()));
        calculo.setNum2(Double.parseDouble(txtnum2.getText()));
        calculo.setResultado(Double.parseDouble(txtResultado.getText()));
        calculo.setOperacao("Multiplicação");
       
        em.getTransaction().begin();

        em.persist(calculo);

        em.getTransaction().commit();
    }
      @FXML
      private void Divisão(ActionEvent event) {
        Double num1 = Double.parseDouble(txtnum1.getText());
        Double num2 = Double.parseDouble(txtnum2.getText());
        Double resultado = num1 / num2;
        txtResultado.setText(resultado.toString());
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        Calculo calculo = new Calculo();

        calculo.setNum1(Double.parseDouble(txtnum1.getText()));
        calculo.setNum2(Double.parseDouble(txtnum2.getText()));
        calculo.setResultado(Double.parseDouble(txtResultado.getText()));
        calculo.setOperacao("Divisão");
       
        em.getTransaction().begin();

        em.persist(calculo);

        em.getTransaction().commit();
    }
     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
