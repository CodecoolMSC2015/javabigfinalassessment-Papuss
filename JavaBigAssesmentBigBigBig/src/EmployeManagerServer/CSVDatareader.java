package EmployeManagerServer;


import java.io.*;
import java.util.*;


public class CSVDatareader extends Datareader {

    private String csvFilePath;

    public CSVDatareader(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }


    public List<String> getPersons(List<String> searchcriteria) throws IOException {
        Scanner scanner = new Scanner(new File(csvFilePath));
        scanner.useDelimiter(";");
        List<String> personList = new ArrayList<String>();
        while (scanner.hasNext()){
            scanner.useDelimiter(";");
            String nl = scanner.nextLine();
            for (String list : personList){
                System.out.println(list);
                if (nl.contains(list)){
                    personList.add(nl);
                }
            }


        }
        scanner.close();



        return personList;
    }
}






