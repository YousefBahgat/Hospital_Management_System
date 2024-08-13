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
public class Nurse_detailsController implements Initializable {
    @FXML
     TextField NID,NFN,NSN,NAGE,NQ,NPN,NJD,NSPH,NG,NCI,NHPD,NMS,NBG,NDPM;
    @FXML
     TextArea  ID1,PN1,FN1,SN1,AGE1,CI1,G1,Q1,MS1,JD1,BG1;
    @FXML
     TextArea ID2,SPH2,HPD2,SPD2,DPM2,SPM2;
    @FXML
    TextField NID1,NFN1,NSN1,NAGE1,NQ1,NPN1,NJD1,NSPH1,NG1,NCI1,NHPD1,NMS1,NBG1,NDPM1;
     @FXML
    TextField NID2,NFN2,NSN2,NAGE2,NQ2,NPN2,NJD2,NSPH2,NG2,NCI2,NHPD2,NMS2,NBG2,NDPM2;
     @FXML
    TextField NID3,NFN3,NSN3,NAGE3,NQ3,NPN3,NJD3,NSPH3,NG3,NCI3,NHPD3,NMS3,NBG3,NDPM3;
    
    
    ADMIN AD = new ADMIN();
    ADMIN AD1 = new ADMIN();
    ADMIN AD2 = new ADMIN();
    ADMIN AD3 = new ADMIN();
    ADMIN AD4 = new ADMIN();
    
