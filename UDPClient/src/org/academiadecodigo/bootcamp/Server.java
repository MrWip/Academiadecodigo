package org.academiadecodigo.bootcamp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {

    public static void main(String[] args) {

        Server server = new Server(8000);
        server.receive();

    }


       private byte[] receive;
       private byte[] send;
       private DatagramSocket server;
       private String s;
       private int port;

        public Server(int port) {

            receive = new byte[1024];
            send = new byte[1024];

            try {

                server = new DatagramSocket(port);

            } catch (SocketException e) {
                e.printStackTrace();
            }

        }

        public void receive(){

            DatagramPacket packet = new DatagramPacket(receive,receive.length);

            System.out.println("Receiving...");
            try {

                server.receive(packet);

            } catch (IOException e) {}

           System.out.println("SERVER RECEIVED: " + receive.toString());
            port = packet.getPort();
            transformSend(packet.getAddress());

        }



        private void transformSend(InetAddress ip){

            s = new String(receive);
            s = s.toUpperCase();
            send = s.getBytes();
            DatagramPacket serverPacket = new DatagramPacket(send,send.length, ip, port);

            try {

                server.send(serverPacket);
            } catch (IOException e) {}

            System.out.println("Server sent: " + serverPacket.getData());
            server.close();
        }

}
