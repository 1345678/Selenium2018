package com.edu.test0917;

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
public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8032/test/demo5.html");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		String title=(String)js.executeScript("return document.title");
		System.out.println(title);
		
		driver.get("http://localhost:8032/mymovie/");
		new WebDriverWait(driver,5).
		until(ExpectedConditions.elementToBeClickable(By.linkText("��¼1")));
		
//		//�����clickû����Ӧʱ����js����click
//		js.executeScript("arguments[0].click();", 
//				driver.findElement(By.linkText("��¼")));
		
	

	

	}

}
