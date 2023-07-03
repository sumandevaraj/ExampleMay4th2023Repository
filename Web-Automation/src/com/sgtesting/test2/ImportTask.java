package com.sgtesting.test2;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import javax.swing.filechooser.FileNameExtensionFilter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportTask {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlayout();
		importTask();
		
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
	private static void importTask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(1000);
			String filename="C:\\Excel\\Sample12.csv";
			copyFile(filename);
			Thread.sleep(1000);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(4000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void copyFile(String filename) 
	{
		StringSelection strSelection=new StringSelection(filename);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
		
	}
	

}
