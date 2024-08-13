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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Receptionist extends Employees{

    public Receptionist() {
    }
    
    private int RecipitionNum;
    private String usernamee;
    private String passwordd;
    Connection con;
    PreparedStatement com,com1;
    ResultSet rst,rst1;
    outdoor_patients pa = new outdoor_patients();
    Bill_System bn = new Bill_System();
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
    

    

   

    @Override
    public void DeletePerson() {
        try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
        com= con.prepareStatement("delete from Receptionist_data where Receptionist_ID = '"+ID+"' ");
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
           com= con.prepareStatement("Select*from Receptionist_data"); 
           com1= con.prepareStatement("Select*from salary_details"); 
           //SPACES ARE NOT acceptable 
            rst = com.executeQuery();
            rst1= com1.executeQuery();
          //  JOptionPane.showMessageDialog(null,"successful connection");
            while(rst.next()){
               if(rst.getString("Receptionist_ID").equals(ID)){                   
                this.FirstName= rst.getString("First_Name");
                this.SecondName= rst.getString("Second_Name");
                this.Age=rst.getInt("Age");
                this.Gender=rst.getString("gender");
                this.PhoneNum=rst.getInt("Phone_Num");
                this.usernamee=rst.getString("username");
                this.City=rst.getString("City");
                this.Qualification=rst.getString("Qualification");
                this.passwordd=rst.getString("password");
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
           com=con.prepareStatement("Update Receptionist_data set username = '"+usernamee+"',Phone_Num = '"+PhoneNum +"',First_Name = '"+FirstName+"', Second_Name = '"+SecondName+"',Age = '"+Age+"', City= '"+City+"' ,gender = '"+Gender+"',Qualification = '"+Qualification+"',password= '"+passwordd+"',Marital_Status = '"+Marital_Status+"',Joining_Date= '"+Joining_date +"',Blood_Group = '"+blood_group +"' where Receptionist_ID = '"+ID+"' ");
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
           int result1= smt1.executeUpdate(("insert into Receptionist_data values('"+ID+"', '"+usernamee+"', '"+PhoneNum+"', '"+FirstName+"','"+SecondName+"', '"+Age+"','"+City+"', '"+Gender+"', '"+Qualification+"','"+passwordd+"', '"+Marital_Status +"','"+Joining_date+"','"+blood_group +"')"));
            int result2= smt2.executeUpdate(("insert into salary_details values('"+ID+"', '"+SA.getSalaryperhour()+"', '"+SA.getHoursperday()+"', '"+s1+"','"+SA.getDayspermonth()+"', '"+s2+"')" ));
            con.close();
            JOptionPane.showMessageDialog(null,"Successfully Added");
        } catch (Exception ex) {
       JOptionPane.showMessageDialog(null,ex.getMessage() );
        }
    }
    
   @Override
    public void ViewPerson(ArrayList<String> data1) {
      try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
           // JOptionPane.showMessageDialog(null,"successful connection");
            com= con.prepareStatement("Select*from Receptionist_data");
            rst = com.executeQuery();
          //JOptionPane.showMessageDialog(null,"successful connection");
            while(rst.next()){
            data1.add(rst.getString("Receptionist_ID"));
            data1.add(rst.getString("username"));
            data1.add(rst.getString("Phone_Num"));
            data1.add(rst.getString("First_Name"));
            data1.add(rst.getString("Second_Name"));
            data1.add(rst.getString("Age"));
            data1.add(rst.getString("City"));
            data1.add(rst.getString("gender"));
            data1.add(rst.getString("Qualification"));
            data1.add(rst.getString("password"));
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
    
    
    public  boolean Login() {
        
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
            com= con.prepareStatement("Select*from Receptionist_data");
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
    public void viewProfile(){
             try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
           com= con.prepareStatement("Select*from Receptionist_data"); 
           //SPACES ARE NOT acceptable 
            rst = com.executeQuery();
          //  JOptionPane.showMessageDialog(null,"successful connection");
            while(rst.next()){
               if(rst.getString("username").equals(this.usernamee)){                   
                this.FirstName= rst.getString("First_Name");
                this.SecondName= rst.getString("Second_Name");
                this.Age=rst.getInt("Age");
                this.Gender=rst.getString("gender");
                this.PhoneNum=rst.getInt("Phone_Num");
                this.ID=rst.getString("Receptionist_ID");
                this.City=rst.getString("City");
                this.Qualification=rst.getString("Qualification");
                this.passwordd=rst.getString("password");
                this.Marital_Status = rst.getString("Marital_Status");
                this.Joining_date = rst.getString("Joining_Date");
                this.blood_group = rst.getString("Blood_Group");
          
               }
            }  
       
    }
      catch (Exception ex) {
          JOptionPane.showMessageDialog(null," connection failed");
        }
    }
    public void changepass(){
     try{
       Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
       con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb");
       com=con.prepareStatement("Update Receptionist_data set password = '"+this.passwordd+"' where username = '"+usernamee+"'");
       com.execute();     
       }
     catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage() );
        }
     
     }
    public void viewapp(ArrayList<String> dataa){
      try{
      Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
      con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb"); 
      com= con.prepareStatement("Select*from appointments");
      rst = com.executeQuery();
      while(rst.next()){
            dataa.add(rst.getString("count"));
            dataa.add(rst.getString("Doctor_name"));
            dataa.add(rst.getString("First_name"));
            dataa.add(rst.getString("Second_name"));
            dataa.add(rst.getString("phone_number"));
            }
      
      }
      
      catch (Exception ex) {
      JOptionPane.showMessageDialog(null," connection failed");
      }
        
    }
    public void Nextapp(ArrayList<String> data1){
    try{
      Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
      con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb"); 
      com= con.prepareStatement("Select*from appointments where Doctor_name = '"+this.pa.getDname() +"'");
      rst = com.executeQuery();
     while(rst.next()){
      data1.add(rst.getString("count"));
      data1.add(rst.getString("Doctor_name"));
      data1.add(rst.getString("First_name"));
      data1.add(rst.getString("Second_name"));
      data1.add(rst.getString("phone_number"));   
      }
     com1= con.prepareStatement("delete from appointments where Doctor_name = '"+this.pa.getDname()+"' ");
     com1.execute();
     for(int count=5;count<data1.size();count=count+0){
      Statement smt1= con.createStatement();  
      int result1= smt1.executeUpdate(("insert into appointments values('"+data1.get(count)+"', '"+data1.get(count+1)+"','"+data1.get(count+2)+ "','"+data1.get(count+3)+ "','"+data1.get(count+4)+"')"));    
      count = count+5;
     }
     }
    
    
    catch (Exception ex) {
      JOptionPane.showMessageDialog(null," connection failed");
    }    
    }
    
    public boolean calculatebill(){
     try{
        String q=null; 
       Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
       con= DriverManager.getConnection("jdbc:ucanaccess://HMS_DB.accdb"); 
       com= con.prepareStatement("Select*from Doctor_data");
       rst = com.executeQuery();
     //  JOptionPane.showMessageDialog(null," connection ");
       while(rst.next()){
       if(pa.getDname().equals(rst.getString("First_Name")+" "+ rst.getString("Second_Name"))) {
       q = rst.getString("Qualification");
       }
       }
       if(q.equals("specialist")){
       this.bn.setAmount(70.00);
       }
       else if(q.equals("advisory")){
       this.bn.setAmount(90.00);
       } 
       else if(q.equals("professor")){
       this.bn.setAmount(110.00);
       }
       JOptionPane.showMessageDialog(null,"the Appointment fees: "+ this.bn.getAmount());
       this.bn.setPaid(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the paid amount:")));
       if(this.bn.getPaid()< this.bn.getAmount()){
        JOptionPane.showMessageDialog(null,"Error please try again");
       return false;
       }
       else
       {
       this.bn.setRemaider(this.bn.getPaid()-this.bn.getAmount());
       JOptionPane.showMessageDialog(null,"The remainder is: " + this.bn.getRemaider());
       return true;
       }
       }
       catch (Exception ex) {
       JOptionPane.showMessageDialog(null," connection failed");
    }    
       
     return false;
       
    }
    
   
    /* methods */
    
    //booking
    //genertate bill
    //patientdetails
    //calculate bill (bills system)

    
}
