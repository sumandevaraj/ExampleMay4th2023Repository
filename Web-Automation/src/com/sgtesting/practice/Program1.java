package com.sgtesting.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		closeApp();
		
	}
	private static void launch()
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
			oBrowser.get("https://www.flipkart.com/?ef_id=537e8c9eae6a134ac9b8e8ddf605041f:G:s&s_kwcid=AL!739!10!76484920232329!76485137405439&semcmpid=sem_F1167BY7_Brand_adcenter");
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
