package StepDefinitions;

import java.util.List;

import com.trademe.Pages.dataTablePage;
import com.trademe.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class dataTableExample 
{
	private dataTablePage DataTablePageObj = new dataTablePage(DriverFactory.getDriver());
	
	@Given("I want to naviagte hrm application")
	public void i_want_to_naviagte_hrm_application() {
		System.out.println("Step1: User is on Login Page");
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/"); 
	}

	@When("^I enter username (.*) and (.*)$")
	public void i_enter_username_admin_and_admin123(String user, String pass) {
		DataTablePageObj.Login(user, pass);
		
	}

	@And("I click on login page")
	public void i_click_on_login_page() {
		DataTablePageObj.clickLoginBtn();
	}
	
	@When("I enter username and password using DataTable")
	public void i_enter_username_and_password_using_data_table(DataTable dataTable) {
	    System.out.println("______Enter username and password __________");
	    List<List<String>> data = dataTable.cells();
//	    DataTablePageObj.
	}

	 
  
}
