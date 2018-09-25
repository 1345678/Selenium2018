package com.edu.po;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage3Test {
//	get();�ڸ������ǵ�����load()����
	LoginPage3 lp =null;
	@BeforeClass
	public void initLoginPage3() {
		 lp =new LoginPage3();
	}
	@AfterClass
	public void tearDownLoginPage3() {
		lp.quitBrowser();
	}
	@Test
	public void testLoginSuccess() throws InterruptedException {
		lp.load();
		lp.get();
//		��������ѡ��һ�ּ���
		lp.login("admin", "admin");
		assertTrue(lp.getDriver().getPageSource().contains("�˳�"));
	}
	
	@Test
	public void testLoginFail() throws InterruptedException {
		
		lp.login("admin", "123456");
		assertTrue(lp.getDriver().getPageSource().contains("�ʺŻ��������"));
	}

}
