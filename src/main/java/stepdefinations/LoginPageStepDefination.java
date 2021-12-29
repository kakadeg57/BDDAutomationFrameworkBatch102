package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefination {
	WebDriver driver;
	
	@Given("^User should be on login page$")
	public void user_should_be_on_login_page()  {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user will enter username$")
	public void user_will_enter_username()  {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}

	@When("^user enter password$")
	public void user_enter_password()  {
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button()  {
		driver.findElement(By.id("btnLogin")).click();
	}
	

	@Then("^user should be on Home Page$")
	public void user_should_be_on_Home_Page() {
		System.out.println("User is on home page");
	}
}
