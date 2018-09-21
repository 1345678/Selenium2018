package example;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getInstanceName()+"-"+result.getName()+
				"ִ�гɹ���");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getInstanceName()+"-"+result.getName()+
				"ִ��ʧ���ˣ�ִ�н����Ĳ���");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getInstanceName()+"-"+result.getName()+
				"������");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
