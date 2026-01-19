package pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ReturnOrderPage extends BasePage {

	public ReturnOrderPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	// To locate WebElement ----> Amazon logo for SignIn
    @FindBy(xpath="(//i[@role='presentation'])[2]")
    WebElement amazonLogoSignInReturnOrder;
    
    // To locate WebElement ----> SingInText
    @FindBy(xpath="//h1[contains(text(),'Sign in')]")
    WebElement textSignInReturnOrder;
    
    // To locate WebElement ----> enterMobileOrEmailText
    @FindBy(xpath="//label[contains(text(),'Enter mobile number or email')]")
    WebElement textEmailOrMobileReturnOrder;
    
    // To locate WebElement ----> EmailTextBox
    @FindBy(xpath="//input[@id='ap_email']")
    WebElement txtBoxMobileOrEmailReturnOrder;
    
    // To locate WebElement ----> ContinueButton
    @FindBy(xpath="//input[@id='continue'][@type='submit']")
    WebElement btnContinueReturnOrder;
    
    // To locate WebElement ----> By continuing, you agree to Amazon's(TextBelowContinueButton)
    @FindBy(xpath="//div[contains(text(),'By continuing, you agree to Amazo')]")
    WebElement textBelowContinueButtonReturnOrder;
    
    // To locate WebElement ----> linkConditionsOfUse
    @FindBy(xpath="(//a[contains(text(),'Conditions of Use')])[2]")
    WebElement linkConditionsOfUseReturnOder;
    
    // To locate WebElement ----> linkProvacyNotice
    @FindBy(xpath="(//a[contains(text(),'Privacy Notice')])[1]")
    WebElement linkPrivacyNoticeReturnOrder;
    
    // To locate WebElement ----> linkNeedHelp?
    @FindBy(xpath="//span[contains(text(),'Need help?')]")
    WebElement linkNeedHelpReturnOrder;
    
    // To locate WebElement ----> linkForgetPassword
    @FindBy(xpath="//a[contains(text(),'Forgot Password')]")
    WebElement linkForgetPassword;
    
    // To locate WebElement ----> linkOtherIssueWithSignIn
    @FindBy(xpath="//a[contains(text(),'Other issues with Sign-In')]")
    WebElement linkOtherIssueWihtSignIn;
    
    // To locate WebElement ----> textNewToAmazon?
    @FindBy(xpath="//h5[contains(text(),'New to Amazon')]")
    WebElement textNewToAmazonToReturnOrder;
    
    // To locate WebElement ----> createYourAmazonAccountButton
    @FindBy(xpath="//a[@id='createAccountSubmit']")
    WebElement btnCreateYourAmazonAccountReturnOrder;
    
    // To locate WebElement ----> linkHelp(FooterSection)
    @FindBy(xpath="//a[contains(text(),'Help')]")
    WebElement linkHelpFooterSection;
    
    // To locate WebElement ----> amazonAffiliateText 
    @FindBy(xpath="//span[contains(text(),'© 1996-2025, Amazon.com, Inc. or its affiliates')]")
    WebElement textAmazonAffiliateFooterSection;
    
    
    
    // Action Methods :- 
    public void clickOnAmazonLogoReturnOrder()
    {
    	amazonLogoSignInReturnOrder.click();    
    }
    
    public String captureSignInTextReturnOrder()
    {
    	return textSignInReturnOrder.getText();
    }
    
    public String captureEnterMobileOrEmailTextReturnOrder()
    {
    	return textEmailOrMobileReturnOrder.getText();
    }
    
    public void enterMobileOrEmailReturnOrder(String mobile)
    {
    	txtBoxMobileOrEmailReturnOrder.sendKeys(mobile);
    }
    
    public boolean btnContinueButton()
    {
    	return btnContinueReturnOrder.isEnabled();
    }
	
    public String captureTextBelowContinueButton()
    {
    	return textBelowContinueButtonReturnOrder.getText();
    }
    
    public void clickOnLinkConditionsOfUse()
    {
    	linkConditionsOfUseReturnOder.click();
    }
    
    public void clickOnLinkPrivacyNotice()
    {
    	linkPrivacyNoticeReturnOrder.click();
    }
    
    public void clickOnLinkNeedHelp()
    {
    	linkNeedHelpReturnOrder.click();
    }
    
    public void clickOnLinkForgotPasword()
    {
        linkForgetPassword.click();
    }
    
    public void clickOnLinkOtherIssueWithSignIn()
    {
        linkOtherIssueWihtSignIn.click();
    }
    
    public String captureTextNewToAmazonReturnOrder()
    {
    	return textNewToAmazonToReturnOrder.getText();
    }
    
    public boolean btnCreateYourAmazonAccount()
    {
    	return btnCreateYourAmazonAccountReturnOrder.isEnabled();
    }
    
    public void clickOnLinkHelp()
    {
    	linkHelpFooterSection.click();
    }
    
	public String captureAmazonAffiliateText()
	{
		return textAmazonAffiliateFooterSection.getText();
	}
	

}
