package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTask {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlayoutWindow();
		customer();
		project();
		task();
		//deletetask();
	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
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
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlayoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void customer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Nayaz");
			oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void project()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_projectNameField\"]")).sendKeys("Eclipse");
			oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void task()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(1000);
			//oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
			//Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]")).sendKeys("Programming");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	private static void deletetask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div[1]/div")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"deleteTaskPopup_deleteConfirm_submitBtn\"]")).click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	private static void deleteproject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
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
