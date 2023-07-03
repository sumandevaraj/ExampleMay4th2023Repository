
package com.sgtesting.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



	
public class ChromeBrowser {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeAppplication();
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
		   oBrowser.get("http://localhost:81/user/submit_tt.do");
		   Thread.sleep(5000);
	   }catch (Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   private static void closeAppplication()
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
