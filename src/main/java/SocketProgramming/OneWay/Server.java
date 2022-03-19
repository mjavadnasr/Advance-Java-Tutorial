package SocketProgramming.OneWay;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);

            Socket socket = serverSocket.accept();
            System.out.println("client Connected!");

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            String str = (String) dataInputStream.readUTF();
            System.out.println("Client Says : " + str);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
