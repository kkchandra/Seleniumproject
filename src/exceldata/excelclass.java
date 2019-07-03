package exceldata;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import excelconstvalues.excelconst;

public class excelclass {

		public static XSSFWorkbook wb;
		public static XSSFSheet ws;
		public static XSSFCell xc;
		
		public static void excelpath(String pathname) throws Exception {
			File f = new File(pathname);
			FileInputStream fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);
					
		}
		
		public static String Readmethod(String Sheetname, int rowval,int colval) {
		    ws=wb.getSheet(Sheetname);
		    xc=ws.getRow(rowval).getCell(colval);
		    DataFormatter df = new DataFormatter();
		    String  cellvalue =df.formatCellValue(xc);
		    return cellvalue;
			
		}
	
	//  public static void main(String[] args) throws Exception { 
	  //excelpath("C:\\Selenium data\\AA data.xlsx");
	  //System.out.println(Readmethod("Sheet1",1,0));
	  //System.out.println(Readmethod("Sheet1",2,0));
	  //System.out.println(Readmethod("Sheet1",3,0)); }
	 

}
