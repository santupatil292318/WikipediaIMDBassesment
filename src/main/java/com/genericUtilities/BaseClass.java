package com.genericUtilities;
/**
 * 
 * @author santu
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * @author santu
 **/
public class BaseClass 
{
	public static WebDriver sdriver;
	public WebDriver driver;
	
	public FileProperty fLib=new FileProperty();
	public Excelclass excel=new Excelclass();
	public Actions action=new Actions();
	
	/**
	 * launching the browser
	 * @throws Throwable
	 */
	//@Parameters("BROWSER")
	@BeforeMethod
	public void launchTheBrowser()
	{  
		String BROWSER = null;
		try {
			BROWSER = fLib.getPropertKeyValue("browser");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println(BROWSER);
		String URLImdb = null;
		//String URLwiki = null;
		try {
			URLImdb = fLib.getPropertKeyValue("urlimdb");
			//URLwiki = fLib.getPropertKeyValue("urlwiki");
		} catch (Throwable e) {
			e.printStackTrace();
		}

		 if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else {
			driver=new ChromeDriver();
		}

		System.out.println("Browser successfully launched");
		//implicitly wait
		sdriver=driver;
		//enter the URL of the Application
		sdriver.get(URLImdb);
		
		
		
		//maximize the screen
		driver.manage().window().maximize();
	}
	
	/**
	 * close the browser
	 */
	@AfterMethod
	public void closeTheBrowser()
	{
		driver.quit();
		System.out.println("Browser successfully closed");
	}
	
	
}