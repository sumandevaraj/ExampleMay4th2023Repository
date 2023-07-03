package com.sgtesting.pageobjectAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime4 {
	public static WebDriver oBrowser=null; 
	public static ActitimePagenew oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		create_customer();
		modify();
		Delete();
		Logout();
		close();
	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser= new ChromeDriver();
			oPage=new ActitimePagenew(oBrowser);
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
	}private static void login()
	{
		try
		{
			Thread.sleep(2000);
			oPage.getUser().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLogin().click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try
		{
			Thread.sleep(2000);

			oPage.minimize().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void create_customer()
	{
		try
		{
			Thread.sleep(2000);
			oPage.PressTaskButton().click();
			Thread.sleep(2000);
			oPage.PressAddbutton().click();
			Thread.sleep(2000);
			oPage.NewCustomerButton().click();
			Thread.sleep(2000);
			oPage.AddCustomerName().sendKeys("Hari");
			Thread.sleep(2000);
			oPage.CreateCustomerButton().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modify()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("hello");
//			Thread.sleep(2000);
//			oPage.ActionButton().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Delete()
	{
		try
		{
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oPage.ActionButton().click();
			
			Thread.sleep(4000);
			oPage.CustomerdeleteButton().click();
			Thread.sleep(2000);
			oPage.CustomerDeleteConfirmButton().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			Thread.sleep(3000);
			oPage.logout().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try
		{
			Thread.sleep(2000);
		
		oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		

	

}
