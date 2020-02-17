/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Questions;

import java.text.DecimalFormat;

/**
 *
 * @author Dell
 */
class Circle {

    double radius;
    String Color;
    Circle(double radius,String color){
        this.radius =radius;
        this.Color = color;
        
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getArea() {
        return Math.PI * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

}

public class Practical_1 {
    Practical_1() {

    }

    public static void main(String[] args) {
        
        DecimalFormat deci = new DecimalFormat("#.##");

        Circle c =new Circle(12,"orange");
        System.out.println("class description:"+c.toString());
        c.setRadius(5);
        System.out.println("This is my color :"+c.getColor());
        System.out.println("The radius of the circle is $%.2f:"+ c.getRadius());
        
        System.out.println("The Area of the circle is :"+deci.format(c.getArea()));
        System.out.println("The circumference of the circle is :"+deci.format(c.getCircumference()));

    }

}
