package com.individualconcepts.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;



public class ReadTheDataFromExcel extends Base {

	public static void main(String[] args) throws IOException {
		

		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		File f = new File(".\\Datafile\\InputFile.xlsx");
		FileInputStream fp = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fp);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
		for(int i=0;i<=rowcount;i++)
		{
		XSSFRow row = sheet.getRow(i);
		String username = row.getCell(0).getStringCellValue();
		String password = row.getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name=['username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']" )).sendKeys(password);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		}
		
			}

}
