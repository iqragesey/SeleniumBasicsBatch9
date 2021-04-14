package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","/Users/iqragesey/eclipse-workspace/Selenium/driver/geckodriver");

        WebDriver driver = new FirefoxDriver();


        driver.get("https://syntaxtechs.com");
    }
}
