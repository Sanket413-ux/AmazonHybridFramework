package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_HomePageTests extends BaseClass {
	
	@Test(priority=1,groups= {"Regression","Master"})
	public void verifyLogoTopLeftCorner() throws InterruptedException
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
			hp.clickOnLogo();
			Thread.sleep(2000);
			String expTitle1="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			String actTitle1=driver.getTitle();
			Assert.assertEquals(expTitle1, actTitle1);
			driver.navigate().back();
		}
	}
	
	@Test(priority=2)
	public void verifyAllDropdown() throws InterruptedException
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
			hp.clickOnDropdown();
			System.out.println("<---- Dropdown is selected ---->");
		}	
	}
	
	
	@Test(priority=3)
	public void verifySearchBox()
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
			hp.enterTextInSearchBox(props.getProperty("searchProduct"));
			System.out.println("<----Text entered in search box---->");
		}	
	}
	
	
	@Test(priority=4)
	public void verifySearchButton()
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
			hp.clickOnSearchButton();
		}	
	}
	
	
	
	@Test(priority=5)
	public void verifySignInAccountList() throws InterruptedException
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
			hp.signInAccountandList();
			System.out.println("<---- Clicked On Sign In ---->");
			Thread.sleep(2000);
			String actualText="Sign in or create account";
			String expectecText=hp.captureSignInOrCreateAccountText();
			Assert.assertEquals(actualText, expectecText);
	    }	
	}
	
	
	
	
	
	@Test(priority=6)
	public void verifyClickOnReturnOrder() throws InterruptedException
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
			hp.clickOnReturnandOrder();
			System.out.println("<---- Clicked On Return Order ---->");
			Thread.sleep(2000);
			hp.enterMobileToReturnOrder(props.getProperty("mobile"));
			System.out.println("<----- Mobile Number Entered ----->");
		}	
	}
	
	@Test(priority=7)
	public void verifyAddToCartLogo()
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
			hp.clickOnAddToCartLogo();
			System.out.println("<---- Clicked On Add To Cart Logo ---->");
		}	
	}
	
}
