package EmployeManagerServer;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

public class Datareader {

    String searchCriteria;
    SearchType searchType;

    public Set<Person> getPersons(String name, SearchType searchType){
        return null;
    }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }
}
