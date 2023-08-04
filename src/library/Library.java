/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Aayush Kasera
 */
public class Library extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        System.out.println("start");
       fxmlload load=new fxmlload();
       load.load("login");
       
       
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
