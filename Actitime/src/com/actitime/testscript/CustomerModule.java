package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrackPage;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;

@Listeners(com.actitime.generic.ListenersImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("Create Customer", true);
		
		FileLib f=new FileLib();
		String customerName = f.getExcelFile("CreateCustomer", 1, 2);
		String customerdesc = f.getExcelFile("CreateCustomer", 1, 3);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTasks();
		Thread.sleep(2000);
		TaskListPage t=new TaskListPage(driver);
	    t.getAddNewBtn().click();
		Thread.sleep(2000);
	    t.getNewCustomerbtn().click();
		Thread.sleep(2000);
	    t.getCustomerNametbx().sendKeys(customerName);
		Thread.sleep(2000);
	    t.getCustomerDesctbx().sendKeys(customerdesc);
		Thread.sleep(2000);
	    t.getSelectCustDD().click();
		Thread.sleep(2000);
	    t.getBigBangtext().click();
		Thread.sleep(2000);
	    t.getCreateCustbtn().click();
	    Thread.sleep(3000);
	    String actualCustomerText = t.getActualCustomer().getText();
	    Assert.assertEquals(actualCustomerText, customerName);
		Thread.sleep(2000);

	    
	    

	}

	
}
