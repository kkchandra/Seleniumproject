package exceldata;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import airlinemainpage.aamain;
import excelconstvalues.excelconst;

public class Commonmethod {
	public static WebDriver driver;
	public static boolean bvalue;
	public static List<WebElement> elements;
	
	public static WebDriver browtype(String bname)
	{
		if (bname.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();}
		else if(bname.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
				}

				return driver;
	}
	public static void openurl(String testdata) {
		try {
			  driver.get(testdata);
			 
		}catch(Exception e) {
			aamain.statusvalue=false;
			e.printStackTrace();}
    }
	public static void entertext(String locatorvariable, String testdata) {
		try {
		WebElement element=driver.findElement(LocatorsplitFunction.locatorSplitFunction(locatorvariable));
		element.sendKeys(testdata);
		}catch (Exception e) {
			aamain.statusvalue=false;
			e.printStackTrace();}
		}
		
	public static void click(String locatorvariable) {
		try {
		WebElement element=driver.findElement(LocatorsplitFunction.locatorSplitFunction(locatorvariable));
		element.click();
		}catch (Exception e) {
			aamain.statusvalue=false;
			e.printStackTrace();}
}
	
	public static void clear(String locatorvariable) {
		try {
		WebElement element=driver.findElement(LocatorsplitFunction.locatorSplitFunction(locatorvariable));
		element.clear();
		}catch (Exception e) {
			aamain.statusvalue=false;
			e.printStackTrace();}
}
	
	public static List<WebElement> allElements(String locatorVariable){
		try {
			elements = driver.findElements(LocatorsplitFunction.locatorSplitFunction(locatorVariable));
		} catch (Exception e) {
			aamain.statusvalue = false;
			e.printStackTrace();
		}
		return elements;
	}
	
	public static void scroll() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("Scroll(0,1000)");
	}
}


