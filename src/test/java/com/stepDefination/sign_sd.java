package com.stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sign_sd extends driverclass {
    WebDriver driver;
    @Given("^I goto URL as \"([^\"]*)\"$")
    public void iGotoURLAs(String URL){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
        driver.get(URL);


    }

    @When("^I click login button on Home page$")
    public void iClickLoginButtonOnHomePage() {
        driver.findElement(By.linkText("Login")).click();
    }

    @Given("^I enter user name as \"([^\"]*)\"$")
    public void iEnterUserNameAs(String email)  {
        driver.findElement(By.name("log")).sendKeys(email);
    }

    @Given("^I enter password  \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        driver.findElement(By.name("pwd")).sendKeys(password);
        
    }

    @When("^I click login button on login page$")
    public void iClickLoginButtonOnLoginPage() {
        driver.findElement(By.name("submit")).click();
    }

    @Then("^I should see error message\"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String error)  {
        String actual_result;
        actual_result=driver.findElement(By.xpath("//*[@id=\"post-4521\"]/div/div[1]/p")).getText();
    }
}
