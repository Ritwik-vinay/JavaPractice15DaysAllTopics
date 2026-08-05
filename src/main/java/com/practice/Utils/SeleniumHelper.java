package com.practice.Utils;

import com.practice.basics.OopsConcept.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHelper {
    private final WebDriver driver;

    public SeleniumHelper() {
        this.driver = null;
    }

    public SeleniumHelper(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElementSafely(By locator) throws ElementNotFoundException {
        if (driver == null) {
            throw new ElementNotFoundException("WebDriver is not initialized for locator " + locator.toString());
        }

        try {
            return driver.findElement(locator);
        } catch (NoSuchElementException e) {
            throw new ElementNotFoundException(
                    "Element not found with locator " + locator.toString(), e
            );
        }
    }
}
