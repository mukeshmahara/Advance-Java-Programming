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
public class ClientSocket {

    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 8005);

        //reading form the keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//            Sending to the server
        OutputStream ostream = s.getOutputStream();

        PrintWriter pw = new PrintWriter(ostream, true);

                    //receiving from the server
        InputStream istream = s.getInputStream();

        BufferedReader recieveRead = new BufferedReader(new InputStreamReader(istream));

        System.out.println("started");

        String receiveMessage, sendMessage;

        while (true) {
            sendMessage = br.readLine();
            pw.println(sendMessage);
            pw.flush();
            if (((receiveMessage = recieveRead.readLine())) != null) {
                System.out.println("Server Says :" +receiveMessage);
            }
        }
    }

}
