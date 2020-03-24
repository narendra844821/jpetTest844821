package datapack;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel_Class {
	public String excel_username(int i) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\NARENDRA\\git\\jpetTest844821\\src\\test\\resources\\data\\data1.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int count = sheet.getLastRowNum();
		System.out.println(count);

		XSSFRow row = sheet.getRow(i);
		XSSFCell cell = row.getCell(0);
		String un = cell.getStringCellValue();

		return un;
	
	}

	public String excel_password(int i) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\NARENDRA\\git\\jpetTest844821\\src\\test\\resources\\data\\data1.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int count = sheet.getLastRowNum();
		System.out.println(count);


		XSSFRow row = sheet.getRow(i);
		XSSFCell cell = row.getCell(1);
		String un = cell.getStringCellValue();
		return un;
	}
}
