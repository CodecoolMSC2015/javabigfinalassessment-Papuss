package EmployeManagerServer.Server;

import EmployeManagerServer.DataHandler.CSVDatareader;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {

    public Server() {
        try {
            ServerSocket ss = new ServerSocket(9090);
            Socket socket = ss.accept();
            System.out.println("client connected");
            InputStream is = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            OutputStream os = socket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            System.out.println("streams established");

            while (true) {
                Scanner sc = new Scanner(System.in);

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                CSVDatareader teszt = new CSVDatareader("C:\\CodeCool\\Let's_JAVA\\JavaEECodecoolDemo\\persons.csv");
                System.out.println("Enter how many criteria you will add and add them by using enter as a seperator:  ");
                List<String> searchcritera = new ArrayList<String>();
                int howManyCriteria = sc.nextInt();
                for (int i = 0; i < howManyCriteria; i++) {
                    searchcritera.add(sc.next());
                }
                if (socket.isClosed())
                    break;
                oos.close();
                os.close();
                ois.close();
                is.close();
                socket.close();
                ss.close();
                System.out.println("server closed.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}



