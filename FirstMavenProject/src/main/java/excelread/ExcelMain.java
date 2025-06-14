package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String x=ExcelCode.getStringData(1, 0);
		System.out.println(x);
		String y=ExcelCode.getIntegerData(1, 1);
		System.out.println(y);

	}

}
