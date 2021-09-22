package steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import reports.ExtentTestManager;

@CucumberOptions(
        features = "classpath:features",
        glue = "classpath:steps",
        tags = "@SanityTest",
        plugin = {"pretty","html:target/cucumber-report.html"}

)

public class SanityTestRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite running......");
        String pathOfProject = System.getProperty("user.dir");
        ExtentTestManager.setExtentReportsObj(pathOfProject+"/extentReport.html");

    }
    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
