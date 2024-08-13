/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

//import java.io.IOException;
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
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
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
public class Patient_detailsController implements Initializable {
   
    @FXML
    TextArea ID,ED,bednum,FN,SN,G,PN,WN,age,RM;        
    @FXML
    TextField tfn,tsn,ta,tg,tpn,ted,twn,tr,tb,tid;
     @FXML
    TextField tfn1,tsn1,ta1,tg1,tpn1,ted1,twn1,tr1,tb1,tid1;
     @FXML
    TextField tfn2,tsn2,ta2,tg2,tpn2,ted2,twn2,tr2,tb2,tid2;
    @FXML
    TextField tfn11,tsn11,ta11,tg11,tpn11,ted11,twn11,tr11,tb11,tid11;
    Indoor_Patients p = new Indoor_Patients();
    Indoor_Patients A= new Indoor_Patients();
    Indoor_Patients B= new Indoor_Patients();
     Indoor_Patients C= new Indoor_Patients();
    ArrayList<String> x = new ArrayList();
    @FXML
    private void ShowPatients(ActionEvent event){
     x.clear();
     this.p.ViewPatient(x);
     String total = "";
     for(int count=0; count<x.size();count++){
      total+= x.get(count)+"\n";
      count= count+9;
     }
     this.ID.setText(total);
     
     total = "";
     for(int count=1; count<x.size();count++){
      total+= x.get(count)+"\n";
      count= count+9;
     }
     this.ED.setText(total);
     total = "";
     
     for(int count=2; count<x.size();count++){
      total+= x.get(count)+"\n";
      count= count+9;
     }
     this.bednum.setText(total);
     total = "";
     
     for(int count=3; count<x.size();count++){
     total+= x.get(count)+"\n";
      count= count+9;
     }
     this.FN.setText(total);
     total = "";
     
     for(int count=4; count<x.size();count++){
      total+= x.get(count)+"\n";
      count= count+9;
     }
     this.SN.setText(total);
     total = "";
     
     for(int count=5; count<x.size();count++){
      total+= x.get(count)+"\n";
      count= count+9;
     }
     this.G.setText(total);
     total = "";
     
     for(int count=6; count<x.size();count++){
      total+= x.get(count)+"\n";
      count= count+9;
     }
     this.PN.setText(total);
     total = "";
     
     for(int count=7; count<x.size();count++){
      total+= x.get(count)+"\n";
      count= count+9;
     }
     this.WN.setText(total);
     total = "";
     
     for(int count=8; count<x.size();count++){
      total+= x.get(count)+"\n";
      count= count+9;
     }
     this.age.setText(total);
     total = "";
     
       for(int count=9; count<x.size();count++){
      total+= x.get(count)+"\n";
      count= count+9;
     }
     this.RM.setText(total);
     total = "";
     
     }
    @FXML
    private void SearchPatients(ActionEvent event){
    this.p.setID(tid.getText());
    this.p.SearchPatient();
    tfn.setText(this.p.Firstname);
    tsn.setText(this.p.Secondname);
    ta.setText(this.p.age+"");
    tg.setText(this.p.Gender);
    tpn.setText(this.p.telnum+"");
    ted.setText(this.p.entry);
    twn.setText(this.p.getWard_num()+"");
    tr.setText(this.p.Roomnumber.getRoomNum() +"");
    tb.setText(this.p.getBed_num() + "");
    }
     @FXML
    private void SearchPatients3(ActionEvent event){
    this.C.setID(tid11.getText());
    this.C.SearchPatient();
    tfn11.setText(this.C.Firstname);
    tsn11.setText(this.C.Secondname);
    ta11.setText(this.C.age+"");
    tg11.setText(this.C.Gender);
    tpn11.setText(this.C.telnum+"");
    ted11.setText(this.C.entry);
    twn11.setText(this.C.getWard_num()+"");
    tr11.setText(this.C.Roomnumber.getRoomNum() +"");
    tb11.setText(this.C.getBed_num() + "");
    }
       @FXML
    private void SearchPatients2(ActionEvent event){
    this.B.setID(tid2.getText());
    this.B.SearchPatient();
    tfn2.setText(this.B.Firstname);
    tsn2.setText(this.B.Secondname);
    ta2.setText(this.B.age+"");
    tg2.setText(this.B.Gender);
    tpn2.setText(this.B.telnum+"");
    ted2.setText(this.B.entry);
    twn2.setText(this.B.getWard_num()+"");
    tr2.setText(this.B.Roomnumber.getRoomNum() +"");
    tb2.setText(this.B.getBed_num() + "");
    }
    
    
    @FXML
    private void AddPatients(ActionEvent event){
        try{
      this.A.Firstname=tfn1.getText();
      this.A.Secondname=tsn1.getText();
      this.A.age=Integer.parseInt(ta1.getText());
      this.A.Gender=tg1.getText();
      this.A.telnum=Integer.parseInt(tpn1.getText());
      this.A.entry=ted1.getText();
      this.A.setWard_num(Integer.parseInt(twn1.getText()));
      this.A.Roomnumber.setRoomNum(Integer.parseInt(tr1.getText()));
      this.A.setBed_num(Integer.parseInt(tb1.getText()));
      this.A.ID=tid1.getText();
      this.A.AddPatient();
      this.ShowPatients(event);
      tfn1.setText("");
      tsn1.setText("");
      ta1.setText("");
      tg1.setText("");
      tpn1.setText("");
      ted1.setText("");
      twn1.setText("");
      tr1.setText("");
      tb1.setText("");
      tid1.setText("");
        }
       catch(Exception e){
      JOptionPane.showMessageDialog(null,"there is a problem, please try again");  
        }}
     @FXML
     private void DeletePatients(ActionEvent event){
     try{
     this.B.setID(tid2.getText());
     this.B.DeletePatient();
     tfn2.setText("");
     tsn2.setText("");
     ta2.setText("");
     tg2.setText("");
     tpn2.setText("");
     ted2.setText("");
     twn2.setText("");
     tr2.setText("");
     tb2.setText("");
     tid2.setText("");
     this.ShowPatients(event);}
     catch(Exception e){
    JOptionPane.showMessageDialog(null,"there is a problem, please try again");  
            
     }  
    }
    @FXML
     private void UpdatePatients(ActionEvent event){
     try{
       this.C.setID(tid11.getText());
       this.C.Firstname=tfn11.getText();
      this.C.Secondname=tsn11.getText();
      this.C.age=Integer.parseInt(ta11.getText());
      this.C.Gender=tg11.getText();
      this.C.telnum=Integer.parseInt(tpn11.getText());
      this.C.entry=ted11.getText();
      this.C.setWard_num(Integer.parseInt(twn11.getText()));
      this.C.Roomnumber.setRoomNum(Integer.parseInt(tr11.getText()));
      this.C.setBed_num(Integer.parseInt(tb11.getText()));
      this.C.ID=tid11.getText();
      this.C.UpdatePatient();
      this.ShowPatients(event);
           
       }
       catch(Exception e){
    JOptionPane.showMessageDialog(null,"there is a problem, please try again");        
     }   
     }
      
    
    
    @FXML
    private void returnhome(MouseEvent event)throws IOException {
        Parent start = FXMLLoader.load(getClass().getResource("Admindata.fxml"));
        Scene scene = new Scene(start);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    @FXML
    private void Logout(MouseEvent event)throws IOException {
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
