package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchResults {

	public searchResults(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//tbody/tr/td[@class='actionColumn']/a[.='Edit']") private WebElement Edit_link;

	public WebElement getEdit_link() {
		return Edit_link;
	}
	
	

}
