package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        String url=driver.getCurrentUrl();
        System.out.println(url);

        driver.getTitle();
        String title = driver.getTitle();
        System.out.println(title);


    }
}
