package SocketProgramming.TwoWay;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(699);

        Socket s = serverSocket.accept();

        DataInputStream dataInputStream = new DataInputStream(s.getInputStream());


        DataOutputStream dataOutputStream = new DataOutputStream(s.getOutputStream());


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = "", s2 = "";

        while (!s1.equals("stop")) {
            s1 = dataInputStream.readUTF();

            System.out.println("Client Says : " + s1);

            s2 = bufferedReader.readLine();

            dataOutputStream.writeUTF(s2);

            dataOutputStream.flush();
        }
        dataInputStream.close();
        s.close();
        serverSocket.close();
    }
}