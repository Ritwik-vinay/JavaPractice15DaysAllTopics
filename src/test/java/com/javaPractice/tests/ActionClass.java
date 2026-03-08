package com.javaPractice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        //Action Class simulates complex user actions  such as MouseHover, Drag and Drop , double Click
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement hower= driver.findElement(By.id("mousehover"));
        Actions action= new Actions(driver);
        action.moveToElement(hower).build().perform();

        driver.findElement(By.xpath("(//div[@class='mouse-hover-content']/a) [2]")).click();
        Thread.sleep(5000);
        driver.quit();


    }
}
