/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javafx.collections.ObservableList;

/**
 *
 * @author acer
 */
public  class Patient {
    protected String Firstname;
    protected String Secondname;
    protected String ID;
    protected int telnum;
    protected int age;
    protected String Gender ;
 //   protected String type;
   
    
    Rooms Roomnumber = new Rooms();
  

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSecondname() {
        return Secondname;
    }

    public void setSecondname(String Secondname) {
        this.Secondname = Secondname;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getTelnum() {
        return telnum;
    }

    public void setTelnum(int telnum) {
        this.telnum = telnum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Rooms getRoomnumber() {
        return Roomnumber;
    }

    public void setRoomnumber(Rooms Roomnumber) {
        this.Roomnumber = Roomnumber;
    }
    
    public Patient() {
    }
    public  void ViewPatient(ArrayList<String> x){
    
    };
    public  void SearchPatient(){};
    public  void AddPatient(){};
    public  void DeletePatient(){};
    public  void UpdatePatient(){};
    
    
   // public void bills(){}
    
    
}
