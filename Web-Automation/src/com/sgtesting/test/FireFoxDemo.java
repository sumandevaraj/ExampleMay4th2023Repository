package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FireFoxDemo {
	
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
			   ProfilesIni profiles=new ProfilesIni();
			   FirefoxProfile ffprofile= profiles.getProfile("http://sgtesting.com");
			   FirefoxOptions options=new FirefoxOptions();
			   options.setProfile(ffprofile);
			   oBrowser=new FirefoxDriver(options);
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
