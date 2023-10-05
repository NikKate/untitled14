
import java.io.*;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class clientSocket {

    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 8087;
        try (Socket socket = new Socket (host,port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            out.println("Hi");
            System.out.println(in.readLine());
        }
    }
}


