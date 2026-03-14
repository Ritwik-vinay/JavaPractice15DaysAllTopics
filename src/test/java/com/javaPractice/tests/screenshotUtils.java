package com.javaPractice.tests;

import com.practice.driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class screenshotUtils {
    public static String captureAsBase64(WebDriver driver){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }

    public static File captureFile(WebDriver driver, String name) throws IOException {
        File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = "target/Screenshots/ "+ name +"_"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHMMSS"))
                +".png";
        File dest= new File(path);
        FileUtils.copyFile(src, dest);
        return dest;

    }

  /*  public void onTestFailure(ITestResult result){
        String b64= screenshotUtils.captureAsBase64(DriverManager.getDriver());
        extentTest.get().fail("Test Failed"+ MediaEntityBuilder.cre)*/
//    }
}
