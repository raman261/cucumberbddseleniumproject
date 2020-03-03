package com.google.stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPage {
	WebDriver driver = null;
	/*WebDriver driver = null;
	@Given("^User open the browser$") 
	public void user_open_the_browser() { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\eclipse-workspace\\_GithubFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	} 

	@When("^User open Google website$") 
	public void goToGoogle() { 
		driver.get("www.google.com"); 
	}*/

	@Given("User open the browser")
	public void user_open_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\eclipse-workspace\\_GithubFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("chrome opened");
		//driver.manage().window().fullscreen();
		//throw new cucumber.api.PendingException();
	}

	@When("User open Google website")
	public void user_open_Google_website() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com/");
		System.out.println("google search opened");
		if(driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[2]")).getAttribute("value").equalsIgnoreCase("Google Search")) {
			System.out.println("Text Verified");
		}
		//== "Google Search"
		//throw new cucumber.api.PendingException();
	}

	@Then("User verify text \"([^\"]*)\" of search button")
	public void User_verify_text_of_search_button(String textToSearch) {
		// Write code here that turns the phrase above into concrete actions
		if(driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[2]")).getAttribute("value").equalsIgnoreCase("textToSearch")) {
			System.out.println("Text Verified");
		}
		//== "Google Search"
		//throw new cucumber.api.PendingException();
	}
}
