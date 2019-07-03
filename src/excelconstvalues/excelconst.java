package excelconstvalues;


import exceldata.excelclass;

public class excelconst {

	
	    public static final String excelpath="C:\\Selenium data\\AA data.xlsx";
		public static final String browsername= excelclass.Readmethod("Sheet1",1,1);
		public static final String url= excelclass.Readmethod("Sheet1",2,1);
		public static final String dcity= excelclass.Readmethod("Sheet1",3,1);
		public static final String acity= excelclass.Readmethod("Sheet1",4,1);
		public static final String tdate= excelclass.Readmethod("Sheet1",5,1);
		
 
	}

