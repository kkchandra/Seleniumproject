package airlinesubpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import airlinemainpage.aamain;
import excelconstvalues.excelconst;
import excelconstvalues.locatorconst;
import exceldata.Commonmethod;
import exceldata.excelclass;

public class iterselect {
	
	public static void onewayselect() throws Exception{
	Commonmethod.click(locatorconst.onewayslect_textbox);	
	//WebElement os = aamain.driver.findElement(By.xpath("//*[@id=\"watOneWay\"]/label/span[2]"));
	//os.click();
	}
	
	public static void deptcity() throws Exception{
		Commonmethod.clear(locatorconst.dcity_textbox);
		Commonmethod.entertext(locatorconst.dcity_textbox, excelconst.dcity);
	//	aamain.driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
	//	 aamain.driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys(excelclass.Readmethod("Sheet1",3,1));
			
	}
	
	public static void arrcity() throws Exception {
		Commonmethod.entertext(locatorconst.acity_textbox, excelconst.acity);
	//	aamain.driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys(excelconst.acity);
		// String attr = aamain.driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).getAttribute("value");
	}
	
	public static void seldate() {
		Commonmethod.click(locatorconst.deptdate);
	//	Commonmethod.entertext(locatorconst.tdate_textbox, excelconst.tdate); 
		
	//	aamain.driver.findElement(By.name("departDate")).click();
		 // List<WebElement> tbrow = aamain.driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr"));
		List<WebElement> tbrow = Commonmethod.allElements(locatorconst.tdate_textbox);
		int count =tbrow.size();
		  System.out.println("Count"+count);
		  for (int i = 0; i < count; i++) {
			  if (Commonmethod.bvalue == true){ break;}
			  else {
			  List<WebElement> tbdata = tbrow.get(i).findElements(By.tagName("td"));
			  int count1 =tbdata.size();
			  System.out.println("Columncount"+count1);
			  for (int j = 0; j < count1; j++) {
				 String elem = tbdata.get(j).getText();
				 System.out.println(elem);
				 		 if (elem.equals(excelconst.tdate))
						 {tbdata.get(j).click();
						 System.out.println("inputdate"+excelconst.tdate);
						 System.out.println("date"+tbdata.get(j));
						 Commonmethod.bvalue = true;
						 break;}
				 
			  			 
			  }  // inner for loop
			  }   /// else loop
						 
		}	 // main for loop
		
	}
	public static void submit() {
		   Commonmethod.click(locatorconst.submitbutton);
		// aamain.driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
	}
}
