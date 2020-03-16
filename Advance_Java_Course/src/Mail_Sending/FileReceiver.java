/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mail_Sending;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
/**
 *
 * @author Dell
 */
public class FileReceiver {
     public static void main(String[] args) throws IOException {
        FileReceiver server = new FileReceiver();
        SocketChannel socketChannel = server.createServerSocketChannel();
        server.readFromSocketChannel(socketChannel);
    }
 
    private void readFromSocketChannel(SocketChannel socketChannel) throws IOException {
        // Receiver File Location
        String filePath ="F:\\reciver\\sample.txt";
 
        Path path = Paths.get(filePath);
        FileChannel fileChannel = FileChannel.open(path, 
                EnumSet.of(StandardOpenOption.CREATE, 
                        StandardOpenOption.TRUNCATE_EXISTING,
                        StandardOpenOption.WRITE)
                );      
 
        // Allocate a ByteBuffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while(socketChannel.read(buffer) > 0) {
            buffer.flip();
            fileChannel.write(buffer);
            buffer.clear();
        }
        fileChannel.close();
        System.out.println("Received File Successfully!");
        socketChannel.close();
    }
 
    private SocketChannel createServerSocketChannel() throws IOException {
        ServerSocketChannel serverSocket = null;
        SocketChannel client = null;
        serverSocket = ServerSocketChannel.open();
        serverSocket.socket().bind(new InetSocketAddress(9000));
        client = serverSocket.accept();
 
        System.out.println("Connection Established . .?= " + client.getRemoteAddress());
        return client;
    }
}
