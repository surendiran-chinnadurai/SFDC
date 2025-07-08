package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralUtilities.baseClass;

public class casesPage extends baseClass {

	public casesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "phSearchInput")
	private WebElement search_input;
	@FindBy(id = "phSearchButton")
	private WebElement search_btn;

	public WebElement getSearch_input() {
		return search_input;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}
}
