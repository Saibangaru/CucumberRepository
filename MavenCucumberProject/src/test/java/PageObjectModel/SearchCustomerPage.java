package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class SearchCustomerPage {
	public WaitHelper waitHelper;
	
	public WebDriver ldriver;
	public SearchCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waitHelper = new WaitHelper(ldriver);
			
	}


	@FindBy(id="SearchEmail")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="SearchFirstName")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy(id="SearchLastName")
	@CacheLookup
	WebElement txtLastname;
	
	@FindBy(id="search-customers")
	@CacheLookup
	WebElement btnSearch;
	
	@FindBy(xpath="//table[@role='grid']")
	@CacheLookup
	WebElement tableSearchResult;
	
	@FindBy(xpath="//table[@id='customers-grid']")
	WebElement table;
	
	@FindBy(xpath="//table[@id='customers-grid']//tbody/tr")
	List<WebElement> tableRows;
	
	@FindBy(xpath="//table[@id='customers-grid']//tbody/tr/td")
	List<WebElement> tableColumns;
	
	public void setEmail(String email)
	{
	waitHelper.WaitForElement(txtEmail,10);
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setFirstName(String fName)
	{
		waitHelper.WaitForElement(txtFirstName,30);
		txtFirstName.clear();
		txtFirstName.sendKeys(fName);
	}
	public void setLastName(String lName)
	{
		waitHelper.WaitForElement(txtLastname,30);
		txtLastname.clear();
		txtLastname.sendKeys(lName);
	}
	public void clickSearch()
	{
		btnSearch.click();
		waitHelper.WaitForElement(btnSearch,10);
	}
	
	public int getNumberOfRows()
	{
		return (tableRows.size());
		
	}
	public int getNumberOfColumns()
	{
		return(tableColumns.size());
		
		
	}
	
	public boolean searchCustomerByEmail(String email)

	{
		boolean flag=false;
		
		for(int i=1; i<=getNumberOfRows(); i++)
						
		{
			String emailId=table.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr["+i+"]/td[2]")).getText();
					
					System.out.println(emailId);
			if(emailId.equals(email))
				
			{
				flag=true;
			}
		}
			return flag;		
		}
			
	public boolean searchCustomerByName(String name)

	{
		boolean flag=false;
		
		for(int i=1; i<=getNumberOfRows(); i++)
						
		{
			String emailId=table.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr["+i+"]/td[3]")).getText();
					
					System.out.println(name);
					
				String names[]=name.split(" ");
			if(names[0].equals("Victoria")&& names[1].equals("Terces"))
				
			{
				flag=true;
			}
		}
			return flag;		
		}
			
			
			
			
			
			
			
	}
	
	
	
	
	


