package org.example;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recuperation {

    public static void main(String[] args) throws IOException {
        int port = 8080; // Le port sur lequel le serveur écoute

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Serveur en attente de connexion...");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Connexion acceptée : " + socket);

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String input;
            while ((input = br.readLine()) != null) {
                System.out.println("Données reçues : " + input);
            }

            //socket.close();
            System.out.println("Connexion fermée");
            
            
        }
    }
}
