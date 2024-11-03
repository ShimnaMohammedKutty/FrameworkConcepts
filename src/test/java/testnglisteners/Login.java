package testnglisteners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
	@Test(priority=1)
	public void loginWithValidCredentials()
	{
		System.out.println("Login With Valid Credentials");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	public void loginWithInValidCredentials()
	{
		System.out.println("Login With InValid Credentials");
		Assert.assertFalse(false);
	}
	
	@Test(priority=3)
	public void loginWithoutCredentials()
	{
		System.out.println("Login Without  Credentials");
		Assert.fail();
	}

}
