/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingTutorials;

import javax.swing.*;


/**
 *
 * @author Dell
 */


public class SwingClass {
    //Frame
    JFrame f;
    
    JLabel lblname,lblpasword,lblgender,lblsem,lblmajorsubject;
    JTextField txtname,txtpass;
    JPasswordField jpass;
    JRadioButton rbmale,rbfemale,rbother;
    JComboBox<String> jcbsem;
    JCheckBox jcbc,jcbjava;

    SwingClass() {
        f = new JFrame();
        //nameLabel
        lblname = new JLabel("Name:");
        lblname.setBounds(160, 50, 150, 30);
        f.add(lblname);
        
        //textbox for name
        txtname =new JTextField();
        txtname.setBounds(300,50,250,30);
        f.add(txtname);
        
        
        
        
        
//        //textpasword label
        lblpasword = new JLabel("Password:");
        lblpasword.setBounds(160, 100, 150, 30);
        f.add(lblpasword);
        
//        //passbox for password
        txtpass =new JTextField();
        txtpass.setBounds(300,100,250,30);
        f.add(txtpass);
//        
//        //gender label 
        lblgender = new JLabel("Gender:");
        lblpasword.setBounds(160, 250, 100, 30);
        f.add(lblgender);
//        
//        //male Radio button
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(300, 250, 100, 30);
        f.add(rbmale);
//        
//        //female radio button
        rbfemale = new JRadioButton("female");
        rbfemale.setBounds(350, 250, 100, 30);
        f.add(rbfemale);
//        
//        //other radio button
        rbother = new JRadioButton("other");
        rbother.setBounds(450, 250, 100, 30);
        f.add(rbother);
//        
//        
//        
//        
//        
        f.setSize(700,700);
        f.setLayout(null);
        f.setVisible(true);
    
    }
    
    
    public static void main(String[] args){
        SwingClass sq =new SwingClass();
        
    }
    
}
