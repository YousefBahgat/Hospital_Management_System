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
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class outdoor_patients extends Patient{
    private String constant;
    private int Reservation_number;
    private String Dname;
    Connection con;
    PreparedStatement com,com1;
    ResultSet rst,rst1;
    
    public String getConstant() {
        return constant;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }

    public int getReservation_number() {
        return Reservation_number;
    }

    public void setReservation_number(int Reservation_number) {
        this.Reservation_number = Reservation_number;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }

  public void booking(){
       try {
           Reservation_number = 0;
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
            com= con.prepareStatement("Select*from appointments"); 
            rst = com.executeQuery();
            if(rst.wasNull())
            {
            
            Statement smt = con.createStatement();
            int result = smt.executeUpdate(("insert into appointments values('"+Reservation_number+"', '"+Dname+"','"+Firstname+ "','"+Secondname+ "','"+this.telnum+"')"));
            con.close();
            }
            else 
            {
            while(rst.next()){
            if(rst.getString("Doctor_name").equals(Dname)){
            this.Reservation_number = rst.getInt("count");
            } 
            }
            this.Reservation_number++;
            Statement smt1 = con.createStatement();
            int result = smt1.executeUpdate(("insert into appointments values('"+Reservation_number+"', '"+Dname+"','"+Firstname+ "','"+Secondname+ "','"+this.telnum+"')"));
            con.close();
            }
       
          /*   Statement smt= con.createStatement();
        int result= smt.executeUpdate(("insert into indoor_patients values('"+ID+"', '"+entry+"', '"+bed_num+"', '"+Firstname+"','"+Secondname+"', '"+Gender+"','"+telnum+"', '"+ward_num+"', '"+age+"','"+Roomnumber.getRoomNum()+"')")); */
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage() );
        }
     
    
  }  
}
