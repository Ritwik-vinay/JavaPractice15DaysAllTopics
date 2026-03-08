package com.javaPractice.tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Taking Screenshot -> Taking the Screenshot while Passing the testCase
        WebDriver driver = new ChromeDriver();


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("alertbtn")).click();
        String alertText = driver.switchTo().alert().getText();
        System.out.println("Alert Text: " + alertText);
        // Step 3 — ✅ Dismiss/Accept the alert to close it
        driver.switchTo().alert().accept();

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        int imageCount=0;
        File dest = new File("screenshot" +imageCount++ +".png");

        FileUtils.copyFile(srcFile, dest);
        System.out.println("Screenshot captured and saved to: " +
                dest.getAbsolutePath());



        Thread.sleep(3000);
        driver.quit();


    }
}
