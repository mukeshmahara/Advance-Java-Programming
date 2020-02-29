/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingTutorials;

//import javax.swing.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Dell
 */
public class SwingClass {

    //Frame
    JFrame f;

    JLabel lblname, lblpasword, lblgender, lblsem, lblmajorsubject;
    JTextField txtname, txtpass;
    JPasswordField jpass;
    JRadioButton rbmale, rbfemale, rbother;
    JComboBox<String> jcbsem;
    JCheckBox jcbc, jcbjava;

    JButton jsubmit;

    SwingClass() {

        f = new JFrame();
        //nameLabel
        lblname = new JLabel("Username");
        lblname.setBounds(160, 50, 100, 30);
        f.add(lblname);

        //textbox for name
        txtname = new JTextField();
        txtname.setBounds(250, 50, 200, 30);
        f.add(txtname);

//        //textpasword label
        lblpasword = new JLabel("Password");
        lblpasword.setBounds(160, 100, 100, 30);
        lblpasword.setText("password");
        f.add(lblpasword);

//        //passbox for password
        txtpass = new JTextField();
        txtpass.setBounds(250, 100, 200, 30);
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

        jsubmit = new JButton("Submit");
        jsubmit.setBounds(300, 300, 80, 30);
        f.add(jsubmit);

        JButton jcancel = new JButton("cancel");
        jcancel.setBounds(390, 300, 80, 30);
        f.add(jcancel);

        jsubmit.setBackground(Color.green);
        jcancel.setBackground(Color.red);

        
        f.setSize(700, 700);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        SwingClass sq = new SwingClass();

    }

}
