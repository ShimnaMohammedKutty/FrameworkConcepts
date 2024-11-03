package testngattributesxml;

import org.testng.annotations.Test;

public class Register {
	
	@Test(priority=1)
	public void registerWithAllFields()
	{
		System.out.println("Rgister with All fields");
	}
	
	@Test(priority=2)
	public void registerWithMandatoryFields()
	{
		System.out.println("Rgister with Mandatory fields");
	}
	
	@Test(priority=3)
	public void registerWithoutAnyFields()
	{
		System.out.println("Rgister without any fields");
	}

}
