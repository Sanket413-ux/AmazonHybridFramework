package demo;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Demo1 {
 
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jiomart.com/?tab=live-now");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='enable_location_popup']")).click();
		Thread.sleep(2000);
		 try {
		for(int i=1;i<=16;i++)
		{
			WebElement element=driver.findElement(By.xpath("(//a[@class='footer-top-main-section-item-link'])"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
            Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView(true);",element);
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
			Thread.sleep(500);
			String text = element.getText();
			System.out.println("Text: "+text);
			element.click();
			System.out.println("CurrentURL: "+driver.getCurrentUrl());
			System.out.println("Title: "+driver.getTitle());
			System.out.println("------------------------------------------------------------------------------");
			Thread.sleep(1000);
}
		 }
catch(Exception e)
{
	 e.printStackTrace();
}
		 finally
		 {
 
	 for(int i=23;i<=29;i++)
		{
			WebElement element=driver.findElement(By.xpath("(//a[@class='footer-top-main-section-item-link'])["+i+"]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
 
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView(true);",element);
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
			Thread.sleep(500);
			String text = element.getText();
			System.out.println("Text: "+text);
			element.click();
			System.out.println("CurrentURL: "+driver.getCurrentUrl());
			System.out.println("Title: "+driver.getTitle());
			System.out.println("------------------------------------------------------------------------------");
			Thread.sleep(1000);
        }
     }
   }
}
 
