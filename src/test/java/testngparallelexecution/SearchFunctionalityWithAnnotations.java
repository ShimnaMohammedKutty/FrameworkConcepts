package testngparallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchFunctionalityWithAnnotations {
	
	WebDriver driver;
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
	}
	
   @Test(priority=1)
	
	public void searchWithExistingProduct()
	{
		System.out.println("Existing Product");
		
		WebElement text = driver.findElement(By.name("search"));
		text.sendKeys("HP");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		searchButton.click();
		
		WebElement textDisplayed = driver.findElement(By.linkText("HP LP3065"));
		Assert.assertTrue(textDisplayed.isDisplayed());
		
		
		
	}
	
	@Test(priority=2)
	
	public void searchWithNonExistingProduct()
	{
		System.out.println("NON-Existing Product");
	
		
		WebElement text = driver.findElement(By.name("search"));
		text.sendKeys("Honda");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		searchButton.click();
		
        WebElement textForHonda=driver.findElement(By.xpath("//input[@id='button-search']/following-sibling::p"));
       
        String actualtext=textForHonda.getText();
        
        String expectedText="There is no product that matches the search criteria.";
        
        Assert.assertEquals(actualtext,expectedText);
        
       
		
		}
	@Test(priority=3)
	
	public void searchWithOutProduct()
	{
		System.out.println("Blank Product");
		
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		searchButton.click();
		
		WebElement textForHonda=driver.findElement(By.xpath("//input[@id='button-search']/following-sibling::p"));
	       
        String actualtext=textForHonda.getText();
        
        String expectedText="There is no product that matches the search criteria.";
        
        Assert.assertEquals(actualtext,expectedText);
        
     
		
		
	}

}
