package listerners;

import org.testng.IInvokedMethod;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class Invoke_Method implements IInvokedMethod
{

	@Override
	public boolean isTestMethod() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isConfigurationMethod() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ITestNGMethod getTestMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITestResult getTestResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getDate() {
		// TODO Auto-generated method stub
		return 0;
	}

}
