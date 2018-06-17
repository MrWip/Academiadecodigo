package org.academiadecodigo.bootcamp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        System.out.println("Client: Give me a string");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();


        Client client =  new Client(sentence, 8000);
        try {

            InetAddress ip = InetAddress.getByName("localhost");
            client.loadSend(ip);

        } catch (UnknownHostException e) {}

        String s = client.receiveString();
        System.out.println("RECEIVED STRING: " + s);

    }

    private byte[] receive;
    private byte[] send;
    private DatagramSocket client;
    private String s;
    private int port;


    public Client(String sentence, int port){

        s = sentence;
        receive = new byte[1024];
        send = new byte[1024];
        this.port = port;

        try {

            client = new DatagramSocket();

        } catch (SocketException e) {}

    }

    public void loadSend(InetAddress ip){

        send = s.getBytes();

        DatagramPacket clientPacket = new DatagramPacket(send,send.length,ip,port);

        try {

            client.send(clientPacket);

        } catch (IOException e) {}

        System.out.println("CLIENT SENT :" + clientPacket.getData());


    }

    public String receiveString(){

       DatagramPacket finalPacket = new DatagramPacket(receive,receive.length);
        try {

            client.receive(finalPacket);

        } catch (IOException e) {}
        client.close();

        String s = new String (finalPacket.getData());
        return s;
    }

}
