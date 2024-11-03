package testngattributesxml;

import org.testng.annotations.Test;

public class Login {
	
	@Test(priority=1)
	public void loginWithValidCredentials()
	{
		System.out.println("Login With Valid Credentials");
	}
	
	@Test(priority=2)
	public void loginWithInValidCredentials()
	{
		System.out.println("Login With InValid Credentials");
	}
	
	@Test(priority=3)
	public void loginWithoutCredentials()
	{
		System.out.println("Login Without  Credentials");
	}

}
