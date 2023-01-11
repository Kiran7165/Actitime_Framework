package pages;

import org.openqa.selenium.WebDriver;

public class initialisePages {

	public actiTimeLogin_Page2 actiTimeLogin;
	public actiTimeEnterTimeTrack_page2 actitimeEnter;
	public actiTimeUserList_page2 actitimeUsers;
	public addUser_page2 adduser;
	
	public initialisePages(WebDriver driver) {
		this.actiTimeLogin=new actiTimeLogin_Page2(driver);
		this.actitimeEnter=new actiTimeEnterTimeTrack_page2(driver);
		this.actitimeUsers=new actiTimeUserList_page2(driver);
		this.adduser=new addUser_page2(driver);
	}
}
