package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutScenario {
	public static WebDriver oBrowser=null;
	public static ActiPage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlayout();
		logout();

	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oPage=new ActiPage(oBrowser);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(3000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlayout()
	{
		try
		{
			oPage.getFlyoutwindow().click();
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
			oBrowser.close();
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
