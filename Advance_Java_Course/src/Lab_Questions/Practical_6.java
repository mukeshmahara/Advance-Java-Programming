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
class MyCircle{
    MyPoint center ;
    int radius = 1;

    MyCircle() {
    
    }
    MyCircle(int x,int y,int radius){
        
    }
    MyCircle(MyPoint Center,int radius){
        
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    
    public int getCenterX(){
        return 1;
    }
    public void setCenterX(int x){
        
    }
    
    public int getCenterY(){
        return 1;
    }
    
    public void setCenterY(int y){
        
    }
    
    public int[] getCenterXY(){
        int[] xy=new int[]{};
        return xy;
    }
    
    public void setCenterXY(int x,int y){
        
    }
    
    @Override
    public String toString(){
       return "ok"; 
    }
    
    public double getArea(){
        double area=Math.PI*radius*radius;
        return area;
        
        
    }
    
    public double getCircumference(){
        double circumference =2*Math.PI*radius;
        return circumference;
    }
    
    public double distance(MyCircle another){
        
        double distance =2;
        return distance;
    }
    
}
class MyPoint{
    int x,y;
    
}
public class Practical_6 {
    
    public static void main(String[] args){
        
    }
    
}
