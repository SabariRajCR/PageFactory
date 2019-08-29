package com.leaftaps.utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static Object[][] exceldata(String name) throws IOException{
		
		XSSFWorkbook workbook =new XSSFWorkbook("./data/"+name+".xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[lastRowNum][lastCellNum];
		for(int i=1;i<=lastRowNum;i++){
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < lastCellNum; j++) {
				
				XSSFCell cell = row.getCell(j);	
				
				String value = cell.getStringCellValue();
				
				data[i-1][j] = value;
				
			}
						
		}
		workbook.close();
		return data;
	}
	
	
}
