package com.pom;


import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CBTCrowdPO {
	
	public CBTCrowdPO(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@ id='account-chooser-link']")
	private WebElement eleSigninDiffLnk;
	public WebElement getEleSigninDiffLnk()
	{
		return eleSigninDiffLnk;
	}

	@FindBy(xpath="//a[@id='account-chooser-add-account']")
	private WebElement eleAddAccountLnk;
	public  WebElement getEleAddAccountLnk()
	{
		return eleAddAccountLnk;
	}
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement eleEmialTxtFld;
	public WebElement getEleEmialTxtFld()
	{
		return eleEmialTxtFld;
	}
	
	@FindBy(xpath="//input[@id='next']")
	private WebElement eleNextBtn;
	public  WebElement getEleNextBtn()
	{
		return eleNextBtn;
	}
	
	@FindBy(xpath="//input[@id='Passwd']")
	private WebElement elePswdTxtFld;
	public WebElement getElePswdTxtFld()
	{
		return elePswdTxtFld;
	}
	
	@FindBy(xpath="//input[@id='signIn']")
	private WebElement eleSignInBtn;
	public WebElement getEleSignInBtn()
	{
		return eleSignInBtn;
	}
	
	@FindBy(xpath="//a [@class='gb_b gb_Pb']")
	private WebElement eleMenuBtn;
	public WebElement getEleMenuBtn()
	{
		return eleMenuBtn;
	}
			
	@FindBy(xpath="(//span[@class='gb_3'])[1]")
	private WebElement eleMyAccountLnk;
	public  WebElement getEleMyAccountLnk()
	{
		return eleMyAccountLnk;
	}
	
	@FindBy(xpath="(//img[@width='36'])[3]")
	private WebElement eleAccountPrefer;
	public WebElement getEleAccountPrefer()
	{
		return eleAccountPrefer;
	}
	
	@FindBy(xpath="(//a[text()='Connected apps & sites'])[2]")
	private WebElement  eleConnectedApps;
	public WebElement getEleConnectedApps()
	{
		return eleConnectedApps;
	}
	
	@FindBy(xpath="//a[text()='Manage apps']")
	private WebElement eleManageapps;
	public WebElement getEleManageapps()
	{
		return eleManageapps;
	}
	 
	@FindBy(xpath="//div [@class='Zt']")
	private List<WebElement> eleCompany;
	public  List<WebElement> getEleCompany()
	{
		return eleCompany;
	}
	
	
	@FindBy(xpath="(//span[text()='Remove'])[1]")
	private List<WebElement> eleRemoveBtn;
	public List<WebElement> getEleRemoveBtn()
	{
		return eleRemoveBtn;
	}
	
	@FindBy(xpath="(//span[text()='OK'])[2]")
	private WebElement eleOkBtn;
	public WebElement getEleOkBtn()
	{
		return eleOkBtn;
	}
	
	@FindBy(xpath="//td [@class='oZ-x3 xY']")
	private List<WebElement> eleCheckbox;
	public  List<WebElement> getEleCheckbox()
	{
		return eleCheckbox;
	}
	
	@FindBy(xpath="//div[@class='ar9 T-I-J3 J-J5-Ji']")
	private WebElement eleDeleteIcn;
	public WebElement getEleDeleteIcn()
	{
	  return eleDeleteIcn;	
	}
	
	@FindBy(xpath="//div[text()='Your Primary tab is empty.']")
	private WebElement eleEmptyTxt;
	public WebElement getEleEmptyTxt()
	{
		return eleEmptyTxt;
	}
	
	@FindBy(xpath="//span[@class='CJ']")
	private WebElement eleLowBtn;
	public WebElement getEleLowBtn()
	{
		return eleLowBtn;
	}
	
	@FindBy(xpath="//div[text()='Delete forever']")
	private WebElement eleDelete2Icn;
	public WebElement getEleDelete2Icn()
	{
		return eleDelete2Icn;
	}
	
	@FindBy(xpath="//a[text()='Trash']")
	private WebElement eleTrashLnk;
	public WebElement getEleTrashLnk()
	{
		return eleTrashLnk;
	}
	
	@FindBy(xpath="//span[@class='gb_1a gbii']")
	private WebElement eleProfileIcn;
	public WebElement getEleProfileIcn()
	{
		return eleProfileIcn;
	}
	
	@FindBy(xpath="//a[text()='Sign out']")
	private WebElement eleLogoutBtn;
	public WebElement getEleLogoutBtn()
	{
		return eleLogoutBtn;
	}
	
	@FindBy(xpath="(//div[@role='presentation'])[3]")
	private WebElement eleChoiceBtn;
	public WebElement getEleChoiceBtn()
	{
		return eleChoiceBtn;
	}
	
	@FindBy(xpath="(//a[text()='Account overview'])[2]")
	private WebElement eleAccountOverview;
	public WebElement getEleAccountOverview()
	{
		return eleAccountOverview;
	}
	
	@FindBy(xpath="//a[text()='View Dashboard']")
	private WebElement eledashboardLnk;
	public WebElement getEledashboardLnk()
	{
		return eledashboardLnk;
	}
	
	@FindBy(xpath="//a[text()='Change Password']")
	private WebElement eleChangePswLnk;
	public WebElement getEleChangePswLnk()
	{
		return eleChangePswLnk;
	}
	
	@FindBy(xpath="//div[@id=':32']/div[1]/span/div")
	private WebElement eleEmailChoice;
	public WebElement getEleEmailChoice()
	{
		return eleEmailChoice;
	}
	
	@FindBy(xpath="//div[@class='ar9 T-I-J3 J-J5-Ji']")
	private WebElement eleEmailDeleteIcn;
	public WebElement getEleEmailDeleteIcn()
	{
	  return eleEmailDeleteIcn;	
	}
	
	@FindBy(xpath="(//div[@class='Xna']/div [@class='Wna'])[3]")
	private WebElement eleAccountPreferences;
	public WebElement getEleAccountPreferences()
	{
	  return eleAccountPreferences;
	}
	
	@FindBy(xpath="(//input[@class='wb Hj'])[1]")
	private WebElement eleNwPsw;
	public WebElement getEleNwPsw()
	{
		return eleNwPsw;
	}
	
	@FindBy(xpath="(//input[@class='wb Hj'])[2]")
	private WebElement eleCnPsw;
	public WebElement getEleCnPsw()
	{
		return eleCnPsw;
	}
	
	@FindBy(xpath="//content[@class='Nb']")
	private WebElement elechpswBtn;
	public WebElement getElechpswBtn()
	{
		return elechpswBtn;
	}
	
	@FindBy(xpath="//a[text()='Remove']")
	private WebElement eleRemoveLnk;
	public WebElement getEleRemoveLnk()
	{
	  return eleRemoveLnk;	
	}	
	 
	@FindBy(xpath="//button[@id='choose-account-0']")
	private WebElement eleCancelIcn;
	public WebElement getEleCancelIcn()
	{
		return eleCancelIcn;
	}
	
	@FindBy(xpath="//a[@id='edit-account-list']")
	private WebElement eleDoneLnk;
	public WebElement getEleDoneLnk()
	{
		return eleDoneLnk;
	}
	
	@FindBy(xpath="//a[text()='Add account']")
	private WebElement eleAddAccount;
	public WebElement getEleAddAccount()
	{
		return eleAddAccount;
	}
	
	@FindBy(xpath="(//div[@class='Zt'])[1]")
	private WebElement eleAsscoiateTxt;
	public WebElement getEleAsscoiateTxt()
	{
	  return eleAsscoiateTxt;	
	}
	
	@FindBy(xpath="//*[@id=':3a']/div")
	private WebElement eleFirstEmailChkBx;
	public WebElement getEleFirstEmailChkBx()
	{
		return eleFirstEmailChkBx;
	}
	
	
	@FindBy(xpath="//div[@class='Jy hY']")
	private WebElement eleNotConnected;
	public WebElement  getEleNotConnected()
	{
		return eleNotConnected;
	}
	
	
	@FindBy(xpath="//span[text()='Gmail']")
	private WebElement eleGmailIcn;
	public WebElement getEleGmailIcn()
	{
		return eleGmailIcn;
	}
	
	@FindBy(xpath="//span/b[text()='Your password changed']")
	private WebElement elechnPswTxt;
	public WebElement getElechnPswTxt()
	{
		return elechnPswTxt;
	}
	
	@FindBy(partialLinkText="Inbox")
	private WebElement eleInboxLnk;
	public WebElement geteleInboxLnk()
	{
		return eleInboxLnk;
	}
	
	@FindBy(xpath="//img[@id='account-image-0']")
	private WebElement eleEmailImg;
	public WebElement getEleEmailImg()
	{
		return eleEmailImg;
	}
	
	
	
	public void login(String un,String pw)
	{
		getEleEmialTxtFld().sendKeys(un);
		getEleNextBtn().click();
		getElePswdTxtFld().sendKeys(pw);
		getEleSignInBtn().click();
	}
	
		public void deleteEmail() throws InterruptedException
		{
			if(getEleFirstEmailChkBx().isDisplayed())
			{
				Thread.sleep(2000);
		      getEleEmailChoice().click();
		      getEleEmailDeleteIcn().click();
			}
		Thread.sleep(2000);
	}
	
	public void changePassword(WebDriver driver,String pw, String newPsw, String conPsw) throws InterruptedException
	{
		
		        getEleMenuBtn().click();
		        getEleMyAccountLnk().click();
				getEleAccountOverview().click();
				getEledashboardLnk().click();
				getEleChangePswLnk().click();
		        getElePswdTxtFld().sendKeys(pw);
				getEleSignInBtn().click();
				getEleNwPsw().sendKeys(newPsw);
				getEleCnPsw().sendKeys(conPsw);
				getElechpswBtn().click();
				Thread.sleep(2000);
				getEleMenuBtn().click();
				getEleGmailIcn().click();
				Thread.sleep(2000);
				geteleInboxLnk().click();
				Thread.sleep(2000);
				if(getElechnPswTxt().isDisplayed()){
					System.out.println("password changed");
				}
			
				
			}
	
	public void deleteEmailTrash() throws InterruptedException
	{	
		getEleLowBtn().click();
		getEleTrashLnk().click();
		Thread.sleep(1000);
		getEleChoiceBtn().click();
		getEleDelete2Icn().click();
	}
	
	public void logout()
	{
		getEleProfileIcn().click();
		getEleLogoutBtn().click();
	}
	
	public void jsClcik(WebElement element,WebDriver driver)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",element);
	}
	
	public void reusabele()
	{
		getEleSigninDiffLnk().click();;
		getEleRemoveLnk().click();
		getEleEmailImg().click();
		getEleDoneLnk().click();
		getEleAddAccountLnk().click();
	}
     
	public void disassociateApps(WebDriver driver ) throws InterruptedException
	{
		getEleMenuBtn().click();
		getEleMyAccountLnk().click();
		Set <String> set1=driver.getWindowHandles();
		Iterator <String> win1=set1.iterator();
		String parent=win1.next();
		String child=win1.next();
		driver.switchTo().window(child);
		getEleConnectedApps().click();
		getEleManageapps().click();
		try
		{
		        if (getEleNotConnected().isDisplayed())
		        {
		        	String text=getEleNotConnected().getText();
					System.out.println(text);
					
		        }
		}  
		
		catch(Exception e)
		{
		      
		           for( int i=0;i<getEleCompany().size();)
		           {
		           getEleCompany().get(i).click();
			       getEleRemoveBtn().get(i).click();
		           getEleOkBtn().click();		
			       Thread.sleep(3000);
	
		           }
		}
		
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(child);
	}
}

	
		
	
	
	

