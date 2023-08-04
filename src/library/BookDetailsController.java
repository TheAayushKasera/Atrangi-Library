/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;


import java.net.URL;
import java.sql.*;
import java.sql.DriverManager;
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
public class BookDetailsController implements Initializable {

    @FXML
    private Label logo;
    @FXML
    private TableColumn<model,String> bookID;
    @FXML
    private TableColumn<model,String> bookname;
    @FXML
    private TableColumn<model,String> publisher;
    @FXML
    private TableColumn<model,String> author;
    @FXML
    private TableView<model> table;

    /**
     * Initializes the controller class.
     */
     ObservableList<model> oblist=FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://sql201.epizy.com:3306/epiz_27241891_Library","epiz_27241891","9549Atrangi");
            ResultSet rs=con.createStatement().executeQuery("SELECT * FROM BOOKS");
            while(rs.next()){
                oblist.add(new model(rs.getString("id"),rs.getString("name"),rs.getString("publisher"),rs.getString("author")));  
            }
            // TODO
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MemberDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        bookID.setCellValueFactory(new PropertyValueFactory<>("id"));
        bookname.setCellValueFactory(new PropertyValueFactory<>("name"));
        author.setCellValueFactory(new PropertyValueFactory<>("address"));
        publisher.setCellValueFactory(new PropertyValueFactory<>("mobile"));
        
        table.setItems(oblist);
    }    
     
    
}
