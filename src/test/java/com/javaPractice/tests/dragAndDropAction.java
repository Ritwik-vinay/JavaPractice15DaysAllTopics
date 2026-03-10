package com.javaPractice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropAction {
    public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/drag_and_drop");

            //Implement Action class and Perform Drag and Drop

        Actions actions = new Actions(driver);
        WebElement dragA = driver.findElement(By.id("column-a"));
        WebElement dropB = driver.findElement(By.id("column-b"));
        WebElement header =driver.findElement(By.xpath("//div[@id='column-a']/header"));
        System.out.println(header.getText());
        Thread.sleep(2000);
        actions.dragAndDrop(dragA,dropB).build().perform();
        WebElement header2 =driver.findElement(By.xpath("//div[@id='column-a']/header"));
        Thread.sleep(2000);
        System.out.println(header2.getText());

        driver.quit();
    }
}
