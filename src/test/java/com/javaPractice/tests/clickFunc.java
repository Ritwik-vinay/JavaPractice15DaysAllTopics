package com.javaPractice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickFunc {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/client");
        driver.findElement(By.id("userEmail")).sendKeys("ritwikvinay38@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Test1234");
        driver.findElement(By.id("login")).submit();
        Thread.sleep(5000);

       driver.quit();

    }
    
}
