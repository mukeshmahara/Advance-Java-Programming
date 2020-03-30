/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeroApp.com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class MeroServlet extends HttpServlet {
    
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/thml");
//        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("uname");
        out.println("Welcome to  MeroServlet using GET Method ");
        out.println("The user name is :"+username);

    }
     
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/thml");
//        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("uname");
        out.println("Welcome to  MeroServlet using POST method");
        out.println("The user name is :"+username);

    }
    
}
