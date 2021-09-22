package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;


public class accStepDef {
    @When("user go to account page")
    public void userGoToAccountPage() {
    }

    @Then("user enters following details in account page")
    public void userEntersFollowingDetailsInAccountPage(DataTable datatable) {
      Map<String,String> dataMap = datatable.asMap(String.class,String.class);
        System.out.println(dataMap);
    String name = dataMap.get("name");
    System.out.println(name);

    }

    @Then("user add as row in table with following data")
    public void userAddAsRowInTableWithFollowingData(DataTable datatable) {
       List<Map<String,String>> listOfMap = datatable.asMaps();
       for(Map<String,String> map: listOfMap){
            System.out.println("click plus button to add a new row");
            System.out.println("entering data : "+map.get("name")+","+map.get("address")+","+map.get("phno")+","+map.get("landno"));
        }
    }
}
