package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeApp();
	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new FirefoxDriver();
			Thread.sleep(1000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeApp()
	{
		try {
			oBrowser.close();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
