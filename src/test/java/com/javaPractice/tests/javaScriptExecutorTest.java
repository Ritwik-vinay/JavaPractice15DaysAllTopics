package com.javaPractice.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class javaScriptExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement hideField = driver.findElement(By.id("hide-textbox"));
        js.executeScript("arguments[0].click();", hideField);
        Thread.sleep(3000);

        WebElement showField = driver.findElement(By.id("show-textbox"));
        js.executeScript("arguments[0].click();", showField);
        
        //js.executeScript("arguments[0].click();", element); //clicking on Specific Element
        //js.executeScript("window.scrollBy(0, document.body.scrollHeight);"); // Scrolls to the bottom
        //js.executeScript("arguments[0].scrollIntoView(true);", element); // Scrolls to a specific element
        //js.executeScript("document.getElementById('someId').value='someValue';"); //Entering text into input fields:
        //js.executeScript("alert('Hello World');"); //Generating alert pop-ups:
        //String pageTitle = js.executeScript("return document.title;").toString(); //Retrieving page information:
        //String pageURL = js.executeScript("return document.URL;").toString(); //Retrieving page information:

    }
}
