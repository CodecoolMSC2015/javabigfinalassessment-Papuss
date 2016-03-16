package EmployeManagerServer.Server;

import EmployeManagerServer.DataHandler.CSVDatareader;
import EmployeManagerServer.DataHandler.Datareader;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonStoreServerSocket {
    Datareader store;
    static Socket socket = null;
    static ObjectInputStream objectInputStream;
    static ObjectOutputStream objectOutputStream;

    public static void main(String[] args) throws IOException {
        new Client("localhost", 9090);
        while (true) {
            CSVReader();
        }


    }

    public static void CSVReader() throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CSVDatareader teszt = new CSVDatareader("C:\\CodeCool\\Let's_JAVA\\JavaEECodecoolDemo\\persons.csv");
        System.out.println("Enter how many criteria you will add and add them by using enter as a seperator:  ");

        List<String> searchcritera = new ArrayList<String>();
        int howManyCriteria = sc.nextInt();
        for (int i = 0; i < howManyCriteria; i++) {
            searchcritera.add(sc.next());
        }


        System.out.println(teszt.getPersons(searchcritera));
    }
}
