package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logindef {
	
WebDriver driver;
    
    
    @Before
    public void setup() {
    	
    	System.setProperty("webdriver.chrome.driver","chromedriver");
        
        System.setProperty("webdriver.gecko.driver","geckodriver");    
        driver = new ChromeDriver();
    	
    	
    }
    
    
    @After
    public void teardown() {
    	//driver.quit();
    }
	
    @Given("^User has opened swiggy website on Chrome Browser$")
    public void user_has_opened_swiggy_website_on_chrome_browser() throws Throwable {
    	 driver.get("https://www.swiggy.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(50000,TimeUnit.MILLISECONDS);
    }

    @When("^User enters correct \"([^\"]*)\"$")
    public void user_enters_correct_something(String phoneno) throws Throwable {
    	
    	WebElement Link_login = driver.findElement(By.xpath("//*[text()='Login']"));
        Link_login.click();
        
        
        WebElement Phn_no = driver.findElement(By.xpath("//input[@id='mobile']"));
        Phn_no.sendKeys(phoneno);
        
        WebElement Login_btn = driver.findElement(By.xpath("//input[@type='submit']"));
        Login_btn.click();
    	
    }

    @Then("^User should be able to Login successfully$")
    public void user_should_be_able_to_Login_successfully() throws Throwable {
    	
        
    }


}
