package Commonhelper;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonExcel {
	
	 XSSFWorkbook workbook;

	public CommonExcel() {
		
		File src = new File("./Excel_file/CPM.xlsx");
		try {
			FileInputStream fil= new FileInputStream(src);
			 workbook = new XSSFWorkbook(fil);
		} catch (Exception e) {
		
		System.out.println("Excel file does not exist"+e.getMessage());
		}
	}
	
	public String getStringdata(String Sheetname,int rownum,int cellnum) {
		
	return	workbook.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
}
