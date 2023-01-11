package scripts;

import org.testng.annotations.Test;

import dataprovider.actidata;
import generic.Basetest;
import pages.initialisePages;

public class p2 extends Basetest {


	@Test(dataProviderClass=actidata.class,dataProvider="createUserData")
	public void addUserscript(String un,String pw,String fn,String ln,String em) throws InterruptedException
	{
		 //creates an Object of initialises Pages
		initialisePages pages=new initialisePages(driver);
		//logs into the app
		pages.actiTimeLogin.login(un,pw);
		//clicks on users
		pages.actitimeEnter.clickusers();
		//clicks on new user
		pages.actitimeUsers.clickNewUser();
		//pauses for 3 sec
		Thread.sleep(3000);
		//creates a new user
		pages.adduser.addNewUserName(fn,ln,em);

	}
}
