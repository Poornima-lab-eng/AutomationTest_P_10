package Extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReports {
	@Test
	
	public void createReports() {
		
		String timestamp = LocalDateTime.now().toString().replace(":","-");
		
		//step 1:create ExtentSparkReporter object
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/Extentreports_"+timestamp+".html");
		
		//step 2:create Extentreports object
		ExtentReports ereport=new ExtentReports();
		
		//step 3:Attach ExtentSparkreporter to Extentreports
		ereport.attachReporter(spark);
		
		//step 4: create ExtentTest object
		ExtentTest test = ereport.createTest("createReports");
		
		//step 5: call lo(status,"message")
		test.log(Status.PASS, "Message is added into the report");
		
		//call flush()
		ereport.flush();
		
		
	}

}
