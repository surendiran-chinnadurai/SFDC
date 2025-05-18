package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class closeCase {
	
	public closeCase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "cas7") private WebElement Status_DropDown;
	@FindBy(id = "00NG00000064bdq") private WebElement Case_close_reason_dropDown;
	@FindBy(xpath = "//input[@value=' Save ']") private WebElement save_btn;
	public WebElement getStatus_DropDown(String visibleText) {
		Select sl=new Select(Status_DropDown);
		sl.selectByVisibleText(visibleText);
		return Status_DropDown;
	}
	public WebElement getCase_close_reason_dropDown(String visibleText) {
		Select sl=new Select(Case_close_reason_dropDown);
		sl.selectByVisibleText(visibleText);
		return Case_close_reason_dropDown;
	}
	public WebElement getsave_btn() {
		return save_btn;
	}
	
}
