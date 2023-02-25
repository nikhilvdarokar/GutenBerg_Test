package Base_Class_GutenBerg;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gutenberg_Base_Class {
	public WebDriver driver;
public void initializeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://skunkworks.ignitesol.com:3000/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}


}
