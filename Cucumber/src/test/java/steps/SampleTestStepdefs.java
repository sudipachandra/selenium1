package steps;

import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import reports.ExtentTestManager;

public class SampleTestStepdefs {
    @Given("first number is {int}")
    public void firstNumberIs(int arg1) {
        System.out.println("sample test number = :"+arg1);
        ExtentTestManager.logInfo("some test execute : name = :"+arg1);

        //logic
        //int i = 10/5;
       // int i = 10/0;
        int i = 10/arg1;
        ExtentTestManager.logInfo("step first number setup is passed");

    }
}
