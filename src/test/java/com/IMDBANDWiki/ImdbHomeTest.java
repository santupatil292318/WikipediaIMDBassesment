package com.IMDBANDWiki;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.imdbHome.ImdbHomePage;
import com.crm.imdbHome.Pushpapage;
import com.genericUtilities.BaseClass;
import com.wikiPediaHome.PushpawikiPage;
import com.wikiPediaHome.WikiHomePage;
/**
 * 
 * @author santu
 *
 */
public class ImdbHomeTest extends BaseClass {


	@Test
	
	public void ImdbTest() throws Throwable
	{
		//Open the ImdbhomePage
		ImdbHomePage imdbhome = new ImdbHomePage(driver);
		String pushpa = excel.readDataFromExcel("pushpa", 0, 0);
		String URLwiki = fLib.getPropertKeyValue("urlwiki");
		
		//pass value in searchText 
		imdbhome.ImDbpushpaselect(pushpa);
		
		
		//open pushpa movie page
		Pushpapage pushpaReleaseDate = new Pushpapage(driver);
		
		
		//To fetch data on pushpaReleaseContry
		String countryOrigin = pushpaReleaseDate.getcountryorigin().getText();
		System.out.println(countryOrigin);
		
		//To fetch data on pushpaReleaseDate
		String countryDate = pushpaReleaseDate.getreleaseDate().getText();
		System.out.println(countryDate);
		
		//naviagate to wikipediapage
		sdriver.navigate().to(URLwiki);
		WikiHomePage wikihome = new WikiHomePage(driver);
		
		//search pushpa
		wikihome.wikiSearch(pushpa);
		PushpawikiPage pushpawikipage = new PushpawikiPage(driver);
		
		//To fetch data on pushpaReleaseContry
		String countryName = pushpawikipage.getcountryName().getText();
		
		//To fetch data on pushpaReleaseDate
		String contryDate = pushpawikipage.getreleaseDate().getText();
		System.out.println(countryName);
		System.out.println(contryDate);
		
		//validation
		SoftAssert assertsoft = new SoftAssert();
		assertsoft.assertEquals(countryOrigin, countryName);
		Reporter.log("Test pass",true);
		assertsoft.assertEquals(countryDate, contryDate);
		Reporter.log("Test pass",true);
		assertsoft.assertAll();
	}
}
