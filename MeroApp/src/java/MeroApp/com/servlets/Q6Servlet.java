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
import java.sql.DriverManager;
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
public class Q6Servlet extends HttpServlet {

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

            out.println("<h1>Servlet Q6Servlet at " + request.getContextPath() + "</h1>");

            int roll_no = Integer.parseInt(request.getParameter("roll_no"));
            String name = request.getParameter("uname");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String faculty = request.getParameter("faculty");
            String date_of_admission = request.getParameter("doa");

            
            DB_Connection DB = new DB_Connection();
            Connection conn = DB.getCon();
            Statement stmt = conn.createStatement();
            
//            String sql ="insert into student values('" + roll_no + "','" + name + "','" + address + "','" + email + "','" + faculty + "','" + date_of_admission + "')";
            
            stmt.executeUpdate("insert into student values('"+roll_no+"','"+name+"','"+address+"','"+email+"','"+faculty+"','"+date_of_admission+"')");
        
//           conn.setAutoCommit(false);
            out.println("Recorded inserted sucessfullty");
        
        } catch (SQLException ex) {
            out.println(ex);
            Logger.getLogger(Q6Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
     * @param response Servlet response
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
    