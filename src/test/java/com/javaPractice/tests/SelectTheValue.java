package com.javaPractice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTheValue {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {

            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            WebElement eleDropDown= driver.findElement(By.id("dropdown-class-example"));
            Select select = new Select(eleDropDown);
            select.selectByVisibleText("Option2");

            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }

    }
}
