package EmployeManagerServer.Server;

import EmployeManagerServer.DataHandler.CSVDatareader;
import EmployeManagerServer.DataHandler.Datareader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonStoreServerSocket {
    Datareader store;

    public static void main(String[] args) throws IOException {
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
