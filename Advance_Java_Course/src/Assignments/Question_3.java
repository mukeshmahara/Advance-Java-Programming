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
public class Question_3 {

    
    public void isInertial(int[] a){
        for (int i = 0; i < a.length; i++) {
            
            if (a[i]%2 == 0) {
                int[] evenarr;
                System.out.println("the even number is:"+a[i]);
            } 
            else if(a[i]%2!=0){
                int[] oddarr;
                System.out.println("The odd number is :"+a[i]);
                
            }
            else {
                
                    
                    
            }
            
        }
        
        

    }
    
    
    
    

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 7, 8};
        
       Question_3 q = new Question_3();
       q.isInertial(a);
    }

}
