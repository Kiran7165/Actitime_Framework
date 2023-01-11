package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addUser_page2 {
	
	@FindBy(xpath="(//input[@name='firstName'])[2]")
	private WebElement tbFirstName;
	
	@FindBy(xpath="(//input[@name='lastName'])[2]")
	private WebElement tbLastName;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	private WebElement tbEmail;
	
	@FindBy(xpath="//div[text()='Save & Send Invitation']")
	private WebElement btnSave;
	
	public void FirstName(String fn) {
		this.tbFirstName.sendKeys(fn);
	}
	public void LastName(String ln) {
		this.tbLastName.sendKeys(ln);
	}
	public void Email(String em) {
		this.tbEmail.sendKeys(em);
	}
	public void save() {
		this.btnSave.click();
	}
	public void addNewUserName(String fn,String ln,String em) {
		this.tbFirstName.sendKeys(fn);
		this.tbLastName.sendKeys(ln);
		this.tbEmail.sendKeys(em);
		this.btnSave.click();
	}
	
	
	public addUser_page2(WebDriver driver) {

		PageFactory.initElements(driver, this);

}
}
