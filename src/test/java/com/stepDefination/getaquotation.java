package com.stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getaquotation {
    WebDriver driver;
    @Given("^I enter URL as \"([^\"]*)\"$")
    public void iEnterURLAs(String url) {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();    }


    @When("^I click on login button on home page$")
    public void iClickOnLoginButtonOnHomePage() {
        driver.findElement(By.linkText("Login")).click();
    }


    @Given("^I entered \"([^\"]*)\"$")
    public void iEntered(String firstname){
        driver.findElement(By.name("first-name")).sendKeys(firstname);
    }


    @Given("^I entered valid email address as \"([^\"]*)\"$")
    public void iEnteredValidEmailAddressAs(String email){
        driver.findElement(By.name("your-email")).sendKeys(email);
    }

    @Given("^I entered valid phone number \"([^\"]*)\"$")
    public void iEnteredValidPhoneNumber(String phoneno){
        driver.findElement(By.name("tel-879")).sendKeys();
    }

    @Given("^I entered subject as \"([^\"]*)\"$")
    public void iEnteredSubjectAs(String subject){
        driver.findElement(By.name("your-subject")).sendKeys();
    }

    @Given("^I entered message as \"([^\"]*)\"$")
    public void iEnteredMessageAs(String subject){
        driver.findElement(By.name("your-message")).sendKeys();
    }

    @Given("^I entered captcha code as shown on the page\"([^\"]*)\"$")
    public void iEnteredCaptchaCodeAsShownOnThePage(String captchacode){
        driver.findElement(By.name("captcha-005")).sendKeys(captchacode);
    }

    @When("^I click on send message button$")
    public void iClickOnSendMessageButton() {
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f391-o1\"]/form/p[4]/input")).click();
    }

    @Then("^I should be able to see \"([^\"]*)\"$")
    public void iShouldBeAbleToSee(String submit){
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f391-o1\"]/form/p[4]/input")).click();
    }

    @Given("^I entered as \"([^\"]*)\"$")
    public void iEnteredAs(String lastname)  {
        driver.findElement(By.name("last-name")).sendKeys();
    }
}

