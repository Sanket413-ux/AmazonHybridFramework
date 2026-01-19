package testCases;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ReturnOrderPage;
import testBase.BaseClass;

public class TC003_ReturnAndOrderPageTest extends BaseClass{

	@Test(priority=1,groups= {"Reression","Master"})
	public void verifySignInLogoReturnOrder()
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
		    logger.info("**** Verifying Amazon Logo *****");
			ReturnOrderPage rp=new ReturnOrderPage(driver);
			rp.clickOnAmazonLogoReturnOrder();
			String act_Title1="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			String exp_Title1=driver.getTitle();
			Assert.assertEquals(act_Title1, exp_Title1);
			driver.navigate().back();
	    }
	}
	
	
	
	@Test(priority=2)
	public void verifySignInTextReturnOrder()
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
			logger.info("**** Verifying Sign In Text *****");
			ReturnOrderPage rp=new ReturnOrderPage(driver);
			String actText1=rp.captureSignInTextReturnOrder();
			String expText1="\r\n"
					+ "            Sign in\r\n"
					+ "          ";
			Assert.assertEquals(actText1, expText1.trim());
		}
	}
	
	
	
	@Test(priority=3)
	public void verifyEnterMobileOrEmailTextReturnOrder()
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
			logger.info("**** Verifying Enter Mobile or Email Text *****");
			ReturnOrderPage rp=new ReturnOrderPage(driver);
			String actText2=rp.captureEnterMobileOrEmailTextReturnOrder();
			String expText2="\r\n"
					+ "              Enter mobile number or email\r\n"
					+ "            ";
					
			Assert.assertEquals(actText2, expText2.trim());
		}
	}
	
	
	@Test(priority=4)
	public void verifyEnterMobileOrEmailTextBoxReturnOrder()
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
			logger.info("**** Verifying Enter Mobile or Email Text Box *****");
			ReturnOrderPage rp=new ReturnOrderPage(driver);
			rp.enterMobileOrEmailReturnOrder(props.getProperty("mobile"));
		}
	}
	
	
	
	@Test(priority=5)
	public void verifycontinueButton()
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
			logger.info("**** Verifying Continue Button *****");
			ReturnOrderPage rp=new ReturnOrderPage(driver);
			rp.btnContinueButton();
			System.out.println(" <----Continue Button is Enabled----> ");
		}
	}
	
	
	@Test(priority=6)
	public void verifyTextBelowContinueButton()
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
			logger.info("**** Verifying Text Below Continue Button *****");
			ReturnOrderPage rp=new ReturnOrderPage(driver);
			String actText3=rp.captureTextBelowContinueButton();
			System.out.println("Actual Text3 :"+actText3);
			String expText3="By continuing, you agree to Amazon's Conditions of Use and Privacy Notice.";
			System.err.println("Expected Text3 :"+expText3);
			Assert.assertEquals(actText3, expText3);
		}
	}
	
	
	@Test(priority=7)   
	public void verifyLinkConditionsOfUse() throws InterruptedException
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
			logger.info("**** Verifying Link Conditions of use *****");
			String parentHandle=driver.getWindowHandle();
			ReturnOrderPage rp=new ReturnOrderPage(driver);
			rp.clickOnLinkConditionsOfUse();
			Thread.sleep(5000);
			Set<String> handles=driver.getWindowHandles();
			for(String s:handles)
			{
				driver.switchTo().window(s);
				String title=driver.getTitle();
				if(title.contains("Conditions of use"))
				{
					 String act_Title2=driver.getTitle();
					 System.out.println("actTitle 2:"+act_Title2);
					 String exp_Title2="Conditions of Use - Amazon Customer Service";
					 System.out.println("expTitle 2:"+exp_Title2);
					 Assert.assertEquals(act_Title2, exp_Title2);
				}
			}
		    driver.switchTo().window(parentHandle);
		    driver.navigate().back();
		}
	}
	
	
	@Test(priority=8)
	public void verifyLinkPrivacyNotice()
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
			logger.info("**** Verifying Link Privacy Notice *****");
			ReturnOrderPage rp=new ReturnOrderPage(driver);
			rp.clickOnLinkPrivacyNotice();
			String act_Title3="Amazon.in Privacy Notice - Amazon Customer Service";
			String exp_Title3=driver.getTitle();
			Assert.assertEquals(act_Title3, exp_Title3);
			driver.navigate().back();
		}
	}
	
	@Test(priority=9)
	public void verifyLinkNeedHelp() throws InterruptedException
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
			logger.info("**** Verifying Link Need Help *****");
			ReturnOrderPage rp=new ReturnOrderPage(driver);
			rp.clickOnLinkNeedHelp();
			System.out.println("<---- Clicked On Link Need Help ---->");
			rp.clickOnLinkForgotPasword();
			System.out.println("<---- Clicked On Link Forget Passowrd ---->");
			String act_Title4="Amazon Password Assistance";
			String exp_Title4=driver.getTitle();
			Assert.assertEquals(act_Title4, exp_Title4);
			driver.navigate().back();
			Thread.sleep(5000);
			rp.clickOnLinkNeedHelp();
			System.out.println("<---- Clicked On Link Need Help ---->");
			rp.clickOnLinkOtherIssueWithSignIn();	
			System.out.println("<---- Clicked On Link other issue with sign in ---->");
			String act_Title5="Amazon.in - Account & Login Issues";
			String exp_Title5=driver.getTitle();
			Assert.assertEquals(act_Title5, exp_Title5);
			driver.navigate().back();
		}
	}
	
	
	
	
	@Test(priority=10)
	public void verifyNewToAmazonText()
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
			logger.info("**** Verifying New To Amazon Text *****");
		    ReturnOrderPage rp=new ReturnOrderPage(driver);
			String actText3=rp.captureTextNewToAmazonReturnOrder();
			String expText3="New to Amazon?";
			Assert.assertEquals(actText3, expText3);
		}
	}
	
	@Test(priority=11)
	public void verifyButtonCreateYourAmazonAccount()
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
			logger.info("**** Verifying Create Your Amazon Account Button *****");
		    ReturnOrderPage rp=new ReturnOrderPage(driver);
			rp.btnCreateYourAmazonAccount();
			System.out.println("<---- Create your amazon account button is enabled ---->");
		}
	}
	
	
	@Test(priority=12)  
	public void verifyLinkHelpFooterSection() throws InterruptedException
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
			logger.info("**** Verifying Help Link @Footer Seaction *****");
			ReturnOrderPage rp=new ReturnOrderPage(driver);
			Thread.sleep(6000);
            String parentHandle=driver.getWindowHandle();
            rp.clickOnLinkHelp();
            Set<String> windowHandles=driver.getWindowHandles();
            for(String s:windowHandles)
            {
            	driver.switchTo().window(s);
            	String title=driver.getTitle();
            	if(title.contains("Help"))
            	{
            		String act_Handle6=driver.getTitle();
            		String exp_Handle6="Help - Amazon Customer Service";
            		Assert.assertEquals(act_Handle6, exp_Handle6);
            	}
            }
            driver.switchTo().window(parentHandle);
			driver.navigate().back();
		}
	}
	
	
	@Test(priority=13)
	public void verifyAffiliateText()
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
			logger.info("**** Verifying © 1996-2025, Amazon.com, Inc. or its affiliates Text *****");
		    ReturnOrderPage rp=new ReturnOrderPage(driver);
			String actText3=rp.captureAmazonAffiliateText();
			String expText="\r\n"
					+ "  © 1996-2025, Amazon.com, Inc. or its affiliates";
			Assert.assertEquals(actText3, expText.trim());
		}
	}
}
