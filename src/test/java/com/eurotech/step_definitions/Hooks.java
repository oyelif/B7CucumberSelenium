package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before //JAVA (yanlislikla junit'ten alma)
    public void setUp(){
        System.out.println("This is coming from Before method");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }

    @After //JAVA (yanlislikla junit'ten alma)
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }

    @Before("@db")
    public void setUpDB(){
        System.out.println("\tConnection DB");
    }
    @After("@db")
    public void tearDownDB(){
        System.out.println("\tDisconnection DB");
    }
}
