/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author Aayush Kasera
 */
public class AddmemberController implements Initializable {

    @FXML
    private Button save;
    @FXML
    private Button cancel;
    @FXML
    private TextField name;
    @FXML
    private TextField id;
    @FXML
    private TextField mobile;
    @FXML
    private TextField address;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


  

    @FXML
    private void save(ActionEvent event) {
        fxmlload load=new fxmlload();
        load.load("mainpage");
        insert();
    }
      @FXML
    private void save(KeyEvent event) {
        if(event.getCode().equals(KeyCode.ENTER)){
        fxmlload load=new fxmlload();
        load.load("mainpage");
        insert();
    }
    }

    @FXML
    private void cancel(ActionEvent event) {
        fxmlload load=new fxmlload();
        load.load("mainpage");
    }
    private void insert(){
        String namee=name.getText();
        String idd=id.getText();
        String mob=mobile.getText();
        String add=address.getText();
        database db=new database();
        db.addmember(namee,idd,add,mob);
    }
    
}
