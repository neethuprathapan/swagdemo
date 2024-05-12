package basepackage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class baseclass
{
	public static FirefoxDriver driver;
	String baseurl="https://www.saucedemo.com/";
	
	@BeforeTest
	public void beforetest()
	{
		driver=new FirefoxDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}

}
