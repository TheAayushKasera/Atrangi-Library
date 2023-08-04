/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Aayush Kasera
 */
public class fxmlload {
    
    Parent root = null;
    public static Stage primaryStage=new Stage();
    public static Stage secondaryStage=new Stage();
    public static Scene scene;
    public void load(String filename){
        switch(filename){
            case "mainpage" -> {
                secondaryStage.close();
                
                primaryStage.close();
                try {
                    root = FXMLLoader.load(getClass().getResource("mainpage.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(MainpageController.class.getName()).log(Level.SEVERE, null, ex);
                }
                    scene = new Scene(root);

                primaryStage.setTitle("Welcome to library");
                primaryStage.setScene(scene);
                primaryStage.show();
                primaryStage.setResizable(false);

            }
            case "addbooks" -> {
                try {
                    root = FXMLLoader.load(getClass().getResource("addbook.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(AddbookController.class.getName()).log(Level.SEVERE, null, ex);
                }
                    scene = new Scene(root);

                secondaryStage.setTitle("Add Books");
                secondaryStage.setScene(scene);
                secondaryStage.show();
                secondaryStage.setResizable(false);

            }
                        case "addmembers" -> {
                            try {
                                root = FXMLLoader.load(getClass().getResource("addmember.fxml"));
                            } catch (IOException ex) {
                                Logger.getLogger(AddmemberController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                scene = new Scene(root);

                            secondaryStage.setTitle("Add members");
                            secondaryStage.setScene(scene);
                            secondaryStage.show();
                            secondaryStage.setResizable(false);
            }
                        case "login" ->  {
                            try {
                                System.out.println("Login");
                                root = FXMLLoader.load(getClass().getResource("login.fxml"));
                                System.out.println("fxmlload");
                            } catch (IOException ex) {
                                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("exception");
                                scene = new Scene(root);
System.out.println("scene");
                            primaryStage.setTitle("Library Login");
                            System.out.println("title");
                            primaryStage.setScene(scene);
                            System.out.println("setscene");
                            primaryStage.show();
                            System.out.println("show");
                            primaryStage.setResizable(false);
                            System.out.println("resixe");
            }
                        case "memberdetails" -> {
                            try {
                                root = FXMLLoader.load(getClass().getResource("MemberDetails.fxml"));
                            } catch (IOException ex) {
                                Logger.getLogger(MemberDetailsController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                scene = new Scene(root);

                            secondaryStage.setTitle("Member Details");
                            secondaryStage.setScene(scene);
                            secondaryStage.show();
                            secondaryStage.setResizable(false);
            }
                        case "bookdetails" -> {
                            try {
                                root = FXMLLoader.load(getClass().getResource("bookdetails.fxml"));
                            } catch (IOException ex) {
                                Logger.getLogger(MemberDetailsController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                scene = new Scene(root);

                            secondaryStage.setTitle("Book Details");
                            secondaryStage.setScene(scene);
                            secondaryStage.show();
                            secondaryStage.setResizable(false);
            }
                        case "issuedbooks" -> {
                            try {
                                root = FXMLLoader.load(getClass().getResource("issuedbooks.fxml"));
                            } catch (IOException ex) {
                                Logger.getLogger(MemberDetailsController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                scene = new Scene(root);

                            secondaryStage.setTitle("Issued Books");
                            secondaryStage.setScene(scene);
                            secondaryStage.show();
                            secondaryStage.setResizable(false);
            }
                        case "allbooks" -> {
                            try {
                                root = FXMLLoader.load(getClass().getResource("allbooks.fxml"));
                            } catch (IOException ex) {
                                Logger.getLogger(MemberDetailsController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                scene = new Scene(root);

                            secondaryStage.setTitle("All books");
                            secondaryStage.setScene(scene);
                            secondaryStage.show();
                            secondaryStage.setResizable(false);
            }
                        case "allmembers" -> {
                            try {
                                root = FXMLLoader.load(getClass().getResource("allmembers.fxml"));
                            } catch (IOException ex) {
                                Logger.getLogger(MemberDetailsController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                scene = new Scene(root);

                            secondaryStage.setTitle("All members");
                            secondaryStage.setScene(scene);
                            secondaryStage.show();
                            secondaryStage.setResizable(false);
            }
                        case "fxml" -> {
                            try {
                                root = FXMLLoader.load(getClass().getResource("fxml.fxml"));
                            } catch (IOException ex) {
                                Logger.getLogger(MemberDetailsController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                scene = new Scene(root);

                            secondaryStage.setTitle("Atrangi Library");
                            secondaryStage.setScene(scene);
                            secondaryStage.show();
                            secondaryStage.setResizable(false);
            }


        }
    }
}
