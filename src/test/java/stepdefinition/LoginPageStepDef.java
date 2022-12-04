package stepdefinition;

import com.basedriver.BaseDriver;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	
	LoginPage loginPage = new LoginPage(BaseDriver.getDriver());
	
	@Given("user is at the login page")
	public void userisAtlogin_page() {
	   BaseDriver.getDriver().get("http://live.techpanda.org/index.php/customer/account/login/");
	}

	@When("user provide {string} and {string}")
	public void userProvideUsernameandPassword(String username, String password) {
	    loginPage.setUsername(username);
	    loginPage.setUserPassword(password);
	}

	@When("click on Login button")
	public void click_on_login_button() {
	    loginPage.clickOnLogin();
	}

	@Then("user should be navigated to Account page")
	public void user_should_be_navigated_to_account_page(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

}
