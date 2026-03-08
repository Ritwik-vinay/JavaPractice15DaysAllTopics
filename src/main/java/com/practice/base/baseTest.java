package com.practice.base;


import com.practice.Utils.LoggerUtils;
import com.practice.driver.BrowserFactory;
import com.practice.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.slf4j.Logger;

import static com.practice.driver.DriverManager.driver;


public class baseTest {
    protected Logger log= LoggerUtils.getLogger(this.getClass());
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("Chrome") String browser){
        log.info("Initializing Test Setup");
        log.info("Browser Selected :{} ", browser);
        DriverManager.setDriver(BrowserFactory.createDriver(browser));
        DriverManager.getDriver().manage().window().maximize();

    }
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
//        if (driver.DriverManager.getDriver() != null) {
//            DriverManager.getDriver().quit();
//            DriverManager.unload();
//
//        }
        if (DriverManager.getDriver()!=null){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
