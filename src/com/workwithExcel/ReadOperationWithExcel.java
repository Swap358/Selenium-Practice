package com.workwithExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadOperationWithExcel {

	public static void main(String[] args) throws IOException {
		
		//Work with excel operatin usig selenium = 
		// her we use Apaceh POI external jar / api library for handles it.
		
		FileInputStream excelDataFile =new FileInputStream("C:\\Users\\s\\git\\repository\\Core_Java_Examples\\ExcelOperation\\ExcelPractice.xlsx");
		
		// identify the work book in excel 
		XSSFWorkbook exclWorkbook =new XSSFWorkbook(excelDataFile);
		
		//identify sheet 
		XSSFSheet workbookSheet =exclWorkbook.getSheet("sheet1");
		System.out.println("shet is identify "+workbookSheet);
		
		// identify the row in the sheet 
		// also count row and column from 0,1,2,3    //  means  
		XSSFRow sheetofRow= workbookSheet.getRow(3); //here column (vertical) location of cell
		
		//to read the data into cell 
		
		XSSFCell RowOfCell = sheetofRow.getCell(4); // here the count from row (horizontal)
		
		//to read the data in to cell
		String testData = RowOfCell.getStringCellValue()	;
		
		System.out.println(testData);
	}

}
