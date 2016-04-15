package com.script;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pom.CBTCrowdPO;

public class CBTCrowdTest extends Basetest {
	
	public CBTCrowdPO cBTCrowdPO;
	
	@Test(priority=1, enabled =true)
	public void testLogin() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login27";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	
	@Test (priority=11, enabled=true)
	public void t2() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login28";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	
	@Test (priority=11, enabled=true)
	public void t3() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login29";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	
	
	@Test(priority=1, enabled =true)
	public void testLogin4() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login27";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	@Test(priority=1, enabled =true)
	public void testLogin5() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login27";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	
	@Test(priority=1, enabled =true)
	public void testLogin6() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login27";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	
	@Test(priority=1, enabled =true)
	public void testLogin7() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login27";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	
	@Test(priority=1, enabled =true)
	public void testLogin8() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login27";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	
	@Test(priority=1, enabled =true)
	public void testLogin9() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login27";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	
	@Test(priority=1, enabled =true)
	public void testLogin10() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login27";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	
	@Test(priority=1, enabled =true)
	public void testLogin11() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login27";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	
	@Test(priority=1, enabled =true)
	public void testLogin12() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login27";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	
	@Test(priority=1, enabled =true)
	public void testLogin13() throws Exception
	{
		try
		{
		cBTCrowdPO=new CBTCrowdPO(driver);
		testCaseName="Login27";
		DataSheetList=generic.readDataFromExcel(testCaseName);
		cBTCrowdPO.login(DataSheetList.get(1), DataSheetList.get(2));
		cBTCrowdPO.deleteEmail();
		cBTCrowdPO.deleteEmailTrash();
		cBTCrowdPO.disassociateApps(driver);
		cBTCrowdPO.changePassword(driver,  DataSheetList.get(2),  DataSheetList.get(3),  DataSheetList.get(3));
		cBTCrowdPO.logout(); 
		cBTCrowdPO.reusabele();
		generic.WriteData("pass", testCaseName, "");
		}
		catch(Exception e)
		{
			generic.WriteData("Fail", testCaseName, e.toString());

		}
	}
	
	
}
