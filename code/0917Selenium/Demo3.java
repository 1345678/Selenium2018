package com.edu.test0917;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * �����
 */
public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8032/mymovie/");
		driver.findElement(By.linkText("��¼")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("qingdao01");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='���ϵ�¼']")).click();
		boolean s1 = driver.getPageSource().contains("�˳�");
		System.out.println(s1);
		driver.findElement(By.linkText("�˳�")).isEnabled();
				Thread.sleep(3000);
	

	

	}

}
