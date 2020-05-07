package StepDefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmPage extends BaseClass{

	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
	

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdvna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@When("I open orange HRM home page")
	public void i_open_orange_HRM_home_page() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Then("I verify that logo present on the page")
	public void i_verify_that_logo_present_on_the_page() {
		boolean status = driver.findElement(By.xpath("//*[@id=\'divLogo\']/img")).isDisplayed();

		if (status == true) {
			System.out.println("Logo is displayed");
		} else {
			System.out.println("Logo is not displayed");
		}

	}

	@Then("close browser")
	public void close_browser() {

		driver.close();

	}

}
