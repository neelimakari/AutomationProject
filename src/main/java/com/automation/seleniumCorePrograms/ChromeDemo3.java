package com.automation.seleniumCorePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ChromeDemo3
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/neelimak/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.gmail.com");
        String actualTitle=driver.getCurrentUrl();
        System.out.println("Title is:" + actualTitle);
        String actualCurUrl=driver.getCurrentUrl();
        System.out.println("Current Url is:" + actualCurUrl);
        String curWindowName=driver.getWindowHandle();
        System.out.println("Current window name is:" + curWindowName);
        Set<String> windows=driver.getWindowHandles();
        System.out.println(" window are:" + windows);
        WebElement userName=driver.findElement(By.id("identifierId"));
        userName.sendKeys("neelima.karu@gmail.com");
        WebElement nxt= driver.findElement(By.id("identifierNext"));
        nxt.click();
        Thread.sleep(5000);
        driver.close();
    }
}
