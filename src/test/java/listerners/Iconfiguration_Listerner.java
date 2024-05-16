package listerners;

import org.testng.IConfigurationListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class Iconfiguration_Listerner implements IConfigurationListener
{

	@Override
	public void onConfigurationSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		IConfigurationListener.super.onConfigurationSuccess(tr);
	}

	@Override
	public void onConfigurationSuccess(ITestResult tr, ITestNGMethod tm) {
		// TODO Auto-generated method stub
		IConfigurationListener.super.onConfigurationSuccess(tr, tm);
	}

	@Override
	public void onConfigurationFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		IConfigurationListener.super.onConfigurationFailure(tr);
	}

	@Override
	public void onConfigurationFailure(ITestResult tr, ITestNGMethod tm) {
		// TODO Auto-generated method stub
		IConfigurationListener.super.onConfigurationFailure(tr, tm);
	}

	@Override
	public void onConfigurationSkip(ITestResult tr) {
		// TODO Auto-generated method stub
		IConfigurationListener.super.onConfigurationSkip(tr);
	}

	@Override
	public void onConfigurationSkip(ITestResult tr, ITestNGMethod tm) {
		// TODO Auto-generated method stub
		IConfigurationListener.super.onConfigurationSkip(tr, tm);
	}

	@Override
	public void beforeConfiguration(ITestResult tr) {
		// TODO Auto-generated method stub
		IConfigurationListener.super.beforeConfiguration(tr);
	}

	@Override
	public void beforeConfiguration(ITestResult tr, ITestNGMethod tm) {
		// TODO Auto-generated method stub
		IConfigurationListener.super.beforeConfiguration(tr, tm);
	}

}
