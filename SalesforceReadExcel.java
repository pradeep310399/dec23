package salesforce;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SalesforceReadExcel {
	public static String[][] read() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/salesforceCreate.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int lastRowNum = ws.getLastRowNum();
		short lastCellNum = ws.getRow(0).getLastCellNum();
		
		String[][] data = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				String stringCellValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[1-i][j]=stringCellValue;
				System.out.println(stringCellValue);
				
			}
		}
		
		
		
		
		wb.close();
		return data;
	}

}
