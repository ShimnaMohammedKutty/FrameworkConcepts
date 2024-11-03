package testngconcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutTestng {

	public static void main(String[] args) {
		
		//Selenium Test Automation Code
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
