package org.example;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;





	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.net.ServerSocket;
	import java.net.Socket;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.net.ServerSocket;
	import java.net.Socket;

	public class Recuperation {

	    public static void main(String[] args) {
	        try {
	            ServerSocket serverSocket = new ServerSocket(8080);
	            System.out.println("Attente de la connexion du client...");
	            Socket socket = serverSocket.accept();
	            System.out.println("Connexion établie avec le client.");

	            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	            String jsonData = bufferedReader.readLine();

	            System.out.println("Données JSON reçues : " + jsonData);

	            // ... complétez cette partie de code pour gérer le résultat de la requête
	            // Vous pouvez utiliser la bibliothèque Jackson pour convertir la chaîne JSON en objets Java si nécessaire

	            bufferedReader.close();
	            socket.close();
	            serverSocket.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

