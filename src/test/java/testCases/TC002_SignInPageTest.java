package testCases;

import org.testng.Assert;

import pageObjects.HomePage;
import pageObjects.SignInPage;
import testBase.BaseClass;
import org.testng.annotations.*;

public class TC002_SignInPageTest extends BaseClass {
	
	@Test(priority=1,groups={"Sanity","Master"})
	public void clickOnSignInandAccountButton()
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
		}
	}
	
	
	@Test(priority=2)
	public void verifyLogo() throws InterruptedException
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
			SignInPage sp = new SignInPage(driver);
			logger.info("***** Verifying Logo available on SignIn Page *****");
			Thread.sleep(5000);
			sp.clickOnAmazonLogo();
			String expectedTitle = driver.getTitle();
			String actualTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			Assert.assertEquals(expectedTitle, actualTitle);
			driver.navigate().back();
			System.out.println("Hello");
		}
		   
		   
	}
	
	
	@Test(priority=3)
	public void verifySignInorCreateAccountText() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		try
		{
			 hp.clickOnContinueShoppingButton();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			hp.signInAccountandList();
		}
		finally
		{
			hp.signInAccountandList();
			logger.info("**** Verifying SignIn or Create Account Text from SignIn Page ****");
			Thread.sleep(3000);
			SignInPage sp=new SignInPage(driver);
			String expectedText1="\r\n"
					+ "            Sign in or create account\r\n"
					+ "        ";
			String actualText1=sp.captureSignInOrCreateAccountText();
			Assert.assertEquals(expectedText1.trim(), actualText1);
		}
		
	}
	
	
	@Test(priority=4)
	public void verifyEnterMobileNumberOrEmailText()
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
			logger.info("**** Verifying Enter Mobile Number or Email Text from SignIn Page ****");
			SignInPage sp=new SignInPage(driver);
			String expectedText2="\r\n"
					+ "    Enter mobile number or email\r\n"
					+ "  ";
			String actualText2=sp.captureEnterMobileNumberOrEmailText();
			Assert.assertEquals(expectedText2.trim(), actualText2);
		}
		
	}
	
	
	@Test(priority=5)
	public void enterMobileNumberIntxtMobileBox() throws InterruptedException
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
			logger.info("**** Verifying Enter Mobile Number or Email Text Box ****");
			SignInPage sp=new SignInPage(driver);
			Thread.sleep(3000);
			sp.enterMobileNumber(props.getProperty("mobile"));
			Thread.sleep(3000);
		}
		
	}
	
	
	@Test(priority=6)
	public void verifyContinueButton()
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
			logger.info("**** Verifying Continue Button ****");
			SignInPage sp=new SignInPage(driver);
			Assert.assertTrue(sp.clickContinueButton());
		}
		
	}
	
	@Test(priority=7)
	public void verifybyContinuingYouAgreeToAmazonsText()
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
			logger.info("**** Verifying By Continuing you agree to amazons Text from SignIn Page ****");
			SignInPage sp=new SignInPage(driver);
			String expText3="By continuing, you agree to Amazon's Conditions of Use and Privacy Notice.";
			System.out.println(expText3);
			String actualText3=sp.capturebyContinuingYouAgreeToAmazonsText();
			System.out.println(actualText3);
			Assert.assertEquals(expText3,actualText3);
		}
		
	}
	
	@Test(priority=8)
	public void verifyConditionsOfUseLink()
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
			logger.info("**** Verifying Conditions of use link from sign in page ****");
			SignInPage sp=new SignInPage(driver);
			sp.clickOnConditionsOfUseLink();
			String actTitle="Conditions of Use - Amazon Customer Service";
			String expTitle=driver.getTitle();
			Assert.assertEquals(actTitle, expTitle);
			driver.navigate().back();
		}
		
	}
	
	@Test(priority=9)
	public void verifyPrivacyNoticeLink()
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
			logger.info("**** Verifying Privacy Notice Link from SignIn Page ****");
			SignInPage sp=new SignInPage(driver);
			sp.clickOnPrivacyNoticeLink();
			String actTitle1="Amazon.in Privacy Notice - Amazon Customer Service";
			String expTitle1=driver.getTitle();
			Assert.assertEquals(actTitle1, expTitle1);
			driver.navigate().back();
		}
		
	}
	
	@Test(priority=10)
	public void verifyBuyingForWorkText()
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
			logger.info("**** Verifying Buying for work Text from SignIn Page ****");
			SignInPage sp=new SignInPage(driver);
			String actText4="Buying for work?";
		    System.out.println(actText4);
			String expText4=sp.captureBuyingForWorkText();
			System.out.println(expText4);
			Assert.assertEquals(actText4, expText4);
		}
		
	}
	
	@Test(priority=11)
	public void verifyFreeBusinnessAccountLink()
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
			logger.info("**** Verifying Free business account link from SignIn Page ****");
			SignInPage sp=new SignInPage(driver);
			sp.clickOnFreeBusinessAccountLink();
			String actTitle2="Amazon Business";
			String expTitle2=driver.getTitle();
			Assert.assertEquals(actTitle2, expTitle2);
			driver.navigate().back();
		}
		
	}
	
	@Test(priority=12)
	public void verifyHelpLink() throws InterruptedException
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
			logger.info("**** Verifying Help Link from SignIn Page ****");
			SignInPage sp=new SignInPage(driver);
			Thread.sleep(10000);
			sp.clickOnHelpLink();
			String actTitle3="Help - Amazon Customer Service";
			System.out.println("Actual Title :"+actTitle3);
			Thread.sleep(3000);
			String expTitle3=driver.getCurrentUrl();
			System.out.println("Current URL :"+driver.getCurrentUrl());
			System.out.println("Expected Title :"+expTitle3);
			Assert.assertTrue(expTitle3.contains("www.amazon.in"));
			//driver.navigate().back();
		}
	}
}
