package StepDefinition;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import PageObjectModel.CustomerPage;
import PageObjectModel.LoginPage;
import PageObjectModel.SearchCustomerPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public CustomerPage custpage;
	public SearchCustomerPage searchpage;
	public static Logger logger;
    public Properties configprop;
// custom email id 	
public static String randomString()	{
	String generatedString1= RandomStringUtils.randomAlphabetic(2);
	return (generatedString1);
	
}

}
