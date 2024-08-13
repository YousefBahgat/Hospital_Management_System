/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public  class Employees {
    protected String FirstName;
    protected String SecondName;
    protected int PhoneNum;
    protected String ID;
    protected String City;
    protected int Age;
    protected String Gender;
    protected String  Qualification;
    protected String Joining_date;
    protected String Marital_Status;
    protected String blood_group;
    Salary SA = new Salary();
    
    
    public Employees() {
    }
    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String SecondName) {
        this.SecondName = SecondName;
    }
    
    

    public int getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(int PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
   
    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public String getJoining_date() {
        return Joining_date;
    }

    public void setJoining_date(String Joining_date) {
        this.Joining_date = Joining_date;
    }

    public String getMarital_Status() {
        return Marital_Status;
    }

    public void setMarital_Status(String Marital_Status) {
        this.Marital_Status = Marital_Status;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public Salary getSA() {
        return SA;
    }

    public void setSA(Salary SA) {
        this.SA = SA;
    }
    
    public  void AddPerson(){};
    public  void DeletePerson(){};
    public  void SearchPerson(){};
    public  void UpdatePerson(){};
    public  void ViewPerson(ArrayList<String> data1){};
    public void  ViewSalary(ArrayList<String> data2){};
    
    
}
   

