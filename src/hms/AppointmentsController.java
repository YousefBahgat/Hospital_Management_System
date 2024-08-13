/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
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
public class AppointmentsController implements Initializable {
    
    @FXML 
     ChoiceBox<String> Dname;
      @FXML 
     ChoiceBox<String> Dname1;
    @FXML 
    TextField  FN,SN,PH;
    @FXML
    TextArea rn,dn,fn,sn,pn;
    Doctor d1 = new Doctor();
    outdoor_patients op = new  outdoor_patients();
    String namee;
    String passwordd;
    ArrayList<String> dataa = new ArrayList();
    ArrayList<String> data1 = new ArrayList();
    
    Receptionist R  = new Receptionist();
    Receptionist R1  = new Receptionist();
     public void logindata(String name, String pass){
     this.namee = name;
     this.passwordd = pass;
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
    private void addap(ActionEvent e)throws IOException{
     op.Firstname = FN.getText();
     op.Secondname = SN.getText();
     op.telnum =Integer.parseInt(PH.getText());
     op.setDname(Dname.getSelectionModel().getSelectedItem());
     op.booking();
     JOptionPane.showMessageDialog(null,"Successfully Added");
     this.showapp(e);
     
    }
    @FXML
    private void showapp(ActionEvent e)throws IOException{
       dataa.clear();
       String total = "";
       this.R.viewapp(dataa);
      for(int count=0; count<dataa.size();count++){
      total+= dataa.get(count)+"\n";
      count= count+4;
      }
      this.rn.setText(total); 
      total = "";
      
      for(int count=1; count<dataa.size();count++){
      total+= dataa.get(count)+"\n";
      count= count+4;
      }
      this.dn.setText(total); 
      total = "";
      
      for(int count=2; count<dataa.size();count++){
      total+= dataa.get(count)+"\n";
      count= count+4;
      }
      this.fn.setText(total); 
      total = "";
      
      for(int count=3; count<dataa.size();count++){
      total+= dataa.get(count)+"\n";
      count= count+4;
      }
      this.sn.setText(total); 
      total = "";
      for(int count=4; count<dataa.size();count++){
      total+= dataa.get(count)+"\n";
      count= count+4;
      }
      this.pn.setText(total); 
      total = "";
    }
    @FXML
    private void nextapp(ActionEvent e) throws IOException{
     R.pa.setDname(Dname1.getSelectionModel().getSelectedItem());
     R.Nextapp(data1);
     data1.clear();
     this.showapp(e);
    }
    @FXML 
    private void calculatebill(ActionEvent event) throws IOException{
    R1.pa.setDname(Dname.getSelectionModel().getSelectedItem());
    boolean x = R1.calculatebill();
    if(x == true){
     FXMLLoader Loader = new FXMLLoader();
     Loader.setLocation(getClass().getResource("bill.fxml"));
     Parent start = Loader.load();
     Scene scene = new Scene(start);
     BillController controller = Loader.getController();
     controller.billdetails(FN.getText(), SN.getText(),R1.bn.getAmount(),R1.bn.getPaid(),R1.bn.getRemaider());
     Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
     window.setScene(scene);
     window.show();
    FN.setText(" ");
    SN.setText(" ");
    PH.setText(" ");
    }
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
        try {
            Connection con;
            PreparedStatement com;
            ResultSet rst;
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
            com= con.prepareStatement("Select*from Doctor_data"); 
            rst = com.executeQuery();
            while(rst.next()){
             Dname.getItems().add(rst.getString("First_Name")+" "+ rst.getString("Second_Name")); 
             Dname1.getItems().add(rst.getString("First_Name")+" "+ rst.getString("Second_Name")); 
            }
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null," connection failed");
        }
    }    
    
}
