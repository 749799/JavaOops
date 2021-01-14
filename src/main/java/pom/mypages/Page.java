package pom.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	 
	WebDriver driver;
	WebDriverWait wait;
	
	public Page(WebDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 5);
		
	}
	
	//abstract methods
	
	public abstract String getPageTitle();
	
	public abstract String getPageHeader(By locator);
	
	public abstract WebElement getElement(By locator);
	
	public abstract void waitForEelemetPresent(By loactor);
	
	public abstract void waitForPageTitle(String title);
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		try {
		return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		return null;
	}
	
	

}


