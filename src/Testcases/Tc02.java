package Testcases;

import airlinesubpage.iterselect;

public class Tc02 {

	public static void tc02() throws Exception {
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
