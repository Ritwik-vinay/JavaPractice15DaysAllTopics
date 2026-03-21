package com.javaPractice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test_Start_basics {
    //add a method: enterUsername(String username)
    // add a method: clickLogin()
    static WebDriver driver= new ChromeDriver();
    static String actualText= "Congratulations student. You successfully logged in!";

    public static void main(String[] args) throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        enterUsername("student","Password123");
        clickLogin();
        String expText= titelValidationAfterLogin();
        System.out.println(expText);
        Assert.assertEquals(actualText,expText);
        logOut();

        Thread.sleep(5000);
        driver.quit();

    }

    static void enterUsername(String userName, String password){
     WebElement userNameEle=  driver.findElement(By.xpath("//input[@id='username']"));
     userNameEle.sendKeys(userName);
     WebElement passwordElement =  driver.findElement(By.xpath("//input[@id='password']"));
     passwordElement.sendKeys(password);


    }
    static void clickLogin(){
        WebElement submit= driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
    }
    static String titelValidationAfterLogin(){
        WebElement getTextCong= driver.findElement(By.xpath("//p/strong"));
        String expectedText= getTextCong.getText();
        return expectedText;
    }
    static void logOut(){
        WebElement logOutEle= driver.findElement(By.xpath("//a[contains(@class,'wp-block-button__link has-text-color')]"));
        logOutEle.click();
    }

}
