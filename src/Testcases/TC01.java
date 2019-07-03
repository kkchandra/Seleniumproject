package Testcases;

import org.openqa.selenium.JavascriptExecutor;

import airlinesubpage.iterselect;
import excelconstvalues.excelconst;
import exceldata.Commonmethod;

public class TC01 {

	public static void tc01() throws Exception {
		
		Commonmethod.browtype(excelconst.browsername); 
		Commonmethod.openurl(excelconst.url);
		Thread.sleep(2000);
		 iterselect.onewayselect(); 
		  iterselect.deptcity();
		  Thread.sleep(2000);
		  iterselect.arrcity();
		  Thread.sleep(2000);
		  iterselect.seldate();
		  Thread.sleep(2000);
		  iterselect.submit();
	}

}
