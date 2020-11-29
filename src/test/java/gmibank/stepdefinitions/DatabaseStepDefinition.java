package gmibank.stepdefinitions;

import cucumber.api.java.en.Given;
import gmibank.utilities.DatabaseUtility;

import java.util.List;

public class DatabaseStepDefinition {

    @Given("user connect database and print all data")
    public void user_connect_database_and_print_all_data() {
        DatabaseUtility.createConnection();

        String query = "SELECT * FROM public.tp_customer";
        List<Object> list = DatabaseUtility.getColumnData(query, "email");

        for(Object w : list){
            System.out.println(w.toString());
        }

    }
}
