package example;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class Test1 {
	@Test
	public void a1() {
		Assert.assertEquals(1, 2);
	}
	
	@Test
	public void a2() {
		Assert.assertEquals(1, 1);
	}
	
//	@Test
//	public void  a3(ITestContext context) {
//		context.setAttribute("name", "tom");
//		
//	}
	
//	@BeforeClass
//	public void bc() {
//		System.out.println("Test1-@BeforeClass");
//	}
//	
//	@AfterMethod
//	public void ac(ITestResult result) {
//		System.out.println("������"+result.getInstance());
//		System.out.println("���Խ����"+result.getStatus());
//		System.out.println("���Է�������"+result.getName());
//		System.out.println("������Ϣ��"+result.getThrowable());
//	}
	@Test(enabled=false)
	public void a4() {
		System.out.println("enabled=false");
	}
	

	

}
