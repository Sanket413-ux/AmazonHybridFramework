package testCases;


import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC005_DataDrivenSearchProductTest extends BaseClass{
	
	
	@Test(dataProvider="searchData", dataProviderClass=DataProviders.class)
	public void verifyDataDrivenProductSearch(String productName) throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		try
		{
			hp.clickOnContinueShoppingButton();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			hp.enterTextInSearchBox(productName);
			hp.clickOnSearchButton();
			System.out.println("<----Text entered in search box---->");
		}
	}

}
