package pom.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomaPage extends BasePage{
	
	private By header = By.id("");

	public HomaPage(WebDriver driver) {
		super(driver);
		
	}
	
	public String getHeader(By header) {
		WebElement element = getElement(header);
		return element.getText();
	}
	
	public String getHomePageTitle() {
		
		return getPageTitle();
	}

}
