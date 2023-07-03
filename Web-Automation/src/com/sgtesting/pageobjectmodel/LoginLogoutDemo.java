package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutwindow();
		logout();
		CloseApp();
	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate() 
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getusername().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutwindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CloseApp()
	{
		try
		{
			oBrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
