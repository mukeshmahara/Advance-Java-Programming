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
public class UDPServer {

    public static void main(String[] args) throws Exception {
        DatagramSocket server_socket = new DatagramSocket(1234);
        
        BufferedReader server_input = new BufferedReader(new InputStreamReader(System.in));
        
        InetAddress IP_address = InetAddress.getByName("Localhost");
        
        byte out_data[] = new byte[1024];
        byte in_data[] = new byte[1024];
        
        while (true) {
            DatagramPacket packet2 = new DatagramPacket(in_data, in_data.length);
            server_socket.receive(packet2);
            String str = new String(packet2.getData());
            System.out.println(" client says: \n " + str);

            InetAddress ip_addr1 = packet2.getAddress();
            int port = packet2.getPort();
        
            String send_str = server_input.readLine();
            out_data = send_str.getBytes();
            DatagramPacket packet3 = new DatagramPacket(out_data, out_data.length, ip_addr1, port);
            server_socket.send(packet3);
        }

    }
}

