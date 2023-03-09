package com.pom.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	@BeforeTest
	public void browserinit() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

	}

	@AfterTest
	public void tearup() {

//		driver.close();

	}

}
