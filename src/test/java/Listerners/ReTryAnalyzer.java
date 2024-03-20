package Listerners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryAnalyzer implements IRetryAnalyzer {

	int counter = 0;
	int retryLimit = 1;
	@Override
	public boolean retry(ITestResult result) {
		if (counter < retryLimit) {
			counter++;
			return true; // execute again
		}
		return false; // stop executing
	}


}