package tutorial;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.IDynamicGraph;

public class ExtentReportSample {
    public static void main(String[] args) {
        String pathOfProject = System.getProperty("user.dir");
        ExtentReports extentReportsObj = new ExtentReports(pathOfProject+"/extentReport.html");
        //start a test
        ExtentTest extentTestObj = extentReportsObj.startTest("sample test 1");

        extentTestObj.log(LogStatus.INFO,"this is some info step");
        extentTestObj.log(LogStatus.PASS,"this is some pass step");
        //stop test
        extentReportsObj.endTest(extentTestObj);
        //close the report
        extentReportsObj.flush();
    }
}
