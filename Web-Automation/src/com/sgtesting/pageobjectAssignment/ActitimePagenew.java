package com.sgtesting.pageobjectAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimePagenew {
	public ActitimePagenew(WebDriver o)
{
	PageFactory.initElements(o,this);

}
//Webelements for User TextField
private WebElement username;

public WebElement getUser()
{
	return username;
}
private WebElement pwd;
public WebElement getPassword()
{
	return pwd;
}
//WebElement Login Button
@FindBy(xpath="//*[@id=\'loginButton\']/div")
private WebElement oLogin;
public WebElement getLogin()
{
	return oLogin;
}
// WebElement FlyoutWindow
private WebElement gettingStartedShortcutsPanelId;
public WebElement minimize()
{
	return gettingStartedShortcutsPanelId;
}
//WebElement Logout
@FindBy (linkText="Logout")
private WebElement oLogout;
public WebElement logout()
{
	return oLogout;
}
// Create user
@FindBy (xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
private WebElement CreateUser;
public WebElement cUser()
{
	return CreateUser;
}
//Add Button
@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
private WebElement oAdd;
public WebElement oAddUserButton()
{
	return oAdd;
}
//Firstname
@FindBy(xpath=("//*[@id=\'userDataLightBox_firstNameField\']"))
private WebElement Firstname;
public WebElement Fname()
{
	return Firstname;
}
//last name
@FindBy (xpath=("//*[@id=\'userDataLightBox_lastNameField\']"))
private WebElement Lastname;
public WebElement Lname()
{
	return Lastname;
}
//email
private WebElement userDataLightBox_emailField;
public WebElement email()
{
	return userDataLightBox_emailField;
}
//User name
private WebElement userDataLightBox_usernameField;
public WebElement Username()
{
	return userDataLightBox_usernameField;

}
//Password
private WebElement userDataLightBox_passwordField;
public WebElement Password()
{
	return userDataLightBox_passwordField;

}
//Re password
private WebElement userDataLightBox_passwordCopyField;
public WebElement RePassWord()
{
	return userDataLightBox_passwordCopyField;
}//Create user Button
@FindBy (xpath="//*[@id=\'userDataLightBox_commitBtn\']/div")
private WebElement cbutton;
public WebElement createUserButton()
{
	return cbutton;
}
//delete user button
private WebElement userDataLightBox_deleteBtn;
public WebElement deleteUserbutton()
{
	return userDataLightBox_deleteBtn;
}
//Create PressTask
@FindBy (xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a")
private WebElement Task;
public WebElement PressTaskButton()
{
	return Task;
}
//Task-pressAddButton

@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")
private WebElement addbutton;
public WebElement PressAddbutton()
{
	return addbutton;
}
//New Customer Button
@FindBy(xpath="/html/body/div[14]/div[1]")
private WebElement Newcustomer;
public WebElement NewCustomerButton()
{
	return Newcustomer;
}
//Enter customer name
private WebElement customerLightBox_nameField;
public WebElement AddCustomerName()
{
	return customerLightBox_nameField;
}
//Create Customer button
@FindBy (xpath="//*[@id=\'customerLightBox_commitBtn\']/div")
private WebElement Createcustomerbutton;
public WebElement CreateCustomerButton()
{
	return Createcustomerbutton;
}
//click on Customer edit button
@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
private WebElement Customereditbutton;
public WebElement CustomerEditButton()
{
	return Customereditbutton;
}
//click on action button
@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
private WebElement Actionbutton;
public WebElement ActionButton()
{
	return Actionbutton;
}
//customer Delete Button
@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
private WebElement CDeletebutton;
public WebElement CustomerdeleteButton()
{
	return CDeletebutton;
}
// customer Delete confirm Button
private WebElement customerPanel_deleteConfirm_submitTitle;
public WebElement CustomerDeleteConfirmButton()
{
	return customerPanel_deleteConfirm_submitTitle;
}
//Create new Project button
@FindBy(xpath="/html/body/div[14]/div[2]")
private WebElement pressNewprojectButton;
public WebElement ClickNewProjectButton()
{
	return pressNewprojectButton;
}
//Enter project name
private WebElement projectPopup_projectNameField;
public WebElement EnterProjectName()
{
	return projectPopup_projectNameField;
}
//Project>customer click Button
@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div")
private WebElement ProjectcustomerClickButton;
public WebElement ProjectCustomerClickButton()
{
	return ProjectcustomerClickButton;
}
//project>customer>newcustomer
@FindBy(xpath="//*[@id=\'ext-gen216\']")
private WebElement Projectcustomerwrite;
public WebElement ProjectcustomeNAMEclick ()
{
	return Projectcustomerwrite;
}//project>customer>newcustomer>enter
private WebElement projectPopup_newCustomerNameField;
public WebElement ProjectCUSTOMERNameWrite()
{
	return projectPopup_newCustomerNameField;
}
//project createButtonYellow
@FindBy (xpath="//*[@id=\'projectPopup_commitBtn\']/div")
private WebElement ProjectcreateButton;
public WebElement ProjectCreateButtonYellow()
{
	return ProjectcreateButton;
}
//Project action
@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
private WebElement Projectaction;
public WebElement ProjectActionButton()
{
	return Projectaction;
}
@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
private WebElement Projectdelete;
public WebElement ProjectDeleteButton()
{
	return Projectdelete;
}
@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
private WebElement Harieditit;
public WebElement HariEditButton()
{
	return Harieditit;
}
@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
private WebElement Deletepermanently;
public WebElement DeleteProjectPermanently()
{
	return Deletepermanently;
}
@FindBy(xpath="//*[@id=\'cpTreeBlock\'A]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
private WebElement projectHarri;
public WebElement ProjectHarrieditbutton()
{
	return projectHarri;
}
@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
private WebElement project_Description;
public WebElement project_DescriptionButton()
{
	return project_Description;
}



}
