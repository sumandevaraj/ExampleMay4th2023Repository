package com.sgtesting.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act1 {
	public static WebDriver oBrowser=null;
	public static ActiNew oPage=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimizeFlayout();
		logout();
		closeApp();
	}
	private static void launch()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oPage=new ActiNew(oBrowser);
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			Thread.sleep(2000);
			oPage.getuser().sendKeys("admin");
			oPage.getpassword().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getlogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlayout()
	{
		try
		{
			oPage.getminimizeFlayout().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void logout()
	{
		try
		{
			oPage.getlogout().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void closeApp()
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
