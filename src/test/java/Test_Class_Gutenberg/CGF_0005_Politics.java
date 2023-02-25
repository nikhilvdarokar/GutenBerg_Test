package Test_Class_Gutenberg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base_Class_GutenBerg.Gutenberg_Base_Class;
import GutenBerg_Pom_Class.GutenBerg_Homepage;
import GutenBerg_UtilityClass.Gutenberg_Utility;

public class CGF_0005_Politics extends Gutenberg_Base_Class {
	
	GutenBerg_Homepage ghomepom;
	SoftAssert sat;
	@BeforeMethod
	public void openBrowser() {
		initializeBrowser();
		ghomepom = new GutenBerg_Homepage(driver);
		 sat = new SoftAssert();
	}
	
	@Test
	public void CGF_0005Politics() throws IOException, Throwable {
		ghomepom.clickPolitics_Button();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		String actualPageTitleFiction= "Politics";
		String expectedPageTitleFiction=Gutenberg_Utility.getTestData(3, 0);
		sat.assertEquals(expectedPageTitleFiction, actualPageTitleFiction);
		Reporter.log("TC is passed", true);
		sat.assertAll();
	}
	
	@AfterMethod
	public void close_browser6(){
		driver.quit();	
	}
}
