/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classwork;

/**
 *
 * @author Dell
 */

class Circle{
    double radius;
    String color;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    default constructor
    Circle(){
        
    }
    
//    constructor that takes the radius a parameter
    Circle(double radius){
        this.radius = radius;
    }
    
    Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
    
    public void getArea(){
        System.out.println("The area of the circle is :"+3.1415*radius*radius);
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    

    public void setColor(String color) {
        this.color = color;
    }
    
      public void getCircumference(){
        System.out.println("The circumference of the circle is :"+2*3.1415*radius);
    }
     
      
      

}


public class Practice {
    public static void main(String arg[]){
//        Circle c = new Circle(14);
//        c.getArea();
//        c.getCircumference();
        
        Circle c = new Circle();
        
        c.setName("Mukeh Mahara");
        System.out.println("This is my name :"+c.getName());
        c.setColor("orange");
        c.setRadius(100);
        c.getArea();
        c.getCircumference();
    }
    
    
    
    
}
