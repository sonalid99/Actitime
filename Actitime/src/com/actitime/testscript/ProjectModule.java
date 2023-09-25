package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrackPage;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;

@Listeners(com.actitime.generic.ListenersImplementation.class)
public class ProjectModule extends BaseClass {
	
	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException {
		
		Reporter.log("Create Project");
		
		FileLib f=new FileLib();
		String ProjectName = f.getExcelFile("CreateProject", 1, 2);
		String Projectdesc=f.getExcelFile("CreateProject", 1, 3);
		
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		//click on tasks tab
		e.setTasks();
		Thread.sleep(3000);
		TaskListPage t=new TaskListPage(driver);
		//click on add new button
		t.getAddNewBtn().click();
		Thread.sleep(3000);
		//click on new project
		t.getNewProjectTab().click();
		Thread.sleep(3000);
		//click on project name textbox and type the project name
		t.getProjectNametbx().sendKeys(ProjectName);
		Thread.sleep(3000);
		//click on customer name dropdown
		//t.getCustomerNameDD().click();
		//Thread.sleep(3000);
		//select customer 
		//t.getAxis_007Customer().click();
		//Thread.sleep(3000);
		//description textbox
		t.getProjectDesctbx().sendKeys(Projectdesc);
		Thread.sleep(3000);
		//click on create project button
		t.getCreateProjectbtn().click();
		Thread.sleep(3000);
		//verify the project name
		String actProjectName = t.getActualProjectName().getText();
		Assert.assertEquals(ProjectName, actProjectName);
		Thread.sleep(3000);
		
		
	}

}
