package com.crm.imdbHome;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author santu
 */
public class ImdbHomePage {

	//declaration
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchIMDB;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitbtn;
	
	@FindBy(xpath = "//h3[@class='findSectionHeader' and text()='Titles']/following-sibling::table/descendant::tr[@class='findResult odd']/td[@class='primary_photo']")
	private WebElement selectpushpalink;
	
	

	//initialization
	public ImdbHomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getSearchIMDB() {
		return searchIMDB;
	}
	public WebElement getsubmitbtn() {
		return submitbtn;
	}
	public WebElement getselectpushpalink() {
		return selectpushpalink;
	}
	
	public void ImDbpushpaselect(String name)
	{
		searchIMDB.sendKeys(name);
		submitbtn.click();
		selectpushpalink.click();
	}
	
}
