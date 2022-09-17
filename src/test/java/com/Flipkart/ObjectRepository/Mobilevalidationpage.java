package com.Flipkart.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.Resources.CommonActions;

public class Mobilevalidationpage extends CommonActions{
	
	public Mobilevalidationpage(){
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="q")
	private WebElement search;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closeicon;
	public WebElement getSearch() {
		return search;
	}
	public WebElement getCloseicon() {
		return closeicon;
	}
	
}
