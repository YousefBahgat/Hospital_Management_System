/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Indoor_Patients extends Patient{
    private int ward_num;
    private int bed_num;
    String entry= new String();
    Connection con;
    PreparedStatement com;
    ResultSet rst;

    public Indoor_Patients() {
    }

    public int getWard_num() {
        return ward_num;
    }

    public void setWard_num(int ward_num) {
        this.ward_num = ward_num;
    }

    public int getBed_num() {
        return bed_num;
    }

    public void setBed_num(int bed_num) {
        this.bed_num = bed_num;
    }
    
    
    @Override
    public void ViewPatient(ArrayList<String> x)  {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
            com= con.prepareStatement("Select*from indoor_patients");
            rst = com.executeQuery();
            while(rst.next()){
            x.add(rst.getString("patient_ID"));
            x.add(rst.getString("entry_Date"));
            x.add(rst.getString("bed_num"));
            x.add(rst.getString("First_name"));
            x.add(rst.getString("Second_name"));
            x.add(rst.getString("gender"));
            x.add(rst.getString("phone_number"));
            x.add(rst.getString("ward_num"));
            x.add(rst.getString("Age"));
            x.add(rst.getString("Room_number"));
            }
        //JOptionPane.showMessageDialog(null,"successful connection");
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null," connection failed");
        }
        
    }
    
    
    @Override
    public void SearchPatient(){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
           com= con.prepareStatement("Select*from indoor_patients"); 
           //SPACES ARE NOT acceptable 
            rst = com.executeQuery();
          //  JOptionPane.showMessageDialog(null,"successful connection");
            while(rst.next()){
               if(rst.getString("patient_ID").equals(super.ID)){
                this.Firstname= rst.getString("First_name");
                this.Secondname= rst.getString("Second_name");
                this.age=rst.getInt("Age");
                this.Gender=rst.getString("gender");
                this.entry=(rst.getString("entry_Date"));
                this.telnum=rst.getInt("phone_number");
                this.Roomnumber.setRoomNum(rst.getInt("Room_number"));
                this.ward_num=rst.getInt("ward_num");
                this.bed_num=rst.getInt("bed_num");
               }
            }
            //JOptionPane.showMessageDialog(null,"successful connection");
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null," connection failed");
        }
 
    }

    @Override
    public void AddPatient() {
        try {
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
        Statement smt= con.createStatement();
        int result= smt.executeUpdate(("insert into indoor_patients values('"+ID+"', '"+entry+"', '"+bed_num+"', '"+Firstname+"','"+Secondname+"', '"+Gender+"','"+telnum+"', '"+ward_num+"', '"+age+"','"+Roomnumber.getRoomNum()+"')"));
         con.close();
         JOptionPane.showMessageDialog(null,"Successfully Added");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage() );
            
        }
        
    }

    @Override
    public void DeletePatient() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
            com= con.prepareStatement("delete from indoor_patients where patient_ID = '"+ID+"' ");
            com.execute();
           JOptionPane.showMessageDialog(null,"Successfully Deleted");        
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage() );
        }  
    }

    @Override
    public void UpdatePatient() {
       try{
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
           com=con.prepareStatement("Update indoor_patients set entry_Date = '"+entry+"',bed_num = '"+bed_num +"',First_name = '"+Firstname+"', Second_name = '"+Secondname+"',gender = '"+Gender+"',phone_number = '"+telnum+"' ,ward_num = '"+ward_num+"',Age = '"+age+"',Room_number= '"+Roomnumber.getRoomNum()+"'where patient_ID = '"+ID+"' ");
           com.execute();
           JOptionPane.showMessageDialog(null,"Successfully Updated");
       }
       catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage() );
        }  
    }
    
    
    
    
   
    
    
           
}
