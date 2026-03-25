package com.javaPractice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class variableAndDatatypes {
    //Mini Task (Your Turn)
    //👉 Convert this into variables:
    //URL → "https://flipkart.com
    //Username → "ritwik123"
    //Password → "test@123"

    public static void main(String[] args) {
        String url= "https://flipkart.com";
        String userName= "ritwik123";
        String passWord= "test@123";
        WebDriver driver= new ChromeDriver();

        driver.navigate().to(url);



    }
}
