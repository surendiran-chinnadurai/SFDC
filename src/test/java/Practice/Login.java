package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Login {
	
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mylogin.hpe.com/app/salesforce/exkl8pn7jtyoF0etz697/sso/saml");
		driver.findElement(By.xpath("//a[.='Sign in with Virtual Digitalbadge']")).click();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		ChromeOptions chrome_option=new ChromeOptions();
	}
	public static void main(String[] args) throws InterruptedException {
		Login lg=new Login();
		lg.login();
	}

}
