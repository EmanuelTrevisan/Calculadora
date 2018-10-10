/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
00000000000000 */
package br.edu.ifro.Control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


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
    }
    @FXML
     private void Subtração(ActionEvent event) {
        Double num1 = Double.parseDouble(txtnum1.getText());
        Double num2 = Double.parseDouble(txtnum2.getText());
        Double resultado = num1 - num2;
        txtResultado.setText(resultado.toString());
    }
     @FXML
       private void Multiplicação(ActionEvent event) {
        Double num1 = Double.parseDouble(txtnum1.getText());
        Double num2 = Double.parseDouble(txtnum2.getText());
        Double resultado = num1 * num2;
        txtResultado.setText(resultado.toString());
    }
      @FXML
      private void Divisão(ActionEvent event) {
        Double num1 = Double.parseDouble(txtnum1.getText());
        Double num2 = Double.parseDouble(txtnum2.getText());
        Double resultado = num1 / num2;
        txtResultado.setText(resultado.toString());
    }
     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
