package com.sgtesting.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiNew {
	public ActiNew(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//webElement for user
	private WebElement username;
	
	public WebElement getuser()
	{
		return username;
	}
	//webElement for password
	private WebElement pwd;
	
	public WebElement getpassword()
	{
		return pwd;
	}
	//Web Element for login
	@FindBy(xpath="//*[@id=\"loginButton\"]/div")
	private WebElement ologin;
	
	public WebElement getlogin()
	{
		return ologin;
	}
	// minimizeFlayout

	private WebElement gettingStartedShortcutsPanelId;
	
	public WebElement getminimizeFlayout()
	{
		return gettingStartedShortcutsPanelId;
	}
	//logout
	@FindBy(linkText="Logout")
	private WebElement ologout;
	
	public WebElement getlogout()
	{
		return ologout;
	}
	
	
	

	

}
