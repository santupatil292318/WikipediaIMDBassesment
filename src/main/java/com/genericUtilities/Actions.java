package com.genericUtilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
/**
 * 
 * @author santu
 *
 */
public class Actions {

	/**
	 *it will wait for 10 seconds till the page gets load.
	 * @author santu
	 */
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Paths.implicitlyWaitDuration));
	}
	/**
	 * it is used to perform scrollBar Actions
	 * @author santu
	 */
	public void scrollBarAction(WebDriver driver)
	{
		JavascriptExecutor javaScript = (JavascriptExecutor)driver;
		javaScript.executeScript("window.scrollBy(0,800)");
	}
	
}
