package com.practice.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitHelpers {
    WebDriver driver= new ChromeDriver();
    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));

    public static void ElementImplicitWait(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public static void sleep() throws InterruptedException {
        Thread.sleep(5000);
    }
    public static void visibiltyOfElement(WebDriver driver,WebElement locator){
        ExpectedConditions.visibilityOf(locator);
    }
    public static void visibleByLocator(WebDriver driver,By locator){
        ExpectedConditions.visibilityOfElementLocated(locator);
    }
    public static void invisibleOfLocator(WebDriver driver, By locator){
        ExpectedConditions.invisibilityOfElementLocated(locator);
    }

    public static void invisibilityOfElement(WebDriver driver, WebElement ele){
        ExpectedConditions.invisibilityOf(ele);
    }
    public static void elementToBeClickable(WebDriver driver, WebElement ele){
        ExpectedConditions.elementToBeClickable(ele);
    }
    public static void elementToBeSelected(WebDriver driver, WebElement ele){
        ExpectedConditions.elementToBeSelected(ele);
    }

}
