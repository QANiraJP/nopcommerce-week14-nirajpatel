package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = "Chrome";

    @BeforeMethod

    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }



}
