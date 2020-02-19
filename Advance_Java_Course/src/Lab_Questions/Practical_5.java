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

class Book{
    String name;
    
    Aurthor[] aurthors ;
    
    double price;
    int qty = 0;
    
    Book( String name, Aurthor[] aurthors,double price){
        this.aurthors =aurthors;
        this.name = name;
        this.price = price;
        
        
    }
    
    Book(String name, Aurthor[] aurthors, double price, int qty){
        this.name = name;
        this.aurthors = aurthors;
        this.price = price;
        this.qty = qty;
        
        
        
    }

//    get methods for name,aurthor,price and quantiry
    public String getName() {
        return name;
    }

    public Aurthor[] getAurthors() {
        return aurthors;
    }



    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    //user defined methods
    @Override
    public String toString(){
        
        return "";
    }
    
    public String getAurthors_Names(){
        return "";
    }
    
    //setter methods for price and quantity
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}

class Aurthor{
    String name,email;
    char gender;
//    Aurthor(String name,String email,char gender){
//        this.name =name;
//        this.email = email;
//        this.gender = gender;
        
    }
    
    
    
    
    
    



public class Practical_5 {
    public static void main(String[] args){
        
        
        
       Aurthor[] auth = new Aurthor[]{};
        Book b = new Book("AdvanceJava",auth,500);
        
        System.out.println("Aurthors are :"+b.getAurthors());

     
    }

   
    
}
