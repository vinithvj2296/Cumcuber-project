package com.Flipkart.Stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.Flipkart.Resources.CommonActions;

import cucumber.api.java.en.When;

public class TvValidationSteps  extends CommonActions{
	CommonActions c= new CommonActions();
	   String name="";
	@When("User search Tv by using Oned list")
	public void user_search_Tv_by_using_Oned_list(io.cucumber.datatable.DataTable dataTable) {
		 List<String>  datas = dataTable.asList();
			
	     name = datas.get(1);
		WebElement search=	MobilevalidationSteps.driver.findElement(By.name("q"));
			search.sendKeys(name+" Tv",Keys.ENTER);
			
	}

	@When("User select the Tv and click add to cart")
	public void user_select_the_Tv_and_click_add_to_cart() {
		
			MobilevalidationSteps. driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[2]")).click();
		      
		      c.windowshandling();
			 
	}

	@When("User search Tv by using Oned map")
	public void user_search_Tv_by_using_Oned_map(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String>Dmap =dataTable.asMap(String.class, String.class);
		name = Dmap.get("name1");
		WebElement search=	MobilevalidationSteps.driver.findElement(By.name("q"));
			search.sendKeys(name+" Tv",Keys.ENTER);
	}

}
