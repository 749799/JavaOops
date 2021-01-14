package pom.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page{

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPageTitle() {
		
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		// TODO Auto-generated method stub
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
		element = driver.findElement(locator);
		return element;
		}
		catch(Exception e){
			
			System.out.println("Some error occured while creating a element: "+locator.toString());
			e.printStackTrace();
		}
		
		return element;
	}

	@Override
	public void waitForEelemetPresent(By locator) {
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		catch(Exception e) {
			
			System.out.println("element "+locator.toString()+" not visible within expected time");
		}
		
	}
	
	//method overrriding

	@Override
	public void waitForPageTitle(String title) {
		
		try {
			
			wait.until(ExpectedConditions.titleContains(title));
		}
		
		catch(Exception e) {
			System.out.println(title+" not loaded within expected time");
			e.printStackTrace();
		}
		
		
	}

}
