package com.automationexercise.browserfactory;

import com.automationexercise.propertreader.PropertyReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.time.Duration;

public class ManageBrowser {
    private static final Logger log = LogManager.getLogger(ManageBrowser.class.getName());
    public static WebDriver driver;
    static String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");
    static int implicitlyWait = Integer.parseInt(PropertyReader.getInstance().getProperty("implicitlyWait"));


    public ManageBrowser() {
        PageFactory.initElements(driver, this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/resources/propertiesfiles/log4j2.properties");
    }

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
//            // Enable incognito mode for Chrome
//            chromeOptions.addArguments("--incognito");
            chromeOptions.addExtensions(new File("./Extensions/Adblock Plus - free ad blocker 3.21.1.0.crx"), new File("./Extensions/SelectorsHub 5.1.8.0.crx"));
            driver = new ChromeDriver();
            log.info("Chrome Browser Launch .....");
        } else if (browser.equalsIgnoreCase("FireFox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            // Enable incognito mode for Firefox
            //firefoxOptions.addArguments("-private");
            driver = new FirefoxDriver();
            log.info("Firefox Browser Launch .....");
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
            log.info("Edge Browser Launch .....");
        } else {
            System.out.println("Wrong browser name");
            log.info("Wrong Browser Launch .....");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
        driver.get(baseUrl);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}