package example;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener2 extends TestListenerAdapter
{
	
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

}
