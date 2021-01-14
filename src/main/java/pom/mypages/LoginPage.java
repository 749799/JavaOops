package pom.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	private By emailid = By.id("");
	private By password = By.id("");
	private By header = By.id("");
	private By login = By.id("");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	//encapsulation accessing private variable with public method
	public void doLogin(String username, String Password) {
		
		getElement(emailid).sendKeys(username);
		getElement(password).sendKeys(Password);
		getElement(login).click();
		
	}
	
	//handle negative scenario with method overloading
	public void doLogin(String username) {
		
		getElement(emailid).sendKeys(username);;
		getElement(login).click();
	}
	
	public String LoginPageTitle() {
		
		return getPageTitle();
	}

}
