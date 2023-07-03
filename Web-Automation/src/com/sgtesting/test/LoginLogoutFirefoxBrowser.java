package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginLogoutFirefoxBrowser {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	   {
		   try
		   {
			   oBrowser=new FirefoxDriver();
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
	   private static void navigate()
	   {
		   try
		   {
			   oBrowser.get("http://localhost:81/user/submit_tt.do");
			   Thread.sleep(5000);
		   }catch (Exception e)
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
	  private static void minimizeFlyoutWindow()
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
	  private static void closeApplication()
	  {
		  try
		  {
			  oBrowser.quit();
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }


}
