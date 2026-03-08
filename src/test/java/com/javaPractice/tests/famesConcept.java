package com.javaPractice.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class famesConcept {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // ✅ Step 1 — Find the iframe from MAIN page first
        WebElement iFrame = driver.findElement(By.id("courses-iframe"));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame)); // ✅ waits + switches in one line

        // ✅ Step 2 — NOW find elements inside the frame
        WebElement frameText = driver.findElement(
                By.xpath("//div[@class='col-md-6 text-left']/h2/span"));

        WebElement viewCourses = driver.findElement(
                By.xpath("//a[@class='btn btn-primary view-all-courses-btn']"));

        // ✅ Step 3 — Wait properly using wait.until()
        wait.until(ExpectedConditions.visibilityOf(frameText));
        System.out.println("Frame Text: " + frameText.getText());

        //✅ Step 4 — Scroll the button into view using JS before clicking.
        js.executeScript("arguments[0].scrollIntoView(true);",viewCourses);
        Thread.sleep(1000);

        // ✅ Step 4 — Click View Courses button
        wait.until(ExpectedConditions.elementToBeClickable(viewCourses));
        Actions actions = new Actions(driver);
        viewCourses.click();
        Thread.sleep(3000);

        // ✅ Step 5 — Switch back to main page after frame work is done
        driver.switchTo().defaultContent();

        Thread.sleep(3000);
        driver.quit();
    }
}