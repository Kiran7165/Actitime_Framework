package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeUserList_page2 {
	
	@FindBy(xpath="(//div[contains(text(),'  Departments')])[1]")
	private WebElement btnDepartments;
	
	@FindBy(xpath="//div[text()='New User']")
	private WebElement btnNewUser;
	
	@FindBy(xpath="//div[text()='Bulk Invitations']")
	private WebElement btnBulkInvitations;
	
	public void clickDepartment() {
		this.btnDepartments.click();
	}
	public void clickNewUser() {
		this.btnNewUser.click();
	}
	public void clickBulkInvitations() {
		this.btnBulkInvitations.click();
	}
	
	
	public actiTimeUserList_page2(WebDriver driver) {

		PageFactory.initElements(driver, this);
	
	
	}
}
