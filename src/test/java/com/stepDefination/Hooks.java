package com.stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks {
    driverclass driverC= new driverclass();

    @Before

    public void browser(){
        driverC.openbrowser();


    }
    @After

    public void close(){
        driverC.closebrowser();

    }





}
