/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author acer
 */
public class Salary {
   private int salaryperhour;
   private int hoursperday;
   private int dayspermonth;

    public int getSalaryperhour() {
        return salaryperhour;
    }

    public void setSalaryperhour(int salaryperhour) {
        this.salaryperhour = salaryperhour;
    }

    public int getHoursperday() {
        return hoursperday;
    }

    public void setHoursperday(int hoursperday) {
        this.hoursperday = hoursperday;
    }

    public int getDayspermonth() {
        return dayspermonth;
    }

    public void setDayspermonth(int dayspermonth) {
        this.dayspermonth = dayspermonth;
    }
   
 
   public int salaryperday(){
     return this.salaryperhour*this.hoursperday;    
   }
   public int salarypermonth(){
    
    return this.salaryperday()* dayspermonth;
   }
   public void UpdateSalary(){};
   public void ShowSalay(){};
   
}
