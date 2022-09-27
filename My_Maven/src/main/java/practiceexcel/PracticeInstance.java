package practiceexcel;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeInstance {
	FileInputStream fs;
	XSSFWorkbook wb;
	XSSFSheet sh;
	
public String readStringVal(int i, int j) throws IOException {
	fs=new FileInputStream("C:\\Users\\afna\\Desktop\\NameRollNo.xlsx");
	wb=new XSSFWorkbook(fs);
	sh=wb.getSheet("NameRollNo");
	
	Row r=sh.getRow(i);
	Cell c=r.getCell(j);
	
	return c.getStringCellValue();	
	
	

}		
public String readNumValue(int i, int j) throws IOException {
	fs=new FileInputStream("C:\\Users\\afna\\Desktop\\NameRollNo.xlsx");
	wb=new XSSFWorkbook(fs);
	sh=wb.getSheet("NameRollNo");
	
	Row r=sh.getRow(i);
	Cell c=r.getCell(j);
	
	int num= (int) c.getNumericCellValue();
	return String.valueOf(num);
	
}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PracticeInstance obj=new PracticeInstance();
		String s1=obj.readStringVal(0, 0);
		System.out.println(s1);
		String s2=obj.readStringVal(1, 0);
		System.out.println(s2);
		
		String s3=obj.readNumValue(0, 1);
		System.out.println(s3);
		String s4=obj.readNumValue(0, 3);
		System.out.println(s4);
	
	}}