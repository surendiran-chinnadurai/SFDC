package GeneralUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import objectRepository.caseEdit;
import objectRepository.casesPage;
import objectRepository.closeCase;
import objectRepository.searchResults;

public class baseClass {
	
	public WebDriver driver;
	public fileUtilities fUtil=new fileUtilities();
	public casesPage cp;
	public searchResults sr;
	public caseEdit ce;
	public closeCase cc;
	public SeleniumUtilites sUtil=new SeleniumUtilites();
	
@BeforeSuite
public void setup() 
{
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
}
@BeforeTest
public void login() throws InterruptedException {
	driver.get("https://mylogin.hpe.com/app/salesforce/exkl8pn7jtyoF0etz697/sso/saml");
	driver.findElement(By.xpath("//a[.='Sign in with Virtual Digitalbadge']")).click();
	Thread.sleep(15000);
}


public void logout() {
	driver.close();
}

@AfterSuite
public void close() {
	driver.quit();
}

}
