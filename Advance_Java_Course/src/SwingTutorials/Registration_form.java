/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingTutorials;

import java.awt.Color;
import java.awt.event.ActionEvent;

import SwingTutorials.DbConnection;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Dell
 */
public class Registration_form {

    JLabel fname, lname, address, email, password, gender, dob, city, country;
    JTextField txtfname, txtlname, txtaddress, txtemail, txtpassword, txtdob, txtcity, txtcountry;
    JRadioButton rbmale, rbfemale, rbother;

    JButton send;

    Registration_form() {

        JFrame form = new JFrame("Registration Form");

        //All the labels in the form here
        fname = new JLabel("First Name");
        fname.setBounds(100, 50, 100, 30);
        form.add(fname);

        lname = new JLabel("Last Name");
        lname.setBounds(100, 100, 100, 30);
        form.add(lname);

        address = new JLabel("Address");
        address.setBounds(100, 150, 100, 30);
        form.add(address);

        email = new JLabel("Email");
        email.setBounds(100, 200, 100, 30);
        form.add(email);

        password = new JLabel("password");
        password.setBounds(100, 250, 100, 30);
        form.add(password);

        gender = new JLabel("gender");
        gender.setBounds(100, 300, 100, 30);
        form.add(gender);

        dob = new JLabel("dob");
        dob.setBounds(100, 350, 100, 30);
        form.add(dob);

        city = new JLabel("city");
        city.setBounds(100, 400, 100, 30);
        form.add(city);

        country = new JLabel("country");
        country.setBounds(100, 450, 100, 30);
        form.add(country);

        //All the input text box here
        txtfname = new JTextField("first name");
        txtfname.setBounds(250, 50, 250, 30);
        form.add(txtfname);

        txtlname = new JTextField("Last Name");
        txtlname.setBounds(250, 100, 250, 30);
        form.add(txtlname);

        txtaddress = new JTextField("Address");
        txtaddress.setBounds(250, 150, 250, 30);
        form.add(txtaddress);

        txtemail = new JTextField("Email");
        txtemail.setBounds(250, 200, 250, 30);
        form.add(txtemail);

        txtpassword = new JTextField("Password");
        txtpassword.setBounds(250, 250, 250, 30);
        form.add(txtpassword);

        //gender radio button here
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(250, 300, 65, 30);
        form.add(rbmale);
//        
//        //female radio button
        rbfemale = new JRadioButton("female");
        rbfemale.setBounds(350, 300, 65, 30);
        form.add(rbfemale);

//        //other radio button
        rbother = new JRadioButton("other");
        rbother.setBounds(450, 300, 65, 30);
        form.add(rbother);

        txtdob = new JTextField("Date of Birth");
        txtdob.setBounds(250, 350, 250, 30);
        form.add(txtdob);

        txtcity = new JTextField("City");
        txtcity.setBounds(250, 400, 250, 30);
        form.add(txtcity);

        txtcountry = new JTextField("Country");
        txtcountry.setBounds(250, 450, 250, 30);
        form.add(txtcountry);

        //send button here
        send = new JButton("send");
        send.setBounds(250, 500, 80, 30);
        send.setBackground(Color.green);
        form.add(send);

        //Action event and label added to send button
        JLabel txt = new JLabel();
        txt.setBounds(300, 530, 200, 30);
        txt.setForeground(Color.green);
        form.add(txt);

//         send.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                txt.setText("Registred sucessfully");
//            }
        send.addActionListener((ActionEvent e) -> {

            String fname = txtfname.getText();
            String lname = txtlname.getText();
            String address = txtaddress.getText();
            String email = txtemail.getText();
            String dob = txtdob.getText();
            String password = txtpassword.getText();
            String city = txtcity.getText();
            String country = txtcountry.getText();

            System.out.println(fname + lname);

        });

        //cancel button here
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(340, 500, 80, 30);
        cancel.setBackground(Color.red);
        form.add(cancel);

        form.setSize(600, 600);
        form.setLayout(null);
        form.setVisible(true);
    }

    

    public void insertQuery() {

    }

    public static void main(String[] args) {
        
        
        DbConnection startcon;
        startcon= new DbConnection(); 
        
        Registration_form newForm = new Registration_form();

    }

}
