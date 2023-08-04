package library;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Aayush Kasera
 */
public class IssuedbooksController implements Initializable {

    @FXML
    private Label logo;
    @FXML
    private TableView<model> table;
    @FXML
    private TableColumn<model,String> bookname;
    @FXML
    private TableColumn<model,String> membername;

    ObservableList<model> oblist=FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://sql201.epizy.com:3306/epiz_27241891_Library","epiz_27241891","9549Atrangi");
            ResultSet rs=con.createStatement().executeQuery("SELECT  books.name,members.name FROM books,members where (members.issue is not null and members.issue=books.id ) and (books.issue is not null) ");
            while(rs.next()){
                oblist.add(new model(rs.getString("books.name"),rs.getString("members.name")));  
            }
            // TODO
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MemberDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        bookname.setCellValueFactory(new PropertyValueFactory<>("id"));
        membername.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        table.setItems(oblist);
    }    
}
