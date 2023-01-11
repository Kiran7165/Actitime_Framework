package scripts;

import org.testng.annotations.Test;

import generic.Basetest;
import pages.initialisePages;

public class p1  extends Basetest{
	
	@Test
	public void actiLoginScript() 
	{
		initialisePages pages=new initialisePages(driver);
		pages.actiTimeLogin.login(p.getProperty("username"),p.getProperty("password"));
		
		util.validateTitle("actiTIME - Track Time");
	}

}
