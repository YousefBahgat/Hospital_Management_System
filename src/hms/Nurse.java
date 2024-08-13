/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Nurse extends Employees {

  Connection con;
  PreparedStatement com,com1;
  ResultSet rst,rst1;
    @Override
    public void DeletePerson() {
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
        com= con.prepareStatement("delete from Nurse_data where Nurse_ID = '"+ID+"' ");
        com.execute();
        com1 = con.prepareStatement("delete from salary_details where ID = '"+ID+"' ");
        com1.execute();
       JOptionPane.showMessageDialog(null,"Successfully Deleted");             
             }
    catch (Exception ex) {
          JOptionPane.showMessageDialog(null," connection failed");
        }
    
    }  
    
    @Override
    public void SearchPerson() {
       try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
           com= con.prepareStatement("Select*from Nurse_data"); 
           com1= con.prepareStatement("Select*from salary_details"); 
           //SPACES ARE NOT acceptable 
            rst = com.executeQuery();
            rst1= com1.executeQuery();
          //  JOptionPane.showMessageDialog(null,"successful connection");
            while(rst.next()){
               if(rst.getString("Nurse_ID").equals(ID)){                   
                this.FirstName= rst.getString("First_Name");
                this.SecondName= rst.getString("Second_Name");
                this.Age=rst.getInt("Age");
                this.Gender=rst.getString("gender");
                this.PhoneNum=rst.getInt("Phone_Num");
                this.City=rst.getString("City");
                this.Qualification=rst.getString("Qualification");
                this.Marital_Status = rst.getString("Marital_Status");
                this.Joining_date = rst.getString("Joining_Date");
                this.blood_group = rst.getString("Blood_Group");
          
               }
            }
            while(rst1.next()){
            if(rst1.getString("ID").equals(ID)){
            this.SA.setSalaryperhour(rst1.getInt("S_per_h"));
            this.SA.setHoursperday(rst1.getInt("h_per_d"));
            this.SA.setDayspermonth(rst1.getInt("d_per_m"));
            }
            
            }
            
          
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null," connection failed");
        }
    }
      @Override
    public void UpdatePerson() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
            int s1 = super.SA.salaryperday();
            int s2 = super.SA.salarypermonth();
           com=con.prepareStatement("Update Nurse_data set Phone_Num = '"+PhoneNum +"',First_Name = '"+FirstName+"', Second_Name = '"+SecondName+"',Age = '"+Age+"', City= '"+City+"' ,gender = '"+Gender+"',Qualification = '"+Qualification+"',Marital_Status = '"+Marital_Status+"',Joining_Date= '"+Joining_date +"',Blood_Group = '"+blood_group +"' where Nurse_ID = '"+ID+"' ");
           com.execute();
           com1=con.prepareStatement("Update salary_details set S_per_h = '"+SA.getSalaryperhour()+"',h_per_d = '"+SA.getHoursperday() +"',S_per_d = '"+s1+"', d_per_m = '"+SA.getDayspermonth()+"',s_per_m = '"+s2+"' where ID = '"+ID+"' "); 
           com1.execute();
         JOptionPane.showMessageDialog(null,"Successfully Updated");
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null,ex.getMessage() );
        }
    }
        @Override
    public void AddPerson() {
        
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
           
            int s1 = super.SA.salaryperday();
            int s2 = super.SA.salarypermonth();
            Statement smt1= con.createStatement();
            Statement smt2 = con.createStatement();
           int result1= smt1.executeUpdate(("insert into Nurse_data values('"+ID+"',  '"+PhoneNum+"', '"+FirstName+"','"+SecondName+"', '"+Age+"','"+City+"', '"+Gender+"', '"+Qualification+"', '"+Marital_Status +"','"+Joining_date+"','"+blood_group +"')"));
            int result2= smt2.executeUpdate(("insert into salary_details values('"+ID+"', '"+SA.getSalaryperhour()+"', '"+SA.getHoursperday()+"', '"+s1+"','"+SA.getDayspermonth()+"', '"+s2+"')" ));
            con.close();
            JOptionPane.showMessageDialog(null,"Successfully Added");
        } catch (Exception ex) {
       JOptionPane.showMessageDialog(null,ex.getMessage() );
        }
    } @Override
    public void ViewPerson(ArrayList<String> data1) {
      try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
           // JOptionPane.showMessageDialog(null,"successful connection");
            com= con.prepareStatement("Select*from Nurse_data");
            rst = com.executeQuery();
          //JOptionPane.showMessageDialog(null,"successful connection");
            while(rst.next()){
            data1.add(rst.getString("Nurse_ID"));
            data1.add(rst.getString("Phone_Num"));
            data1.add(rst.getString("First_Name"));
            data1.add(rst.getString("Second_Name"));
            data1.add(rst.getString("Age"));
            data1.add(rst.getString("City"));
            data1.add(rst.getString("gender"));
            data1.add(rst.getString("Qualification"));
            data1.add(rst.getString("Marital_Status"));
            data1.add(rst.getString("Joining_Date"));
            data1.add(rst.getString("Blood_Group"));
            }}
        //JOptionPane.showMessageDialog(null,"successful connection");
        catch (Exception ex) {
           JOptionPane.showMessageDialog(null," connection failed");
        }
    }
     @Override
    public void ViewSalary(ArrayList<String> data2) {
      try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
           // JOptionPane.showMessageDialog(null,"successful connection");
            com= con.prepareStatement("Select*from salary_details");
            rst = com.executeQuery();
          //JOptionPane.showMessageDialog(null,"successful connection");
            while(rst.next()){
            data2.add(rst.getString("ID"));
            data2.add(rst.getString("S_per_h"));
            data2.add(rst.getString("h_per_d"));
            data2.add(rst.getString("S_per_d"));
            data2.add(rst.getString("d_per_m"));
            data2.add(rst.getString("s_per_m"));
         
            }}
        //JOptionPane.showMessageDialog(null,"successful connection");
        catch (Exception ex) {
           JOptionPane.showMessageDialog(null," connection failed");
        }
    }
    
    

    
    
    
      
    
}
