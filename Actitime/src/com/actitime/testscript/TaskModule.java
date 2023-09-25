package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrackPage;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;

@Listeners(com.actitime.generic.ListenersImplementation.class)
public class TaskModule extends BaseClass {
	
	@Test
	public void testCreateTask() throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileLib f=new FileLib();
		String taskName = f.getExcelFile("CreateTask", 1, 2);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		Thread.sleep(2000);
		//click on tasks tab
		e.setTasks();
		TaskListPage t=new TaskListPage(driver);
		Thread.sleep(2000);
		//click on add new button
		t.getAddNewBtn().click();
		//click on new task button
		t.getNewTaskbtn().click();
		Thread.sleep(2000);
		//click customer dropdown
		t.getTaskSelectCustomerDD().click();
		Thread.sleep(2000);
		//select customer
		t.getTaskCustomerNameSbi().click();
		Thread.sleep(2000);
		//click on select project dropdown
		t.getTaskSelectProjectDD().click();
		Thread.sleep(2000);
		//select project
		t.getTaskProjectnameSbi().click();
		Thread.sleep(2000);
		//enter task name
		t.getTaskNametbx().sendKeys(taskName);
		Thread.sleep(2000);
		//click on create task button
		t.getCreateTaskbtn().click();
		Thread.sleep(2000);
		
		
	}

}