    ArrayList<String> data1 = new ArrayList();
    ArrayList<String> data2 = new ArrayList();
    @FXML
    private void SearchNurse(ActionEvent e){
     AD2.NE.setID(NID1.getText());
     AD2.NE.SearchPerson();
     NFN1.setText(AD2.NE.FirstName);
     NSN1.setText(AD2.NE.SecondName);
     NAGE1.setText(AD2.NE.Age + "");
     NQ1.setText(AD2.NE.Qualification);
     NPN1.setText(AD2.NE.PhoneNum+ "");
     NJD1.setText(AD2.NE.Joining_date);
     NSPH1.setText(AD2.NE.SA.getSalaryperhour()+"");
     NG1.setText(AD2.NE.Gender);
     NCI1.setText(AD2.NE.City);
     NHPD1.setText(AD2.NE.SA.getHoursperday() + "");
     NMS1.setText(AD2.NE.Marital_Status);
     NBG1.setText(AD2.NE.blood_group);
     NDPM1.setText(AD2.NE.SA.getDayspermonth()+ "");
         
    }
    @FXML
     private void SearchNurse2(ActionEvent e){
       AD3.NE.setID(NID2.getText());  
       AD3.NE.SearchPerson();
     NFN2.setText(AD3.NE.FirstName);
     NSN2.setText(AD3.NE.SecondName);
     NAGE2.setText(AD3.NE.Age + "");
     NQ2.setText(AD3.NE.Qualification);
     NPN2.setText(AD3.NE.PhoneNum+ "");
     NJD2.setText(AD3.NE.Joining_date);
     NSPH2.setText(AD3.NE.SA.getSalaryperhour()+"");
     NG2.setText(AD3.NE.Gender);
     NCI2.setText(AD3.NE.City);
     NHPD2.setText(AD3.NE.SA.getHoursperday() + "");
     NMS2.setText(AD3.NE.Marital_Status);
     NBG2.setText(AD3.NE.blood_group);
     NDPM2.setText(AD3.NE.SA.getDayspermonth()+ ""); 
        
        
        
    }
    @FXML
     private void SearchNurse3(ActionEvent e){
      AD4.NE.setID(NID3.getText());  
      AD4.NE.SearchPerson();
     NFN3.setText(AD4.NE.FirstName);
     NSN3.setText(AD4.NE.SecondName);
     NAGE3.setText(AD4.NE.Age + "");
     NQ3.setText(AD4.NE.Qualification);
     NPN3.setText(AD4.NE.PhoneNum+ "");
     NJD3.setText(AD4.NE.Joining_date);
     NSPH3.setText(AD4.NE.SA.getSalaryperhour()+"");
     NG3.setText(AD4.NE.Gender);
     NCI3.setText(AD4.NE.City);
     NHPD3.setText(AD4.NE.SA.getHoursperday() + "");
     NMS3.setText(AD4.NE.Marital_Status);
     NBG3.setText(AD4.NE.blood_group);
     NDPM3.setText(AD4.NE.SA.getDayspermonth()+ ""); 
     }     
        
        
        
    
     
     
    @FXML
    private void ShowNurse(ActionEvent e)
    {
     
     data1.clear();
     this.AD1.NE.ViewPerson(data1);
     String total = "";
     for(int count=0; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+10;
     }
     this.ID1.setText(total);
     
     total = "";
     for(int count=1; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+10;
     }
     this.PN1.setText(total);
     total = "";
     
     for(int count=2; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+10;
     }
     this.FN1.setText(total);
     total = "";
     
     for(int count=3; count<data1.size();count++){
     total+= data1.get(count)+"\n";
      count= count+10;
     }
     this.SN1.setText(total);
     total = "";
     // ID1,UN1,PN1,FN1,SN1,AGE1,CI1,G1,Q1,P1,MS1,JD1,BG1;
     for(int count=4; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+10;
     }
     this.AGE1.setText(total);
     total = "";
     
     for(int count=5; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+10;
     }
     this.CI1.setText(total);
     total = "";
     
     for(int count=6; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+10;
     }
     this.G1.setText(total);
     total = "";
     
     for(int count=7; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+10;
     }
     this.Q1.setText(total);
     total = "";
     
     for(int count=8; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+10;
     }
     this.MS1.setText(total);
     total = "";
     // ID1,UN1,PN1,FN1,SN1,AGE1,CI1,G1,Q1,P1,MS1,JD1,BG1;
       for(int count=9; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+10;
     }
     this.JD1.setText(total);
     total = "";
     
     for(int count=10; count<data1.size();count++){
     total+= data1.get(count)+"\n";
      count= count+10;
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
    private void addNurse(ActionEvent e)
    {
      
    //NID,NFN,NSN,NAGE,NQ,NPN,NJD,NSPH,NG,NCI,NHPD,NMS,NBG,NDPM;
        
    try{    
    AD.NE.ID = NID.getText();
    AD.NE.FirstName =NFN.getText();
    AD.NE.SecondName= NSN.getText();
    AD.NE.Age=Integer.parseInt(NAGE.getText()) ;
    AD.NE.Qualification = NQ.getText(); 
    AD.NE.PhoneNum =Integer.parseInt(NPN.getText());
    AD.NE.Joining_date = NJD.getText();
    AD.NE.SA.setSalaryperhour(Integer.parseInt(NSPH.getText()));
    AD.NE.Gender = NG.getText();
    AD.NE.City = NCI.getText();
    AD.NE.SA.setHoursperday(Integer.parseInt(NHPD.getText()));
    AD.NE.Marital_Status = NMS.getText();
    AD.NE.blood_group = NBG.getText();
    AD.NE.SA.setDayspermonth(Integer.parseInt(NDPM.getText()));
    AD.NE.AddPerson();
    this.ShowNurse(e);
    this.ShowSalary(e);
     NID.setText("");
      NFN.setText("");
      NSN.setText("");
      NAGE.setText("");
      NQ.setText("");
      NPN.setText("");
      NJD.setText("");
      NSPH.setText("");
      NG.setText("");
      NCI.setText("");
      NHPD.setText("");
      NMS.setText("");
      NBG.setText("");
      NDPM.setText("");
    }
    catch(Exception e1){
    JOptionPane.showMessageDialog(null,"there is a problem, please try again"); 
    }
    
    }
    @FXML
    private void updateNurse(ActionEvent e){
    
    try{
    AD3.NE.ID = NID2.getText();
    AD3.NE.FirstName = NFN2.getText();
    AD3.NE.SecondName= NSN2.getText();
    AD3.NE.Age=Integer.parseInt(NAGE2.getText()) ;
    AD3.NE.Qualification = NQ2.getText();
    AD3.NE.PhoneNum =Integer.parseInt(NPN2.getText());
    AD3.NE.Joining_date = NJD2.getText();
    AD3.NE.SA.setSalaryperhour(Integer.parseInt(NSPH2.getText()));
    AD3.NE.Gender = NG2.getText();
    AD3.NE.City = NCI2.getText();
    AD3.NE.SA.setHoursperday(Integer.parseInt(NHPD2.getText()));
    AD3.NE.Marital_Status = NMS2.getText();
    AD3.NE.blood_group = NBG2.getText();
    AD3.NE.SA.setDayspermonth(Integer.parseInt(NDPM2.getText()));
    AD3.NE.UpdatePerson();
    this.ShowNurse(e);
    this.ShowSalary(e);
    
    }
     catch(Exception e1){
    JOptionPane.showMessageDialog(null,"there is a problem, please try again"); 
    }
    }
    @FXML
    private void deleteNurse(ActionEvent e){
      try{
      AD4.NE.ID =NID3.getText();   
      AD4.NE.DeletePerson();
      NID3.setText("");
      NFN3.setText("");
      NSN3.setText("");
      NAGE3.setText("");
      NQ3.setText("");
      NPN3.setText("");
      NJD3.setText("");
      NSPH3.setText("");
      NG3.setText("");
      NCI3.setText("");
      NHPD3.setText("");
      NMS3.setText("");
      NBG3.setText("");
      NDPM3.setText("");
      this.ShowNurse(e);
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
