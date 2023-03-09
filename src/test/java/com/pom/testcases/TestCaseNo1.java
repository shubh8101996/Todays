package com.pom.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.base.Base;
import com.pom.pageclass.LoginPageClass;
import com.pom.pageclass.TimeTrackPageClass;

public class TestCaseNo1 extends Base {

	
	@Test(description = "Login Functionality")
	public void LoginFun() throws InterruptedException   {
		
		LoginPageClass lp=new LoginPageClass(driver);
		TimeTrackPageClass tt=new TimeTrackPageClass(driver);
		
		lp.EnterUserName("trainee");
		lp.EnterPasword("trainee");
		lp.EnterLoginBTn();
		Thread.sleep(5000);
		
		
		
	}

}
