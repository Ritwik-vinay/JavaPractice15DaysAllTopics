package com.javaPractice.tests;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class handleBrowserNotification {
    public static void main(String[] args) throws InterruptedException {
        //Authorisation
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement getText = driver.findElement(By.xpath("//p[@id='result']"));

        //Basic-Auth -> Alert Handle
        //Final Result Authorised
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        //Switch To Alert
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.visibilityOf(getText));
        System.out.println(getText.getText());

        Thread.sleep(3000);
        //jsPrompt()
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("Click for JS Prompt");
        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.visibilityOf(getText));
        System.out.println(getText.getText());
        Thread.sleep(3000);


        driver.quit();

    }


}
