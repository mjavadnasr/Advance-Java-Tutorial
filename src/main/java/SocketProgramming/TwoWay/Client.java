package SocketProgramming.TwoWay;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("localhost", 699);

        DataInputStream dataInputStream = new DataInputStream(s.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(s.getOutputStream());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = "", s2 = "";
        while (!s1.equals("stop")) {
            s1 = bufferedReader.readLine();

            dataOutputStream.writeUTF(s1);
            dataOutputStream.flush();
            s2 = dataInputStream.readUTF();

            System.out.println("Server Says : " + s2);

        }
        dataOutputStream.close();
        s.close();
    }

}