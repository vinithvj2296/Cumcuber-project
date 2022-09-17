package com.Flipkart.Stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Flipkart.ObjectRepository.Mobilevalidationpage;
import com.Flipkart.Resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Ma;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilevalidationSteps extends CommonActions {
	
	
	
	CommonActions c= new CommonActions();
	Mobilevalidationpage v= new Mobilevalidationpage();
	
	@Given("User launches flipkart application")
	public void user_launches_flipkart_application() {
	   
	}
	@Given("User handles login")
	public void user_handles_login() {
		  
			v.getCloseicon().click();
	}

	   String name="";
	@When("User search mobile")
	public void user_search_mobile() {
		name = "SAMSUNG";
	
		//search.sendKeys(name+" mobiles",Keys.ENTER);
	c.Insertdatas(v.getSearch(), name);
		}
	@When("User select the mobile and click add to cart")
	public void user_select_the_mobile_and_click_add_to_cart() throws InterruptedException {
		 driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[2]")).click();
		   Thread.sleep(2000);
		  c.windowshandling();
 
	}


	@When("User doing the payment")
	public void user_doing_the_payment() {
		JavascriptExecutor j= (JavascriptExecutor)driver;
	   j.executeScript("window.scrollBy(0,1800)","");
	}

	@Then("User receive the confirmation message")
	public void user_receive_the_confirmation_message() throws IOException {
		c.Screenshot();
		driver.quit();
	
	}
	@When("User search mobile by using Oned list")
	public void user_search_mobile_by_using_Oned_list(io.cucumber.datatable.DataTable dataTable) {
	    List<String>  datas = dataTable.asList();
		
	     name = datas.get(1);
		
		v.getSearch().sendKeys(name+" mobiles",Keys.ENTER);
			
	}

	@When("User search mobile by using Oned map")
	public void user_search_mobile_by_using_Oned_map(io.cucumber.datatable.DataTable dataTable) {
	  
		Map<String, String>Dmap =dataTable.asMap(String.class, String.class);
		name = Dmap.get("name2");
		;
			v.getSearch().sendKeys(name+" mobiles",Keys.ENTER);
			
		
	}



}