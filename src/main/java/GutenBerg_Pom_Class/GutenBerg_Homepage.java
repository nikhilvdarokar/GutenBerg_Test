package GutenBerg_Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GutenBerg_Homepage {
	
	//Creating Variables for All elements present on WebPage
	
	@FindBy(xpath="//h1") private WebElement title;
	@FindBy(xpath="//div[@class='ui equal width grid']/descendant::span[text()='FICTION']") private WebElement Fiction_Button;
	@FindBy(xpath="//div[@class='ui equal width grid']/descendant::span[text()=' DRAMA']")private WebElement Drama_Button;
	@FindBy(xpath="//div[@class='ui equal width grid']/descendant::span[text()=' HUMOR']")private WebElement Humor_Button;
	@FindBy(xpath="//div[@class='ui equal width grid']/descendant::span[text()=' POLITICS']")private WebElement Politics_Button;
	@FindBy(xpath="//div[@class='ui equal width grid']/descendant::span[text()=' PHILOSOPHY']")private WebElement Philosophy_Button;
	@FindBy(xpath="//div[@class='ui equal width grid']/descendant::span[text()=' HISTORY']")private WebElement History_Button;
	@FindBy(xpath="//div[@class='ui equal width grid']/descendant::span[text()=' ADVENTURE']")private WebElement Adventure_Button;

	
	public GutenBerg_Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public String verifyTitle() {
		String actText = title.getText();
		return actText;
	}
	
	public void clickFiction_Button() {	
		Fiction_Button.click();
	}
	
	public void clickDrama_Button() {	
		Drama_Button.click();
	}
	
	public void clickHumor_Button() {	
		Humor_Button.click();
	}
	
	public void clickPolitics_Button() {	
		Politics_Button.click();
	}

	public void clickPhilosophy_Button() {	
		Philosophy_Button.click();
	}

	public void clickHistory_Button() {	
		History_Button.click();
	}

	public void clickAdventure_Button() {	
		Adventure_Button.click();
	}


}
