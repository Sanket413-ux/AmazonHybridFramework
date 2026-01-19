package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import pageObjects.HomePage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class TC004_ProductPageTest extends BaseClass {
	
	@Test(priority=1)
	public void verifySearchBoxFromHomePage() throws InterruptedException
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
			hp.clickOnSearchButton();
			String parentHandle=driver.getWindowHandle();
		    ProductPage pp=new ProductPage(driver);
			pp.clickOnFrameHP225();
			System.out.println("<---- Clicked On Frame ----->");
			Thread.sleep(5000);
		    pp.clickOnHP225LaptopLink();
		    Thread.sleep(3000);
			Set<String> windowHandles=driver.getWindowHandles();
			for(String handle:windowHandles)
			{
				driver.switchTo().window(handle);
				String title=driver.getTitle();
				if(title.contains("HP 255 G10"))
				{
					driver.switchTo().window(handle);
			        logger.info("***** Verifying Add To Cart Product *****");		
					Thread.sleep(3000);
					// Locate WebElement ----> HP255G10LaptopLinkText
					WebElement HP255G10LaptopLinkText=driver.findElement(By.xpath("(//span[contains(text(),'HP 255 G10 Laptop for Home or Work')])[1]"));
					HP255G10LaptopLinkText.click();
					System.out.println("<---- Clicked On Link ---->");
					Thread.sleep(3000);
					// Locate WebElement ----> AddToCartFrame
					// WebElement addToCartFrame=driver.findElement(By.xpath("//div[@id='buyBoxAccordion']"));
					// addToCartFrame.click();
					// Locate WebElement ----> AddToCartButton
					WebElement addToCartButton=driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].scrollIntoView[true]",addToCartButton);
					addToCartButton.click();
					System.out.println("<---- Switch Into Frame ---->");
					Thread.sleep(5000);
					System.out.println("<---- Product Added to cart ---->");
			        pp.captureTextAddToCart();
			        System.out.println("<---- Product Successfully Added To Cart ---->");
				}
				
			}
			System.out.println("ParentHandle :"+parentHandle);
		}
	}
}
