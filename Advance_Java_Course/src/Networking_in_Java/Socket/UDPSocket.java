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
public class UDPSocket {

    public static void main(String[] args) throws Exception {
        //read the input from the keyboard
        BufferedReader user_input = new BufferedReader(new InputStreamReader(System.in));

        //create the DatagramSocket to create the UDP Socket
        DatagramSocket client_socket = new DatagramSocket();
        //to get the ip address
        InetAddress IP_add = InetAddress.getByName("localhost");
        System.out.println(IP_add);
        //receiving a data from the client
        byte in_data[] = new byte[1024];
        //creating buffer for send the data
        byte out_data[] = new byte[1024];
        //create the string to collect user Input
        String str = user_input.readLine();
        out_data = str.getBytes();

        //creating datagramPackets where data is encapsulated
        DatagramPacket packet1 = new DatagramPacket(out_data, out_data.length, IP_add, 1234);

        //send the datagrampacket to the server
        client_socket.send(packet1);
        // receive the datagram packet from the server
        DatagramPacket packet4 = new DatagramPacket(in_data, in_data.length);
        //receiving the datapacket from the server
        client_socket.receive(packet4);
        //getting data that we recieved
        String receive_str = new String(packet4.getData());
        System.out.println("server says:\n" + receive_str);
        client_socket.close();

    }
}
