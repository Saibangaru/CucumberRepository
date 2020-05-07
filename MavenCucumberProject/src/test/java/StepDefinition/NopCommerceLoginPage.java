package StepDefinition;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.CustomerPage;
import PageObjectModel.LoginPage;
import PageObjectModel.SearchCustomerPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class NopCommerceLoginPage  extends BaseClass{

//	public WebDriver driver;/* declared these two in Baseclass and  extended to this class
//	public LoginPage lp;
	
	public static Logger logger;
	@Before
	
	public void setup() throws IOException
	{
		configprop = new Properties();
		FileInputStream configProfile= new FileInputStream("config.properties");
		
		configprop.load(configProfile);
		
		
	//	private static final Logger logger = LogManager.getLogger(NopCommerceLoginPage.class.getName());
		//Logger= LogManager.getLogger(NopCommerceLoginPage.class);
		//PropertyConfigurator.configure("log4j.properties");
		//Logger.setLevel(Level.DEBUG);
	//	DOMConfigurator.configure("log4j2.xml");
		logger=logger.getLogger("BaseClass");
		 PropertyConfigurator.configure("log4j.properties");
		
		String br= configprop.getProperty("browser");
		//if(br=="chrome")
		
			
		
		System.setProperty("webdriver.chrome.driver",configprop.getProperty("chromepath"));
		   driver=new ChromeDriver();
		
		
		logger.info("enter value");
		logger.info("Hello world");
	
	}

@Given("User Launch Chrome browser")
public void user_Launch_Chrome_browser() {
	
	
	lp= new LoginPage(driver);
	
	
	
logger.info("Page opened");
}

@When("User open Url {string}")
public void user_open_Url(String  title) {
	
	driver.get(title);    
}

@When("Enter user email as {string} and password as {string}")
public void enter_user_email_as_and_password_as(String email, String pass) {
    
	lp.setUserName(email);
	lp.setUserPassWord(pass);
}

@When("click on login")
public void click_on_login() {
	lp.clickButton();
    
}

@Then("page title should be {string}")
public void page_title_should_be(String title) {
    
	String act_title=driver.getTitle();
if(act_title==title)
{
	System.out.println("same title");
}
else
{
	System.out.println("not same title");
}
}

@When("User click on logout link")
public void user_click_on_logout_link() {
    lp.clickLogout();
}


    

//Customer Feature step definitions

@Then("User can view  Dashboard")
public void user_can_view_Dashboard() {
    custpage=new CustomerPage(driver);// CustomerPage POM
    Assert.assertEquals("Dashboard / nopCommerce administration",custpage.getPageTitle());
}

@When("User click on Customer menu")
public void user_click_on_Customer_menu() {
   custpage.clickOnCustomersMenu();
}

@When("click on customer item")
public void click_on_customer_item() {
    
	custpage.clickOnCustomersMenuItem();
}

@When("click on Add new")
public void click_on_Add_new() {
    custpage.clickOnAddnew();
}

@Then("User can view add new  Customer page")
public void user_can_view_add_new_Customer_page() {
    Assert.assertEquals("Add a new customer / nopCommerce administration", custpage.getPageTitle());
}

@Then("Enter Customer info")
public void enter_Customer_info() throws InterruptedException {
    String email= randomString()+ "@gmail.com";
    custpage.setEmail(email);
    custpage.setPassword("test123");
    custpage.setCustomerRoles("guest");
    Thread.sleep(4000);
    
    custpage.setAdminContent("sailu23");
    custpage.setCompanyName("newcompany");
    custpage.setManagerOfVendor("Vendor 1");
    custpage.setFirstName("Sailu");
    custpage.setLastName("Daggupati");
    custpage.setGender("Female");
    custpage.setDob("02/02/1985");
}

@Then("Click save")
public void click_save() {
    custpage.clickOnSave();
}

@Then("User can see confirmation message {string}")
public void user_can_see_confirmation_message(String string) {
   
   // Assert.assertEquals("Edit customer details / nopCommerce administration",custpage.getPageTitle());
Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
}



//Search customer by email
@Then("Enter customer email")
public void enter_customer_email() {
	
	searchpage=new SearchCustomerPage(driver);
	
searchpage.setEmail("victoria_victoria@nopCommerce.com");
}

    


@When("Click on search button")
public void click_on_search_button() {
	searchpage.clickSearch();
    
}

@Then("User should found email in the search table")
public void user_should_found_email_in_the_search_table() {
boolean status1=searchpage.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
  
Assert.assertEquals(true,status1);

}

// search by name

@When("Enter customer first name")
public void enter_customer_first_name() {
    searchpage=new SearchCustomerPage(driver);
    searchpage.setFirstName("Victoria");
}

@When("Enter customer last name")
public void enter_customer_last_name() {
    searchpage.setLastName("Terces");
}
@Then("User should found name in the search table")
public void user_should_found_name_in_the_search_table() {
    boolean status= searchpage.searchCustomerByName("Victoria Terces");
    Assert.assertEquals(true, status);
}


@Then("Close browser")
public void close_browser() {
	
	driver.close();
}
@After
public void teardown()
{
driver.quit();
}
}


