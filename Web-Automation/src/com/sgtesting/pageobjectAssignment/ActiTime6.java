package com.sgtesting.pageobjectAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime6 {
	public static WebDriver oBrowser=null; 
	public static ActitimePagenew oPage=null;
	public static void main(String[] args) {
		

		launchBrowser();
		navigate();
		login();
		minimize();
		create_customer();
		Create_project();
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
	private static void Create_project()
	{
		try
		{
			Thread.sleep(2000);
			oPage.PressAddbutton().click();
			Thread.sleep(3000);
			oPage.ClickNewProjectButton().click();
			Thread.sleep(2000);
			oPage.EnterProjectName().sendKeys("harii");
			Thread.sleep(2000);
			oPage.ProjectCustomerClickButton().click();
			Thread.sleep(1000);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}private static void modify()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
		Thread.sleep(2000);
			oPage.ProjectDeleteButton().click();
			Thread.sleep(2000);
			//oPage.project_DescriptionButton().click();
			oPage.project_DescriptionButton().sendKeys("HELLO");
			Thread.sleep(2000);
			oPage.ProjectHarrieditbutton().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	private static void Delete()
	{
		try
		{
			oPage.ProjectDeleteButton().click();
			Thread.sleep(3000);

			oPage.ProjectActionButton().click();
			Thread.sleep(2000);
			oPage.ProjectDeleteButton().click();
			Thread.sleep(2000);
			oPage.DeleteProjectPermanently().click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oPage.ActionButton().click();
			Thread.sleep(3000);
			oPage.CustomerdeleteButton().click();
			Thread.sleep(3000);
			oPage.CustomerDeleteConfirmButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			Thread.sleep(1000);
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
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
