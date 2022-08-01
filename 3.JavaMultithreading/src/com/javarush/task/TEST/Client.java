package com.javarush.task.TEST;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket()) {
//            socket.connect(new InetSocketAddress("india.colorado.edu", 13), 2000);
            socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 8189), 2000);
            Scanner scanner = new Scanner(socket.getInputStream());

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}
