package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//Web elementb for User text field
	private WebElement username;

	public WebElement getusername()
	{
		return username;

	}
	//Web element passward
	private WebElement pwd;

	public WebElement getPassword()
	{
		return pwd;
	}
	//Web element for Login button
	@FindBy(xpath="//*[@id=\"loginButton\"]/div")
	private WebElement oLogin;

	public WebElement getLogin()
	{
		return oLogin;
	}
	//WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;

	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//WebElement for Logout link
	@FindBy(linkText ="Logout")
	private WebElement oLogout;

	public WebElement getLogout()
	{
		return oLogout;
	}
	//Create user
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement ouser;

	public WebElement getUser()
	{
		return ouser;
	}
	//Add user

	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement oAdd;

	public WebElement oAdduserbutton()
	{
		return oAdd;
	}
	//FirstName 
	@FindBy(xpath="//*[@id=\"userDataLightBox_firstNameField\"]")
	private WebElement ofirstname;

	public WebElement getFirstname()
	{
		return ofirstname;
	}
	//LastName
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement olastname;

	public WebElement getlastname()
	{
		return olastname;
	}
	//Email
	@FindBy(xpath="//*[@id=\"userDataLightBox_emailField\"]")
	private WebElement oemail;

	public WebElement getemail()
	{
		return oemail;
	}
	//Username
	@FindBy(xpath="//*[@id=\'userDataLightBox_usernameField\']")
	private WebElement ousername;

	public WebElement getUsername()
	{
		return ousername;
	}
	//password
	@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")
	private WebElement opassword;

	public WebElement oPassword()
	{
		return opassword;
	}
	//ReenterPassword
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement opasswordcopy;

	public WebElement getPasswordcopy()
	{
		return opasswordcopy;
	}
	//createbutton
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement ocreatebutton;

	public WebElement getcreatebutton()
	{
		return ocreatebutton;
	}
	//delete user
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oclickonuser;

	public WebElement getclickonuser()

	{
		return oclickonuser;
	}
	//delete user
	
	//delete user button
	private WebElement userDataLightBox_deleteBtn;
	public WebElement deleteUserbutton()
	{
		return userDataLightBox_deleteBtn;
	}
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a")
	private WebElement oTask;

	public WebElement getTask()
	{
		return oTask;
	}
	//create  Customer
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement oAddCustomer;

	public WebElement getCustomer()
	{
		return oAddCustomer;
	}
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement oNewcustomer;

	public WebElement getnewCustomer()
	{
		return oNewcustomer;
	}
	@FindBy(xpath="//*[@id=\"customerLightBox_nameField\"]")
	private WebElement ocustomername;

	public WebElement getcustomername()
	{
		return ocustomername;
	}
	@FindBy(xpath="//*[@id=\"customerLightBox_nameField\"]")
	private WebElement ocreatecustomer;

	public WebElement getcreatecustomername()
	{
		return ocreatecustomer;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oselectcust;

	public WebElement getselectcust()
	{
		return oselectcust;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
	private WebElement oactions;

	public WebElement getcustActions()
	{
		return oactions;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement odeletecust;

	public WebElement getcustdelete()
	{
		return odeletecust;
	}
	@FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")
	private WebElement odeletecustper;

	public WebElement getcustdeleteper()
	{
		return odeletecustper;
	}
	
}