package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage {

	public ActiPage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//create WebElement for userName
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//create WebElement for Password
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Create WebElement for Login button
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}

	//create WebElement for Flayoutwindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyoutwindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//create WebElement for Logout
	@FindBy(linkText = "Logout")
	private WebElement oLogout;
	public WebElement getLogoutButton()
	{
		return oLogout;
	}
	//create WebElement for create user
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement ouser;
	public WebElement getUserbutton()
	{
		return ouser;
	}
	//create Webelement for Addbutton
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement oAddUser;
	public WebElement getAdduserbutton()
	{
		return oAddUser;
	}

	private WebElement firstName;
	public WebElement getfirstName()
	{
		return firstName;
	}

	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}

	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}

	private WebElement userDataLightBox_usernameField;
	public WebElement getUsername()
	{
		return userDataLightBox_usernameField;
	}

	private WebElement password;
	public WebElement getpassword()
	{
		return password;
	}

	private WebElement passwordCopy;
	public WebElement getpasswordCopy()
	{
		return passwordCopy;
	}

	@FindBy(xpath="//span[text()='Create User']")
	private WebElement oCreateUser;
	public WebElement getCreateUser()
	{
		return oCreateUser;
	}
	
	@FindBy(xpath="//span[text()='pasha, Nayaz']")
	private WebElement opasha;
	public WebElement getCreateduser()
	{
		return opasha;
	}
	
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteuser()
	{
		return userDataLightBox_deleteBtn;
	}
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement savebutton;
	public WebElement getsavebutton()
	{
		return savebutton;
	}
	
	// Create Customer Scenerio
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement oTASKS;
	public WebElement getTaskbar()
	{
		return oTASKS;
	}
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement oAddNew;
	public WebElement getAddNew()
	{
		return oAddNew;
	}
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement NewCustomer;
	public WebElement getNewCustomer()
	{
		return NewCustomer;
	}
	
	private WebElement customerLightBox_nameField;
	public WebElement getCustomer()
	{
		return customerLightBox_nameField;
	}
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement CreateCustomer;
	public WebElement getCreateCustomer()
	{
		return CreateCustomer;
	}
	
	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oclickonCreatedCust;
	public WebElement getclickonCustomer()
	{
		return oclickonCreatedCust;
	}
	
	@FindBy(xpath = "//div[text()='ACTIONS']")
	private WebElement oACTIONS;
	public WebElement getAction()
	{
		return oACTIONS;
	}
	
	@FindBy(xpath = "//div[text()='Delete']")
	private WebElement oDelete;
	public WebElement getDelete()
	{
		return oDelete;
	}
	
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getdeleteConfirm()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement oDiscription;
	public WebElement getDescription()
	{
		return oDiscription;
	}
	
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement ocloseButton;
	public WebElement getcloseButton()
	{
		return ocloseButton;
	}
	
	// Create Project Scenerio
	
	@FindBy(xpath = "/html/body/div[14]/div[2]")
	private WebElement oNewproject;
	public WebElement getNewproject()
	{
		return oNewproject;
	}
	
	private WebElement projectPopup_projectNameField;
	public WebElement getprojectNameField()
	{
		return projectPopup_projectNameField;
	}
	
	@FindBy(xpath = "//span[text()='Create Project']")
	private WebElement oCreateProject;
	public WebElement getCreateProject()
	{
		return oCreateProject;
	}
	//Delete Customer
	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement oProjEdit1;;
	public WebElement getProjedit()
	{
		return oProjEdit1;
	}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oProjAction;
	public WebElement getProjAction()
	{
		return oProjAction;
	}
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement oProjDelete;
	public WebElement getProjDelete()
	{
		return oProjDelete;
	}
	
	@FindBy(xpath = "//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")
	private WebElement odeleteConfirm;
	public WebElement getProjDeleteConfirm()
	{
		return odeleteConfirm;
	}
	
	
	//Modify Project
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement oDescriptionProject;
	public WebElement getDescriptionProject()
	{
		return oDescriptionProject;
	}
	
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
	private WebElement ocloseButton1;
	public WebElement getcloseButton1()
	{
		return ocloseButton1;
	}
}
