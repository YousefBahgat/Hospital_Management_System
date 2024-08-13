/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Screen;



/**
 *
 * @author acer
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleradiobuttonadmin(ActionEvent event) throws IOException {
        Parent admin = FXMLLoader.load(getClass().getResource("ADMIN Portal.fxml"));
        Scene scene = new Scene(admin);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show(); 
        
    } 
      @FXML
    private void handleradiobuttonReceptionist(ActionEvent event) throws IOException {
        Parent Reception = FXMLLoader.load(getClass().getResource("Receptionist Portal.fxml"));
        Scene scene = new Scene(Reception);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show(); 
        
    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
