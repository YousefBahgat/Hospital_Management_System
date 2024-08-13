/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class Receptionist_dataaController implements Initializable {
     @FXML
     TextField RID,RFN,RSN,RUN,RAGE,RQ,RP,RPN,RJD,RSPH,RG,RCI,RHPD,RMS,RBG,RDPM;
     @FXML
     TextArea  ID1,UN1,PN1,FN1,SN1,AGE1,CI1,G1,Q1,P1,MS1,JD1,BG1;
     @FXML
     TextArea ID2,SPH2,HPD2,SPD2,DPM2,SPM2;
    @FXML
    TextField RID1,RFN1,RSN1,RUN1,RAGE1,RQ1,RP1,RPN1,RJD1,RSPH1,RG1,RCI1,RHPD1,RMS1,RBG1,RDPM1;
     @FXML
    TextField RID2,RFN2,RSN2,RUN2,RAGE2,RQ2,RP2,RPN2,RJD2,RSPH2,RG2,RCI2,RHPD2,RMS2,RBG2,RDPM2;
     @FXML
    TextField RID3,RFN3,RSN3,RUN3,RAGE3,RQ3,RP3,RPN3,RJD3,RSPH3,RG3,RCI3,RHPD3,RMS3,RBG3,RDPM3;
    
    
    ADMIN AD = new ADMIN();
    ADMIN AD1 = new ADMIN();
    ADMIN AD2 = new ADMIN();
    ADMIN AD3 = new ADMIN();
    ADMIN AD4 = new ADMIN();
    
    ArrayList<String> data1 = new ArrayList();
    ArrayList<String> data2 = new ArrayList();
    @FXML
    private void Searchreceptionist(ActionEvent e){
     AD2.RC.setID(RID1.getText());
     AD2.RC.SearchPerson();
     RFN1.setText(AD2.RC.FirstName);
     RSN1.setText(AD2.RC.SecondName);
     RUN1.setText(AD2.RC.getUsernamee());
     RAGE1.setText(AD2.RC.Age + "");
     RQ1.setText(AD2.RC.Qualification);
     RP1.setText(AD2.RC.getPasswordd());
     RPN1.setText(AD2.RC.PhoneNum+ "");
     RJD1.setText(AD2.RC.Joining_date);
     RSPH1.setText(AD2.RC.SA.getSalaryperhour()+"");
     RG1.setText(AD2.RC.Gender);
     RCI1.setText(AD2.RC.City);
     RHPD1.setText(AD2.RC.SA.getHoursperday() + "");
     RMS1.setText(AD2.RC.Marital_Status);
     RBG1.setText(AD2.RC.blood_group);
     RDPM1.setText(AD2.RC.SA.getDayspermonth()+ "");
         
    }
    @FXML
     private void Searchreceptionist2(ActionEvent e){
       AD3.RC.setID(RID2.getText());  
       AD3.RC.SearchPerson();
     RFN2.setText(AD3.RC.FirstName);
     RSN2.setText(AD3.RC.SecondName);
     RUN2.setText(AD3.RC.getUsernamee());
     RAGE2.setText(AD3.RC.Age + "");
     RQ2.setText(AD3.RC.Qualification);
     RP2.setText(AD3.RC.getPasswordd());
     RPN2.setText(AD3.RC.PhoneNum+ "");
     RJD2.setText(AD3.RC.Joining_date);
     RSPH2.setText(AD3.RC.SA.getSalaryperhour()+"");
     RG2.setText(AD3.RC.Gender);
     RCI2.setText(AD3.RC.City);
     RHPD2.setText(AD3.RC.SA.getHoursperday() + "");
     RMS2.setText(AD3.RC.Marital_Status);
     RBG2.setText(AD3.RC.blood_group);
     RDPM2.setText(AD3.RC.SA.getDayspermonth()+ ""); 
        
        
        
    }
    @FXML
     private void Searchreceptionist3(ActionEvent e){
      AD4.RC.setID(RID3.getText());  
      AD4.RC.SearchPerson();
     RFN3.setText(AD4.RC.FirstName);
     RSN3.setText(AD4.RC.SecondName);
     RUN3.setText(AD4.RC.getUsernamee());
     RAGE3.setText(AD4.RC.Age + "");
     RQ3.setText(AD4.RC.Qualification);
     RP3.setText(AD4.RC.getPasswordd());
     RPN3.setText(AD4.RC.PhoneNum+ "");
     RJD3.setText(AD4.RC.Joining_date);
     RSPH3.setText(AD4.RC.SA.getSalaryperhour()+"");
     RG3.setText(AD4.RC.Gender);
     RCI3.setText(AD4.RC.City);
     RHPD3.setText(AD4.RC.SA.getHoursperday() + "");
     RMS3.setText(AD4.RC.Marital_Status);
     RBG3.setText(AD4.RC.blood_group);
     RDPM3.setText(AD4.RC.SA.getDayspermonth()+ ""); 
     }     
        
        
        
    
     
     
    @FXML
    private void Showreceptionists(ActionEvent e)
    {
     
     data1.clear();
     this.AD1.RC.ViewPerson(data1);
     String total = "";
     for(int count=0; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.ID1.setText(total);
     
     total = "";
     for(int count=1; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.UN1.setText(total);
     total = "";
     
     for(int count=2; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.PN1.setText(total);
     total = "";
     
     for(int count=3; count<data1.size();count++){
     total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.FN1.setText(total);
     total = "";
     // ID1,UN1,PN1,FN1,SN1,AGE1,CI1,G1,Q1,P1,MS1,JD1,BG1;
     for(int count=4; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.SN1.setText(total);
     total = "";
     
     for(int count=5; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.AGE1.setText(total);
     total = "";
     
     for(int count=6; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.CI1.setText(total);
     total = "";
     
     for(int count=7; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.G1.setText(total);
     total = "";
     
     for(int count=8; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.Q1.setText(total);
     total = "";
     // ID1,UN1,PN1,FN1,SN1,AGE1,CI1,G1,Q1,P1,MS1,JD1,BG1;
       for(int count=9; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.P1.setText(total);
     total = "";
     
     for(int count=10; count<data1.size();count++){
     total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.MS1.setText(total);
     total = "";
     
      for(int count=11; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.JD1.setText(total);
     total = "";
     for(int count=12; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+12;
     }
     this.BG1.setText(total);
     total = "";
    }
    
    @FXML
    private void ShowSalary(ActionEvent e)
    {
    // ID2,SPH2,HPD2,SPD2,DPM2,SPM2;
     data2.clear();
     this.AD1.RC.ViewSalary(data2);
     String total = "";
     for(int count=0; count<data2.size();count++){
      total+= data2.get(count)+"\n";
      count= count+5;
     }
     this.ID2.setText(total);
     
     total = "";
     for(int count=1; count<data2.size();count++){
      total+= data2.get(count)+"\n";
      count= count+5;
     }
     this.SPH2.setText(total);
     total = "";
     
     for(int count=2; count<data2.size();count++){
      total+= data2.get(count)+"\n";
      count= count+5;
     }
     this.HPD2.setText(total);
     total = "";
     
     for(int count=3; count<data2.size();count++){
     total+= data2.get(count)+"\n";
      count= count+5;
     }
     this.SPD2.setText(total);
     total = "";

     for(int count=4; count<data2.size();count++){
      total+= data2.get(count)+"\n";
      count= count+5;
     }
     this.DPM2.setText(total);
     total = "";
     
     for(int count=5; count<data2.size();count++){
      total+= data2.get(count)+"\n";
      count= count+5;
     }
     this.SPM2.setText(total);
     total = "";
           
    }
    
    
    @FXML
    private void addreceptionist(ActionEvent e)
    {
      
     // RID,RFN,RSN,RUN,RAGE,RQ,RP,RPN,RJD,RSPH,RG,RCI,RHPD,RMS,RBG,RDPM;  
        
    try{    
    AD.RC.ID = RID.getText();
    AD.RC.FirstName = RFN.getText();
    AD.RC.SecondName= RSN.getText();
    AD.RC.setUsernamee(RUN.getText());
    AD.RC.Age=Integer.parseInt(RAGE.getText()) ;
    AD.RC.Qualification = RQ.getText();
    AD.RC.setPasswordd(RP.getText());
    AD.RC.PhoneNum =Integer.parseInt(RPN.getText());
    AD.RC.Joining_date = RJD.getText();
    AD.RC.SA.setSalaryperhour(Integer.parseInt(RSPH.getText()));
    AD.RC.Gender = RG.getText();
    AD.RC.City = RCI.getText();
    AD.RC.SA.setHoursperday(Integer.parseInt(RHPD.getText()));
    AD.RC.Marital_Status = RMS.getText();
    AD.RC.blood_group = RBG.getText();
    AD.RC.SA.setDayspermonth(Integer.parseInt(RDPM.getText()));
    AD.RC.AddPerson();
    this.Showreceptionists(e);
    this.ShowSalary(e);
     RID.setText("");
      RFN.setText("");
      RSN.setText("");
      RUN.setText("");
      RAGE.setText("");
      RQ.setText("");
      RP.setText("");
      RPN.setText("");
      RJD.setText("");
      RSPH.setText("");
      RG.setText("");
      RCI.setText("");
      RHPD.setText("");
      RMS.setText("");
      RBG.setText("");
      RDPM.setText("");
    }
    catch(Exception e1){
    JOptionPane.showMessageDialog(null,"there is a problem, please try again"); 
    }
    
    }
    @FXML
    private void updatereceptionist(ActionEvent e){
    
    try{
    AD3.RC.ID = RID2.getText();
    AD3.RC.FirstName = RFN2.getText();
    AD3.RC.SecondName= RSN2.getText();
    AD3.RC.setUsernamee(RUN2.getText());
    AD3.RC.Age=Integer.parseInt(RAGE2.getText()) ;
    AD3.RC.Qualification = RQ2.getText();
    AD3.RC.setPasswordd(RP2.getText());
    AD3.RC.PhoneNum =Integer.parseInt(RPN2.getText());
    AD3.RC.Joining_date = RJD2.getText();
    AD3.RC.SA.setSalaryperhour(Integer.parseInt(RSPH2.getText()));
    AD3.RC.Gender = RG2.getText();
    AD3.RC.City = RCI2.getText();
    AD3.RC.SA.setHoursperday(Integer.parseInt(RHPD2.getText()));
    AD3.RC.Marital_Status = RMS2.getText();
    AD3.RC.blood_group = RBG2.getText();
    AD3.RC.SA.setDayspermonth(Integer.parseInt(RDPM2.getText()));
    AD3.RC.UpdatePerson();
    this.Showreceptionists(e);
    this.ShowSalary(e);
    
    }
     catch(Exception e1){
    JOptionPane.showMessageDialog(null,"there is a problem, please try again"); 
    }
    }
    @FXML
    private void deleteReceptionist(ActionEvent e){
      try{
      AD4.RC.ID =RID3.getText();   
      AD4.RC.DeletePerson();
      RID3.setText("");
      RFN3.setText("");
      RSN3.setText("");
      RUN3.setText("");
      RAGE3.setText("");
      RQ3.setText("");
      RP3.setText("");
      RPN3.setText("");
      RJD3.setText("");
      RSPH3.setText("");
      RG3.setText("");
      RCI3.setText("");
      RHPD3.setText("");
      RMS3.setText("");
      RBG3.setText("");
      RDPM3.setText("");
      this.Showreceptionists(e);
      this.ShowSalary(e);}
       catch(Exception e1){
    JOptionPane.showMessageDialog(null,"there is a problem, please try again"); 
    }
      
      
    }
    
    
    
    
    
    
     @FXML
    private void returnhomee(MouseEvent event)throws IOException {
        Parent start = FXMLLoader.load(getClass().getResource("Admindata.fxml"));
        Scene scene = new Scene(start);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    @FXML
    private void Logoutt(MouseEvent event)throws IOException {
        Parent start = FXMLLoader.load(getClass().getResource("ADMIN Portal.fxml"));
        Scene scene = new Scene(start);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
