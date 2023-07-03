package FramesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handlepopupbrowser();

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
	private static void handlepopupbrowser()
	{
		WebElement olink=null;
		try
		{
			olink=oBrowser.findElement(By.linkText("actiTIME Inc."));
			Thread.sleep(3000);
			System.out.println("before click on link num of pop  "+popupcount());
			olink.click();
			System.out.println("After click on link num of pop  "+popupcount());
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static int popupcount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
}
