package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeLogin_Page2 {
	// identifies username//
	@FindBy(name = "username")
	private WebElement tbUsername;

	// identifies password//
	@FindBy(name = "pwd")
	private WebElement tbPassword;

	// identifies the loginbutton
	@FindBy(id = "loginButton")
	private WebElement btnLogin;
	
	//creates an method of username//
	public void setusername(String un) {
		this.tbUsername.sendKeys(un);
	}
	//creates an method of password//
	public void setpassword(String pw) {
		this.tbPassword.sendKeys(pw);
	}
	//creates the method of login button//
	public void clickLogin() {
		this.btnLogin.click();
		
	}
	
	public void login(String un,String pw) {
		
		this.tbUsername.sendKeys(un);
		this.tbPassword.sendKeys(pw);
		this.btnLogin.click();
	}
	

	public actiTimeLogin_Page2(WebDriver driver) {
		// intialises webelement//
		PageFactory.initElements(driver, this);
	}

}
