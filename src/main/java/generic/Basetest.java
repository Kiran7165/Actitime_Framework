package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Basetest {

	public static final String userDir = System.getProperty("user.dir");
	public static final String chromekey = "webdriver.chrome.driver";
	public static final String geckokey = "webdriver.gecko.driver";
	public static final String chromeValue = userDir + "./drivers/chromedriver.exe";
	public static final String geckoValue = userDir + "./drivers/geckodriver.exe";
	public static final String excelPath = userDir + "./data\\actidata.xls";

	public WebDriver driver;
	public static Properties p;
	public static actionUtil util;

	// sets the path for driver executables
	@BeforeClass
	public void setpath() {
		
		FileInputStream f;
		try {
			f=new FileInputStream(userDir+"./data\\demo.properties");
			p=new Properties();
			p.load(f);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		// sets the path for chromedriver.exe
		System.setProperty(chromekey, chromeValue);
		// sets the path for geckodriver.exe
		System.setProperty(geckokey, geckoValue);
	}

	// launches the browser
	@Parameters("BrowserName")
	@BeforeMethod
	public void launch(String bn) {
		// launches the chrome browser
		if (bn.equals("chrome"))
			driver = new ChromeDriver();
		// launches the firefox browser
		else if (bn.equals("firefox"))
			driver = new FirefoxDriver();
		// launches the edge browser
		else if (bn.equals("edge"))
			driver = new EdgeDriver();
		
		util=new actionUtil(driver);

		// defines implicitly wait for 30sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// maximises the window
		driver.manage().window().maximize();

		// fetches the web app and waits until it is loaded
		driver.get("https://demo.actitime.com/login.do");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//closes the browser
		driver.quit();
	}
	
	//kills the drivers
		@AfterSuite
		public void killDriver()
		{
			try {
				Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
				Runtime.getRuntime().exec("taskkill /IM geckodriver.exe /F");
				Runtime.getRuntime().exec("taskkill /IM edgedriver.exe /F");
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
}

