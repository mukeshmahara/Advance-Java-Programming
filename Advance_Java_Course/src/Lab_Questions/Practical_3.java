/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Questions;

/**
 *
 * @author Dell
 */
class Employee{
    int id,salary;
    String first_name,last_name;
    Employee(){
        
    }
    Employee(int id,String first_name,String last_name,int salary) {
        this.id =id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
   
    public int getAnnualSalary(){
        return this.salary;
    }
    
    public int getRaiseSalary(){
        return this.salary;
    }
    
    public int raiseSalary(int percent){
        return (percent*salary)/100;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }
    
    
    
}


public class Practical_3 {
    
    public static void main(String[] args){
        
        Employee e =new Employee(1,"mukesh","mahara",50000);
        
        System.out.println("Employee class description: "+e.toString());
        
        System.out.println("ID :"+e.getId());
        System.out.println("first Name: "+e.getFirst_name());
        System.out.println("last_name :" +e.getLast_name());
        System.out.println("Annual Salary :"+e.getAnnualSalary());
        
        
        e.setSalary(4000);
        System.out.println("Salary setted to :"+e.getSalary());
        
    }
    
}
