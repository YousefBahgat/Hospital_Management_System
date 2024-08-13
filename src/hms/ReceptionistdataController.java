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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class ReceptionistdataController implements Initializable {
    private String Name;
    private String password;
    Receptionist z = new Receptionist();

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    
    
    
    
    
    
    public void getlogindata(String name, String pass ){
        this.Name = name;
        this.password = pass;
    }
    @FXML
    private void  Profile(ActionEvent event)throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Profile.fxml"));
        Parent Receptionistdata = Loader.load();
        Scene scene = new Scene(Receptionistdata);
        ProfileController controller = Loader.getController();
        controller.logindata(this.Name,this.password);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();  
     
    }
     @FXML
    private void  appointments(ActionEvent event)throws IOException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("appointments.fxml"));
        Parent start = Loader.load();
        Scene scene = new Scene(start);
        AppointmentsController controller = Loader.getController();
        controller.logindata(this.Name,this.password);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();  
     
    }
    public void dataRecovery(String u , String p){
    this.Name = u;
    this.password  = p;
    }
     @FXML
    private void Logout(ActionEvent event)throws IOException {
        Parent start = FXMLLoader.load(getClass().getResource("Receptionist Portal.fxml"));
        Scene scene = new Scene(start);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
     @FXML
    private void IndoorPatients(ActionEvent event)throws IOException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("patient_details1.fxml"));
        Parent start = Loader.load();
        Scene scene = new Scene(start);
        Patient_details1Controller controller = Loader.getController();
        controller.dataRecoveryy(this.Name,this.password);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    @FXML 
    private void changningPassword(ActionEvent event)throws IOException {
     String npass = new  String();
     String cpass = new String();
    npass = JOptionPane.showInputDialog(null,"Please Enter your new password:");
    cpass = JOptionPane.showInputDialog(null,"Confirm your password:");
    if(cpass.equals(npass)){
     this.z.setPasswordd(npass);
     this.z.setUsernamee(this.Name);
     this.z.changepass();
     JOptionPane.showMessageDialog(null,"Successfully Updated");
     this.Logout(event);
    }
    else {
    JOptionPane.showMessageDialog(null,"password doesn't match,try again");  
    } 
    }
    
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
