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
        lblname = new JLabel("Username");
        lblname.setBounds(160, 50, 100, 30);
        f.add(lblname);
        
        //textbox for name
        txtname =new JTextField();
        txtname.setBounds(250,50,200,30);
        f.add(txtname);
        
        
//        //textpasword label
        lblpasword = new JLabel("Password");
        lblpasword.setBounds(160, 100, 100, 30);
        f.add(lblpasword);
        
//        //passbox for password
        txtpass =new JTextField();
        txtpass.setBounds(250,100,200,30);
        f.add(txtpass);
//        
//        //gender label 
        lblgender = new JLabel("Gender");
        lblgender.setBounds(160, 250, 80, 30);
        f.add(lblgender);
//        
//        //male Radio button
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(250, 250, 100, 30);
        f.add(rbmale);
//        
//        //female radio button
        rbfemale = new JRadioButton("female");
        rbfemale.setBounds(350, 250, 100, 30);
        f.add(rbfemale);
      
//        //other radio button
        rbother = new JRadioButton("other");
        rbother.setBounds(450, 250, 100, 30);
        f.add(rbother);

        
        f.setSize(700,700);
        f.setLayout(null);
        f.setVisible(true);
    
    }

    public JFrame getF() {
        return f;
    }

    public JLabel getLblname() {
        return lblname;
    }

    public JLabel getLblpasword() {
        return lblpasword;
    }

    public JLabel getLblgender() {
        return lblgender;
    }

    public JLabel getLblsem() {
        return lblsem;
    }

    public JLabel getLblmajorsubject() {
        return lblmajorsubject;
    }

    public JTextField getTxtname() {
        return txtname;
    }

    public JTextField getTxtpass() {
        return txtpass;
    }

    public JPasswordField getJpass() {
        return jpass;
    }

    public JRadioButton getRbmale() {
        return rbmale;
    }

    public JRadioButton getRbfemale() {
        return rbfemale;
    }

    public JRadioButton getRbother() {
        return rbother;
    }

    public JComboBox<String> getJcbsem() {
        return jcbsem;
    }

    public JCheckBox getJcbc() {
        return jcbc;
    }

    public JCheckBox getJcbjava() {
        return jcbjava;
    }
    
    
    public static void main(String[] args){
        SwingClass sq =new SwingClass();
        System.out.println(""+sq.txtpass);
    }
    
}
