package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserScenerio {
	public static WebDriver oBrowser=null;
	public static ActiPage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlayoutwindow();
		createUser();
		deleteuser();
		logout();

	}
	private static void launchBrowser()
	{
		try 
		{
			oBrowser=new ChromeDriver();
			oPage=new ActiPage(oBrowser);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch (Exception e) 
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
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlayoutwindow()
	{
		try
		{
			oPage.getFlyoutwindow().click();
			Thread.sleep(1000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			oPage.getUserbutton().click();
			oPage.getAdduserbutton().click();
			oPage.getfirstName().sendKeys("Nayaz");
			Thread.sleep(1000);
			oPage.getlastName().sendKeys("pasha");
			Thread.sleep(1000);
			oPage.getemail().sendKeys("nayazpasha@gmail.com");
			Thread.sleep(1000);
			oPage.getUsername().sendKeys("nayazpasha");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("nayaz1234");
			Thread.sleep(1000);
			oPage.getpasswordCopy().sendKeys("nayaz1234");
			Thread.sleep(1000);
			oPage.getCreateUser().click();
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try 
		{
			oPage.getCreateduser().click();
			Thread.sleep(1000);
			oPage.getdeleteuser().click();
			Thread.sleep(3000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(3000);
		} catch (Exception e) 
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
