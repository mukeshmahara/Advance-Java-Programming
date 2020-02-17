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
class Rectangle{
    float length,width;
    Rectangle(){
        
    }
    Rectangle(float length,float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }
    
    public float getArea(){
        return length*width;
    }
    
    public float getPeri(){
        return 2*(length+width);
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
    
    
}

public class Practical_2 {
    
    
    
    public static void main(String[] args){
        
        Rectangle r = new Rectangle(20,20);
        System.out.println("Desc:"+r.toString());
        System.out.println("Area:"+r.getArea());
        System.out.println("Perimeter :"+r.getPeri());
        r.setLength(10);
        r.setWidth(5);
        System.out.println("Desc:"+r.toString());
        System.out.println("Area:"+r.getArea());
        System.out.println("Perimeter :"+r.getPeri());
        
        
    }
}
