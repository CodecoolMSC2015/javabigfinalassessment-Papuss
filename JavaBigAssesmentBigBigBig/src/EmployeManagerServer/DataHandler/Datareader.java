package EmployeManagerServer.DataHandler;

import EmployeManagerServer.Person.Person;

import java.util.Set;

public class Datareader {

    String searchCriteria;
    SearchType searchType;

    public Set<Person> getPersons(String searchCriteria, SearchType searchType) {
        return null;
    }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }
}
