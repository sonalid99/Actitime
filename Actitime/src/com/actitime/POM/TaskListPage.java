package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerbtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement customerNametbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDesctbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangtext;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustbtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='title']")
	private WebElement actualCustomer;
	
	//Project Module
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectTab;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
	private WebElement projectNametbx;
	
	@FindBy(xpath="//div[@class='comboboxButton']")
	private WebElement customerNameDD;
	
	@FindBy(xpath="//div[text()='Axis_007' and @class='itemRow cpItemRow ']")
	private WebElement axis_007Customer;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement projectDesctbx;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectbtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='title']")
	private WebElement actualProjectName;
	
	//Task Module
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTaskbtn;
	
	@FindBy(xpath="//div[text()='- Select Customer -']")
	private WebElement taskSelectCustomerDD;
	
	@FindBy(xpath="//div[text()='Axis_007' and @class='itemRow cpItemRow ']")
	private WebElement taskCustomerNameSbi;
	
	@FindBy(xpath="//div[text()='- Select Project -']")
	private WebElement taskSelectProjectDD;
	
	@FindBy(xpath="//div[text()='Axis Bank' and @class='itemRow cpItemRow ']")
	private WebElement taskProjectnameSbi;
	
	@FindBy(xpath="(//tr//td//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name'])[4]")
	private WebElement taskNametbx;
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement createTaskbtn;
	

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getNewTaskbtn() {
		return newTaskbtn;
	}

	public WebElement getTaskSelectCustomerDD() {
		return taskSelectCustomerDD;
	}

	public WebElement getTaskSelectProjectDD() {
		return taskSelectProjectDD;
	}

	public WebElement getTaskNametbx() {
		return taskNametbx;
	}

	public WebElement getCreateTaskbtn() {
		return createTaskbtn;
	}
	
	
	public WebElement getActualProjectName() {
		return actualProjectName;
	}

	public WebElement getNewProjectTab() {
		return newProjectTab;
	}

	public WebElement getProjectNametbx() {
		return projectNametbx;
	}

	public WebElement getCustomerNameDD() {
		return customerNameDD;
	}

	public WebElement getAxis_007Customer() {
		return axis_007Customer;
	}

	public WebElement getProjectDesctbx() {
		return projectDesctbx;
	}

	public WebElement getCreateProjectbtn() {
		return createProjectbtn;
	}

	

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerbtn() {
		return newCustomerbtn;
	}

	public WebElement getCustomerNametbx() {
		return customerNametbx;
	}

	public WebElement getCustomerDesctbx() {
		return customerDesctbx;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getBigBangtext() {
		return bigBangtext;
	}

	public WebElement getCreateCustbtn() {
		return createCustbtn;
	}

	public WebElement getActualCustomer() {
		return actualCustomer;
	}
	
	public WebElement getTaskCustomerNameSbi() {
		return taskCustomerNameSbi;
	}

	public WebElement getTaskProjectnameSbi() {
		return taskProjectnameSbi;
	}

	
	}

