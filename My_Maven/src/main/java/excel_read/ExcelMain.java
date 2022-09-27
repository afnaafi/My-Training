package excel_read;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     String s1=ExcelCode.stringReadData(3, 0);
     System.out.println(s1);
     String s2=ExcelCode.stringReadData(4, 0);
     System.out.println(s2);
     String s3=ExcelCode.stringReadData(5, 0);
     System.out.println(s3);
     String s4=ExcelCode.integerReadData(0, 0);
     System.out.println(s4);
     String s5=ExcelCode.integerReadData(1, 0);
     System.out.println(s5);
     String s6=ExcelCode.integerReadData(2, 0);
     System.out.println(s6);
     
	}

}
