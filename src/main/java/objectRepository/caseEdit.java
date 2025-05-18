package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class caseEdit {
	public caseEdit(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//tr/td[4]//span[@class='dateFormat']/a") private WebElement Date_sent_customerLink;
	@FindBy(xpath = "//input[@name='save_close']") private WebElement Save_close_btn;
	
	public WebElement getDate_sent_customerLink() {
		return Date_sent_customerLink;
	}

	public WebElement getSave_close_btn() {
		return Save_close_btn;
	}
	
	
}

