package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateUserScenario {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlayout();
		createUser();
		deleteUser();
		logout();
		closeApp();

	}
	private static void launchBrowser()
	{
		try
		{
			 oBrowser=new ChromeDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
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
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Manoj");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Chilllal");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("manojchillal123@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("manoj123");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("manojbenki");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("manojbenki");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Chilllal, Manoj']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
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
