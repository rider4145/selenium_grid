package selenium_driver;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class driver2 
{

	@Test
	public void drive() throws MalformedURLException, URISyntaxException
	{
		DesiredCapabilities cap = new DesiredCapabilities(); 
		cap.setBrowserName("chrome");									// to set the browser
//		cap.setPlatform(Platform.WINDOWS);								// to set the platform where the test has to run
//		System.out.println(cap.getBrowserName());						// to get the browser name
//		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);	// to accept insecure/ssl certificate
//		cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");		// another way of setting up the browser
		
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.0.100:4444").toURL(),cap);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("NONE2");
//		driver.findElement(By.cssSelector(".Google.Search")).click();
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getTitle());
		
		
	}
}