package Practice;

import java.io.IOException;

import GeneralUtilities.baseClass;
import GeneralUtilities.fileUtilities;

public class ExcelWrite extends baseClass{
	
	public static void main(String[] args) throws IOException {
		
		fileUtilities fUtil=new fileUtilities();
		fUtil.CreateExcelAndWriteData("sheet1", 1, 1, "helloworld");
		
		
	}

}
