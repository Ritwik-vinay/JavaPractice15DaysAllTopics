package com.javaPractice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class countWebElementOnThePage  {
//extends baseTest
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
      //  waitHelpers helper= new waitHelpers();
        try {
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            //helper.sleep();
            int linkCount = driver.findElements(By.tagName("a")).size();
            int imageCount= driver.findElements(By.tagName("img")).size();
            int buttonCount= driver.findElements(By.tagName("button")).size();
            // Print results
            System.out.println("Number of links: " + linkCount);
            System.out.println("Number of images: " + imageCount);
            System.out.println("Number of buttons: " + buttonCount);
            System.out.println("Total elements counted: " + (linkCount +
                    imageCount + buttonCount));}
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        finally {
            driver.quit();
        }
    }
}
