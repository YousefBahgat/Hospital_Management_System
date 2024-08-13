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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ADMIN {
   private String usernamee;
   private String passwordd;
   Connection con;
   PreparedStatement com;
   ResultSet rst;
  // Indoor_Patients inp= new Indoor_Patients();
   Receptionist RC = new Receptionist();
   Nurse NE = new Nurse();
   Doctor DC = new Doctor();
   
    public ADMIN() {
    }

    public String getUsernamee() {
        return usernamee;
    }

    public void setUsernamee(String usernamee) {
        this.usernamee = usernamee;
    }

    public String getPasswordd() {
        return passwordd;
    }

    public void setPasswordd(String passwordd) {
        this.passwordd = passwordd;
    }
  
   
    public  boolean Login() {
        
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
            com= con.prepareStatement("Select*from admin_account");
            rst = com.executeQuery();
            while(rst.next())
            {
            if(rst.getString("username").equals (this.usernamee)){
               if(rst.getString("password").equals(this.passwordd)){
                 return true;}
            }
            }
            
         //JOptionPane.showMessageDialog(null,"successful connection");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null," connection failed");
        }
         return false; 
}
}
