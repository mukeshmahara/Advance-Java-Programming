/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking_in_Java.Socket;

import java.net.*;
import java.io.*;

/**
 *
 * @author Dell
 */
public class MyServer {

    public static void main(String[] args){
        try {
            System.out.println("Server is listening");
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Server is waiting for connection");
            Socket s = ss.accept(); // establish connection
            System.out.println("Server is connected");

            DataInputStream dis = new DataInputStream(s.getInputStream());

            String str = dis.readUTF();
            System.out.println("Message = " + str);

            ss.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
