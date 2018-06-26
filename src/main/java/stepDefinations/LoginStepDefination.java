package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/*public class LoginStepDefination {
WebDriver driver;
@Given("^user is already on loginpage$")
public void user_is_already_on_loginpage() 
{
	System.setProperty("webdriver.chrome.driver","D:\\Project Management\\com.qa.freecrm.bdd\\driver\\chromedriver.exe" );
    driver=new ChromeDriver();
    driver.get("https://www.freecrm.com/index.html");
    
}

@When("^title is already on loginpage$")
public void title_is_already_on_loginpage() 
{
	String titel=driver.getTitle();
	System.out.println(titel);
	Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", titel);
    
}

@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String username,String password) 
{
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
   
}

@Then("^user clicks on login button$")
public void user_clicks_on_login_button()  
{
	WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", loginBtn);
    
}

@Then("^user is on homepage$")
public void user_is_on_homepage()  
{
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("CRMPRO", title);
   
}
@Then("^close the browser$")
public void close_the_browse()
{
	driver.quit();
}

	
	
	
}
*/
