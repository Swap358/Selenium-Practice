package com.workwithExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperationWithExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//identify the excel in your systemm or check the file is exist or not 
	
		FileInputStream excelTestDataFile =new FileInputStream("C:\\Users\\s\\git\\repository\\Core_Java_Examples\\ExcelOperation\\ExcelPractice.xlsx");
		
		//identify the the workbook in excel 
		XSSFWorkbook excelWrokBook =new XSSFWorkbook(excelTestDataFile);
		
		//idenffy the sheet in workbook 
		XSSFSheet excelSheet =excelWrokBook.createSheet("Manual");
		
		System.out.println("Sheet is created.....");
		XSSFRow newRow=excelSheet.createRow(4);
		XSSFCell newCell=newRow.createCell(4);
		
		newCell.setCellValue("Automation Name");
		
		FileOutputStream saveExcelTestDataFile = new FileOutputStream("C:\\Users\\s\\git\\repository\\Core_Java_Examples\\ExcelOperation\\ExcelPractice.xlsx");
		excelWrokBook.write(saveExcelTestDataFile);
		System.out.println("cell is created ...");
		
	}

}
