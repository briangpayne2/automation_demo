package common;

public class Constraints {

	/*
	 * Constraints contain static variables that are not expected
	 * to change regardless of what's being tested.
	 * These include data file paths, device farm URLs, API tokens, etc..
	 */
	
	public String screenshot_path() { 
		String screenshot_path = "/Users/brianpayne/eclipse-workspace/santander/screenshots/";
		return screenshot_path;
	}
	
	public String extent_path() {
		String extent_path = System.getProperty("user.dir")+"/extent-reports/";
		return extent_path;
	}
	
}
