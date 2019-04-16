package com.stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class register1 {
    WebDriver driver;
    @Given("^I GOTO URL as \"([^\"]*)\"$")
    public void iGOTOURLAs(String URL){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @When("^I click on register button on home page$")
    public void iClickOnRegisterButtonOnHomePage() {
        driver.findElement(By.linkText("Register")).click();
    }

    @Given("^I enter first name as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String firstname){
        driver.findElement(By.name("first_name")).sendKeys(firstname);
    }

    @Given("^I enter last name\"([^\"]*)\"$")
    public void iEnterLastName(String lastname)  {
        driver.findElement(By.name("last_name")).sendKeys(lastname);
    }

    @Given("^I enter email address as \"([^\"]*)\"$")
    public void iEnterEmailAddressAs(String email) {
        driver.findElement(By.name("email")).sendKeys(email);    }

    @Given("^I enter confirm password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String confirmpassword){
        driver.findElement(By.name("pass2")).sendKeys();
    }

    @When("^I click on register button$")
    public void iClickOnRegisterButton() {
        driver.findElement(By.name("btn-submit")).click();
    }

    @Then("^I should see error message as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageAs(String errormessage){
        String actual_result;
        actual_result=driver.findElement(By.xpath("//*[@id=\"post-4519\"]/div/div[1]/p")).getText();
    }

    @Given("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password)  {
        driver.findElement(By.name("pass1")).sendKeys(password);
    }
}
