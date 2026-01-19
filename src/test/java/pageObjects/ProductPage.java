package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductPage extends BasePage{

	public ProductPage(WebDriver driver) 
	{
		super(driver);
    }
	
	// Locate WebElement ----> Laptop HP225G10 Frame
	@FindBy(xpath="(//div[@class='a-section'])[4]")
	WebElement frameHP225G10;
	
	// Locate WebElement ----> textHP225Laptop
	@FindBy(xpath="//span[contains(text(),'HP 255 G10 Laptop')]")
	WebElement textHP225Laptop;
	
	// Locate WebElement ----> Added to cart Text 
		@FindBy(xpath="//h1[contains(text(),'Added to cart')]")
		WebElement addedToCartTex;
	
	// Action Method
	public void clickOnFrameHP225()
	{
		frameHP225G10.click();
	}
	
    public void clickOnHP225LaptopLink()
    {
    	textHP225Laptop.click();
    }
    
    public void captureTextAddToCart()
	{
		System.out.println(addedToCartTex.getText());
	}
    
}
