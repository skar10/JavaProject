//package com.qa.training;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class AlertEx {
//
//	public static WebDriver driver;
//
//	public static void main(String[] args) throws InterruptedException {
//
//		// Create a new instance of the Firefox driver
//
//		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
//		 driver = new FirefoxDriver();
//	
//	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
// 
//	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	        
//	        
// 
//	        // Launch the URL
// 
//	        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
// 
//	        // Click on the Button "Alert Box"
// 
//	        driver.findElement(By.name("Alert Box")).click();
// 
//	        // Switch to JavaScript Alert window
// 
//	        Alert myAlert = driver.switchTo().alert();
// 
//	        // Accept the Alert
// 
//	        myAlert.accept();
// 
//	        // Close Original window
// 
//	        driver.close();
// 
//	        
//	        String mainpage = driver.getWindowHandle();
//	        
//	        Alert alt = driver.switchTo().alert();
//	        
//	        alt.accept();
//	        
//	        alt.dismiss();
//	        
//	        driver.switchTo().window(mainpage);
//	        
//	        
//	        
//	      Actions act = new Actions(driver);
//	      
//	      act.moveToElement(rightclick).perform();
//	      
//	      act.contextClick().perform();
//	      
//	      //drag and drop
//	      
//	      
//	      Actions action = new Actions(driver);
//	      
//	      Webelement source = driver.findElement(By.xpath(""));
//	      Webelement target = driver.findElement(By.xpath(""));
//	      
//	      action.dragAndDrop(source,target).perform();
//	      //upload a file
//	      
//	      
//	      //driver.findElement(By.xpath(xpathExpression)).sendkeys("path of thje file")
//	      
//	      //how do u get currenturl
//	      
//	     driver.getCurrentUrl();
//	     
//	     
//	     //reading a excel file and writing
//	     
//	     fileinputpath fip = new fileinputpath("path of webpage");
//	     
//	     Workbook wb = workbookpage.create(fip);
//	     
//	     Sheet s = wb.getsheet("sheetname");
//	     
//	     String value = s.getrow("rownum").getcell("cellnum").getstringcellvalue();
//	     
//	     s.getrow("rownum").getcell("cellnum").setstringcellvalue("value to be set");
//	     
//	     fileoutputstream fos = new fileoutputstream("path of webpage";)
//	    		 
//	    		 wb.write(fos);
//	     
//	     
//	     
//	     
//	     
//	     
//	     
//	     
//	     
//	     
//	     
//	     
//	     
//	      
//	      
//	      
//	      
//	      
//	      
//	      
//	        
//	        
//	        
//	        
//	        
//	        
//	        
//	        
//	        
//	        
//	        
//	}
//}
