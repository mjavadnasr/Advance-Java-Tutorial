package SocketProgramming.OneWay;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost" , 8000);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            dataOutputStream.writeUTF("I am here!!!!");

            dataOutputStream.flush();
            dataOutputStream.close();

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
