package GutenBerg_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Gutenberg_Utility {
	
	public static String getTestData(int rowNum,int cellNum) throws Throwable, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Nikhil\\Downloads\\TestData_Gutenberg.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
		
		String data = sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		return data;

}
}
