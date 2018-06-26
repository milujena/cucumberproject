package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


/*public class ContactsStepDefination {
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
	public void user_enters_and(String username, String password) 
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

	@Then("^user move to new contact page$")
	public void user_move_to_new_contact_page()
	{
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	    
	}

	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String firstname, String lastname, String position)  
	{
		 driver.findElement(By.id("first_name")).sendKeys(firstname);
		 driver.findElement(By.id("surname")).sendKeys(lastname);
		 driver.findElement(By.id("company_position")).sendKeys(position);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	    
	}

	@Then("^close the browser$")
	public void close_the_browser()  
	{
		driver.quit();
	    
	}


}
*/