package stepdefainations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	
	WebDriver driver;
	
	@Given("^user is in login page$")
	public void user_is_in_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TRISHITA MOHARAR\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
		
	@When("^user provides usernme and password$")
    public void user_provides_usernme_and_password()
	{
        driver.findElement(By.id("email")).sendKeys("hello");
        driver.findElement(By.id("pass")).sendKeys("hello");
        driver.findElement(By.id("u_0_b")).click();


    }

    @Then("^user is in the homepage$")
    public void user_is_in_the_homepage()
    {
      System.out.println(driver.getTitle()); 
	System.out.println("this is from git"); 
	System.out.println("this is from workspace");

    }

}
