package com.sgtesting.test2;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap2 {

	Properties o=null;
	public ObjectMap2(String file)
	{
		FileInputStream f=null;
		{
			try
			{
				f=new FileInputStream(file);
				o=new Properties();
				o.load(f);
						
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

	public By getlocator01(String longicalname)
	{
		By by=null;
		try
		{
			String locator=o.getProperty(longicalname);
			System.out.println(locator);
			String locatordetails[]=locator.split(";");
			String loctorname=locatordetails[0];
			String locatorvalue=locatordetails[1];
			switch(loctorname.toLowerCase())
			{
			case "id":
				by=By.id(locatorvalue);
				break;
			case "name":
				by=By.name(locatorvalue);
				break;
			case "xpath":
				by=By.xpath(locatorvalue);
				break;
			case "classname":
				by=By.className(locatorvalue);
				break;
			case "linktext":
				by=By.linkText(locatorvalue);
				break;
			case "cssselector":
				by=By.cssSelector(locatorvalue);
				break;
			case "tagname":
				by=By.tagName(locatorvalue);
				break;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}
	

}
