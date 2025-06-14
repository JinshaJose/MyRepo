package excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;

	public static String getStringData(int a,int b) throws IOException 
	{
		f=new FileInputStream("C:\\Users\\jinsh\\OneDrive\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
		
	}
	
	public static String getIntegerData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\jinsh\\OneDrive\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		int s=(int) c.getNumericCellValue();// type casting
		return String.valueOf(s);
		
	}

	

}
