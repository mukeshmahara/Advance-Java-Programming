/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingTutorials;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class DbConnection {

    DbConnection() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/advancejava", "root", "password");
            
            //here advancejava is database name, root is username and password  
                        System.out.println("Connected to DB");
            //query to execute here
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
                        + rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println("unable to connect database...");
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

    }

}
