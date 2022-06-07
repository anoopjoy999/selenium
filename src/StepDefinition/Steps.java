package StepDefinition;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.gecko.driver", "C://AJ//selenium//geckodriver-v0.31.0-win64//geckodriver.exe");					
       driver= new FirefoxDriver();					
       driver.manage().window().maximize();			
       driver.get("http://ec2-13-126-11-22.ap-south-1.compute.amazonaws.com/login");					
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("user");							
       driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("user");							
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
    	//driver.findElement(By.id("save")).click();
       driver.findElement(By.xpath("/html/body/app-root/app-content/app-login/div/mat-card/mat-card-content/form/mat-card-actions/button[1]/span[1]")).click();					
    }		
}