/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Access;


import java.sql.*;

/**
 *
 * @author Dell
 */
public class DB_config {

    public static void main(String args[]) {
        try {
//step1 load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create  the connection object  
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl", "aj", "aj");

//step3 create the statement object  
            Statement stmt = con.createStatement();

//step4 execute query  
            ResultSet rs = stmt.executeQuery("select * from countries");
            System.out.println("Country_id\t"+"Country_name\t\t"+"Region ID");
            while (rs.next()) {
                
                System.out.println( rs.getString(1) + "\t\t" + rs.getString(2)+""+ rs.getInt(3));
            }

//step5 close the connection object  
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
