package GeneralUtilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class fileUtilities {
	
	public String readCaseNumberFromExcel(String Sname,int r,int c) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("C:\\Users\\chinnsur\\git\\SFDC\\TestData\\CaseNumber.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		Sheet sheetname=wb.getSheet(Sname);
		Row row=sheetname.getRow(r);
		Cell cell=row.getCell(c);
		DataFormatter df=new DataFormatter();
		String caseNumber=df.formatCellValue(cell);
		return caseNumber;
	}
	public int getNumberOfRow(String Sname) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("C:\\Users\\chinnsur\\git\\SFDC\\TestData\\CaseNumber.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		Sheet sheetname=wb.getSheet(Sname);
		int TotalNumberOfRows=sheetname.getPhysicalNumberOfRows();
		return TotalNumberOfRows;
	}
	public void WriteDateInExcel(String Sname,int r,int c) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("C:\\Users\\chinnsur\\git\\SFDC\\TestData\\CaseNumber.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		Sheet sheetname=wb.getSheet(Sname);
		Row row=sheetname.getRow(r);
		Cell cell=row.getCell(c+1);
		cell.setCellValue("closed");
	
	}
	public void CreateExcelAndWriteData(String sheetname,int rownum,int cellnum, String data) throws IOException {
		Workbook wb=new XSSFWorkbook();
		Sheet sheet=wb.createSheet(sheetname);
		Row row=sheet.createRow(rownum);
		Cell cell=row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream fis=new FileOutputStream("C:\\Users\\chinnsur\\git\\SFDC\\TestData\\CaseNumber.xlsx");
		wb.write(fis);
		wb.close();
		fis.close();
	}

}
