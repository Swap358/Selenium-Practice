package com.workwithExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ERead_Ex_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream TestFile =new FileInputStream("C:\\Users\\s\\git\\repository\\Core_Java_Examples\\ExcelOperation\\ExcelPractice.xlsx");
		
		XSSFWorkbook Wb=new XSSFWorkbook(TestFile);
		
		XSSFSheet  sheet = Wb.getSheet("Sheet1");
		System.out.println("Sheet is identified ");
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell =row.getCell(0);
		
		String text =cell.getStringCellValue();
		
		System.out.println("Cell Data is :" +text);
		
		FileOutputStream ofi= new FileOutputStream("C:\\Users\\s\\git\\repository\\Core_Java_Examples\\ExcelOperation\\ExcelPractice.xlsx");
		row=sheet.getRow(0);
		cell =row.getCell(0);
		cell.setCellValue("Swapnil is Failuer Person.....");
		Wb.write(ofi);
		text =cell.getStringCellValue();
		System.out.println("Cell Data is :" +text);
	}	

}
