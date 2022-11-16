package com.crm.imdbHome;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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
	
	@FindAll({@FindBy(xpath = "//h3[@class='findSectionHeader' and text()='Titles']/following-sibling::table/descendant::tr[@class='findResult odd']/td[@class='primary_photo']")
	,@FindBy(xpath = "//a[@class='ipc-metadata-list-summary-item__t' and contains(@href,'fn_al_tt_1')]")})
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
