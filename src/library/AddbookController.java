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
public class AddbookController implements Initializable {

    @FXML
    private Button save;
    @FXML
    private Button cancel;
    @FXML
    private TextField id;
    @FXML
    private TextField title;
    @FXML
    private TextField publish;
    @FXML
    private TextField author;

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
    private void cancel(ActionEvent event) {
        fxmlload load=new fxmlload();
        load.load("mainpage");
    }

    @FXML
    private void save(KeyEvent event) {
        if(event.getCode().equals(KeyCode.ENTER)){
            fxmlload load=new fxmlload();
            load.load("mainpage");
            insert();
        }
    }
    private void insert(){
        String namee=title.getText();
        String idd=id.getText();
        String pub=publish.getText();
        String add=author.getText();
        database db=new database();
        db.addbook(namee,idd,add,pub);
    }
    
}
