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
public class Doctor_detailsController implements Initializable {
    @FXML
     TextField DID,DFN,DSN,DAGE,DQ,DPN,DJD,DSPH,DG,DCI,DHPD,DMS,DBG,DDPM,DRM,DDET,DSP;
    @FXML
     TextArea  ID1,PN1,FN1,SN1,AGE1,CI1,G1,Q1,MS1,JD1,BG1,RM1,SP1,DET1;
    @FXML
     TextArea ID2,SPH2,HPD2,SPD2,DPM2,SPM2;
    @FXML
    TextField DID1,DFN1,DSN1,DAGE1,DQ1,DPN1,DJD1,DSPH1,DG1,DCI1,DHPD1,DMS1,DBG1,DDPM1,DRM1,DDET1,DSP1;
     @FXML
    TextField DID2,DFN2,DSN2,DAGE2,DQ2,DPN2,DJD2,DSPH2,DG2,DCI2,DHPD2,DMS2,DBG2,DDPM2,DRM2,DDET2,DSP2;
     @FXML
    TextField DID3,DFN3,DSN3,DAGE3,DQ3,DPN3,DJD3,DSPH3,DG3,DCI3,DHPD3,DMS3,DBG3,DDPM3,DRM3,DDET3,DSP3;
    
    
    ADMIN AD = new ADMIN();
    ADMIN AD1 = new ADMIN();
    ADMIN AD2 = new ADMIN();
    ADMIN AD3 = new ADMIN();
    ADMIN AD4 = new ADMIN();
    
    ArrayList<String> data1 = new ArrayList();
    ArrayList<String> data2 = new ArrayList();
    @FXML
    private void SearchDoctor(ActionEvent e){
     AD2.DC.setID(DID1.getText());
     AD2.DC.SearchPerson();
     DFN1.setText(AD2.DC.FirstName);
     DSN1.setText(AD2.DC.SecondName);
     DAGE1.setText(AD2.DC.Age + "");
     DQ1.setText(AD2.DC.Qualification);
     DPN1.setText(AD2.DC.PhoneNum+ "");
     DJD1.setText(AD2.DC.Joining_date);
     DSPH1.setText(AD2.DC.SA.getSalaryperhour()+"");
     DG1.setText(AD2.DC.Gender);
     DCI1.setText(AD2.DC.City);
     DHPD1.setText(AD2.DC.SA.getHoursperday() + "");
     DMS1.setText(AD2.DC.Marital_Status);
     DBG1.setText(AD2.DC.blood_group);
     DDPM1.setText(AD2.DC.SA.getDayspermonth()+ "");
     DRM1.setText(AD2.DC.Rm.getRoomNum()+"");
     DDET1.setText(AD2.DC.getDepartment());
     DSP1.setText(AD2.DC.getSpecialization());
    }
    @FXML
     private void SearchDoctor2(ActionEvent e){
     AD3.DC.setID(DID2.getText());  
     AD3.DC.SearchPerson();
     DFN2.setText(AD3.DC.FirstName);
     DSN2.setText(AD3.DC.SecondName);
     DAGE2.setText(AD3.DC.Age + "");
     DQ2.setText(AD3.DC.Qualification);
     DPN2.setText(AD3.DC.PhoneNum+ "");
     DJD2.setText(AD3.DC.Joining_date);
     DSPH2.setText(AD3.DC.SA.getSalaryperhour()+"");
     DG2.setText(AD3.DC.Gender);
     DCI2.setText(AD3.DC.City);
     DHPD2.setText(AD3.DC.SA.getHoursperday() + "");
     DMS2.setText(AD3.DC.Marital_Status);
     DBG2.setText(AD3.DC.blood_group);
     DDPM2.setText(AD3.DC.SA.getDayspermonth()+ ""); 
     DDET2.setText(AD3.DC.getDepartment());
     DSP2.setText(AD3.DC.getSpecialization());   
     DRM2.setText(AD3.DC.Rm.getRoomNum()+"");  
        
    }
    @FXML
     private void SearchDoctor3(ActionEvent e){
      AD4.DC.setID(DID3.getText());  
      AD4.DC.SearchPerson();
     DFN3.setText(AD4.DC.FirstName);
     DSN3.setText(AD4.DC.SecondName);
     DAGE3.setText(AD4.DC.Age + "");
     DQ3.setText(AD4.DC.Qualification);
     DPN3.setText(AD4.DC.PhoneNum+ "");
     DJD3.setText(AD4.DC.Joining_date);
     DSPH3.setText(AD4.DC.SA.getSalaryperhour()+"");
     DG3.setText(AD4.DC.Gender);
     DCI3.setText(AD4.DC.City);
     DHPD3.setText(AD4.DC.SA.getHoursperday() + "");
     DMS3.setText(AD4.DC.Marital_Status);
     DBG3.setText(AD4.DC.blood_group);
     DDPM3.setText(AD4.DC.SA.getDayspermonth()+ ""); 
     DDET3.setText(AD4.DC.getDepartment());
     DSP3.setText(AD4.DC.getSpecialization());
     DRM3.setText(AD4.DC.Rm.getRoomNum()+"");
     }     
        

