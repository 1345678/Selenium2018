package com.edu.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageMovie {
	
	@FindBy(xpath="//h2[contains(text(),'ӰƬ����')]")
	public WebElement fileManage;
	@FindBy(name="filmname")
	public WebElement filmname;

}
