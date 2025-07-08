package automations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import GeneralUtilities.baseClass;
import objectRepository.caseEdit;
import objectRepository.casesPage;
import objectRepository.closeCase;
import objectRepository.searchResults;


public class RenewalsCaseClosure extends baseClass{
	
	@Test
	public void renewalsCaseClosure() throws EncryptedDocumentException, IOException, InterruptedException {
			
		cp=new casesPage(driver);
		sr=new searchResults(driver);
		ce=new caseEdit(driver);
		cc=new closeCase(driver);
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--headless=new");
		
		int NoOfRow=fUtil.getNumberOfRow("Sheet1");
		System.out.println(NoOfRow);
		
		for(int i=0;i<NoOfRow;i++) {
		String casenumber=fUtil.readCaseNumberFromExcel("Sheet1",i, 0);
		cp.getSearch_input().sendKeys(casenumber);
		cp.getSearch_btn().submit();
		sr.getEdit_link().click();
		ce.getDate_sent_customerLink().click();
		Thread.sleep(1000);
		try {
			ce.getSave_close_btn().click();
			cc.getStatus_DropDown("Closed");
			cc.getCase_close_reason_dropDown("Completed in S4");
			cc.getsave_btn().click();
			fUtil.WriteDateInExcel("Sheet1", i, 0);
			}
		catch (Exception e){
			}
		
		}	
	}
	
}
