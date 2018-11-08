package common;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentTabularReporter;

public class Methods {

	/*
	 * Methods contain generic Java methods that will be re-used multiple times in a
	 * test script. These methods are key to standardizing the coding convention and
	 * simplifying the scripting process.
	 */

	Constraints constraint = new Constraints();
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public ExtentReports getReport(String report_type) {

		extent = new ExtentReports();
		if (report_type.equals("html")) {
			ExtentHtmlReporter html = new ExtentHtmlReporter(constraint.extent_path()+"/ExtentHtmlReport.html");
			extent.attachReporter(html);
		}
		if (report_type.equals("table")) {
			ExtentTabularReporter table = new ExtentTabularReporter(constraint.extent_path()+"ExtentTabluarReport.html");
			extent.attachReporter(table);
		}
		return extent;
	}
	
	public ExtentTest createTestName(String test_name) {
		test = extent.createTest(test_name);
		return test;
	}
	
	public ExtentTest reportPass(String details) {
		test.pass(details);
		return test;
	}
	
	public ExtentTest reportFail(String details) {
		test.fail(details);
		return test;
	}
	
	public void closeReport(String report_type) {
		if (extent.equals(null)) {}else {
			extent.flush();
		}
	}


}
