package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}

	// To locate WebElement ----> ContinueShoppingButton
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnContinueShoppingButton;
	
	// To locate WebElement ----> Amazon logo(Top left corner)
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	WebElement amazonLogo;
	
	// To locate WebElement ----> Location
	//@FindBy(xpath="//a[@id='nav-global-location-popover-link']")
	//WebElement location;
	
	// To locate WebElement ----> PinCodeBox
	//@FindBy(xpath="//input[@autocomplete='postal-code']")
	//WebElement txtPinCodeBox;
	
	// To locate WebElement ----> Apply button to apply pin code
	//@FindBy(xpath="//span[text()='Apply']")
	//WebElement btnApplyPinCode;
	
	// To locate WebElement ----> All Dropdown
	@FindBy(xpath="//select[@id='searchDropdownBox']")
	WebElement allDropdown;
	
	// To locate WebElemet ----> SearchBox
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
    WebElement txtSearchBox;
	
	// To locate WebElement ----> SearchButton
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement btnSearch;
	
	// To locate WebElement ----> SignInAccountandList
	@FindBy(xpath="//div[@id='nav-link-accountList']")
	WebElement signInAccountandList;
	
	// To locate WebElement ----> SignInOrCreateAccountText(From SignIn Page)
	@FindBy(xpath = "//h1[contains(text(),'Sign in or create account')]")
	WebElement signInorCreateAccountText;
	
	// To locate WebElement ----> Return and Order
	@FindBy(xpath="//a[@id='nav-orders']")
	WebElement returnsandOrders;
	
	// To locate WebElement ----> EnterMobile to return Order
	@FindBy(xpath="//input[@name='email']")
	WebElement mobile;
	
	// To locate WebElement ----> AddToCartLogo (Top right corner)
	@FindBy(xpath="//a[@id='nav-cart']")
	WebElement addToCartLogo;
	
    
    // Action Methods :- 
	
	public void clickOnContinueShoppingButton()
	{
		btnContinueShoppingButton.click();
	}
	
	
	public void clickOnLogo()
	{
		amazonLogo.click();
	}
    
   /* public void clickOnLocation()
    {
    	location.click();
    }
    
    
    public void enterPinCode(String pinCode)
    {
    	txtPinCodeBox.sendKeys(pinCode);
    }
    
    public void applyPincode()
    {
    	btnApplyPinCode.click();
    }*/
    
    public void clickOnDropdown()
    {
    	allDropdown.click();
    	Select s1=new Select(allDropdown);
    	s1.selectByValue("search-alias=digital-text");
    }
    
    public void enterTextInSearchBox(String searchData)
    {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(txtSearchBox)).sendKeys(searchData);
    }
    
    public void clickOnSearchButton()
    {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(btnSearch)).click();
    }
    
    public void signInAccountandList()
    {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(signInAccountandList)).click();
    }
    
    public String captureSignInOrCreateAccountText()
    {
    	String text=signInorCreateAccountText.getText();
    	return text;
    }
    
    
    
    public void clickOnReturnandOrder()
    {
    	returnsandOrders.click();
    }
    
    public void enterMobileToReturnOrder(String mobileNumber)
    {
    	mobile.sendKeys(mobileNumber);
    }
    
    public void clickOnAddToCartLogo()
    {
    	addToCartLogo.click();
    }

}
