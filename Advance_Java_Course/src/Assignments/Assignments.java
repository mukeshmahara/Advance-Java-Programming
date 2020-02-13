/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

/**
 *
 * @author Dell
 */
public class Assignments {

    int num;

    public double next_Perfect_Square(int n) {
        this.num = n + 1;
        double var = Math.ceil(Math.sqrt(num));
        double square = var * var;
        while (num < square) {
            num++;
        }
        return num;
    }
    
    public int primeCount(int start,int end){
        int count=0;
        for(int i=start;i<=end;i++){
            if(i){
                
            }
        }
        return count;
    }

}
