package dataprovider;

import org.testng.annotations.DataProvider;

import generic.Basetest;
import generic.actionUtil;

public class actidata {

	@DataProvider
	public Object[][] createUserData()
	{
		Object[][] d=new Object[1][5];
		d[0][0]=actionUtil.getData(Basetest.excelPath,"adduser",1,0);
		d[0][1]=actionUtil.getData(Basetest.excelPath,"adduser",1,1);
		d[0][2]=actionUtil.getData(Basetest.excelPath,"adduser",1,2);
		d[0][3]=actionUtil.getData(Basetest.excelPath,"adduser",1,3);
		d[0][4]=actionUtil.getData(Basetest.excelPath,"adduser",1,4);
		return d;
	}
}
