package airlinemainpage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Testcases.TC01;
import Testcases.Tc02;
import airlinesubpage.iterselect;
import excelconstvalues.excelconst;
import exceldata.Commonmethod;
import exceldata.excelclass;

public class aamain {
	public static boolean statusvalue;
	@BeforeClass
	public static void prerequest() throws Exception {
		excelclass.excelpath(excelconst.excelpath);
	}
//** TestCase 1***************
//* comment to test GIT changes
		@Test
		public static void t1() throws Exception{
		statusvalue = true;
		TC01.tc01();
		if (statusvalue == true) {
		System.out.println("TC01 pass");}
		else { 
			System.out.println("TC01 fail");
		}
		}
//*testcase2**********				
	
		
	
}
		/*
		 * // public static final String excelpath="C:\\Selenium data\\AA data.xlsx"; //
		 * System.out.println(excelclass.Readmethod("Sheet1",1,1)); //
		 * System.out.println(excelclass.Readmethod("Sheet1",2,1)); //
		 * System.out.println(excelconst.acity); // public static final String dcity=
		 * excelclass.Readmethod("Sheet1",3,1); // public static final String acity=
		 * excelclass.Readmethod("Sheet1",4,1); // public static final String tdate=
		 * excelclass.Readmethod("Sheet1",5,1); // TODO Auto-generated method stub //
		 * excelclass.excelpath(excelconst.excelpath);
		 * 
		 * Commonmethod.browtype(excelconst.browsername);
		 * Commonmethod.openurl(excelconst.url); //
		 * driver.navigate().to(excelclass.Readmethod("Sheet1",2,1));
		 * Thread.sleep(2000); iterselect.onewayselect(); iterselect.deptcity();
		 * Thread.sleep(2000); iterselect.arrcity(); iterselect.seldate();
		 * iterselect.submit();
		 */
		 

