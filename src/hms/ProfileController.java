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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author acer
 */
  
public class ProfileController implements Initializable {
    private String namee;
    private String passwordd;
    @FXML
    TextField RID1,RFN1,RSN1,RUN1,RAGE1,RQ1,RP1,RPN1,RJD1,RG1,RCI1,RMS1,RBG1;
    ADMIN AN = new ADMIN();
    
    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public String getPasswordd() {
        return passwordd;
    }

    public void setPasswordd(String passwordd) {
        this.passwordd = passwordd;
    }
    
    public void logindata(String name, String pass){
     this.namee = name;
     this.passwordd = pass;
     this.RUN1.setText(namee);
     
    }
    
    @FXML
    public void viewProfile(ActionEvent e){
     AN.RC.setUsernamee(RUN1.getText());
     AN.RC.viewProfile();
     RFN1.setText(AN.RC.FirstName);
     RSN1.setText(AN.RC.SecondName);
     RID1.setText(AN.RC.ID);
     RAGE1.setText(AN.RC.Age + "");
     RQ1.setText(AN.RC.Qualification);
     RP1.setText(AN.RC.getPasswordd());
     RPN1.setText(AN.RC.PhoneNum+ "");
     RJD1.setText(AN.RC.Joining_date);
     RG1.setText(AN.RC.Gender);
     RCI1.setText(AN.RC.City);
     RMS1.setText(AN.RC.Marital_Status);
     RBG1.setText(AN.RC.blood_group);  
    } 
     @FXML
    private void returnhome(MouseEvent event)throws IOException {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("receptionistdata.fxml"));
        Parent start = Loader.load();
        Scene scene = new Scene(start);
        ReceptionistdataController controller = Loader.getController();
        controller.dataRecovery(this.namee,this.passwordd);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
        
    }
    @FXML
    private void Logout(MouseEvent event)throws IOException {
        Parent start = FXMLLoader.load(getClass().getResource("Receptionist Portal.fxml"));
        Scene scene = new Scene(start);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }  
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
