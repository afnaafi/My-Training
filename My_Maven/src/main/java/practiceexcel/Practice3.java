package practiceexcel;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice3 {
	static FileInputStream fs;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	public static String readDataOfString(int i, int j) throws IOException {
		fs=new FileInputStream("C:\\Users\\afna\\Desktop\\NameRollNo.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("NameRollNo");
		
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		
		return c.getStringCellValue();
	}
	public static String readDataOfNumber(int i, int j) throws IOException {
		fs=new FileInputStream("C:\\Users\\afna\\Desktop\\NameRollNo.xlsx");
		wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("NameRollNo");
		
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		
		
		int a=(int) c.getNumericCellValue();
		return String.valueOf(a);
	
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s1=readDataOfString(0,0);
	    System.out.println(s1);
	    String s2=readDataOfString(1,0);
	    System.out.println(s2);
	    String s3=readDataOfString(2,0);
	    System.out.println(s3);
	    String s4=readDataOfString(3,0);
	    System.out.println(s4);
	    String s5=readDataOfString(0,2);
	    System.out.println(s5);
	    String s6=readDataOfString(1,2);
	    System.out.println(s6);
	    String s7=readDataOfString(2,2);
	    System.out.println(s7);
	    String s8=readDataOfString(3,2);
	    System.out.println(s8);
	    
	    
	   
	    String s9=readDataOfNumber(0,1);
	    System.out.println(s9);
	    String s10=readDataOfNumber(1,1);
	    System.out.println(s10);
	    String s11=readDataOfNumber(2,1);
	    System.out.println(s11);
	    String s12=readDataOfNumber(3,1);
	    System.out.println(s12);
	  
	    String s13=readDataOfNumber(0,3);
	    System.out.println(s13);
	    String s14=readDataOfNumber(1,3);
	    System.out.println(s14);
	   
	    String s15=readDataOfNumber(2,3);
	    System.out.println(s15);
	    String s16=readDataOfNumber(3,3);
	    System.out.println(s16);
	    
		
	}

}
