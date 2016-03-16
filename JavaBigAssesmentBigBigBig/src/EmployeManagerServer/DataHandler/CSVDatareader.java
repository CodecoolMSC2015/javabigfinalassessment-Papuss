package EmployeManagerServer.DataHandler;


import java.io.*;
import java.util.*;


public class CSVDatareader extends Datareader {

    private String csvFilePath;

    public CSVDatareader(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }


    public List<String> getPersons(List<String> searchcriteria) throws IOException {


        List<String> personList = new ArrayList<String>();
        for (String item : searchcriteria) {
            Scanner scanner = new Scanner(new File(csvFilePath));
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {
                scanner.useDelimiter(";");
                String nl = scanner.nextLine();
                {
                    if (nl.contains(item)) {
                        personList.add(nl);

                    }
                }

            }
            scanner.close();
        }


        return personList;
    }


}






