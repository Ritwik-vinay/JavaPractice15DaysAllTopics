package com.javaPractice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class multipleXpaths {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //By class attribute (your original)
        WebElement dynamicValue= driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']"));
        dynamicValue.click();
        dynamicValue.sendKeys("ind");
        //1. Click on Dynamic Value
        //2. Send Keys Dynamic Value
        //3. Enter the value and use SELECT class to getTheValues with Text
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']")));

        WebElement suggestion = driver.findElement(
                By.xpath("//ul[contains(@class,'ui-autocomplete')]//li//div[text()='India']"));
        wait.until(ExpectedConditions.elementToBeClickable(suggestion));
        suggestion.click();

        // Step 4 — Print selected value
        System.out.println("Selected: " + dynamicValue.getAttribute("value")); // ✅


        //2. By contains on class (more flexible, won't break if class changes slightly)
        driver.findElement(By.xpath("//input[contains(@class,'ui-autocomplete-input')]"));

        //By parent - Child Relationship
        driver.findElement(By.xpath("//div[@class='inputs-container']//input"));

        //By starts-with
        driver.findElement(By.xpath("//input[starts-with(@class,'input')]"));

        //List Of Xpath Element which can be written in different ways
        //Attribute[@attr='value']//input[@id='name']
        // Contains[contains(@attr,'val')]//div[contains(@class,'btn')]
        // Starts-with[starts-with(@attr,'val')]//input[starts-with(@id,'user')]
        // Text[text()='value']//button[text()='Login']
        // Contains text[contains(text(),'val')]//h2[contains(text(),'Welcome')]
        // Parent→Child//parent//child//div[@id='form']//input
        // Siblingfollowing-sibling::tag//label/following-sibling::input
        // Index(//tag)[n](//input)[2]
        // Attribute valuegetAttribute("value")for input field values



        driver.quit();

    }
}
