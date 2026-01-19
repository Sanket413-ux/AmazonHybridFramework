package pageObjects;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BasePage{

	public SignInPage(WebDriver driver) 
	{
		super(driver);	
	}
	
	
	// To locate WebElement ----> AmazonLogo on SignIn Page
	@FindBy(xpath="//i[@aria-label='Amazon']")
	WebElement logoAmazon;
	
	// To locate WebElement ----> SignInOrCreateAccountText
	@FindBy(xpath="//h1[contains(text(),'Sign in or create account')]")
	WebElement signInorCreateAccountText;
	
	// To locate WebElement ----> EnterMobileNumberOrEmailText
	@FindBy(xpath="//p[contains(text(),'Enter mobile number or email')]")
	WebElement enterMobileNumberOrEmailText;
	
	// To locate WebElement ----> MobileNumberTextBox
	@FindBy(xpath="//input[@name='email']")
	WebElement txtMobileNumberBox;
	
	// To locate WebElement ----> ContinueButton
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnContinue;
	
	// To locate WebElement ----> ByContinuingYouAgreeToAmazon'sText
	@FindBy(xpath="//p[contains(text(),'By continuing, you agree')]")
	WebElement byContinuingYouAgreeToAmazonsText;
	
	// To locate WebElement ----> ConditionsOfUseLink
	@FindBy(xpath="//a[text()='Conditions of Use']")
	WebElement linkConditionsOfUse;
	
	// To locate WebElement ----> PrivacyNoticeLink
	@FindBy(xpath="//a[text()='Privacy Notice']")
	WebElement linkPrivacyNotice;
	
	// To locate WebElement ----> BuyingForWorkText
	@FindBy(xpath="//span[contains(text(),'Buying for work?')]")
	WebElement buyingForWorkText;
	
	// To locate WebElement ----> CreateAFreeBusinessAccountLink
	@FindBy(xpath="//span[contains(text(),'Create a free business account')]")
	WebElement linkCreateFreeBusinessAccount;
	
	// To locate WebElement ----> HelpLink
	@FindBy(xpath="//a[contains(text(),'Help')]")
	WebElement linkHelp;
	
	
	// Action Methods
	public void clickOnAmazonLogo()
	{
		logoAmazon.click();
	}
	
	
	public String captureSignInOrCreateAccountText()
	{
		return signInorCreateAccountText.getText();
	}
	
	
	public String captureEnterMobileNumberOrEmailText()
	{
		return enterMobileNumberOrEmailText.getText();
	}
	
	
	public void enterMobileNumber(String mobile)
	{
		txtMobileNumberBox.sendKeys(mobile);
	}
	
	public boolean clickContinueButton()
	{
		return btnContinue.isEnabled();
	}
	
	
	public String capturebyContinuingYouAgreeToAmazonsText()
	{
		return byContinuingYouAgreeToAmazonsText.getText();
	}
	
	
	public void clickOnConditionsOfUseLink()
	{
		linkConditionsOfUse.click();
	}
	
	public void clickOnPrivacyNoticeLink()
	{
		linkPrivacyNotice.click();
	}
	
	public String captureBuyingForWorkText()
	{
		return buyingForWorkText.getText();
	}
	
	public void clickOnFreeBusinessAccountLink()
	{
		linkCreateFreeBusinessAccount.click();
	}
	
	public void clickOnHelpLink() 
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(linkHelp));
		linkHelp.click();
	}
}
