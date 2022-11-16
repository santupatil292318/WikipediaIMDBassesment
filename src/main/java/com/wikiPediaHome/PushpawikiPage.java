package com.wikiPediaHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author santu
 *
 */
public class PushpawikiPage {

	//declaration
	@FindBy(xpath="//table[@class='infobox vevent']/tbody/tr[contains(.,'Release date')]/td[1]")
	private WebElement releaseDate;

	@FindBy(xpath = "//table[@class='infobox vevent']/tbody/tr[contains(.,'Country')]/td[1]")
	private WebElement countryName;


	//initialization
	public PushpawikiPage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}


	//utilization
	public WebElement getreleaseDate() {
		return releaseDate;
	}
	public WebElement getcountryName() {
		return countryName;
	}

	
}
