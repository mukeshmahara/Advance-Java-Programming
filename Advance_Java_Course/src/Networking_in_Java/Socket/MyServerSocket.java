/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking_in_Java.Socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Dell
 */
public class MyServerSocket {
     public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(8005);
        System.out.println("Server is ready");

        Socket s = ss.accept();

        System.out.println("Server is connected");

        //reading from the keyword
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));

        //sending to the client
        OutputStream ostream = s.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);

        //recieving from the client
        InputStream istream = s.getInputStream();

        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
        String receveiveMessage, sendMessage;

        while (true) {
            if ((receveiveMessage = receiveRead.readLine()) != null) {
                System.out.println("Client Says : " + receveiveMessage);

            }
            sendMessage = keyRead.readLine();
            pwrite.println(sendMessage);
            pwrite.flush();
        }
    }
    
}
