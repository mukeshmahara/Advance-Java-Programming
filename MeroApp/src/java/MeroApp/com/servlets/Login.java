/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeroApp.com.servlets;

import MeroApp.com.DBcon.DB_Connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class Login extends HttpServlet {

    int count_id = 1;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */

            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            DB_Connection DB = new DB_Connection();
            Connection con = DB.getCon();

            Statement stmt = con.createStatement();

            count_id++;
//            String insert_sql = "insert into credentials values('" + count_id + "','" + username + "','" + password + "')";
            String credentials = "select user_name, user_password from credentials where user_name='" + username + "' and user_password='" + password + "' ";

            ResultSet cred = stmt.executeQuery(credentials);

//            out.println(cred.);
            if (cred.first() || cred.next()) {

                String user = cred.getString("user_name");
                String pass = cred.getString("user_password");

                if (password.equals(pass) && username.equals(user)) {
                    out.println("<h1>Welcome, " +username+"</h1>");

//                    out.println("<table border='1' >"
//                            + "<tr>"
//                            + "<td>username</td>"
//                            + "<td>password</td>"
//                            + "</th>"
//                            + "</tr>"
//                            + "<td>" + cred.getString(1) + "</td>"
//                            + "<td>" + cred.getString(2) + "</td>"
//                            + "</table>"
//                    );
                } 

            } else {

                out.println("No Record found <br> Invalid Credentials");
            }

//            stmt.executeUpdate(insert_sql);
//            out.println("credentials added to database");
        } catch (SQLException ex) {

            out.println(ex);
//            out.Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
