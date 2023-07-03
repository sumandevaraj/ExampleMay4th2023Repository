package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeApp();
	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeApp()
	{
		try 
		{
			oBrowser.close();
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
