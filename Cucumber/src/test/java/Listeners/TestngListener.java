package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
       String name =  iTestResult.getMethod().getMethodName();
        System.out.println("the test name is : "+name);
      //  ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //ITestListener.super.onTestSuccess(result);
        System.out.println("onTestSuccess");
    }

    @Override
    public void onTestFailure(ITestResult result) {
       // ITestListener.super.onTestFailure(result);
        System.out.println("onTestFailure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
       // ITestListener.super.onTestSkipped(result);
        System.out.println("onTestSkipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
       // ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
        System.out.println("onTestFailedButWithinSuccessPercentage");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        //ITestListener.super.onTestFailedWithTimeout(result);
        System.out.println("onTestFailedWithTimeout");
    }

    @Override
    public void onStart(ITestContext context) {
       // ITestListener.super.onStart(context);
        System.out.println("onStart");
    }

    @Override
    public void onFinish(ITestContext context) {
      //  ITestListener.super.onFinish(context);
        System.out.println("onFinish");
    }
}
