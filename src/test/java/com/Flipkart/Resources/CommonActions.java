package com.Flipkart.Resources;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	  public static  WebDriver driver;
  
	  public void windowshandling(){
		  
		  String parent=  driver.getWindowHandle();
		     
	  		Set<String>child=driver.getWindowHandles();
	  		
	  		for(String v:child){
	  			if(!parent.equals(v)){
	  				driver.switchTo().window(v);
	  			}
	  		}
		  
	  }
	  
	  public void Insertdatas(WebElement ele,String value){
		
		  ele.sendKeys(value,Keys.ENTER);
	  }
	  
	  public void Screenshot() throws IOException{
		  TakesScreenshot t= (TakesScreenshot)driver;
	        File src=  t.getScreenshotAs(OutputType.FILE);
	       File des= new File("C:\\Users\\vinit\\workspace\\Cucumber-Project\\Screenshot\\photo.png");
	       FileUtils.copyFile(src, des);
	       
	  }
	  public void Launch(String url){
		  WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			 driver.navigate().to(url);
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
}




