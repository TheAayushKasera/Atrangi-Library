/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Aayush Kasera
 */
public class LoginController implements Initializable {
    String user="Aayushkasera";
    String pass="9549Atrangi";
    
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Button loginbutton;
    @FXML
    private Button forgot;
    @FXML
    private BorderPane loginpage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Login");
    }    

    @FXML
    private void login(ActionEvent event) throws IOException {
       if(event.getSource()==loginbutton){
                       System.out.println(password.getText());

        if(username.getText().equals(user) && password.getText().equals(pass))
        {
            loginbutton.setText("Successfully");
             fxmlload load=new fxmlload();
            load.load("mainpage");
            
        }
        
       }
}}
