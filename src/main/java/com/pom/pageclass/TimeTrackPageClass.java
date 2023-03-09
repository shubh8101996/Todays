package com.pom.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPageClass {
	
	@FindBy(xpath = "/html/body/div[6]/table/tbody/tr[1]/td[1]/div/div[1]/img")
	private WebElement logo;
	
	
	
	public TimeTrackPageClass(WebDriver driver) {
		
		PageFactory.initElements(driver, this);

	}
	
	
	

	

}
