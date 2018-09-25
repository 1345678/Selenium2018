package com.edu.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
//	1��ͨ��@FindBy�ķ�ʽ�ҳ������漰��������ҳ��Ԫ��
//	2��ͨ�����췽����ʼ�����е�Ԫ��,
//	PageFactory.initElements(driver, this);
	@FindBy(name="username")
	public WebElement username;
	
//	@FindBys
	
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submitBtn;
	
	public  LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
