package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateModyProject {
	public static WebDriver oBrowser=null;
	public static ActiPage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlayout();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
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
	private static void createCustomer()
	{
		try
		{
			oPage.getTaskbar().click();
			Thread.sleep(1000);
			oPage.getAddNew().click();
			Thread.sleep(1000);
			oPage.getNewCustomer().click();
			Thread.sleep(1000);
			oPage.getCustomer().sendKeys("Dimond");
			Thread.sleep(3000);
			oPage.getCreateCustomer().click();
			Thread.sleep(1000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try
		{
			oPage.getAddNew().click();
			Thread.sleep(1000);
			oPage.getNewproject().click();
			Thread.sleep(1000);
			oPage.getprojectNameField().sendKeys("Eclipse");
			Thread.sleep(1000);
			oPage.getCreateProject().click();
			Thread.sleep(3000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyProject()
	{
		try 
		{
			oPage.getProjedit().click();
			Thread.sleep(1000);
			oPage.getDescriptionProject().sendKeys("Complete on time");
			Thread.sleep(1000);
			oPage.getcloseButton1().click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try 
		{
			oPage.getProjedit().click();
			Thread.sleep(1000);
			oPage.getProjAction().click();
			Thread.sleep(2000);
			oPage.getProjDelete().click();
			Thread.sleep(2000);
			oPage.getProjDeleteConfirm().click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try 
		{
			oPage.getclickonCustomer().click();
			Thread.sleep(1000);
			oPage.getAction().click();
			Thread.sleep(2000);
			oPage.getDelete().click();
			Thread.sleep(2000);
			oPage.getdeleteConfirm().click();
			Thread.sleep(2000);
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