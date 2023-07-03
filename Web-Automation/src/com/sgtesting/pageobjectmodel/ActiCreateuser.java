package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiCreateuser {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutwindow();
		createuser();
		deleteuser();
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
	private static void createuser()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(2000);
			oPage.oAdduserbutton().click();
			Thread.sleep(1000);
			oPage.getFirstname().sendKeys("Ganesha");
			oPage.getlastname().sendKeys("HN");
			oPage.getemail().sendKeys("suman7171@gmail.com");
			oPage.getUsername().sendKeys("gani");
			oPage.oPassword().sendKeys("ganesh124");
			oPage.getPasswordcopy().sendKeys("ganesh124");
			Thread.sleep(1000);
			oPage.getcreatebutton().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			Thread.sleep(2000);
			//oPage.getclickonuser().click();
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			oPage.deleteUserbutton().click();
			
			Thread.sleep(1000);
			oBrowser.switchTo().alert().accept();
			
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
