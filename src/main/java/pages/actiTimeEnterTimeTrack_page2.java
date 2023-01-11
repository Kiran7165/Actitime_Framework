package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basetest;

public class actiTimeEnterTimeTrack_page2 {

	// identifies tasks//
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement btnTasks;

	// identifies Reports//
	@FindBy(xpath = "//a[@class='content reports']")
	private WebElement btnReports;

	// identifies users//
	@FindBy(xpath = "//a[@class='content users']")
	private WebElement btnUsers;

	// identifies logout//
	@FindBy(id = "logoutLink")
	private WebElement btnLogout;
	
	public void clicktasks() {
		this.btnTasks.click();;
	}

	public void clickusers() {
		Basetest.util.validateElementVisibility(btnUsers);
		this.btnUsers.click();;
	}

	public void clickreports() {
		this.btnReports.click();;
	}

	public void clicklogout() {
		this.btnLogout.click();;
	}
	

	public actiTimeEnterTimeTrack_page2(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
