package testngconcepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithTestng {
	
	@Test
	
	public void getPageTitle()

	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}
}
