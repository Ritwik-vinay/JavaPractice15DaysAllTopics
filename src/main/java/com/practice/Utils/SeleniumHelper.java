package com.practice.Utils;

import com.practice.basics.OopsConcept.ElementNotFoundException;
import com.practice.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class SeleniumHelper {
    public WebElement findElementSafely(By locator) throws ElementNotFoundException {
        try{
            WebElement element= DriverManager.getDriver().findElement(locator);
            return element;
        }catch (NoSuchElementException e){
            throw new ElementNotFoundException(
                    "Element not found with locator "+ locator.toString(),e
            );
        }
    }
}
