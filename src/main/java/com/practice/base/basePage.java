package com.practice.base;

import com.practice.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage {

    protected WebDriver driver;
    public basePage(WebDriver driver){
        this.driver= DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }
}
