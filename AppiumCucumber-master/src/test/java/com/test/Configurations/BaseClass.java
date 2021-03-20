package com.test.Configurations;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    String Config = "src/test/java/com/test/Configurations/Configuration.properties";
    public static ExtentReports extent;
    static AppiumDriver driver ;

    /*
    *   Start Appium Server Programmatically before each scenario
    */
    @Before
    public void startServer() throws MalformedURLException {

        File appDir = new File("src/test/resources/");
        File app = new File(appDir, "FlickrBrowser-cal.zip");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
        capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 500000);
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver =new AppiumDriver<MobileElement>(url,capabilities);


        ExtentSparkReporter spark = new ExtentSparkReporter("Reports/ExtentReportResults.html");
        extent = new ExtentReports();

        extent.attachReporter(spark);
    }
    /*
    *   Stop Appium Server Programmatically before each scenario
    */
    @After
    public void stopServer() {
        extent.flush();
    }
}
