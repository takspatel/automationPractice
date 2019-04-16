package com.stepDefination;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverclass {
    public static WebDriver driver;

    public void openbrowser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("http://www.automationpractice.com");


    }
        public void closebrowser(){
//        driver.close();
//        driver.quit();
    }



}
