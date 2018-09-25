package com.edu.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
//	1��ͨ��@FindBy�ķ�ʽ�ҳ������漰��������ҳ��Ԫ��
//	2���ڹ��췽����ʵ����WebDriver����,����ʼ�����е�ҳ��Ԫ��
//	3��ʵ�����еĲ�������

	public WebDriver driver =null;
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submitBtn;
	
//	public Select Fruit;
	
	public LoginPage2() {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		driver = new FirefoxDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void openUrl() {
		this.driver.get("http://localhost:8032/mymovie/admin.php/");
	}
	
	public void login(String u_name,String u_password) throws InterruptedException {
		
		this.username.sendKeys(u_name);
		this.password.sendKeys(u_password);
		this.submitBtn.click();
		Thread.sleep(3000);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void quitBrowser() {
		this.driver.quit();
	}
	
}
