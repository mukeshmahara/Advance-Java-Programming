/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking_in_Java.Socket;

import java.io.*;
import java.net.*;

/**
 *
 * @author Dell
 */
public class MyClient {

    public static void main(String[] args) throws IOException {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            dout.writeUTF("My name is client");

            dout.flush();
            dout.close();
            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
