package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlayout();
		logout();
		closeApp();
		
	}
	private static void launchBrowser()
	{
		try 
		{
			oBrowser=new ChromeDriver();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void minimizeFlayout()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try 
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeApp()
	{
		try {
			oBrowser.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
