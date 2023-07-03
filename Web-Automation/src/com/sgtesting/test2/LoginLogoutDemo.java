package com.sgtesting.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
	private static WebDriver oBrowser=null;
	public static ObjectMap om=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWind();
		logout();
	}
	
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			String fileName=".\\Library\\MAP\\objectmap.properties";
			om=new ObjectMap(fileName);		
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(om.getLocator("Loginpageusername")).sendKeys("admin");
			oBrowser.findElement(om.getLocator("Loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(om.getLocator("Loginpagelohinbtn")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWind()
	{
		try
		{
			oBrowser.findElement(om.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(om.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}	


