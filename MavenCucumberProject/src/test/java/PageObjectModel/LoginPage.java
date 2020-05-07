package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Log in']")
	@CacheLookup
	WebElement txtButton;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/ul/li[3]/a")
	@CacheLookup
	WebElement logOut;
	
	public void setUserName(String uname)
	{
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void setUserPassWord(String pass)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pass);
	}
	public void clickButton()
	{
	
	txtButton.click();
	}
	public void clickLogout()
	{
		logOut.click();
	}
	
	
	
	

}
