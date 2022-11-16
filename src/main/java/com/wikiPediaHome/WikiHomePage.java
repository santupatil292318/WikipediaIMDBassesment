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
public class WikiHomePage {

	//declaration
		@FindBy(xpath="//input[@id='searchInput']")
		private WebElement searchWiki;
		
		@FindBy(xpath = "//button[@type='submit']")
		private WebElement submitbtn;
		

		//initialization
		public WikiHomePage(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
		}
		
		
		//utilization
		public WebElement getsearchWiki() {
			return searchWiki;
		}
		public WebElement getSubmitwiki() {
			return submitbtn;
		}
		
		public void wikiSearch(String name)
		{
			searchWiki.sendKeys(name);
			submitbtn.click();
		}
}
