package stepdefinations;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definations {
	
	@Before
	public void initiate(){
		System.out.println("Cucumber hook started");
	}
	
	@After
	public void cleanup(){
		System.out.println("Cumcumber hook end");
	}
	
	@Given("^I am in the website$")
	public void i_am_in_the_website() throws Throwable {
		System.out.println("I am in the website");
	}

	@When("^I click on some button$")
	public void i_click_on_some_button() throws Throwable {
		System.out.println("I click on some button");
	}

	@When("^I enter a text in a box$")
	public void i_enter_a_text_in_a_box() throws Throwable {
		System.out.println("I enter a text in a box");
	}
	
	@When("^I enter a \"([^\"]*)\" in a box and \"([^\"]*)\" as well$")
	public void i_enter_a_in_a_box_and_as_well(String str1, String str2) throws Throwable {
	    System.out.println(str1+"\t"+str2);
	}

	@When("^I click on submit$")
	public void i_click_on_submit() throws Throwable {
		System.out.println("I click on submit");
	}

	@Then("^I should get another text$")
	public void i_should_get_another_text() throws Throwable {
		System.out.println("I should get another text");
	}
	
	@Then("^page should be navigated$")
	public void page_should_be_navigated() throws Throwable {
	   System.out.println("Page should be navigated");
	}
	
	@When("^I enter a integral data as (\\d+)$")
	public void i_enter_a_integral_data_as(int arg1) throws Throwable {
		System.out.println();
	}

	@When("^I enter a decimal data as (\\d+)\\.(\\d+)$")
	public void i_enter_a_decimal_data_as(int arg1, int arg2) throws Throwable {

	}

	@When("^I enter a decimal data as string \"([^\"]*)\"$")
	public void i_enter_a_decimal_data_as_string(String arg1) throws Throwable {

	}
	
	@When("^the following data should be received$")
	public void the_following_data_should_be_received(DataTable arg1) throws Throwable {
	   List<List<String>> tableData = arg1.raw();
	   for(List<String> lineData:tableData){
		   for(String name: lineData){
			   System.out.print(name+"\t");
		   }
		   System.out.println();
	   }
	   
	}
	@When("^I enter comodity as \"([^\"]*)\" with count (\\d+)$")
	public void i_enter_comodity_as_with_count(String comodity, int count) throws Throwable {
	    System.out.println("Comodity and count is "+comodity+"\t"+count);
	}

	@When("^color as \"([^\"]*)\" and price as (\\d+)$")
	public void color_as_and_price_as(String color, int price) throws Throwable {
		 System.out.println("Color and price is "+color+"\t"+price);
	}
}
