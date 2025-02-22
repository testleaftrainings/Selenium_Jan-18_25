package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadvalueFromExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb=new XSSFWorkbook("./DataFile/CreateLead.xlsx");
		
		XSSFSheet sheet=wb.getSheetAt(0);
		//index value start from '0'
		//count row value
		int rowcount = sheet.getLastRowNum();
		System.out.println("Row count :"+rowcount);
		
		//include the header row value 
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("include header value :"+physicalNumberOfRows);

	//cell value
		short cellcount = sheet.getRow(1).getLastCellNum();
		System.out.println("Cell value :"+cellcount);
		
		//row value =start from 1
		//cell value = start from 0
		
		String cellValue = sheet.getRow(2).getCell(2).getStringCellValue();
		System.out.println(cellValue);
		
		//print all value
		for (int i = 1; i <=rowcount; i++) {
			
			for (int j = 0; j < cellcount; j++) {
				
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			}
			
		}
	
	
	}

}
