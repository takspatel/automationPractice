package com.stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Contactus extends driverclass{
        @Given("^I click on Contact us buttom$")
    public void iClickOnContactUsButtom() {
        driver.findElement(By.id("contact-link")).click();
    }

    @And("^I select \"([^\"]*)\" from Subject Heading$")
    public void iSelectFromSubjectHeading(String Subject_Heading){
        new Select(driver.findElement(By.id("id_contact"))).selectByValue("2");

        }

    @And("^I attached a file$")
    public void iAttachedAFile() {

            String path = System.getProperty("user.dir");
            driver.findElement(By.name("fileUpload")).sendKeys(path + "/src/test/java/com/testData/sample.txt");

    }
}
