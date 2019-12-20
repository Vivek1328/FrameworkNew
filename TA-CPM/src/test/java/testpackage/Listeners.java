package testpackage;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {
	
	
	public void onTestFailure(ITestResult Result) {					
        // TODO Auto-generated method stub				
		System.out.println("The name of the testcase failed is :"+Result.getName());		
    }
}
