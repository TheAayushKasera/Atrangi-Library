/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aayush Kasera
 */
public class MainpageController implements Initializable {

    @FXML
    private Label atlogo;
    @FXML
    private TextField bookID;
    @FXML
    private TextField MemberID;
    @FXML
    private Button addmember;
    @FXML
    private Button memberdetails;
    @FXML
    private Button bookdetails;
    @FXML
    private Button issue;
    @FXML
    private Button allbooks;
    @FXML
    private Button allmembers;
    @FXML
    private Button issuedbooks;
    @FXML
    private Button Addbook;
    @FXML
    private TextField bookID1;
    @FXML
    private TextField MemberID1;
    @FXML
    private Button reissue;
    @FXML
    private TextField bookID2;
    @FXML
    private TextField MemberID2;
    @FXML
    private Button giveback;
    @FXML
    private Tab issuetb;
    @FXML
    private Tab reissuetb;
    @FXML
    private Tab givebacktb;
    @FXML
    private Tab abouttb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    @FXML
    private void addbooks(ActionEvent event){
        fxmlload load=new fxmlload();
        load.load("addbooks");
             
    }

    @FXML
    private void addmembers(ActionEvent event) {
    fxmlload load=new fxmlload();
     load.load("addmembers");

    }

    @FXML
    private void memberdetails(ActionEvent event) {
        fxmlload load= new fxmlload();
        load.load("memberdetails");
    }

    @FXML
    private void bookdetails(ActionEvent event) {
        fxmlload load= new fxmlload();
        load.load("bookdetails");
    }

    @FXML
    private void allbooks(ActionEvent event) {
        fxmlload load= new fxmlload();
        load.load("allbooks");
    }

    @FXML
    private void allmembers(ActionEvent event) {
        fxmlload load= new fxmlload();
        load.load("allmembers");
    }

    @FXML
    private void issuedbooks(ActionEvent event) {
        fxmlload load= new fxmlload();
        load.load("issuedbooks");
    }

    @FXML
    private void colrchange(Event event) {
        

        }

    @FXML
    private void issue(ActionEvent event) {
        database db=new database();
        String bid=bookID.getText();
        String mid=MemberID.getText();
        db.issue(bid,mid);
        fxmlload load= new fxmlload();
        load.load("fxml");
        bookID.setText(null);
        MemberID.setText(null);
    }
  

    

    
}

    
