package testngattributesxml;

import org.testng.annotations.Test;

public class Search {
	
	@Test(priority=1)
	public void searchWithExistingProduct()
	{
		System.out.println("Search with Existing Product");
	}
	
	@Test(priority=2)
	public void searchWithoutExistingProduct()
	{
		System.out.println("Search with Existing Product");
	}
	
	@Test(priority=3)
	public void searchWithBlank()
	{
		System.out.println("Search with Existing Product");
	}

}
