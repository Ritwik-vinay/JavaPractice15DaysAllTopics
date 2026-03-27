package com.practice.Utils;

import com.practice.basics.OopsConcept.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHelper {
    WebDriver driver;
    public WebElement findElementSafely(By locator) throws ElementNotFoundException {
        try{
            WebElement element= driver.findElement(locator);
            return element;
        }catch (NoSuchElementException e){
            throw new ElementNotFoundException(
                    "Element not found with locator "+ locator.toString(),e
            );
        }
    }
}