    @FXML
    private void ShowDoctor(ActionEvent e)
    {
     
     data1.clear();
     this.AD1.DC.ViewPerson(data1);
     String total = "";
     for(int count=0; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.ID1.setText(total);
     
     total = "";
     for(int count=1; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.RM1.setText(total);
     total = "";
     
     for(int count=2; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.PN1.setText(total);
     total = "";
     
     for(int count=3; count<data1.size();count++){
     total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.FN1.setText(total);
     total = "";
     // ID1,UN1,PN1,FN1,SN1,AGE1,CI1,G1,Q1,P1,MS1,JD1,BG1;
     for(int count=4; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.SN1.setText(total);
     total = "";
     
     for(int count=5; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.AGE1.setText(total);
     total = "";
     
     for(int count=6; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.CI1.setText(total);
     total = "";
     
     for(int count=7; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.G1.setText(total);
     total = "";
     
     for(int count=8; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.Q1.setText(total);
     total = "";
     // ID1,UN1,PN1,FN1,SN1,AGE1,CI1,G1,Q1,P1,MS1,JD1,BG1;
       for(int count=9; count<data1.size();count++){
      total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.MS1.setText(total);
     total = "";
     
     for(int count=10; count<data1.size();count++){
     total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.JD1.setText(total);
     total = "";
     
     for(int count=11; count<data1.size();count++){
     total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.BG1.setText(total);
     total = "";
     
     for(int count=12; count<data1.size();count++){
     total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.DET1.setText(total);
     total = "";
     
      for(int count=13; count<data1.size();count++){
     total+= data1.get(count)+"\n";
      count= count+13;
     }
     this.SP1.setText(total);
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
    private void addDoctor(ActionEvent e)
    {
      
    //DID,DFN,DSN,DAGE,DQ,DPN,DJD,DSPH,DG,DCI,DHPD,DMS,DBG,DDPM,DRM,DDET,DSP;
        
    try{    
    AD.DC.ID = DID.getText();
    AD.DC.FirstName =DFN.getText();
    AD.DC.SecondName= DSN.getText();
    AD.DC.Age=Integer.parseInt(DAGE.getText()) ;
    AD.DC.Qualification = DQ.getText(); 
    AD.DC.PhoneNum =Integer.parseInt(DPN.getText());
    AD.DC.Joining_date = DJD.getText();
    AD.DC.SA.setSalaryperhour(Integer.parseInt(DSPH.getText()));
    AD.DC.Gender = DG.getText();
    AD.DC.City = DCI.getText();
    AD.DC.SA.setHoursperday(Integer.parseInt(DHPD.getText()));
    AD.DC.Marital_Status = DMS.getText();
    AD.DC.blood_group = DBG.getText();
    AD.DC.Rm.setRoomNum(Integer.parseInt(DRM.getText()));
    AD.DC.SA.setDayspermonth(Integer.parseInt(DDPM.getText()));
    AD.DC.setDepartment(DDET.getText());
    AD.DC.setSpecialization(DSP.getText());
    AD.DC.AddPerson();
   //JOptionPane.showMessageDialog(null,"there is a problem, please try again"); 
    this.ShowDoctor(e);
    this.ShowSalary(e);
     DID.setText("");
      DFN.setText("");
      DSN.setText("");
      DAGE.setText("");
      DQ.setText("");
      DPN.setText("");
      DJD.setText("");
      DSPH.setText("");
      DG.setText("");
      DCI.setText("");
      DHPD.setText("");
      DMS.setText("");
      DBG.setText("");
      DDPM.setText("");
      DDET.setText("");
      DSP.setText("");
      DRM.setText("");
      
    }
    catch(Exception e1){
    JOptionPane.showMessageDialog(null,"there is a problem, please try again"); 
    }
    
    }
    @FXML
    private void updateDoctor(ActionEvent e){
    
    try{
    AD3.DC.ID = DID2.getText();
    AD3.DC.FirstName = DFN2.getText();
    AD3.DC.SecondName= DSN2.getText();
    AD3.DC.Age=Integer.parseInt(DAGE2.getText()) ;
    AD3.DC.Qualification = DQ2.getText();
    AD3.DC.PhoneNum =Integer.parseInt(DPN2.getText());
    AD3.DC.Joining_date = DJD2.getText();
    AD3.DC.SA.setSalaryperhour(Integer.parseInt(DSPH2.getText()));
    AD3.DC.Gender = DG2.getText();
    AD3.DC.City = DCI2.getText();
    AD3.DC.SA.setHoursperday(Integer.parseInt(DHPD2.getText()));
    AD3.DC.Marital_Status = DMS2.getText();
    AD3.DC.blood_group = DBG2.getText();
    AD3.DC.SA.setDayspermonth(Integer.parseInt(DDPM2.getText()));
    AD3.DC.setDepartment(DDET2.getText());
    AD3.DC.setSpecialization(DSP2.getText());
    AD3.DC.Rm.setRoomNum(Integer.parseInt(DRM2.getText()));
    AD3.DC.UpdatePerson();
    this.ShowDoctor(e);
    this.ShowSalary(e);
    
    }
     catch(Exception e1){
    JOptionPane.showMessageDialog(null,"there is a problem, please try again"); 
    }
    }
    @FXML
    private void deleteDoctor(ActionEvent e){
      try{
      AD4.DC.ID =DID3.getText();   
      AD4.DC.DeletePerson();
      DID3.setText("");
      DFN3.setText("");
      DSN3.setText("");
      DAGE3.setText("");
      DQ3.setText("");
      DPN3.setText("");
      DJD3.setText("");
      DSPH3.setText("");
      DG3.setText("");
      DCI3.setText("");
      DHPD3.setText("");
      DMS3.setText("");
      DBG3.setText("");
      DDPM3.setText("");
      DDET3.setText("");
      DSP3.setText("");
      DRM3.setText("");
      this.ShowDoctor(e);
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
