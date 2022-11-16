package com.crm.imdbHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author santu
 *
 */
public class Pushpapage {


	//declaration
	@FindBy(xpath="//li[contains(.,'Release date')]/descendant::li[@role='presentation']")
	private WebElement releaseDate;
	
	@FindBy(xpath="//li[contains(.,'Country of origin')]/descendant::li[@role='presentation']")
	private WebElement countryorigin;

	//initialization
	public Pushpapage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getreleaseDate() {
		return releaseDate;
	}
	
	public WebElement getcountryorigin() {
		return countryorigin;
	}
	
	
}
