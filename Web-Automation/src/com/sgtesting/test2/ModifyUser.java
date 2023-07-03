package com.sgtesting.test2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUser {
	public static   WebDriver l=null;
    public static ObjectMap1 k=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login01();
		minimizeFlyOutWind();
		usercreate();
		modifyuser();
		delete();
		logout();

	}
	private static void launch()
	{
		try
		{
			l=new ChromeDriver();
			String filename01=".\\ObjectMap2\\objectmap.properties";
			k=new ObjectMap1(filename01);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			l.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login01()
	{
		try
		{
			l.findElement(k.getlocator01("getlonginusernames")).sendKeys("admin");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getloginpassward")).sendKeys("manager");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getloginclick")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWind()
	{
		try
		{
			l.findElement(k.getlocator01("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void usercreate()
	{
		try
		{
			l.findElement(k.getlocator01("getclickonuser")).click();
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getadduserclick")).click();
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getuseronefirstname")).sendKeys("user1");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getuserlastname")).sendKeys("us");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getuserEmail")).sendKeys("user123@gmail.com");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getusernameforuser")).sendKeys("user123");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getusernamepassword")).sendKeys("123user");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getusernamecopypassword")).sendKeys("123user");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getaddusercreate")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser()
	{
		try
		{
			l.findElement(k.getlocator01("getclickonuser1")).click();
			Thread.sleep(1000);
			l.findElement(k.getlocator01("getclickonlastname")).clear();
			Thread.sleep(1000);
			l.findElement(k.getlocator01("getclickonlastname")).sendKeys("ad");
			Thread.sleep(1000);
			l.findElement(k.getlocator01("getclickonsave")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void delete()
	{
		try
		{
			l.findElement(k.getlocator01("getclickonmoduser")).click();
			Thread.sleep(1000);
			l.findElement(k.getlocator01("getclickondelete")).click();
			Thread.sleep(1000);
			Alert oAlert=l.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			l.findElement(k.getlocator01("getout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}


