package parameterizationdatadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	
	
	@Test(dataProvider="dataSupplier")
	public void loginWithValidCredentials(String email,String password)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccount.click();
		
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		
		WebElement emailtext = driver.findElement(By.id("input-email"));
		emailtext.sendKeys(email);
		
		WebElement passemail = driver.findElement(By.id("input-password"));
		passemail.sendKeys(password);
		
		WebElement button = driver.findElement(By.xpath("//input[@value='Login']"));
		button.click();
		
		WebElement text = driver.findElement(By.linkText("Edit your account information"));
		boolean expected=text.isDisplayed();
		
		Assert.assertTrue(expected);
		
		driver.quit();
		
		}
	
	@DataProvider
	public Object[][] dataSupplier()
	{
		Object[][] data= {
				            {"amotooricap1@gmail.com","12345"},
				            {"amotooricap2@gmail.com","12345"},
				            {"amotooricap1@gmail.com","12345"}
		                 }  ;
		
		   return data;
	}
}
