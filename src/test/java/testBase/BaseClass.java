package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class BaseClass {
	
	public static WebDriver driver;
	public Properties props;
	public Logger logger;
	
	@Parameters({"browser","os"})
	@BeforeMethod(groups={"Sanity","Regression","Master"})
	public void setup(String br,String os) throws IOException
	{
		
		logger=LogManager.getLogger(this.getClass());
		
		FileInputStream fis=new FileInputStream("./src//test//resources//config.properties");
		props=new Properties();
		props.load(fis);
		
		if(br.equalsIgnoreCase("chrome"))
    	{
			driver=new ChromeDriver();
    	}
    	else if(br.equalsIgnoreCase("firefox"))
    	{
    		driver=new FirefoxDriver();
    	}
    	else if(br.equalsIgnoreCase("edge"))
    	{
    		driver=new EdgeDriver();
    	}
    	else
    	{
    		System.out.println("Invalid Browser");
    	}
		
		/*ChromeOptions options = new ChromeOptions()
        options.addArgument("--incognito");
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.get("");*/
		
		driver.get(props.getProperty("appURL"));
		driver.manage().window().maximize();
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	public String captureScreen(String tname) throws IOException 
	{
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\"+ tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
		
		return targetFilePath;
	}

}
