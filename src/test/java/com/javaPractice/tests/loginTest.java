package com.javaPractice.tests;

import com.practice.Utils.SeleniumHelper;
import com.practice.basics.OopsConcept.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class loginTest {
    public void testLogin(){
        SeleniumHelper helper= new SeleniumHelper();
        try {
            WebElement btn = helper.findElementSafely(By.id("loginbtn"));
            btn.click();
        }catch (ElementNotFoundException e){
            System.out.println("Test Failed "+ e.getMessage());
        }
    }
}
