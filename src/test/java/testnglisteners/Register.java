package testnglisteners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Register {
	
	@Test(priority=1)
	public void registerWithAllFields()
	{
		System.out.println("Rgister with All fields");
		Assert.assertEquals(5, 5);
	}
	
	@Test(priority=2,enabled=false)  //testmethod is skipped because enabled=false
	public void registerWithMandatoryFields()
	{
		System.out.println("Rgister with Mandatory fields");
		
	}
	
	@Test(priority=3)
	public void registerWithoutAnyFields()
	{
		int a=5;
		if(a==5)
		{
			throw new SkipException("Intentially skip");//another way of skipping method using throw
		}
		System.out.println("Rgister without any fields");
	}

}
