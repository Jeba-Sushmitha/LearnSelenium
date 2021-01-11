package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReadApachiPOI {
	@Test
	public void ReadExcelData() throws BiffException, IOException {		
		FileInputStream excelSource = new FileInputStream("D:\\Selenium\\Excel Jars\\ReadApachi.xls");
		
		/*Workbook workbook = Workbook.getWorkbook(excelSource);
		Sheet sheet = workbook.getSheet(0);
		int rows = sheet.getRows();
		int columns = sheet.getColumns();
		System.out.println(rows);
		System.out.println(columns);*/
		}
}
